package com.tj.ythu.spi.dubbo.impl;

import com.tj.ythu.spi.dubbo.Computer;
import com.tj.ythu.spi.dubbo.ComputerOS;
import org.apache.dubbo.common.URL;

public class HuaweiComputer implements Computer {
    private ComputerOS computerOS;

    public void setComputerOS(ComputerOS computerOS) {
        this.computerOS = computerOS;
    }

    @Override
    public String getComputerOSManufactor(URL url) {
        return computerOS.manufactor(url);
    }
}
