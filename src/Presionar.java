import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Presionar {
	
	private Robot r;
	private boolean condicional;
	
	public Presionar(){
		
	}
	
	public void metodo(){	
			try {
				r = new Robot();
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
				
				try{
					 Thread.sleep(2000);
				}
				catch(Exception es){}
				
				r.keyPress(KeyEvent.VK_RIGHT);
				r.keyRelease(KeyEvent.VK_RIGHT);
				
				r.keyPress(KeyEvent.VK_RIGHT);
				r.keyRelease(KeyEvent.VK_RIGHT);
				
				try{
					 Thread.sleep(2000);
				}
				catch(Exception es){}
				
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				try{
					 Thread.sleep(2000);
				}
				catch(Exception es){}
				
				
				r.keyPress(KeyEvent.VK_LEFT);
				r.keyRelease(KeyEvent.VK_LEFT);
				
				r.keyPress(KeyEvent.VK_LEFT);
				r.keyRelease(KeyEvent.VK_LEFT);
				
				try{
					 Thread.sleep(2000);
				}
				catch(Exception es){}
				
				
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
