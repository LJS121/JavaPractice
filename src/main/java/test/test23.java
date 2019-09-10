package test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 17:08
 */


import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 15:34
 */
public class test23 {
    public static void main(String[] args) {
//        Order order = new Order(123,"Ljs",new Date());
        Order order = new Order();
        OrderUpgrade orderUpgrade = new OrderUpgrade();
        try {
            BeanUtils.copyProperties(order,orderUpgrade);
            System.out.println(orderUpgrade.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

