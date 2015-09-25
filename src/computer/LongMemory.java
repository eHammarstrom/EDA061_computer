package computer;

public class LongMemory extends Memory {
	
	public LongMemory(int size) {
		wordList = new LongWord[size];
		
		for (int i = 0; i < wordList.length; i++)
			wordList[i] = new LongWord(0);
	}
}
