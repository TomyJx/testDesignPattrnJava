package com.test.testDesignPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-10-12:35
 */
public class Request {
    // 申请类型 0 加班，1 请假，2 加薪
    private int type;
    // 申请人
    private String name;
    // 申请内容
    private String content;
    // 申请量级
    private int num;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
