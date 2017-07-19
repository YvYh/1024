package fonctions;
import initialization.variable;

public class up {
	public static void up(){
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3; j++)
			{
				if (variable.base[i][j].getValue()==0)//if the value of square(j,i) is null
				{
					int limit=j;
					do{
						limit=limit+1;
					}while((variable.base[i][limit].getValue()==0)&&(limit<3));
					//find the first square below which is not null, it's place is [i,limit]
					
					if (limit!=4)//if there exist a square with a no-zero value
					{
						//up the line below [i,limit] to [i,j] 
						/*int init = j;
						for(int b=limit; b<4; b++)
						{
							variable.base[i][init].setValue(variable.base[i][b].getValue());
							init++;
						}*/
						
						int below = limit;
						for(int b=j; b<4; b++){
							if(below<4)
							{
								variable.base[i][b].setValue(variable.base[i][below].getValue());
								below++;
							}
							else{
								variable.base[i][b].setValue(0);
							}
							
						}
					}
				}
				
				
			}
		}
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3; j++)
			{
				if (variable.base[i][j].getValue()==variable.base[i][j+1].getValue())
				{
					variable.base[i][j].setValue(2*variable.base[i][j].getValue());
					//remove the line below [i,j]  one square up
					for(int b=j+1; b<3; b++)
					{
						variable.base[i][b].setValue(variable.base[i][b+1].getValue());
					}
				}
			}
		}
	}

}
