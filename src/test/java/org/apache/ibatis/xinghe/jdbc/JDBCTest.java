package org.apache.ibatis.xinghe.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis?useUnicode=&characterEncoding=UTF-8&serverTimezone=UTC", "root", "root123456");
        Statement statement = connection.createStatement();
        String sql = "select * from mybatis_test where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, 1L);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getLong("id"));
            System.out.println(resultSet.getString("test_id"));
        }
    }
}
