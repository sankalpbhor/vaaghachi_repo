package dsa;


public class missingNo {

//	public static int bruteForce(int[] arr, int n) {
//		for (int i = 1; i <n; i++) {
//			int flag = 0;
//			for (int j = 0; j < n-1; j++) {
//				if(arr[j] == i) {
//					flag = 1;
//					break;
//				}
//			}
//			if (flag == 0) {
//
//				System.out.println("missing no:");
//				return i;
//			}
//		}
//
//		return -1;
//
//	}
	


//	public static int usingHashing(int[] arr) {
//		// declaration of hash 
//		int[] hash=new int[arr.length+1];		
//		
//		for(int i=0;i<arr.length;i++) {			//checking the occurances of numbers 
//			hash[arr[i]]=1;
//		}
//		for(int i=0;i<arr.length;i++) {    	//returning the number which didnt occur
//			if(hash[arr[i]]==0) {
//				return i;
//			}
//			
//		}
//		return -1;
//	}
	
//	public static int optimal(int[] arr) {
//		int n=arr.length;
//		 int sumArr=0;
//		int expectdSum=(n+1)*(n+2)/2;
//		for(int i : arr) {
//			sumArr+=i;
//		}
//		
//			return expectdSum-sumArr;
//	
//
//		
//	}
	
	
	
	public static int optimalWithXOR(int[] arr) {
		int n= arr.length;
		int XOR1=0;
		int XOR2=0;
		
		//XOR 1 to n
		for(int i=1;i<=n;i++) {
			XOR1^=i;
		}
		
		// xor array elememts 
		for(int i=0;i<n-1;i++) {
			XOR2^=arr[i];
		}
		
		
		//xor XOR1 ANd XOR2 to get  the missing element
		return XOR1^XOR2;
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5,6,4,8,9 };
//		System.out.println(bruteForce(arr, 5));
//		System.out.println(usingHashing(arr));
//		System.out.println(optimal(arr));
		System.out.println(optimalWithXOR(arr));
		
		
		
	}

}
