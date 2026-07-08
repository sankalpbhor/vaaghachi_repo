package dsa;
import java.util.*;
public class MaxConsecativeOnes {
	public static int bruteforce(int[] arr){
		int n= arr.length;
		int maxi=0; int cnt=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i]==1) {
				cnt++;
				maxi=Math.max(cnt,maxi);
			}else {
				cnt=0;
			}
			
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,1,1,1,1,2,3,2,3,1,1,1,1,3,3,3,2,1,1,1,1,1,1};
		// TODO Auto-generated method stub
		System.out.println(bruteforce(arr));

	}

}
