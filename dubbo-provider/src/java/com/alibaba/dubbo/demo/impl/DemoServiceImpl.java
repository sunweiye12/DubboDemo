package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

//实现公共的接口,并实现里面的方法 --->  此处为服务所能提供的方法
public class DemoServiceImpl implements DemoService {
    //将此方法重写接口中方法,实现输入一个id,返回一个包装后的数组
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
