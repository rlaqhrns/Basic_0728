
public class Green {

	private int saveData;
	private int saveEng;
	private int saveMath;
	private int total;
	private float avg;

	public Green() {
		System.out.println("그린 생성");
	}

	public Green(int saveData, int saveEng, int saveMath) {
		this.saveData = saveData;
		this.saveEng = saveEng;
		this.saveMath = saveMath;

	}

	public void setSaveData(int saveData) {
		this.saveData = saveData;
	}

	public int getSaveData() {
		return this.saveData;
	}

	public void setSaveEng(int saveEng) {
		this.saveEng = saveEng;
	}

	public int getSaveEng() {
		return this.saveEng;
	}

	public void setSaveMath(int saveMath) {
		this.saveMath = saveMath;
	}

	public int getSaveMath() {
		return this.saveMath;
	}
}
