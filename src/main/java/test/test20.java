package test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 9:31
 */
public class test20 {
    @Test
    public void test() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Student> type = Student.class;
        Student student = type.newInstance();
        Field f = type.getDeclaredField("name");
        f.setAccessible(true);
        f.set(student,"小松");
        System.out.println(f.get(student));
        System.out.println(student.toString());

        Student student1 = type.getConstructor().newInstance();
        System.out.println(student1);
        Student student2 = type.getConstructor(String.class).newInstance("小松松");
        System.out.println(student2);

        Method method = type.getDeclaredMethod("setName");
        method.invoke(student);

        Method method2 = type.getDeclaredMethod("setName1",new Class[]{String.class});
        method2.invoke(student,"小李子");
        System.out.println(student.toString());
    }

}
class Student{
    private String name;
    public Student(){

    }
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if(name==null){
            return "nothing here";
        }else{
            return name+"你好！";
        }
    }
    public void setName(){
        System.out.println("fake method here");
    }
    public void setName1(String name){
        this.name = name;
        System.out.println("true method here");
    }
}