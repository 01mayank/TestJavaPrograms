import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestClass {
	
	public static boolean checkEmail(String emailIds) throws Exception {
		
				Pattern p = Pattern.compile("^[\\/\\w-\\+\\.]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[0-9a-z.]{2,})$",Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(emailIds);
				if(!m.matches())
					return false;
		
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(checkEmail("test23@test.com"));
	}
}