package computer;

public class ProgramCounter {
	private int index;

	public ProgramCounter() {
		index = 0;
	}
	
	public int getIndex() {
		return index;
	}
	
	public boolean isPositive() {
		if(index >= 0)
			return true;
		return false;
	}
	
	public void increment(){
		index++;
	}
	
	public void setIndex(int nbr){
		index = nbr;
	}
}
