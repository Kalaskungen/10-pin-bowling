
public class Frame {
	private int roll1;
	private int roll2;
	
	public Frame(int roll1, int roll2) {
		this.roll1 = roll1;
		this.roll2 = roll2;
	}

	public Frame(int roll) {
		this.roll1 = roll;
	}

	public int getRoll1Score(){
		return roll1;
	}
	
	public int getRoll2Score(){
		return roll2;
	}
	
	public int getFrameScore(){
		return roll1 + roll2;
	}
}
