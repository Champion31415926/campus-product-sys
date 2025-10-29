package cn.kmbeast.pojo.api;

import lombok.Getter;
import lombok.Setter;

/**
 * 响应基类
 *
 * @param <T>
 */
@Setter
@Getter
public class Result<T> {
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应消息
     */
    private String msg;

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
