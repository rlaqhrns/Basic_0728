
public class Green {

	private int saveData;
	private int saveEng;
	private int saveMath;
	private int total;
	private float avg;

	public Green() {
//		System.out.println("그린 생성");
	}

	public Green(int saveData, int saveEng, int saveMath) {
		this.saveData = saveData;
		this.saveEng = saveEng;
		this.saveMath = saveMath;
		setTotal();
		setAvg();
	}

	public void setSaveData(int saveData) {
		this.saveData = saveData;
	}

	public int getSaveData() {
		return this.saveData;
	}

	public void setSaveEng(int saveEng) {
		this.saveEng = saveEng;
		setTotal();
	}

	public int getSaveEng() {
		return this.saveEng;
	}

	public void setSaveMath(int saveMath) {
		this.saveMath = saveMath;
		setTotal();
	}

	public int getSaveMath() {
		return this.saveMath;

	}

	public float getAvg() {
		setAvg();
		return this.avg;
	}

	public void setAvg() {
		setTotal();
		this.avg = this.total / 2.0f;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal() {
		this.total = this.saveEng + this.saveMath;
	}
	public void printGreen() {
		System.out.println(getSaveData() + "번 학생 성적표");
		System.out.println("영어 : " + getSaveEng());
		System.out.println("수학 : " + getSaveMath());
		System.out.println("합계 : " + getTotal());
		System.out.println("평균 : " + getAvg());
	}

}
