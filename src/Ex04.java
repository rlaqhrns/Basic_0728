import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5 입력 : ");
		Calculator calc = new Calculator();
		int N = sc.nextInt();
		int result;
		if (N == 1) {
			System.out.println("두 수 입력(add) : ");
			result = calc.add(sc.nextInt(), sc.nextInt());
			System.out.println("result : " + result);
		} else if (N == 2) {
			System.out.println("두 수 입력(sub) : ");
			result = calc.sub(sc.nextInt(), sc.nextInt());
			System.out.println("result : " + result);
		} else if (N == 3) {
			System.out.println("두 수 입력(mul) : ");
			result = calc.mul(sc.nextInt(), sc.nextInt());
			System.out.println("result : " + result);
		} else if (N == 4) {
			System.out.println("두 수 입력(div) : ");
			float _result = calc.div(sc.nextInt(), sc.nextInt());
			System.out.println("result : " + _result);
		} else if (N == 5) {
			System.out.println("두 수 입력(mod) : ");
			result = calc.mod(sc.nextInt(), sc.nextInt());
			System.out.println("result : " + result);
		} else {
			System.out.println("다시");
		}
	}

}
