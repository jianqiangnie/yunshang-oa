package com.star.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.star.model.system.SysRole;
import com.star.vo.system.AssginRoleVo;

import java.util.Map;

/**
 * @Date 2023-04-16 14:53 星期日
 * @Author: 聂建强
 * @Description:
 */
public interface SysRoleService extends IService<SysRole> {

    //1 查询所有角色 和 当前用户所属角色
    Map<String, Object> findRoleDataByUserId(Long userId);

    //2 为用户分配角色
    void doAssign(AssginRoleVo assginRoleVo);
}
