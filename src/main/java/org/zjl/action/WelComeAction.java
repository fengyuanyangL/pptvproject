package org.zjl.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zjl.bean.ResultBean;
import org.zjl.manage.SystemUserManage;
import org.zjl.manage.WelComeManage;
import org.zjl.pojo.SystemUser;
import org.zjl.util.ApplicationContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @date 2017-10-13-15:11
 */
@Controller
@RequestMapping(value = "/baseaction")
public class WelComeAction {
    Logger logger=Logger.getLogger(this.getClass());
    @Autowired
    private WelComeManage welComeManage;
    @Autowired
    private SystemUserManage systemUserManage;

    @RequestMapping(value="/ok")
    public void okTest(HttpServletRequest request, HttpServletResponse response){
            logger.debug("-----------------------------control-----------------------------");
        try {
            response.getOutputStream().write("wecdn dowload api ok".getBytes("UTF-8"));
            response.getOutputStream().flush();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

    }
    @RequestMapping(value="/ok1/{userid}",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean ok1Test(@PathVariable Long userid,@RequestParam(value = "domain_name", required = false) String domain_name){
            //获取配置文件中的值
            String configProStr = welComeManage.wsApiUserName;
            //调用server层的方法
            String serviceValStr = welComeManage.testDeal();
            //获取请求地址中的数据
            Long urlParmStr = userid;
            //通过bean工厂获取对象
            boolean beanStr = ApplicationContextHolder.getBean("welComeManage") == ApplicationContextHolder.getBean("welComeManage");
            //异步延迟执行方法
            welComeManage.asyncMethodWithVoidReturnType();
            return new ResultBean(null, 0, "success："+configProStr + serviceValStr + urlParmStr + beanStr + domain_name);

    }

    @RequestMapping(value="/ok2",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultBean  ok2(SystemUser systemUser) {

        return new ResultBean(systemUserManage.update(systemUser),0,"success");
    }

}