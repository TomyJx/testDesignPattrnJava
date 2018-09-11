package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-20:50
 */
public class PhoneNokia implements IPhone {
    private String masterName;

    public PhoneNokia() {
    }

    public PhoneNokia(String masterName) {

        this.masterName = masterName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public void call(String phoneNum) {
        System.out.println(masterName + "user Nokia call " + phoneNum);
    }

    public void answer(String phoneNum) {
        System.out.println(masterName + "user Nokia answer " + phoneNum);
    }
}
