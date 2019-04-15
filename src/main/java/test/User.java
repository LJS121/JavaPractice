package test;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.util.Date;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/11 17:02
 */
@Data
@JSONType(orders = {"date","name","id","age"})
public class User {
    @JSONField(name = "id")
    private long idCard;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "age")
    private int age;
    @JSONField(name = "date",format = "yyyy-MM-dd")
    private Date date = new Date();
}
