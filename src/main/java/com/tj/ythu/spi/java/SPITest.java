package com.tj.ythu.spi.java;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPITest {

    // Java SPI 存在缺点
    // (1) 不能跟某个名称获取对应的实现类（可以写很多实现类）
    // (2) 不是实现AOP 和IOC 的机制（假如实现里面有依赖其他对象；没办法统一加上某个功能；）
    public static void main(String[] args) {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }

}
