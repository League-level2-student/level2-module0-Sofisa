package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	Random randy = new Random();
	//3. use a for loop to initialize the robots.
	//while(robots[5].getY() > 0) {	
	for (int i = 0; i < robots.length; i++) {
		robots[i] = new Robot();
		robots[i].miniaturize();
		robots[i].setX(650);
		robots[i].setY(300);
		robots[i].setSpeed(randy.nextInt(90));
		robots[i].getY();
		

	}
	
	
		
	for (int j = 0; j < 2100; j++) {
		
		
	for (int k = 0; k < robots.length; k++) {
		int random = randy.nextInt(10);
		
		if (random >= 9) {
			
		
		robots[k].move(20);
		robots[k].turn(-5);
		robots[k].getX();
	}
	
	if(robots[k].getX() > 645 && j > 70) {
		JOptionPane.showMessageDialog(null, "WINNER");
	}
	}		
	}	
		
	
	
	
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}