package com.pmo.test;

import java.io.*;

/**
 * Created by ASUS on 2018/10/23.
 */
public class IoStream {
       /* InputStream�ܴӁ�Դ����ȡһ��һ��byte,
        ����������ͼ��ģ�*/
     /* public static void main(String[] args) {

          try {
              FileInputStream in = new FileInputStream("F://demo//a.txt");
              int i;
              while ((i=in.read())!=-1){
                  System.out.println(i);
              }
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }*/


         /*   InputStreamReader
            InputStreamReader���b��InputStream����ͷ,
            ���Խϸ߼��ķ�ʽ,һ�ζ�ȡһ��һ���ַ�,
            �����ֻ���ĸ������� "��������"*/

   /* public static void main(String[] args) {

        try {
            FileInputStream in = new FileInputStream("F://demo//a.txt");
            InputStreamReader inReader = new InputStreamReader(in);
            int i;
            while ((i=inReader.read())!=-1){
                System.out.println((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


          /*   BufferedReader
            BufferedReader���Ǳ�InputStreamReader���߼�,
            �����b��StreamReader��,
            һ�ζ�ȡȡһ�е��ַ�*/
    public static void main(String[] args) {

        try {
            FileInputStream in = new FileInputStream("F://demo//a.txt");
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(inReader);
            String line;
            while ((line=reader.readLine())!=null
                    ){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
