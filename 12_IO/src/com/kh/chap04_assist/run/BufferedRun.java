package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		BufferedDao bd = new BufferedDao();
		//bd.fileSave();
		bd.fileRead();		
		
	}

}
