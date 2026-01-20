/*public class MoveZero_to_Last {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}*/

import java.util.Scanner;
public class MovezeroToL
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number n");
		int n = sc.nextInt();
		int [] num = new int[n];
		for(int i = 0;i<n;i++)
		{
		    num[i] = sc.nextInt();
		}
		if(n == 0||n == 1)
		{
		    return;
		}
		
		int nz = 0,z = 0;
		while(nz<n){
		if(num[nz] != 0)
		{
		    int temp = num[nz];
		    num[nz] = num[z];
		    num[z] = temp;
		    nz++;
		    z++;
		}
		else{
		nz++;
		}
		}
		for(int i= 0;i<n;i++)
		{
		System.out.print(num[i]+" ");
		}
	}
}
