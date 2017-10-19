package org.zjl.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author
 * @date 2017-10-16-15:18
 */
public class InstantiationTracingBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //如果没有if会被执行两次
        if(event.getApplicationContext().getParent() == null) {
            System.out.println("--------------------spring容器初始化完成后所做的操作--------------------------");
            //需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。
        }

    }
}