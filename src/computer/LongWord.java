package computer;

public class LongWord implements Word {
	private long data;

	public LongWord(long data) {
		this.data = data;
	}

	@Override
	public void add(Word w) {
		data += ((LongWord) w).data;
	}

	@Override
	public void mul(Word w) {
		// TODO Auto-generated method stub
		data *= ((LongWord) w).data;
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

	public boolean equals(LongWord w) {
		if (w instanceof LongWord && data == ((LongWord) w).data)
			return true;
		return false;
	}

	@Override
	public Word getWord(Memory m) {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public String toString() {
		return Long.toString(data);
	}

//	@Override
//	public void setNumber(Number n) {
//		// TODO Auto-generated method stub
//		data=(long) n;
//	}
}
