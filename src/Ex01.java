
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		Green gr = new Green();

		for (int i = 0; i < arr.length; i++) {
			gr.setSaveData(arr[i]);
			System.out.println("setter로 저장된 값을 getter로 : " + gr.getSaveData());

		}

	}

}
