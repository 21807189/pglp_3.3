
public class Robotmobile extends robot{

	
	public Robotmobile(Position position, Direction direction) {
		super(position, direction);
		// TODO Auto-generated constructor stub
	}
	Position x1 = null;
	
	public void avance(){
		
		
		position.setX(position.getX()+x1.getX());
		position.setY(position.getY()+x1.getY());
		System.out.println();
	}
	public void tourn(){}
}
