import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Green gr = new Green();

		int[] arrMath = { 30, 87, 56, 35, 98 };
		int[] arrEng = { 87, 56, 87, 89, 100 };
		float[] arrAvg = new float[arrMath.length];
		int[] arrTotal = new int[arrMath.length];
		int[] arrStudentID = new int[arrMath.length];
		for (int i = 0; i < arrMath.length; i++) {
			gr.setSaveEng(arrEng[i]);
			gr.setSaveMath(arrMath[i]);
			gr.setSaveData(i + 1);
			arrStudentID[i] = gr.getSaveData();
			arrAvg[i] = gr.getAvg();
			arrTotal[i] = gr.getTotal();
//			System.out.println((i+1)+"번째 학생 평균 : "+gr.getAvg());
//			System.out.println((i+1)+"번째 학생 합계 : "+gr.getTotal()+"\n");
		}
		for (int i = 0; i < arrAvg.length; i++) {
			for (int j = i + 1; j < arrAvg.length; j++) {
				float temp = arrAvg[i];
				arrAvg[i] = arrAvg[j];
				arrAvg[j] = temp;
			}
		}
		for (float i : arrAvg)
			System.out.println(i);

	}

}
