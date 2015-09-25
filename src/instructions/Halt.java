package instructions;

import computer.Memory;
import program.ProgramCounter;

public class Halt implements Instruction {

	@Override
	public void execute(ProgramCounter c, Memory m) {
		// TODO Auto-generated method stub
		c.setIndex(-1);
	}

	@Override
	public String toString() {
		return "HLT";
	}
}
