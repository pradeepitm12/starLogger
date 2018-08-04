package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import constants.ConfiConst;

public class Writer {
	private static FileWriter fileWriter;
	
    private static final Writer inst= new Writer();

    public Writer()  {
        super();
        try{
        File file = new File(ConfiConst.FILE_Write_LOCATION);
		fileWriter = new FileWriter(file);
        }
        catch(Exception ex){
        	System.out.println(ex);
        }
    }

    public synchronized void writeToFile(String str) {
    	try{
    	fileWriter.write(str);
    	fileWriter.flush();
    	}
    	catch(Exception ex){
    		System.out.println(ex);
    	}
    	
    }

    public Writer getInstance() {
        return inst;
    }

}