package com.pmo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Created by ASUS on 2018/10/17.
 */
public class Jdbc {
      public static void main(String[] args) throws Exception{
            // JDBC开发步骤
          //1、注册驱动，告诉jvm使用的是哪一个数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
          //2、获取连接
          String url="jdbc:mysql://localhost:3306/test";
          String username="root";
          String password="root";
          Connection conn= DriverManager.getConnection(url, username, password);
          //3、获得语言执行平台，?通过连接对象获取对SQL语句的执行者对象
          String sql ="select 1";
          PreparedStatement prt=conn.prepareStatement(sql);
          //4、执行sql语句
          ResultSet rs = prt.executeQuery();
          //5、处理结果
          while (rs.next()){
              System.out.println(rs.getString(1));
          }
          //6、释放资源
          rs.close();
          prt.close();
          conn.close();

          }
}
