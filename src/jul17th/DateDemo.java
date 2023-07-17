package jul17th;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//System.out.println(new Date());
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date=simpleDateFormat.format(new Date());
		
		System.out.println(date);
		
		date= date.replace(":", "-");
		
		System.out.println(date);
		

	}

}
