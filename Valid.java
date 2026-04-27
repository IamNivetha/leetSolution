import java.util.Scanner;
public class Valid{
    
    public static boolean validPalindrome(String s)
    {
        int left = 0,right = s.length()-1;
        while(left<right){
        while(left<right&&!Character.isLetterOrDigit(s.charAt(left)))
        {
            left++;
        }
        while(left<right&&!Character.isLetterOrDigit(s.charAt(right)))
        {
            right--;
        }
        if(Character.toLowerCase(left) != Character.toLowerCase(right))
        {
            return false;
        }
        }
        return true;
        
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.print(validPalindrome(s));
}
}