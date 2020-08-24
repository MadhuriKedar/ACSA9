package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class P40 {
	//to perform mouse actions
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		Robot r1 = new Robot();
		
		for(int i=1;i<500;i=i+50) {
			r1.mouseMove(i, 100);
			Thread.sleep(500);
		}
	}
}
