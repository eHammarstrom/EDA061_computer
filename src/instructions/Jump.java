package instructions;

import computer.Memory;
import program.ProgramCounter;

public class Jump implements Instruction {
	int nbr;

	public Jump(int nbr) {
		this.nbr = nbr;
	}

	@Override
	public void execute(ProgramCounter c, Memory m) {
		c.setIndex(nbr);
	}

	@Override
	public String toString() {
		return "JMP " + nbr;
	}
}
