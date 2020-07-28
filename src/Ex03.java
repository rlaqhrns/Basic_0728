import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int N = sc.nextInt();
		Green[] gr = new Green[N];

		for (int i = 0; i < N; i++) {
			gr[i] = new Green();
			gr[i].setSaveData(i + 1);
			System.out.print((i + 1) + "학생의 Eng : ");
			gr[i].setSaveEng(sc.nextInt());
			System.out.print((i + 1) + "학생의 Math : ");
			gr[i].setSaveMath(sc.nextInt());
		}
//		for (Green i : gr) {
//			System.out.println(i.getSaveData() + "번 학생 성적표");
//			System.out.println("영어 : " + i.getSaveEng());
//			System.out.println("수학 : " + i.getSaveMath());
//			System.out.println("합계 : " + i.getTotal());
//			System.out.println("평균 : " + i.getAvg());
//			System.out.println();
//		}
		for(Green i : gr) {
			i.printGreen();
			System.out.println();
		}

	}

}
