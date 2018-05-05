import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
	public static void main(String[]args){
	Robot Xybot = new Robot();
	Xybot.setSpeed(90);
	Xybot.penDown();
	
	Xybot.turn(90);
	Xybot.move(90);
	Xybot.turn(-90);
	Xybot.move(90);


}
}