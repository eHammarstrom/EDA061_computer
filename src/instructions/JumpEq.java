package instructions;

import computer.*;
import program.ProgramCounter;

public class JumpEq extends Jump {
	Operand op1;
	Operand op2;

	public JumpEq(int nbr, Operand op1, Operand op2) {
		// TODO Auto-generated constructor stub
		super(nbr);
		this.op1 = op1;
		this.op2 = op2;
	}

	public void execute(ProgramCounter c, Memory m) {
		if (op1.equals(op2)) {
			super.execute(c, m);
		}
	}
	
	@Override
	public String toString() {
		return "JEQ " + nbr + " " + op1.toString() + " " + op2.toString();
	}
}
