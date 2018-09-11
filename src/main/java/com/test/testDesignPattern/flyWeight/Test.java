package com.test.testDesignPattern.flyWeight;

/**
 * 享元模式
 *
 * @author jiyx
 * @create 2017-05-16-12:41
 */
public class Test {
    public static void main(String[] args) {
        AbstractWebSite a = WebSiteFactory.getWeb("产品展示");
        a.use(new User("小0"));

        AbstractWebSite b = WebSiteFactory.getWeb("产品展示");
        b.use(new User("小1"));

        AbstractWebSite c = WebSiteFactory.getWeb("农业展示");
        c.use(new User("小2"));

        AbstractWebSite d = WebSiteFactory.getWeb("产品展示");
        d.use(new User("小3"));

        System.out.println(WebSiteFactory.getCount());
    }
}
