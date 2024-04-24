package trial;

public class Xpath_Practice {
	
//	Login Button using parent-child xpath
	private String loginButton="//header/div/button[1]/following-sibling::button[1]";
	
	public String GetloginButton() {
		return loginButton;
	}

}
