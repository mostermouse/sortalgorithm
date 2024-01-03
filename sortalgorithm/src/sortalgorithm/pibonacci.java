package sortalgorithm;

public class pibonacci {
	static long[] memo;
	public static long fibonacci(int n) {
		if(n <= 1) 
			return n;
		
		else if(memo[n] != 0) 
			return memo[n];
		else
			return memo[n] = fibonacci(n-1) + fibonacci(n-2);
		
	}
	//중복된 값을 구한 적이 있다면 저장해놨다가 쓰는 방법으로 구현(DP)
	public static void main(String[] args) {
		//int num = 10; //높은 숫자일수록 못구함 DP 구현을 안해서 
		memo = new long[101];
		System.out.println(fibonacci(100));
		
	}
	
	
	

}
