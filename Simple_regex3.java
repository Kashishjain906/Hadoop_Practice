package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple_regex3 
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile( "^([0-2][0-5]{2})\\.([0-9]{3})\\.([0-9]{2,3})\\.([0-9]{3}):([0-9])$");
		Matcher m =p.matcher("255.123.91.197:2");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());	
		}
	}

}

//for IP address