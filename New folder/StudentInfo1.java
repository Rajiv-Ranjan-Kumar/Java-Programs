class StudentInfo1{
String studentName , mobileNo , email , department , collegeName , address ;
int rollNo ;
double fee ;

void dispInfo(){
System.out.println(studentName +"\t\t"+ rollNo +"\t\t"+ fee +"\t"+ mobileNo +"\t\t"+ email +"\t\t"+ department +"\t\t"+ collegeName +"\t\t"+ address);
}

public static void main(String args[]){
System.out.println("\nStudent Name\tRoll No.\tFee\tMobile No.\tEmail Id\tDepartment\tCollege Name\tAddress\n");
new StudentInfo1().dispInfo();
//System.out.println(new StudentInfo1().studentName="Rajiv Kumar");
//System.out.println(new StudentInfo1().rollNo=202101);
new StudentInfo1().studentName="Rajiv";
new StudentInfo1().rollNo=202101;
new StudentInfo1().fee=400000;
new StudentInfo1().mobileNo="123456789";
new StudentInfo1().email="rrks.195@gmail.com";
new StudentInfo1().department="MCA";
new StudentInfo1().collegeName="SRM Univercity";
new StudentInfo1().address="Aurangabad";
//new StudentInfo1().dispInfo();
}
}