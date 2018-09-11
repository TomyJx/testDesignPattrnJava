package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-20:57
 */
public class PhoneHuaWei implements IPhone {

    private String masterName;

    public PhoneHuaWei() {
    }

    public PhoneHuaWei(String masterName) {

        this.masterName = masterName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void call(String phoneNum) {
        System.out.println(masterName + "user HuaWei call " + phoneNum);
    }

    public void answer(String phoneNum) {
        System.out.println(masterName + "user HuaWei answer " + phoneNum);
    }
}
