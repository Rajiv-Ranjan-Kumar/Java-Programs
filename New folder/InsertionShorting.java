class InsertionShorting{
	
	public static void main(String args[]){
		
		int array[] = {10,2,20,5,8};
		for(int i = 0 ; i < array.length-1 ; i++){
			
			for(int j = i ; j < array.length-1 ; j++){
				if(array[j]>array[j+1]){ 	
					int temp = array[j]; 	
					array[j] = array[j+1];  
					array[j+1]=temp;
					
				}
				
			}
			
			
		}
		
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i]+"\t");
	}
}