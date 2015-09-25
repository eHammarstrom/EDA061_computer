package instructions;
import computer.Memory;
import program.ProgramCounter;

public interface Instruction {

	public String toString();
	
	public void execute(ProgramCounter c, Memory m);
}
