import java.util.*;
class InputString{
String name , email , address , mobileNo ;

void dispInfo(){
System.out.println("\n" + name + "\t" + mobileNo + "\t" + email + "\t" + address);
}

void inputInfo(){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a Name : ");
name = sc.nextLine();
System.out.print("Enter Mobile No : ");
mobileNo = sc.nextLine();
System.out.print("Enter Email Address : ");
email = sc.nextLine();
System.out.print("Enter Address : ");
address = sc.nextLine();
}
public static void main(String args[]){

InputString is = new InputString() ;
is.inputInfo();
InputString is1 = new InputString() ;
is1.inputInfo();
is.dispInfo();
}
}