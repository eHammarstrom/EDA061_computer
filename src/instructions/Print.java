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
		System.out.println(op.getWord(m));
		c.increment();
	}

	@Override
	public String toString() {
		return "PRT " + op.toString();
	}
}
