package test;

import lombok.Data;

import java.util.Date;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/15 16:28
 */
@Data
public class OrderUpgrade {
    private Integer id;
    private String name;
    private Date found_time;
    private String remark;
}
