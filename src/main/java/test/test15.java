package test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/8 11:02
 */
import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/8 10:58
 */
public enum test15 {
    SUCCESS("0", "成功"),
    SYSTEM_ERROR("1000", "系统异常"),
    RUNTIME_ERROR("500", "运行时异常");

    private String code;
    private String message;

    private test15(String code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
