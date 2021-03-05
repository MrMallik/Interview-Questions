import java.sql.SQLOutput;
import java.util.*;

public class InfixToPostfix {
    /**
     * Numerically higher number represents, higher priority
     * @param ch
     * @return
     */
    public static int getPrec(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '^') return 3;

        return -1;
    }

    public static boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Deque<Character> stck = new ArrayDeque<Character>();
        int i;

        System.out.print("Enter infix expression : ");
        String infix = sc.nextLine();

        for(i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);

            if(stck.isEmpty() || getPrec(stck.peek()) < getPrec(ch) || stck.peek() == '(' || ch == '(')
                stck.push(ch);
            else if(ch == ')'){
                while(stck.peek() != '(')
                    System.out.print(stck.pop());
                stck.pop(); //discard '(' parenthesis
            }
            else if(getPrec(stck.peek()) >= getPrec(ch)){
                while(!stck.isEmpty() && stck.peek() != '(' && getPrec(stck.peek()) >= getPrec(ch))
                    stck.pop();
                stck.push(ch);
            }
            else
                System.out.print(ch);
        }

        while(!stck.isEmpty())
            System.out.print(stck.pop());
    }
}
