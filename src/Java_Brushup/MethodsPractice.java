package Java_Brushup;

public class MethodsPractice {
	
	public static void main(String[] args) {
		MethodsPractice m = new MethodsPractice();
		m.data();
		String name= m.data2();
		System.out.println(name);
		
//		static keyword example.. after using the static keyword the method is no longer limited to object
//		But belongs to the whole class thus we need not to create instance of it.
		System.out.println(userData());
		
		MethodInstances MI = new MethodInstances();
		
		MI.enterName("Prashant");
		MI.enterAge(25);
		MI.enterAddress("Sec-91, Faridabad");
		MI.enterProfession("Software Development Engineer in Test");
		
		
	}
	
	public void data() {
		System.out.println("Welcome to the Tutorials");		
	}
	
	public String data2() {
		System.out.println("Welcome to the xBox Play");
		return "Hi, Prashant!";		
	}
	
	public static String userData() {
		System.out.println("Welcome to the Jungle");
		return "Hi, Nishant!";		
	}

}
