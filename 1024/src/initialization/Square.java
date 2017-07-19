package initialization;

public class Square {
	/**
	 * the unit of the table, containing it's value and place
	 */
	
	int value;
	//int[] place = new int[2];
	int x;//range
	int y;//line
	
	public  Square(){
		value = 0;
		x=0;
		y=0;
	}
	
	public Square(int value, int x, int y)
	{
		this.value=value;
		this.x=x;
		this.y=y;
	}
	
	public void setValue(int valeur)
	{
		this.value=valeur;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setPlace(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

}
