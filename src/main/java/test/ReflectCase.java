package test;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/12 12:19
 */
public class ReflectCase {
    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Proxy proxy = new Proxy();
        Method method = proxy.getClass().getDeclaredMethod("run",new Class[]{int.class,int.class,float.class});
        proxy.getClass().getDeclaredMethod("run1").setAccessible(true);
        proxy.getClass().getDeclaredMethod("run1").invoke(proxy);
    }

    static class Proxy{
        public void run(int a,int b,float c){
            System.out.println("run"+a+""+b+""+(int)c);
        }
        private void run1(){
            System.out.println("run1");
        }
    }
}
