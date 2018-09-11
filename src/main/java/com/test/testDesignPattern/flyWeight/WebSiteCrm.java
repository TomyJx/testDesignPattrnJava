package com.test.testDesignPattern.flyWeight;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-16-12:44
 */
public class WebSiteCrm extends AbstractWebSite {

    public WebSiteCrm(String name) {
        super(name);
    }

    public void use(User user) {
        System.out.println("网站分类:" + name + " 用户：" + user.getName());
    }

    public static void show() {
        System.out.println("111111");
    }
}
