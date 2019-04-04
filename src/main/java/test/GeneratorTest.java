package test;

import javax.annotation.Generated;
import java.util.Random;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/3 10:00
 */
public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass){
        for (Class<?> type:surroundingClass.getClasses()){
            System.out.println(type.getSimpleName());
            try {
                Generator<?> g = (Generator<?>)type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next()+" ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
//        Generator<java.lang.String> generator = new CountGenerator.String(25);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(generator.next());
//        }
    }

    public static void main(String[] args) {
//        test(CountGenerator.class);
        test(RandomGenerator.class);
    }
}
