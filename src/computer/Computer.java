package computer;

import program.*;

public class Computer {
	private Memory m;
	private Program program;
	private ProgramCounter pc;

	public Computer(Memory m) {
		this.m = m;
		pc = new ProgramCounter();
	}

	public void load(Program program) {
		this.program = program;
	}

	public void run() {
		execute(m);
	}
	
	public void execute(Memory m) {
		while (pc.isPositive()) {	
			program.getInstructionList().get(pc.getIndex()).execute(pc, m);
			
		}
	}	
}
