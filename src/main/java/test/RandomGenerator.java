package test;

import java.util.Random;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/3 10:51
 */
public class RandomGenerator {
    private static Random random = new Random();
    public static class Boolean implements Generator<java.lang.Boolean>{
        @Override
        public java.lang.Boolean next() {
            return random.nextBoolean();
        }
    }

    public static class Character implements Generator<java.lang.Character>{
       public java.lang.Character next(){
           return CountGenerator.chars[random.nextInt(CountGenerator.chars.length)];
       }
    }
    public static class String extends CountGenerator.String{
        int length = 7;
        Generator<java.lang.Character> generator = new Character();
        public String(){}
        public String(int length){super(length);}
        public java.lang.String next(){
            char[] chars = new char[length];
            for (int i = 0; i < length; i++) {
                chars[i] = generator.next();
            }
            return new java.lang.String(chars);
        }
    }
}
