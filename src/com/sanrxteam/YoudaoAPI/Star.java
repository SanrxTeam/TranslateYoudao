package com.sanrxteam.YoudaoAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Star {
    public static void main(String[] args) throws IOException {
    	Get get = new Get();
    	File file = new File("D:\\Eclipse\\workspace\\TranslateYoudao\\data\\data.srt");
    	get.getData(file);//��ȡ�ļ������ݲ�����API
    }
}
