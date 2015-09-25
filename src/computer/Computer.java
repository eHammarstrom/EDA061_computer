package computer;

import program.*;

public class Computer {
	private Memory m;
	private Program program;

	public Computer(Memory m) {
		this.m = m;
	}

	public void load(Program program) {
		this.program = program;
	}

	public void run() {
		program.execute(m);
	}
}
