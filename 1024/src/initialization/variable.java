package initialization;

import java.util.Random;

public class variable {
	double random = 10*Math.random();
	int max;
	public static Square[][] base = new Square[4][4];
	
	
	public static void start(){
		Random rand = new Random();
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){
				base[j][i]=new Square(0,j,i);
				
			}
		}//initialize the table
		
		int x1 =rand.nextInt(4);
		int y1 = rand.nextInt(4);
		base[x1][y1].setValue(2);
		int x2 =rand.nextInt(4);
		int y2 = rand.nextInt(4);
		base[x2][y2].setValue(2);
	}
	


}

