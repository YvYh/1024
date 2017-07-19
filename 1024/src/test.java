import initialization.variable;
import fonctions.up;

public class test {
	
	public static void printTable(){
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){
				System.out.print(variable.base[j][i].getValue()+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		variable.start();
		printTable();
		up.up();
		System.out.println();
		printTable();
		
		

	}

}
