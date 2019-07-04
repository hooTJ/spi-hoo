package com.tj.ythu.spi.dubbo.impl;

import com.tj.ythu.spi.dubbo.ComputerOS;
import org.apache.dubbo.common.URL;


public class Mac implements ComputerOS {
    @Override
    public String manufactor(URL url) {
        return "苹果";
    }
}
