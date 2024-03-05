// 1. Two Stack
// 2. Add names
// 3. pop when ..
// 4. others ignore

import java.util.Stack;

class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath obj = new SimplifyPath();
        System.out.println(obj.simplifyPath("/."));
    }

    public String simplifyPath(String path) {
        Stack<String> s1 = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        String result = new String();
        String str = "";
        int i = 0;
        while (i < path.length()) {
            str = "";
            while (i < path.length() && path.charAt(i) != '/') {
                str = str + path.charAt(i);
                i++;
            }
            if (str.length() != 0) {
                if (str.equals("..")) {
                    if (s1.size() > 0)
                        s1.pop();
                } else if (!str.equals("."))
                    s1.push(str);
            }

            if (i < path.length() && path.charAt(i) == '/') {
                i++;
                continue;
            }
        }
        while (s1.size() > 0) {
            s2.push(s1.pop());
        }
        result = "/";
        while (s2.size() != 0) {
            result = result + s2.pop();
            if (s2.size() != 0)
                result += "/";
        }
        return result;
    }
}