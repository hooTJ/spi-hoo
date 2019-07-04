package com.tj.ythu.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;
// 被此注解标记的接口，就表示是一个可扩展的接口。
// @SPI(value="xxx") xxx指定默认的实现类
@SPI
public interface ComputerOS {
    // 读取URL 里面设置osType 等于固定值的某个实例
    @Adaptive(value = "osType")
    String manufactor(URL url);

}
