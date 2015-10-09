package computer;

public interface Word extends Operand{
	
	public Word add(Word w);
	
	public Word mul(Word w);
	
	public void copy(Word w);
	
	public String toString();
	
	public Word getWord(Memory m);
	
	public boolean equals(Word w);

}
