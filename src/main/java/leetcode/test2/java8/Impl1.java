package leetcode.test2.java8;

import static java.util.stream.Collectors.groupingBy;

import com.google.common.collect.Lists;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import leetcode.model.Person;
import leetcode.model.Product;
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/20 14:53
 */
public class Impl1 implements Java8Interface,Java8Interface2{

    @Override
    public void init() {
        System.out.println("重写init");
    }

    @Test
    public void test(){
        List<Person> list = Lists.newArrayList(new Person("小松", 20),new Person("小猪",12));
        System.out.println(list.stream().map(Person::getName).filter(name -> name.startsWith("小")).skip(1).count());
        list.stream().distinct();
    }

    @Test
    public void test2(){
        Stream.generate(Math::random).limit(3).forEach(System.out::println);
    }

    @Test
    public void test3(){
        List<Product> list = Lists.newArrayList(new Product(10,"松下吹风机",new BigDecimal(200)),new Product(11,"松下熨斗",new BigDecimal(120)));
        Map<BigDecimal, Map<String, List<Product>>> collect = list.stream().collect(groupingBy(Product::getPrice, groupingBy((p) -> {
            if (p.getPrice().compareTo(new BigDecimal(200)) > 0) {
                return "高级货";
            } else {
                return "低级货";
            }
        })));
        Map<Boolean, List<Product>> collect1 = list.stream().collect(Collectors.partitioningBy(p -> p.getPrice().compareTo(new BigDecimal(200)) >= 0));
        System.out.println();
    }
}
