interface sum1{
void add();//by defoult public & abstract
}

class Sum implements sum1{
public void add(){
int a = 10 ;
int b = 20 ;
int c = a+b;
System.out.println("Sum = " + c);
}

public static void main(String args[]){
Sum s = new Sum();
s.add();
}
}