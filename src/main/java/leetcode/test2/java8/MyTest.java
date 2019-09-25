package leetcode.test2.java8;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description 使用parallel并行和普通的顺序执行 在指定情况下存在巨大的性能差异
 *
 *              lambda的延迟执行
 * @date 2019/9/17 17:17
 */
public class MyTest {
    private static int num = 0;
    private LinkedList<Long> linkedList = new LinkedList<>();

    @Before
    public void init() {
        for (Long i = 0l; i < 1000L; i++) {
            linkedList.add(i);
        }
    }

    @Test
    public void test2() {
        long startTime = System.currentTimeMillis();
        linkedList.stream().forEach(System.out::print);
        System.out.println("时间耗费:" + (System.currentTimeMillis() - startTime) + "ms");
    }

    @Test
    public void test3() {
        long startTime = System.currentTimeMillis();
        linkedList.stream().parallel().forEach(System.out::print);
        System.out.println("时间耗费:" + (System.currentTimeMillis() - startTime) + "ms");
    }


    @Test
    public void test4() {
        String msg1 = "A";
        String msg2 = "B";
        String msg3 = "C";
        log(0, (msg) -> {
            System.out.println("延迟执行");
            return msg1 + msg2 + msg3;
        });

        log(1, (msg) -> {
            return msg1 + msg2 + msg3;
        });
    }

    public void log(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }

    public void log(int level, MessageBuilder messageBuilder) {
        if (level == 1) {
            System.out.println(messageBuilder.buildMessage());
        }
    }
}


@FunctionalInterface
interface MessageBuilder {
    String buildMessage(String... msgs);
}
