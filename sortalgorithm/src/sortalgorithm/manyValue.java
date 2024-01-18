package sortalgorithm;

import java.util.Scanner;

public class manyValue {

	public static void main(String[] args) {
		// 1 2 2 3 1 4 2 2 4 3 5 3 2
		// 정답 2 (5회)
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[10]; //입력
		for(int i = 0; i< 10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		int []mode = new int[10];  //최빈수 횟수 구함
		for(int i =0; i<10; i++) {
			mode[inputNum[i]]++; //mode[2] == 4
			
			
		}
		
		int modeNum = 0; //최빈수
		int modeCnt = 0;  //최빈수가 나온 횟수
		for(int i =0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
			
		}
		System.out.println("최빈수 :  " + modeNum + " cnt : " + modeCnt);
		
	}

}
