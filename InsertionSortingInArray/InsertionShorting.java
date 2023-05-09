import java.util.Scanner;
class InsertionShorting{
	
	
	public static void main(String args[]){
		
		int array[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10 ; i++){
			System.out.println("Enter "+(i+1)+"Element : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("\n\t\tInput Element ");
		for(int i=0; i<10 ; i++)
			System.out.print(array[i]+"\t");
		
		//Start Shorting Logic		
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0 ; j < 9 ; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		//Print Shorted Element
		System.out.println("\n\t\tShorted Element ");
		for(int i=0; i<10 ; i++)
			System.out.print(array[i]+"\t");
	} 
}