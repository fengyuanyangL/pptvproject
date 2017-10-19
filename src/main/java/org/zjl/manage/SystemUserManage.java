package org.zjl.manage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zjl.mapper.SystemUserMapper;
import org.zjl.pojo.SystemUser;

/**
 * @author
 * @date 2017-10-17-18:48
 */
@Service(value = "systemUserManage")
public class SystemUserManage {
    Logger logger=Logger.getLogger(this.getClass());
    @Autowired
    private SystemUserMapper systemUserMapper;
    @Transactional
    public Integer update(SystemUser systemUser) {
        systemUserMapper.updateSystemUser(systemUser);
        return 1;
    }

}