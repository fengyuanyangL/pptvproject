package org.zjl.mapper;

import org.zjl.pojo.SystemUser;

import java.util.List;

/**
 * @author
 * @date 2017-10-17-15:36
 */
public interface SystemUserMapper {
    List<SystemUser> getUserList();
    Integer updateSystemUser(SystemUser systemUser);
}