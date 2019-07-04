package com.tj.ythu.spi.dubbo.wrapper;

import com.tj.ythu.spi.dubbo.ComputerOS;
import org.apache.dubbo.common.URL;

/**
 * 接口包装类：必须提供构造方法，自动注入所有的实现类。包装类可以配置在文件中，前面不需要加key。
 */
public class ComputerOSWrapper implements ComputerOS{
    private ComputerOS computerOS;

    /**
     * 这样形式的构造器是必须的
     *
     * @param computerOS
     */
    public ComputerOSWrapper(ComputerOS computerOS) {
        this.computerOS = computerOS;
    }

    @Override
    public String manufactor(URL url) {
        System.out.println("执行前...");
        String result = computerOS.manufactor(url);
        System.out.println("执行后...");
        return result;
    }
}
