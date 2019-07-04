package com.tj.ythu.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Computer {

    String getComputerOSManufactor(URL url);

}
