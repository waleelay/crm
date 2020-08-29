package com.hy.crm.user.service.impl;

import com.hy.crm.user.pojo.Role;
import com.hy.crm.user.mapper.RoleMapper;
import com.hy.crm.user.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-29
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
