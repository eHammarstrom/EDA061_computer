package instructions;
import computer.Operand;
import computer.Address;
import computer.Memory;

public class Add extends ArithmeticInstruction {
	
	public Add(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}

	@Override
	protected void op(Memory memory) {
		address.getWord(memory).copy(
				op1.getWord(memory).add(op2.getWord(memory)));
	}
	
	@Override
	public String toString() {
		return "ADD " + op1.toString() + " " + op2.toString() + " " + address.toString();
	}
}
