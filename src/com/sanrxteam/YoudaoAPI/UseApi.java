package com.sanrxteam.YoudaoAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import java.io.LineNumberReader;
import java.io.OutputStream;

//import com.google.gson.Gson;
import com.sanrxteam.YoudaoAPI.Njson;


public class UseApi{
	String str;
	public void test(String str) throws IOException{
		this.str = str;
        try {
            URL url = new URL("http://fanyi.youdao.com/openapi.do");
            //1,����connection 2, �����ַ���ΪUTF-8 3,�������URL���ӽ�������/��� ��setDoInput()�ó�true
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            //Postֻ��һ������
            connection.setRequestMethod("POST");

            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
          
            //�������� str
        	bw.write("keyfrom=xianyu11111&key=1723527753&type=data&doctype=json&version=1.1&q="+str);
        	bw.flush();
          

            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            //ת��ʵ����      Ϊʲô��\\[
            String ss = s.replaceAll("\\[", "").replaceAll("\\]", "");
            
            Gson gson = new Gson(); 
            
            Njson jo = gson.fromJson(ss, Njson.class);
            
            //���������������װ���� ��java�ٽ���һ���ļ�д��
            System.out.println(str);
            
            System.out.println(ss);
            System.out.println(s);
           String text = jo.translation();
           System.out.println(text);
          /*  FileWriter fw = new FileWriter("e:\\data0.txt");
            fw.write(str);
          //  fw.write(br.readLine());    //Ϊʲô��ôдAPI����ֵΪ��?  ���п����Ǹ�ʽ���� Ӧ����Ҫ�ѷ���������ȡ����
            fw.close();*/
 

            bw.close();
            osw.close();
            os.close();

            br.close();
            isr.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    
}
}
