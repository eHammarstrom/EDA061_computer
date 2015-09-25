package tests;

import computer.Address;
import computer.Computer;
import computer.LongMemory;
import computer.LongWord;
import instructions.Add;
import instructions.Copy;
import instructions.Halt;
import instructions.Jump;
import instructions.JumpEq;
import instructions.Mul;
import instructions.Print;
import program.Program;

public class Factorial extends Program {

	public static void main(String[] args) {
		Program factorial = new Factorial();
		System.out.println(factorial);
		Computer computer = new Computer(new LongMemory(1024));
		computer.load(factorial);
		computer.run();
	}

	public Factorial() {
		Address n = new Address(0), fac = new Address(1);
		add(new Copy(new LongWord(5), n));
		add(new Copy(new LongWord(1), fac));
		add(new JumpEq(6, n, new LongWord(1)));
		add(new Mul(fac, n, fac));
		add(new Add(n, new LongWord(-1), n));
		add(new Jump(2));
		add(new Print(fac));
		add(new Halt());
	}

}