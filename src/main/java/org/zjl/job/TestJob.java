package org.zjl.job;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author
 * @date 2017-10-16-10:11
 */
@Component("testJob")
public class TestJob {
    Logger logger=Logger.getLogger(this.getClass());
    @Scheduled(cron = "0/20 * *  * * ? ")
    public void executeInternal() {
        logger.info ("------------------------定时任务-------------------------------------");

    }

}