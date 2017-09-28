import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleSoapMethods {
	
	public String sayHello(String name){
		
		return "Hello " + name;
	}
	
	public int calcAdd(int num1, int num2){
		return num1+num2;
	}
	
	public String date(){
		String string="";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		string=dateFormat.format(cal); //2016/11/16 12:08:43
		
		return string;
	}

}
