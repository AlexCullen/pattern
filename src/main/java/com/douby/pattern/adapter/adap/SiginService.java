package com.douby.pattern.adapter.adap;

import com.douby.pattern.adapter.dto.Member;
import com.douby.pattern.adapter.dto.ResultMsg;

public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        System.out.println("账号密码登录");
        return null;
    }

}