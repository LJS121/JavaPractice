package leetcode.test2.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.model.Product;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/20 11:13
 */
public class Lambda {
    ArrayList<Product> objects1 = Lists.newArrayList();
    Vector<Object> objects2 = new Vector<>();
    Map<Object, Object> objects3 = new HashMap<>();

    @Before
    public void init() {
        objects1.add(new Product(1, "剃须刀", new BigDecimal(100)));
        objects1.add(new Product(2, "电风扇", new BigDecimal(300)));
        objects1.add(new Product(3, "空调", new BigDecimal(2000)));
        objects1.add(new Product(4, "PSP3000", new BigDecimal(800)));
        objects1.add(new Product(5, "索尼 降噪耳机", new BigDecimal(2599)));

        objects2.add(new Product(1, "剃须刀", new BigDecimal(100)));
        objects2.add(new Product(1, "电风扇", new BigDecimal(300)));
        objects2.add(new Product(3, "空调", new BigDecimal(2000)));

        objects3.put(new Product(1, "剃须刀", new BigDecimal(100)), 1);
        objects3.put(new Product(1, "电风扇", new BigDecimal(300)), 2);
        objects3.put(new Product(3, "空调", new BigDecimal(2000)), 3);
    }

    @Test
    public void test() {
        ArrayList<Object> newObjects = Lists.newArrayList();
        for (Object object : objects1) {
            if (!newObjects.contains(object)) {
                newObjects.add(object);
            }
        }
        newObjects.forEach(vo -> System.out.println(vo.toString()));
    }

    @Test
    public void test2() {
        Vector<Object> newObjects = new Vector<>();
        for (Object object : objects2) {
            if (!newObjects.contains(object)) {
                newObjects.add(object);
            }
        }
        newObjects.forEach(vo -> System.out.println(vo.toString()));
    }

    @Test
    public void test3() {
        Map<Object, Object> newObjects = new HashMap<>();
        for (Object object : objects3.keySet()) {
            if (!newObjects.containsKey(object)) {
                newObjects.put(object, objects3.get(object));
            }
        }
        newObjects.keySet().forEach(vo -> System.out.println(vo.hashCode() + vo.toString()));
    }

    @Test
    public void test4() {
        List<Product> productList = objects1.stream().sorted(Comparator.comparing(Product::getPrice)).limit(3).collect(Collectors.toList());
        System.out.println(productList.toString());
    }

    /**
     * lambda的延迟加载
     */
    @Test
    public void test5() {
        myMethod(123, args -> {
            System.out.println("我是 三剑士合璧后 延迟加载的东东");
        });

        myMethod(124, args -> System.out.println("我是 三剑士合璧后 延迟加载的东东"));
    }

    public void myMethod(int abc, MyInterface myInterface) {
        if (abc == 123) {
            System.out.println("三剑士合璧！");
            myInterface.str();
        }
    }

    @Test
    public void test6() {
        shop(1000, con -> System.out.println("消费了" + con + "元"));
    }

    public void shop(int money, Consumer<Integer> con) {
        con.accept(money);
    }

    @Test
    public void test7() {
        System.out.println(getCode(4, () -> new Random().nextInt(100)));
    }

    public String getCode(int num, Supplier<Integer> sup) {
        String str = "";
        for (int i = 0; i < num; i++) {
            Integer integer = sup.get();
            str += integer;
        }
        return str;
    }

    @Test
    public void test8(){
        List<String> string = getString(Arrays.asList("abc", "abcd", "abcdefg", "zxcvadf"), s -> s.length() > 5);

        List<String> preList = Arrays.asList("abc", "abcd", "abcdefg", "zxcvadf").stream().filter(pre -> pre.length() > 5).collect(Collectors.toList());

        System.out.println(string);

        System.out.println(preList);
    }

    public List<String> getString(List<String> list, Predicate<String> pre) {
        List<String> result = Lists.newArrayList();
        for (String str : list) {
            if (pre.test(str)) {
                result.add(str);
            }
        }
        return result;
    }

    @Test
    public void test9(){
        Java8Interface java8Interface = new Impl1();
        java8Interface.syso();
        java8Interface.init();
    }
}


/**
 * 注解 只能适用接口 且有且只有一个抽象的方法
 */
@FunctionalInterface
interface MyInterface {
    void str(String... args);
}
