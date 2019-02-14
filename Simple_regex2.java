package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple_regex2 
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile( "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}$");
		Matcher m =p.matcher("05/12/1996");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());	
		}
	}

}

// Date
//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
//^ = Finds regex that must match at the beginning of the line
//$ =Finds regex that must match at the end of the line.
