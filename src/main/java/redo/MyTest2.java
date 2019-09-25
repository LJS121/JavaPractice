package redo;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.util.ReflectionUtils;

import com.google.common.collect.Lists;

import leetcode.model.Class;
import leetcode.model.Person;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/11 11:05
 */
public class MyTest2 {
    @Test
    public void test() {
        Person person01 = new Person("小张", 20);
        Person person02 = new Person("小李", 22);
        Class class01 = new Class(1001, Lists.newArrayList(person01, person02));

        Method[] allDeclaredMethods = ReflectionUtils.getAllDeclaredMethods(class01.getClass());
        System.out.println(allDeclaredMethods.length);
        for (Method allDeclaredMethod : allDeclaredMethods) {
            if(allDeclaredMethod.getName().startsWith("get") ){
                if(allDeclaredMethod.getParameterTypes()[0].equals(Integer.class)){
                    System.out.println(allDeclaredMethod.getName() + ":" + "integer");
                }
                if ( allDeclaredMethod.getParameterTypes()[0].getName().equals("java.util.List")) {
                    System.out.println(allDeclaredMethod.getName() + ":" + "list");
                }

            }

        }
    }
}
