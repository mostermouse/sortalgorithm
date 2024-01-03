package sortalgorithm;

public class selectsort {
	
	
	public static void main(String[] args) {
		int [] arr = {10,5,4,1,14,19,3,13,2,18};
		int minIndex;
		int temp;
		
		for(int i =0; i<arr.length; i++) {
			minIndex = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {  //숫자크기 비교 
 					minIndex = j;   //i가 [0]이라고 가정하면 숫자 10과 다른 숫자들과 계속 비교
				}
			}
			temp = arr[minIndex];   //숫자 비교한걸 바꿔줌 
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
