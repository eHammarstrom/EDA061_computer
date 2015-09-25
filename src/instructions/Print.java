package instructions;

import computer.Memory;
import computer.Operand;
import program.ProgramCounter;

public class Print implements Instruction {
	Operand op;

	public Print(Operand op) {
		this.op = op;
	}

	@Override
	public void execute(ProgramCounter c, Memory m) {
		c.increment();
		System.out.println(op.getWord(m));
	}

	@Override
	public String toString() {
		return "PRT " + op.toString();
	}
}
