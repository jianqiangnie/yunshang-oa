package com.star.auth;

import com.star.auth.service.SysRoleService;
import com.star.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TestMpDemo2 {

    //注入
    @Resource
    private SysRoleService service;

    //查询所有记录
    @Test
    public void getAll() {
        List<SysRole> list = service.list();
        System.out.println(list);
    }

}
