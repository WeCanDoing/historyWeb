package com.example.demo.service.impl;

import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

import java.sql.*;


/**
 * @author 熊健
 * @date 2020/6/6  15:52
 */
@Service
public class loginServiceImpl implements LoginService {
    @Override
    public boolean loginService(String userName, String passWord) throws SQLException {
        Connection con=null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            System.out.println("用户名"+userName);
            System.out.println("密码"+passWord);
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3307/test?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false&allowMultiQueries=true&serverTimezone=GMT%2B8";
            con = DriverManager.getConnection(url,userName,passWord);
            stmt =con.createStatement();
            String sql = "select * from tb_app_info";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            if(rs.next()) {
                return true;
            }else {
                return false;
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }finally {
            if(rs!=null) {
                rs.close();
            }
            if(stmt!=null) {
                stmt.close();
            }
            if(con!=null) {
                con.close();
            }
        }
    }
}
