
import java.util.Scanner;
import java.util.Stack;
public class InfixToPrefix {
    static boolean isOperator(char ch)
    {
        return ch == '+' ||ch == '-' ||ch == '*'||ch =='/'||ch == '^';
    }
    static int precedence(char ch)
    {
        switch(ch)
        {
            case'+': 
            case'-': return 1;
            case'*': 
            case'/': return 2;
            case'^': return 3;
        }
        return -1;
    }
    static String infixToprefix(String infix)
    {
        StringBuilder reversed = new StringBuilder(infix).reverse();
        for(int i = 0;i<reversed.length();i++)
        {
            if(reversed.charAt(i) == '(')
            {
                reversed.setCharAt(i,')');
            }
            else if(reversed.charAt(i) == ')')
            {
                reversed.setCharAt(i,'(');
            }
        }
        StringBuilder prefix = new StringBuilder();
>        Stack<Character>stack = new Stack<>();
        for(int i = 0;i<reversed.length();i++)
        {
           char ch = reversed.charAt(i);
           if(Character.isLetterOrDigit(ch))
            {
                prefix.append(ch);
            } 
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    prefix.append(stack.pop());
                }
                stack.pop();

            }
            else if(isOperator(ch))
            {
                while(!stack.isEmpty() && precedence(ch)<precedence(stack.peek()))
                {
                    prefix.append(stack.pop());

                }
                stack.push(ch);
            }
            
        }
        while(!stack.isEmpty())
            {
                prefix.append(stack.pop());
            }
        
        return prefix.reverse().toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        String prefix = infixToprefix(infix);
        System.out.print("the prefix"+prefix);
    }
    
}
