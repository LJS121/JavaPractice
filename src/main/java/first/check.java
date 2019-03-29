package first;

import java.util.Stack;

/**
 * 检查给定的字符串中括号是否匹配 () [] {} 其他字符
 */
public class check {
    public static void main(String[] args) {
        boolean b = checkBrackets("(2*3){232}[]");
        System.out.println(b);
    }
    public static boolean checkBrackets(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c:chars
             ) {
            //其他字符不进入栈中
            if(c=='['||c==']'||c=='('||c==')'||c=='{'||c=='}'){
                if(stack.isEmpty()){
                    stack.push(c);
                }else if(stack.peek()=='('&&c==')'||stack.peek()=='{'&&c=='}'||stack.peek()=='['&&c==']'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
