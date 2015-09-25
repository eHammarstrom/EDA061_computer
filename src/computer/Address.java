package computer;

public class Address implements Operand {
	private int index;

	public Address(int index) {
		this.index = index;

	}

	public Word getWord(Memory m) {
		return m.getWord(index);
	}

	public String toString() {
		return "[" + Integer.toString(index) + "]";
	}
}
