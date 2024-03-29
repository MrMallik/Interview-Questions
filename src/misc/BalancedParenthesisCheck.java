package misc; /**
 * Code checks if a given expression has balanced parenthesis or not
 */

import java.util.*;

public class BalancedParenthesisCheck {
    public static void main(String args[]){
        String exp;
        int i; boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Deque<Character> stck = new ArrayDeque<Character>();
        System.out.print("Enter expression : ");
        exp = sc.nextLine();

        if(exp.indexOf(')') == -1 && exp.indexOf('}') == -1 && exp.indexOf(']') == -1){
            flag = false;
            System.out.println("Not Balanced!");
        }


        for(i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stck.push(ch);
            else if(stck.isEmpty() || ch == ')' && stck.pop() != '(' ||
                    ch == '}' && stck.pop() != '{' ||
                    ch == ']' && stck.pop() != '['){
                System.out.println("Not Balanced!");
                break;
            }
        }

        if(stck.isEmpty() && flag)
            System.out.println("Balanced!");

    }
}