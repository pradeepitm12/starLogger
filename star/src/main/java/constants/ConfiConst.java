package constants;

import utils.PropReader;
public final class ConfiConst {

	private void ConfigConst(){

	}

	public static final String FILE_Write_LOCATION = PropReader.getProperty("file_write_location ");
	public static final int LOG_LEVEL= Integer.parseInt(PropReader.getProperty("star.log.level"));
	public static final String FILE_SYNC =  PropReader.getProperty("star.log.sync");
	public static final String LOG_TPE=PropReader.getProperty("star.log.sync");
}
