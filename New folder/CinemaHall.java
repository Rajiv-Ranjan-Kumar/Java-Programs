class CinemaHall{
String customerName , movieName , aadharNo ;
float fee ;

void dispInfo(){
System.out.println("\t"+ customerName +"\t\t"+ movieName +"\t\t"+ fee +"\t"+ aadharNo);
}

public static void main(String args[]){
System.out.println("\n\tCUSTOMER NAME\tMOVIE NAME\tFEE\tAADHAR NO.");
//No Data Input
CinemaHall ch ;
ch = new CinemaHall() ;
ch.dispInfo(); //Call FispInfo Method/Function

//First Data Input
CinemaHall ch1 ;
ch1 = new CinemaHall() ;
ch1.customerName = "Rajiv" ;
ch1.movieName = "Sidat" ;
ch1.fee = 120.50f ;
ch1.aadharNo = "1234567898547";
ch1.dispInfo();  //Call FispInfo Method/Function

//Second Data Input
CinemaHall ch2 ;
ch2 = new CinemaHall() ;
ch2.customerName = "Gautam" ;
ch2.movieName = "Sole" ;
ch2.fee = 120.50f ;
ch2.aadharNo = "4561239878569" ;
ch2.dispInfo();  //Call FispInfo Method/Function

//Display All Refrence Address of Class Objects
System.out.println("\nRefrence Address of Ref(ch) = " + ch);
System.out.println("Refrence Address of Ref(ch1) = " + ch1);
System.out.println("Refrence Address of Ref(ch2) = " + ch2);
}
}