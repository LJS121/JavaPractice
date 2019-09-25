package leetcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/11 11:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 812682917562004897L;

    private String name;

    private Integer age;
}
