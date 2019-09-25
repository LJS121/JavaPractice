package leetcode.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/20 11:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = -5587099690376783253L;

    private Integer id;

    private String name;

    private BigDecimal price;

    public int hashCode() {
        return new Random().nextInt(100000);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Product && ((Product) obj).getId().equals(this.id)) {
            return true;
        }
        return false;
    }
}
