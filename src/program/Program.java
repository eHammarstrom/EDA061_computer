package program;

import java.util.ArrayList;

import computer.Memory;
import computer.ProgramCounter;
import instructions.Instruction;

public class Program {
	private ArrayList<Instruction> instructionList;

	public Program() {
		instructionList = new ArrayList<Instruction>();
	}
	
	public ArrayList<Instruction> getInstructionList(){
		return instructionList;
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
