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
            // JDBC��������
          //1��ע������������jvmʹ�õ�����һ�����ݿ�����
            Class.forName("com.mysql.jdbc.Driver");
          //2����ȡ����
          String url="jdbc:mysql://localhost:3306/test";
          String username="root";
          String password="root";
          Connection conn= DriverManager.getConnection(url, username, password);
          //3���������ִ��ƽ̨��?ͨ�����Ӷ����ȡ��SQL����ִ���߶���
          String sql ="select 1";
          PreparedStatement prt=conn.prepareStatement(sql);
          //4��ִ��sql���
          ResultSet rs = prt.executeQuery();
          //5��������
          while (rs.next()){
              System.out.println(rs.getString(1));
          }
          //6���ͷ���Դ
          rs.close();
          prt.close();
          conn.close();

          }
}
