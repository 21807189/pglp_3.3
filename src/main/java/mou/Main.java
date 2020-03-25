import java.awt.Robot;
import java.util.Scanner;

public class Main {
	
public static void main(String[]args ){
	Position o=new Position(5,4);
	Direction d=new Direction(1);
	
	Robotmobile r=new Robotmobile(o,d);
	
	
	r.avance();
}
}
