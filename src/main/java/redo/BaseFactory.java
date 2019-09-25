package redo;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/11 10:03
 */
public class BaseFactory {
    public static <T> T newInstance(Class<T> tClass) throws IllegalAccessException, InstantiationException {

        return tClass.newInstance();
    }
}
