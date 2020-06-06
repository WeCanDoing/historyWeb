package com.example.demo.service;

import java.sql.SQLException;

/**
 * 登录服务。
 * @author 熊健
 * @date 2020/6/6  15:49
 */

public interface LoginService {
    /**
     * 链接JDBC，判断用户名，密码是否正确。
     * @param userName
     * @param passWord
     * @return
     */
    public boolean loginService(String userName,String passWord) throws SQLException;

}
