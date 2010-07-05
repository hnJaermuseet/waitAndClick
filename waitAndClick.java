import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class waitAndClick {

	/**
	 * Waits 10 seconds and clicks first mouse button in 0,0
	 * 
	 * @author Hallvard Nygard, hn@jaermuseet.no
	 * @see http://github.com/hnJaermuseet/waitAndClick
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
		try {
			Thread.sleep(10000); // 10 seconds
		} catch (InterruptedException e) {
			
		}
		
		Robot rob = new Robot();
		rob.delay(500);
		rob.mouseMove(0, 0);
		rob.delay(500);
		rob.mousePress(InputEvent.BUTTON1_MASK);
		rob.delay(100);
		rob.mouseRelease(InputEvent.BUTTON1_MASK);
		
		System.exit(1);
	}
}
