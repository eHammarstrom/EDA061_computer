package computer;

public class LongWord implements Word {
	private long data;

	public LongWord(long data) {
		this.data = data;
	}

	@Override
	public Word add(Word w) {
		data += ((LongWord) w).data;
		return this;
	}

	@Override
	public Word mul(Word w) {
		data *= ((LongWord) w).data;
		return this;
	}

	@Override
	public void copy(Word w) {
		// TODO Auto-generated method stub
		data = ((LongWord) w).data;
	}

	@Override
	public Number getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Word getWord(Memory m) {
		// TODO Auto-generated method stub
		return (LongWord) this;
	}
	
	@Override
	public String toString() {
		return Long.toString(data);
	}
	
	@Override
	public boolean equals(Word w) {
		if (data == ((LongWord) w).data)
			return true;
		return false;
	}
}
