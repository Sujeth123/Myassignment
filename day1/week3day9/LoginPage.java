package week3day9;

public class LoginPage extends BasePage{

	
	
	public void performCommonTasks(String commonTask) {
		
		super.performCommonTasks("The task is from the class BasePage");
		
		System.out.println("The class from  LoginPage " + commonTask );


	}
	
	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		
		lp.performCommonTasks("The task is from the class LoginPage");
		


	}

}
