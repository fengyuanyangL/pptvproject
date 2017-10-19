package org.zjl.manage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author
 * @date 2017-10-13-16:46
 */
@Service(value = "welComeManage")
public class WelComeManage {
    Logger logger=Logger.getLogger(this.getClass());

    @Value("${ws.api.name}")
    public String wsApiUserName;
    public String testDeal() {
        return "testDeal"+wsApiUserName;
    }


}