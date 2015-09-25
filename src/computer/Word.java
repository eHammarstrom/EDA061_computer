package computer;

public interface Word extends Operand{
	
	public void add(Word w);
	
	public void mul(Word w);
	
	public void copy(Word w);
	
	public Number getData();
	
	public String toString();
	
//	public void setNumber(Number n);

}
