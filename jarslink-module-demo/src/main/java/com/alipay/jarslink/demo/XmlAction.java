package com.alipay.jarslink.demo;

import com.alipay.jarslink.api.Action;

/**
 * XML bean ，定义在xml中
 *
 * @author joe
 * @version 2018.03.31 23:10
 */
public class XmlAction implements Action<String, String> {
    @Override
    public String execute(String actionRequest) {
        return "xml:" + actionRequest;
    }

    @Override
    public String getActionName() {
        return "xmlAction";
    }
}
