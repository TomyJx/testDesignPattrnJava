package com.test.testDesignPattern.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-16-12:49
 */
public class WebSiteFactory {
    private static Map<String, AbstractWebSite> web = new HashMap<String, AbstractWebSite>();

    public static AbstractWebSite getWeb(String webName) {
        AbstractWebSite abstractWebSite = web.get(webName);
        if (abstractWebSite == null) {
            abstractWebSite = new WebSiteCrm(webName);
            web.put(webName, abstractWebSite);
        }
        return abstractWebSite;
    }

    public static int getCount() {
        return web.size();
    }
}
