package com.sanrxteam.YoudaoAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Get {	//���ڻ�ȡ����
	public void getData(File file) throws IOException{//���ڻ�ȡ���ݲ��Ҵ���API
		int iLine=0,line=0;
		UseApi ua = new UseApi();
		String str;
        FileReader fr = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fr);
        
        while((str = bfr.readLine()) != null) {
        	line++;
        	if((iLine*4+3) == line){
        	iLine++;
        	ua.test(str);
        	}
        }
	}
}
