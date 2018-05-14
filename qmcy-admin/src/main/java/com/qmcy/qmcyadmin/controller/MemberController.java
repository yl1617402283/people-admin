package com.qmcy.qmcyadmin.controller;

import com.qmcy.comment.ResultMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Description:  青马创翼主页
 * @author 柴祖寅
 * @date 2018/5/14 20:50
 */

@Controller
@RequestMapping("/index")
public class MemberController {

    /**
     * @Description: 跳转到主页的方法
     * @author 柴祖寅
     * @date 2018/5/14 20:51
     * @return java.lang.String
     */
    private String index(){
        return "/index";
    }

    private ResultMessage<Map<String, Object>> login(){
        return new ResultMessage<>();
    }

}
