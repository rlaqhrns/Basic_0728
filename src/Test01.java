
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "여러분만나서반가워요앞으로6개월동안같이잘해보아요";
		
		int temp = str.length()%3+1;
		for (int i = 0; i <= str.length()-3; i++) {
			if (i % 3 == 0) {
				System.out.println(str.substring(i, i+3));
			}
			else if(i+3==str.length()){
				System.out.println(str.substring(i+temp));
			}
		}

	}

}
