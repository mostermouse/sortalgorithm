package sortalgorithm;

import java.util.Arrays;

public class Select_Sort {
	static int[] nums;
	public static void main(String[] args) {
		nums = new int[10];
		for(int i = 0; i <10; i++) {
			nums[i] = (int)(Math.random()*10);
		}
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(nums));
		
		for(int i=1; i<nums.length; i++) {
			int temp = nums[i]; //現在選ばれた元素の値を仮変数に格納；
			int prev = i-1; //現在元素を基づいて以前元素を探索のためのindex変数
			while(prev >= 0 && nums[prev] > temp) { //現在選択された元素が現在探索中の元素より小さかったら、次のindexにこす。
				nums[prev+1] = nums[prev]; //次の元素探索
				prev--;
			}
			nums[prev+1] = temp;
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(nums));
		
	}

}
