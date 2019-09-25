package leetcode.test2.java8;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/20 14:50
 */
public interface Java8Interface {
    default void syso(){
        System.out.println("默认实现");
    }

    default void init(){
        System.out.println();
    }
}
