package abc;
import java.util.ResourceBundle;
public class App {
	public int User_Login(String uname, String pass) {
		ResourceBundle rb=ResourceBundle.getBundle("congfig");
		String u_name=rb.getString("username");
		String password=rb.getString("password");
		if(uname.equals(u_name) && pass.equals(password)) {
			System.out.print("Case Passed!!");
			return 1;
		}
		else return 0;
		
	}

}
