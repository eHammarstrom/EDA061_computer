package computer;

public abstract class Memory {
	protected Word[] wordList;
	
	public Word getWord(int index) throws NullPointerException {
		if (index < 0 || index > wordList.length)
			throw new NullPointerException("Scrub");
		
		return wordList[index];
	}
}
