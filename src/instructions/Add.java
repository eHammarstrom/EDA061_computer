package instructions;
import computer.Operand;
import computer.Word;
import computer.Address;
import computer.Memory;

public class Add extends ArithmeticInstruction {
	
	public Add(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}

	@Override
	protected void op(Memory memory) {
		// TODO Auto-generated method stub
		// tv� nummer m�ste kunna adderas, hur?
		Word asd = op1.getWord(memory).add(op2.getWord(memory));
		
		address.getWord(memory).add(asd);
	}
	
	@Override
	public String toString() {
		return "ADD " + op1.toString() + " " + op2.toString() + " " + address.toString();
	}
}
