package com.alibaba.dubbo.demo;

import java.util.List;
/**
 * 在API中定义公共的接口信息,服务的执行要继承接口
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
