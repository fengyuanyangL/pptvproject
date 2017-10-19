package org.zjl.bean;

/**
 * @author
 * @date 2017-10-13-15:28
 */
public class ResultBean {
    private Object data;
    private Integer err;
    private String msg;

    public ResultBean() {
    }

    public ResultBean(Object data, Integer err, String msg) {
        this.data = data;
        this.err = err;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getErr() {
        return err;
    }

    public void setErr(Integer err) {
        this.err = err;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}