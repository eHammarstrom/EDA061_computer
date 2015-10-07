package instructions;

import computer.Memory;
import computer.Address;
import computer.Operand;
import computer.ProgramCounter;

public abstract class ArithmeticInstruction implements Instruction {
	protected Address address;
	protected Operand op1, op2;
	
	protected ArithmeticInstruction(Operand op1, Operand op2, Address address) {
		this.op1 = op1;
		this.op2 = op2;
		this.address = address;
	}
	
	@Override
	public void execute(ProgramCounter c, Memory m) {
		op(m);
		c.increment();
	}
	
	protected abstract void op(Memory memory);
}
