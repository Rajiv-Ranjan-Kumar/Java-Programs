public class aa{

public static void main(String args[]){

for(int i = 1 ; i < 10 ; i++){
for(int j = 1 ; j <= 5 ; j++){
if(i==1&&j==5||i==2&&j==4||i==2&&j==5||i==3&&j==3||i==3&&j==4||i==3&&j==5||i==4&&j==2||i==4&&j==3||i==4&&j==4||i==4&&j==5||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==3||i==5&&j==4||i==5&&j==5)
System . out . print("*");
else if(i==6&&j==2||i==6&&j==3||i==6&&j==4||i==6&&j==5||i==7&&j==3||i==7&&j==4||i==7&&j==5||i==8&&j==4||i==8&&j==5||i==9&&j==5)
System . out . print("*");
else
System.out.print(" ");

}
System . out . println();
}

}}