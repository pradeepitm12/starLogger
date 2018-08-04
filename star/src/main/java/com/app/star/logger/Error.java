package com.app.star.logger;

import constants.ConfiConst;
import utils.Writer;

public class Error implements StarLogger{

	Writer writer=new Writer();
	public void log(String str) {
		switch(ConfiConst.LOG_LEVEL){
		case 1:{
					writer.getInstance().writeToFile("error : " + str);
		}
		
		case 2:
			System.out.println(str);
			
		default:{}
			
		}		
	}

	public void syncLog() {
		
	}

}
