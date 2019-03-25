package test;

import java.util.Stack;

public class test5 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        //如果stack为空 访问peek()会报异常
        System.out.println(stack.peek());
        String s = "nihao";
        char[] c = s.toCharArray();
        System.out.println(String.valueOf(c));
    }
}
