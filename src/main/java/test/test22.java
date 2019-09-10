package test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 9:54
 */
public class test22 {
    public static void main(String[] args) {
//        Product product = Factory.getInstance("ProductA");
        Product product1 = Factory.getInstance("ProductB");
//        product.show();
        product1.show();

    }
}
abstract class Product{
    public abstract void show();
}
class ProductA extends Product{

    @Override
    public void show() {
        System.out.println("show in A's way");
    }
}
class ProductB extends Product{

    @Override
    public void show() {
        System.out.println("show in B's way");
    }
}
 class Factory {

    // 定义方法：通过反射动态创建产品类实例
    public static Product getInstance(String ClassName) {

        Product concreteProduct = null;

        try {

            // 1. 根据 传入的产品类名 获取 产品类类型的Class对象
            Class product_Class = Class.forName(ClassName);
            // 2. 通过Class对象动态创建该产品类的实例
            concreteProduct = (Product) product_Class.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. 返回该产品类实例
        return concreteProduct;
    }

}
