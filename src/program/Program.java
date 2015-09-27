package program;

import java.util.ArrayList;

import computer.Memory;
import instructions.Instruction;

public class Program {
	private ArrayList<Instruction> instructionList;
	private ProgramCounter pc;

	public Program() {
		instructionList = new ArrayList<Instruction>();
		pc = new ProgramCounter();
	}

	public void execute(Memory mem) {
		while (pc.isPositive()) {
			instructionList.get(pc.getIndex()).execute(pc, mem);
		}
	}

	public void add(Instruction in) {
		instructionList.add(in);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < instructionList.size(); i++)
			sb.append(i + " " + instructionList.get(i) + "\n");
		
		return sb.toString();
	}
}
