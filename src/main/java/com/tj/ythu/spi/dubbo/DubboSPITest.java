package com.tj.ythu.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class DubboSPITest {

    // (1)首先接口需要标注@SPI;
    // (2)接口文件位置：META-INF/services/，META-INF/dubbo/，META-INF/dubbo/internal/;
    // (3)接口文件配置：key:实现类，其中key 建议不要省略；省略的话可以在实现类使用注解@Extension 指定，但是该注解已经不推荐使用；
    // (4)接口文件配置：包装类不需要指定key，对包装类的构造器有要求；
    // (5)加载目录，加载文件，加载类（自动激活扩展类@Activate、包装类、实现类）
    // (6)根据实现类创建实例，先拿实例，然后再执行依赖注入【injectExtension(instance);】;
    // (7)然后再执行AOP，利用的是包装类【instance = injectExtension((T) wrapperClass.getConstructor(type).newInstance(instance));】;
    // (8)@Activate：可以被框架中自动激活加载扩展，此Annotation用于配置扩展被自动激活加载条件，可以放在类或者方法上。
    public static void main(String[] args) {
        ExtensionLoader<ComputerOS> loader = ExtensionLoader.getExtensionLoader(ComputerOS.class);
        ComputerOS computerOS = loader.getExtension("win");
        System.out.println(computerOS.manufactor(null));

        ExtensionLoader<Computer> loader2 = ExtensionLoader.getExtensionLoader(Computer.class);
        Computer computer = loader2.getExtension("hw");
        Map<String, String> map = new HashMap<>();
        map.put("osType","mac");
        URL url = new URL("","",0,map);
        System.out.println(computer.getComputerOSManufactor(url));
    }

}
