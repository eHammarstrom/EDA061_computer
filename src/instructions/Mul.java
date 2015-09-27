package instructions;

import computer.Address;
import computer.Memory;
import computer.Operand;

public class Mul extends ArithmeticInstruction {
	
	
	public Mul(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}

	@Override
	protected void op(Memory memory) {
		address.getWord(memory).copy(
				op1.getWord(memory).mul(op2.getWord(memory)));
	}

	@Override
	public String toString() {
		return "MUL " + op1.toString() + " " + op2.toString() + " " + address.toString();
	}
}
