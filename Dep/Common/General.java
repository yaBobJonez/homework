package Common;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class General {
	public static String OS_Name = System.getProperty("os.name");
	public static String OS_Version = System.getProperty("os.version");
	public static InputStream STDIN = System.in;
	public static OutputStream STDOUT = System.out;
	public static PrintStream STDERR = System.err;
	
	public static long currentTime(){
		return new Date().getTime();
	} public static String formatTime(long time, String format){
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(time);
	}
	@SuppressWarnings("null")
	public static long parseTime(String time, String format){
		SimpleDateFormat df = new SimpleDateFormat(format);
		try{
			Date dt = df.parse(time);
			return dt.getTime();
		} catch(ParseException e){ return (Long)null; }
	}
	public static int random(int min, int max){
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	public static int[] range(int min, int max){
		int[] arr = new int[max-min+1];
		for(int i = min; i <= max; i++) arr[i] = i;
		return arr;
	} public static int[] range(int min, int max, int step){
		int[] arr = new int[(max-min)/2+1];
		for(int i = min; i <= max; i += step) arr[i] = i;
		return arr;
	}
	public static void raiseError(String mes){
		System.err.print(mes); System.exit(1);
	}
}