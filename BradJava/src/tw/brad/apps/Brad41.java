package tw.brad.apps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Brad41 {

	public static void main(String[] args) {
		File dir2 = new File("dir2");
		File[] files = dir2.listFiles();
		for (File file : files) {
			SimpleDateFormat sdf = 
					new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date current = new Date(file.lastModified());
			
			System.out.println(file.getName() + ":" +
					file.length() + ":" + sdf.format(current));
		}
		
		
	}

}
