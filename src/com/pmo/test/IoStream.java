package com.pmo.test;

import java.io.*;

/**
 * Created by ASUS on 2018/10/23.
 */
public class IoStream {
       /* InputStream能从來源处读取一個一個byte,
        所以它是最低级的，*/
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
            InputStreamReader封裝了InputStream在里头,
            它以较高级的方式,一次读取一个一个字符,
            其內容只有四个中文字 "上下左右"*/

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
            BufferedReader则是比InputStreamReader更高级,
            它封裝了StreamReader类,
            一次读取取一行的字符*/
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
