package com.tj.ythu.spi.dubbo.impl;

import com.tj.ythu.spi.dubbo.ComputerOS;
import org.apache.dubbo.common.URL;

// @Extension 假如没有在配置中写key，可以利用这个注解生成key，但是这个不推荐使用；
public class Android implements ComputerOS {
    @Override
    public String manufactor(URL url) {
        return "谷歌";
    }
}
