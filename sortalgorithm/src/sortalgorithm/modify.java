package sortalgorithm;

public class modify {

	public static void main(String[] args) {
		int inputNum = 19;
		int bin[] = new int[10]; //변환할때 저장할 깡통
		
		/* 19 / 2  9....1
		 * 9 / 2 4.....1
		 * 4 / 2 2......0
		 * 2 / 2 1.....0
		 * 1 / 2 0.....1
		 * 
		 * 010011  => 19
		 */
		int i = 0;
		int mok = inputNum;
		/*while(mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		i--;
		for(; i >= 0; i--) {
			System.out.print(bin[i]);
		}
	*/
		for(int k=0; k < 8; k++) {
			bin[k] = mok % 2;
			mok /= 2;
		}
		for(int j=8; j >= 0; j--) {
			System.out.print(bin[j]);
		}
		
		
	}

}
