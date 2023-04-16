package com.star.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.star.auth.mapper.SysRoleMapper;
import com.star.auth.service.SysRoleService;
import com.star.model.system.SysRole;
import com.star.vo.system.AssginRoleVo;

import java.util.Map;

/**
 * @Date 2023-04-16 14:54 星期日
 * @Author: 聂建强
 * @Description:
 */
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {


    @Override
    public Map<String, Object> findRoleDataByUserId(Long userId) {
        return null;
    }

    @Override
    public void doAssign(AssginRoleVo assginRoleVo) {

    }
}
