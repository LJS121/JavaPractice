package test;

/**
 * foreach 中无法修改遍历的值
 */
public class test6 {
    public static void main(String[] args) {
        Character c = '\u0000';
        System.out.print(String.valueOf(c));
        System.out.println("nihao");
    }
}
