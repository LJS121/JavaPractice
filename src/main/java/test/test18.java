package test;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/11 17:18
 */
public class test18 {
    /**
     * lambda表达式的常用场景
     */
    @Test
    public void test() {
        List<String> list_one = new ArrayList<>();
        list_one.add("NIKE");
        list_one.add("Addidas");
        /**
         * 用在匿名内部类里简写 ()->
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("do nothing");
            }
        }).start();
        new Thread(() -> System.out.println("do nothing")).start();

        //用在集合比较器里
        Collections.sort(list_one, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(list_one, (o1, o2) -> o1.compareTo(o2));//正序
        Collections.sort(list_one, (o1, o2) -> -o1.compareTo(o2));//逆序

        //用在遍历集合 或操作集合中元素的时候
        list_one.forEach(System.out::println);
        List result = new ArrayList();
        list_one.stream().forEach(item -> result.add(item));


        System.out.println("--boundary--");

        //通过自定义filter方法 或者 集合.stream().filter(Predicate<>)
        filter(list_one, n -> n.startsWith("N"));
        filter(list_one, n -> true);
        filter(list_one, n -> false);
        filter(list_one, n -> n.length() > 5);

        Predicate<String> predicate = n -> n.startsWith("N");
        list_one.stream().filter(predicate).forEach(System.out::print);
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(3);
        list3.add(15);
        list3.add(20);
        Predicate<Integer> predicate1 = n -> Integer.valueOf(n) > 10;

        //用于map reduce中 此处先filter删选数据 然后执行map操作
        Double aDouble = list3.stream().filter(predicate1).map(vo -> vo * .12 + vo).reduce((sum, vo) -> sum + vo).get();
        System.out.println(aDouble);

        //stream()之后可以通过distinct()去重 也可以通过stream().collect(Collectors.toSet())去重
        //Collector.joining(delimiter)通过定界符连接成字符串
        List<String> list4 = new ArrayList<>();
        list4.add("Hello");
        list4.add("Boy");
        list4.add("How");
        list4.add("Are");
        list4.add("You");
        list4.add("You");
        list4.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println(list4.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")));

        /**
         * 通过mapTOInt() mapToDouble() mapToLong() 然后summarStatistics() 可以获得 IntSummaryStatistics 这个类的实例
         * 然后调用它的getSum() getAverage() getCount() getMax() getMin()方法
         */
        List<Integer> list5 = Arrays.asList(1, 3, 4, 5, 6, 7, 10, 23);
        IntSummaryStatistics intSummaryStatistics = list5.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
    }

    public void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter(name -> condition.test(name)).forEach(vo -> System.out.print(vo + " "));
        System.out.println();
    }
}
