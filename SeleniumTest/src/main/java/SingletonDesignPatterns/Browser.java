package SingletonDesignPatterns;

public class Browser {

	private static Browser browser;
	
	private Browser() {
	
	}
	
	public static Browser getInstance() {
		if(browser==null) {
			//synchronized (Browser.class) {
				if(browser == null) {
					browser = new Browser();
				}
			//}
		}
		return browser;
	}
	
	public static void displayMsg() {
		System.out.println("Browser info");
		System.out.println(Thread.currentThread().getName());
	}
}
