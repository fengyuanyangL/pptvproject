package org.zjl.manage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
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

    //在独立的线程中被执行
    @Async
    public void asyncMethodWithVoidReturnType() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.info("延时失败");
        }
        logger.info("异步方法,该方法在被调用5秒后执行");
    }

}