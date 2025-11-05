package seleniumBasics;

public class BrowserAndNavigationCommads extends BasePgm {
   public void browserCommands() {
	
   String title=driver.getTitle();
   System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String id =driver.getWindowHandle();
	System.out.println(id);
	String source = driver.getPageSource();
	System.out.println(source);
   }
   
   public void navigationCommands() {
	   driver.navigate().to("https://www.amazon.in/");
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
   }
	public static void main(String[] args) {
		BrowserAndNavigationCommads cmds = new BrowserAndNavigationCommads ();
		cmds.initializeBrowser();
		//cmds.browserCommands();
		cmds.navigationCommands();
	}

}
