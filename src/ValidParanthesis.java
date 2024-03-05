import java.util.HashMap;
import java.util.Stack;

class ValidParanthesis {
    public static void main(String[] args){
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println("Result is: "+obj.isValid("()"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else {
                if (map.get(s.charAt(i)) == stack.peek()) {
                    stack.pop();
                } else
                    return false;
            }
        }
        return stack.size() == 0 ? true : false;
    }
}