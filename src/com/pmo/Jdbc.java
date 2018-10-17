package com.pmo;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;


/**
 * Created by ASUS on 2018/10/17.
 */
public class Jdbc {
      public static void main(String[] args) {
            // JDBC开发步骤
          //1、注册驱动，告诉jvm使用的是哪一个数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
          //2、获取连接
          String url="jdbc:mysql://localhost:3306/test";
          String username="root";
          String password="1234";
          Connection conn= DriverManager.getConnection(url, username, password);
          //3、获得语言执行平台，?通过连接对象获取对SQL语句的执行者对象
          //4、执行sql语句
          //5、处理结果
          //6、释放资源


          }
}
