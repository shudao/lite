package com.shudao.lite.web.config;

import com.shudao.lite.web.utils.SpringContextHolder;
import org.javalite.activejdbc.DB;
import org.javalite.activeweb.controller_filters.ControllerFilterAdapter;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by dali on 16/6/28.
 */
public class JdbcFilter  extends ControllerFilterAdapter {

    @Override
    public void before() {
        DB db = new DB("default");
        try {
            DataSource passportDataSource = SpringContextHolder.getBean("dataSource");
            db.attach(passportDataSource.getConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void after() {
        DB db = new DB("default");
        db.close();
    }

    @Override
    public void onException(Exception e) {
        DB db = new DB("default");
        db.close();
    }
}
