public class Dill{
public static void main(String args[]){
for(int i = 1 ; i <= 13 ; i++)
{
	for(int j = 1 ; j <= 13 ; j++)
		{
			if(i == 1 && j == 3 || i == 1 && j == 5  || i == 1 && j == 9 || i == 1 && j == 11) // For 1st Row
				System.out.print("*");
			else if(i == 2 && j == 2 || i == 2 && j == 7 || i == 2 && j == 12) // For 2nd Row
				System.out.print("*");
			else if(i == 3 && j == 1 || i == 3 && j == 13) // For 3rd Row
				System.out.print("*");
			else if(i == 4 && j == 1 || i == 4 && j == 13) // For 4th Row
				System.out.print("*");
			else if(i == 5 && j == 2 || i == 5 && j == 12) // For 5th Row
				System.out.print("*");
			else if(i == 6 && j == 3 || i == 6 && j == 11) // For 6th Row
				System.out.print("*");
			else if(i == 7 && j == 5 || i == 7 && j == 9) // For 7th Row
				System.out.print("*");
			else if(i == 8 && j == 7) // For 8th Row
				System.out.print("*");
			else 
				System.out.print(" ");
		}
	System.out.print("\n");
}
}}