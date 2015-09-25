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
		// TODO Auto-generated method stub
		
		address.getWord(memory).add(op1.getWord(memory).add(op2.getWord(memory)));
	}

	@Override
	public String toString() {
		return "MUL " + op1.toString() + " " + op2.toString() + " " + address.toString();
	}
}
