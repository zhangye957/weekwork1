package com.itdr.dao;

import com.itdr.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class IndexDao {
    public Users getu(String uname, String psd){
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

        String sql = "select id,username,password,type,create_time,update_time from user where username= ? and password = ?";

        Users u = null;
        try {
            u = qr.query(sql,new BeanHandler<Users>(Users.class),"张冶","123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
}
