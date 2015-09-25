package computer;

public interface Word extends Operand{
	
	public Word add(Word w);
	
	public Word mul(Word w);
	
	public void copy(Word w);
	
	public Number getData();
	
	public String toString();
	
	public boolean equals(Word w);

}
