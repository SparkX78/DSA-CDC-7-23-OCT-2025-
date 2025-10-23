import java.util.*;
public class DSA_46 {
    public static int evaluate(String[] arr){
        Stack<Integer> stack = new Stack<>();
        for(String ch : arr){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("^") || ch.equals("/")){
                if(stack.size() < 2) throw new IllegalArgumentException("Not enough operands to operate");

                int b = stack.pop();
                int a = stack.pop();
                
                switch(ch){
                    case "+" : stack.push(a+b); break;
                    case "-" : stack.push(a-b); break;
                    case "*" : stack.push(a*b); break;
                    case "/" : if(b == 0){
                                    throw new ArithmeticException("Divison by zero error");
                                }
                                stack.push(Math.floorDiv(a,b)); break;
                    case "^" : stack.push((int)Math.pow(a,b)); break;

                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
    public static void main(String args[]){
        String[] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluate(arr));
    }
}
