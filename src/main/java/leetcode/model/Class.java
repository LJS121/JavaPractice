package leetcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/11 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class implements Serializable {
    private static final long serialVersionUID = -5220535273426908260L;

    private Integer id;

    private List<Person> personList;
}
