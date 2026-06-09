import java.util.Scanner;
public class FirstUnique

{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    int n = s.length()-1;
	    int [] count = new int[26];
	    for(int i = 0;i<n;i++)
	    {
	        count[s.charAt(i)-'a']++;
	    }
	    for(int i = 0;i<n;i++)
	    {
	        if((count[s.charAt(i) - 'a']) == 1)
	        {
	            System.out.print(i);
	            return;
	        }
	    }
	    System.out.print("-1");
	    return;
	}
}