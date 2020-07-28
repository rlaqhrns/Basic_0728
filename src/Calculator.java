
public class Calculator {

	private String name;
	private int id;
	private int calculatedValue;
	
	public int getCalculatedValue() {
		return calculatedValue;
	}

	public void setCalculatedValue(int calculatedValue) {
		this.calculatedValue = calculatedValue;
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public float div(int x, int y) {
		return (float) x / y;
	}

	public int mod(int x, int y) {
		return x % y;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}