package instructions;

import computer.Address;
import computer.Memory;
import computer.Operand;
import program.ProgramCounter;

public class Copy implements Instruction {
	private Operand op, addr;

	public Copy(Operand op, Address addr) {
		this.op = op;
		this.addr = addr;

	}

	@Override
	public void execute(ProgramCounter c, Memory m) {
		addr.getWord(m).copy(op.getWord(m));
		c.increment();
	}

	public String toString() {
		return "CPY " + op.toString() + " " + addr.toString();
	}
}
