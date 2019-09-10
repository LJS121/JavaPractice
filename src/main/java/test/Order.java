package test;

import lombok.Data;

import java.util.Date;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 16:27
 */
@Data
public class Order {
    private Integer id;
    private String name;
    private Date found_time;
    public Order() {
    }

    public Order(Integer id, String name, Date found_time) {
        this.id = id;
        this.name = name;
        this.found_time = found_time;
    }
}
