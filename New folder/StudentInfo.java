class StudentInfo{
String studentName , department , collegeName , emailId , address ;
int rollNo , mobileNo ;
double fee ;

void dispInfo(){

System.out.println(studentName + "\t" + rollNo + "\t     " + department + "\t" + collegeName + "\t\t" + fee + "\t" + mobileNo + "\t" + emailId + "\t" + address);
}

public static void main(String[] args){

System.out.println("\n\nStudent Name\tRoll No.  Department\t College Name\t\t  Fee\t\tMobile No.\t    Email\t\t   Address\n");

//Input Detail's of 1st Student 
StudentInfo si = new StudentInfo();

si . studentName = "Rajiv Kumar" ;
si . rollNo = 202101 ;
si . department = "MCA" ;
si . collegeName = "SRM Univercity" ;
si . fee = 400000 ;
si . mobileNo = 1024158854 ;
si . emailId = "rrks.195@gmail.com" ;
si . address = "Aurangabad (Bihar)" ; 
si . dispInfo();

//Input Detail's of 2nd Student 
StudentInfo si1 = new StudentInfo();

si1 . studentName = "Ranjan Kumar" ;
si1 . rollNo = 202102 ;
si1 . department = "MCA" ;
si1 . collegeName = "SRM Univercity" ;
si1 . fee = 400000 ;
si1 . mobileNo = 1124158856 ;
si1 . emailId = "rajiv.195@gmail.com" ;
si1 . address = "Aurangabad (Bihar)" ; 
si1 . dispInfo();

//Input Detail's of 3rd Student 
StudentInfo si2 = new StudentInfo();

si2 . studentName = "Jay Prakash" ;
si2 . rollNo = 202103 ;
si2 . department = "MCA" ;
si2 . collegeName = "SRM Univercity" ;
si2 . fee = 400000 ;
si2 . mobileNo = 1524158846 ;
si2 . emailId = "jayprakash123@gmail.com" ;
si2 . address = "Gaya (Bihar)" ; 
si2 . dispInfo();

//Input Detail's of 4th Student 
StudentInfo si3 = new StudentInfo();

si3 . studentName = "Prakash Kumar" ;
si3 . rollNo = 202104 ;
si3 . department = "MCA" ;
si3 . collegeName = "SRM Univercity" ;
si3 . fee = 400000 ;
si3 . mobileNo = 1524158451 ;
si3 . emailId = "prakash1524@gmail.com" ;
si3 . address = "Aurangabad (Bihar)" ; 
si3 . dispInfo();

//Input Detail's of 5th Student 
StudentInfo si4 = new StudentInfo();

si4 . studentName = "Rahul Kumar" ;
si4 . rollNo = 202105 ;
si4 . department = "MCA" ;
si4 . collegeName = "SRM Univercity" ;
si4 . fee = 400000 ;
si4 . mobileNo = 1524158854 ;
si4 . emailId = "rk.12345@gmail.com" ;
si4 . address = "Aurangabad (Bihar)" ; 
si4 . dispInfo();
}
}