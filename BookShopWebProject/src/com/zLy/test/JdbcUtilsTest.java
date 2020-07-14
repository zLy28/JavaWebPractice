package com.zLy.test;

import com.zLy.utils.JdbcUtils;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {
    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            JdbcUtils.closeResources(conn);
        }
    }
}
