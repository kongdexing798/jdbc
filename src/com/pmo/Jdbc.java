package com.pmo;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;


/**
 * Created by ASUS on 2018/10/17.
 */
public class Jdbc {
      public static void main(String[] args) {
            // JDBC��������
          //1��ע������������jvmʹ�õ�����һ�����ݿ�����
            Class.forName("com.mysql.jdbc.Driver");
          //2����ȡ����
          String url="jdbc:mysql://localhost:3306/test";
          String username="root";
          String password="1234";
          Connection conn= DriverManager.getConnection(url, username, password);
          //3���������ִ��ƽ̨��?ͨ�����Ӷ����ȡ��SQL����ִ���߶���
          //4��ִ��sql���
          //5��������
          //6���ͷ���Դ


          }
}
