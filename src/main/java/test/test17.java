package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

import java.util.Date;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/10 18:57
 */
@JSONType
public class test17 {
    @JSONField(format = "yyy-MM-dd")
    public static Date date = new Date();
    public static void main(String[] args) {
//        List<Integer> operations = new ArrayList<>();
//        operations.add(10);
//        System.out.println((Integer[])operations.toArray(new Integer[operations.size()]));

//        ArrayList<String> list=new ArrayList<String>();
//        list.add("hello");
//        list.add("hi");
//        list.add("good");
//
//        String[] s = new String[list.size()];
//
//        String[] objects =  list.toArray(s);
//        System.out.println(JSON.toJSONString(date));
        User user = new User();
        user.setAge(20);
        user.setName("小松");
        user.setIdCard(123456);
        System.out.println(JSON.toJSONString(user));
    }

}
