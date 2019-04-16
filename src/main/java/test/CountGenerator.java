package test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/3 9:56
 */
public class CountGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;

        @Override
        public java.lang.Boolean next(){
            value = !value;
            return value;
        }
    }
    public static class Integer implements Generator<java.lang.Integer>{
        private int value = 0;
        @Override
        public java.lang.Integer next() {
            return value++;
        }
    }
    public static class Double implements Generator<java.lang.Double>{
        private double value = 0;
        @Override
        public java.lang.Double next() {
            return value++;
        }
    }
    public static char[] chars = ("abcdefghijklmnopqrstuvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    public static class Character implements Generator<java.lang.Character>{
        int index = 0;
        @Override
        public java.lang.Character next() {
            return chars[(index++)%chars.length];
        }
    }
    public static class String implements Generator<java.lang.String>{
        int length = 7;
        Generator<java.lang.Character> generator = new Character();
        public String(){

        }
        public String(int length){
            this.length = length;
        }
        @Override
        public java.lang.String next() {
            char[] chars = new char[length];
            for (int i = 0; i < length; i++) {
                chars[i] = generator.next();
            }
            return new java.lang.String(chars);
        }
    }
}
