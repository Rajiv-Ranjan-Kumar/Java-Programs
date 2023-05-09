import java.util.Scanner;
public class Main {
int index = 0 ;

	
	UserRegisterAccount storeAccountAddress[] = new UserRegisterAccount [10];
	Scanner sc = new Scanner(System.in);
	
	
	void mainMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t\t\t\t\t\t*              -------------------              *");
		System.out.println("\t\t\t\t\t\t\t*             |     Main Menu     |             *");
		System.out.println("\t\t\t\t\t\t\t*              -------------------              *");
		System.out.println("\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t\t\t\t\t\t*                                               *");
		System.out.println("\t\t\t\t\t\t\t*    1. Register                 2. Login       *");
		System.out.println("\t\t\t\t\t\t\t*                                               *");
		System.out.println("\t\t\t\t\t\t\t*    3. Forget Password          4. Exit        *");
		System.out.println("\t\t\t\t\t\t\t*                                               *");
		System.out.println("\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		do{
			System.out.print("\t\t\t\t\t\t\t\tEnter Your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
		
		
			if(choice == 1 || choice == 2 || choice == 3 || choice == 4){
				if(choice == 1) {
					registerAccount();
					mainMenu();
					break;
				}
				else if(choice == 2) {
					login();
					mainMenu();
					break;
				}
				else if(choice == 3){
					ForgetPassword();
					mainMenu();
					break;
				}
				else{
					System.exit(choice);
					break;
				}
			}
			else {
				System.out.println("\n\t\t\t\t\t\t\t\tWroung Choice...");
			}
		}while(true);
	}
	
	
	
	
	void registerAccount(){
		UserRegisterAccount accountAddress = classReturnObject();
		System.out.print("\n\n\n");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t      ---->     Registration Form      <----     ");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t                                                 ");
		System.out.print("\n\t\t\t\t\t\t\t   Name       : ");
		String name = sc.nextLine();
		accountAddress.setName(name , index);
		
		System.out.print("\n\t\t\t\t\t\t\t   Mobile No. : ");
		String mobileNo = sc.nextLine();
		accountAddress.setMobileNo(mobileNo , index);
		
		System.out.print("\n\t\t\t\t\t\t\t   Email      : ");
		String email = sc.nextLine();
		accountAddress.setEmail(email , index);
		
		System.out.print("\n\t\t\t\t\t\t\t   Password   : ");
		String password = sc.nextLine();
		accountAddress.setPassword(password , index);
		
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\n\t\t\t\t\t\t\t\tRegistration Complete");
		
		accountAddress.setAccountAddress(accountAddress);
		index = index + 1;
	}
	
	
	void ChangeAddress(UserRegisterAccount id , int index){
		System.out.print("\n\t\t\t\t\t\t\t City          : ");
		String city = sc.nextLine();
		id.setCity(city , index);
		
		System.out.print("\n\t\t\t\t\t\t\tPost Office    : ");
		String postOffice = sc.nextLine();
		id.setPostOffice(postOffice , index);
		
		System.out.print("\n\t\t\t\t\t\t\tPolice Station : ");
		String policeStation = sc.nextLine();
		id.setPoliceStation(policeStation , index);
		
		System.out.print("\n\t\t\t\t\t\t\t District      : ");
		String district = sc.nextLine();
		id.setDistrict(district , index);
		
		System.out.print("\n\t\t\t\t\t\t\t State         : ");
		String state = sc.nextLine();
		id.setState(state , index);
		
		System.out.print("\n\t\t\t\t\t\t\t PinCode       : ");
		int pinCode = sc.nextInt();
		sc.nextLine();
		id.setPinCode(pinCode , index);
		
	}
	
	void login() {
		int flag = 0 ;
		System.out.print("\n\n\n");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t      ---->        Login Form          <----     ");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t                                                 ");
		System.out.print("\n\t\t\t\t\t\t\t     User Name   : ");
		String name = sc.nextLine();
		System.out.print("\n\t\t\t\t\t\t\t     Password    : ");
		String password = sc.nextLine();
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		
		for(int j = 0 ; j < index; j++) {
			UserRegisterAccount x = getAccountAddress(j);
			UserRegisterAccount p=UserRegisterAccount.getAccountAddress(j);
			if(name.equals(p.getName(j)) && password.equals(p.getPassword(j))) {
				displayProfile(x,j);
				menu(x,j);
				flag = 1 ;
				break;
			}
			AdminRegisterAccount y = classReturnObject1();
			if(name.equals(y.getName(j)) && password.equals(y.getPassword(j))){
				System.out.println("Rajiv");
				flag = 1 ;
				break;
				}
			}
		}
		
		if(flag == 0)
			System.out.print("\n\t\t\t\t\t\t\t\tWroung UserName and Password..");
	}
	
	
	void ForgetPassword() {
		int flag = 0;
		System.out.print("\n\n\n");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t      ---->       Password Forget      <----     ");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t                                                 ");
		System.out.print("\n\t\t\t\t\t\t\t     User Name   : ");
		String name = sc.nextLine();
		System.out.print("\n\t\t\t\t\t\t\t     Email Id    : ");
		String email = sc.nextLine();
		System.out.print("\n\t\t\t\t\t\t\t     Mobile No   : ");
		String mobileNo = sc.nextLine();
		
		
		for(int j = 0 ; j < index ; j++) {
			UserRegisterAccount x = getAccountAddress(j);
			if(name.equals(x.getName(j)) && email.equals(x.getEmail(j)) && mobileNo.equals(x.getMobileNo(j))) {
				System.out.print("\n\t\t\t\t\t\t\t Enter New Password   : ");
				String password = sc.nextLine();
				System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
				System.out.print("\n\t\t\t\t\t\t\t   Password  Updated... ");
				x.setPassword(password , j);
				flag = 1 ;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.print("\n\t\t\t\t\t\t\t     Invalid User Name , Email and Mobile No.");
		}
	}	
	
	
	void displayProfile(UserRegisterAccount id , int index) {
		System.out.print("\n\n\n");
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t        Welcome " + id.getName(index));
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("\n\t\t\t\t\t\t\t                                                 ");
		System.out.print("\n\t\t\t\t\t\t\t   Name       : " + id.getName(index));
		System.out.print("\n\t\t\t\t\t\t\t   Mobile No. : " + id.getMobileNo(index));
		System.out.print("\n\t\t\t\t\t\t\t   Email      : " + id.getEmail(index));
		System.out.print("\n\t\t\t\t\t\t\t-------------------------------------------------");
	}
	
	
	void displayAddress(UserRegisterAccount id , int index) {
		System.out.print("\n\t\t\t\t\t\t\t   City           : " + id.getCity(index));
		System.out.print("\n\t\t\t\t\t\t\t   Post Office    : " + id.getPostOffice(index));
		System.out.print("\n\t\t\t\t\t\t\t   Police Station : " + id.getPoliceStation(index));
		System.out.print("\n\t\t\t\t\t\t\t   District       : " + id.getDistrict(index));
		System.out.print("\n\t\t\t\t\t\t\t   PinCode        : " + id.getPinCode(index));
		System.out.print("\n\t\t\t\t\t\t\t   State          : " + id.getState(index));
		System.out.print("\n\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *");
	}
	
	
	void menu(UserRegisterAccount id , int index){
		System.out.print("\n\t\t\t\t\t\t\t-------------------------------------------------");
		System.out.print("\n\t\t\t\t\t\t\t  1. View Profile\t\t2. Shoping\n\t\t\t\t\t\t\t  3. My Wishlist\t\t4. Log Out");
		System.out.print("\n\t\t\t\t\t\t\t  Enter Your Choice  : " );
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice == 1){
			displayProfile(id , index);
			displayAddress(id , index);
			do{
				System.out.print("\n\t\t\t\t\t\t\tDo You Want To Change Your Address(y/n) : " );
				String choice1 = sc.next();
				sc.nextLine();
				if(choice1.equals("y")||choice1.equals("Y")){
					ChangeAddress(id,index);
					menu(id , index);
					break;
				}
				else if(choice1.equals("n")||choice1.equals("N")){
					menu(id , index);
					break;
				}
				else{
					System.out.print("\n\t\t\t\t\t\t\t\t\tWroung Choice" );
				}
			}while(true);
		}
		else if(choice == 2){
			
		}
		else if(choice == 3){
			
		}
		else if(choice == 4){
			mainMenu();
		}
		else{
			System.out.print("\n\t\t\t\t\t\t\t   Wrong Choice" );
			menu(id , index);
		}
	}
	
	
	void setAccountAddress(UserRegisterAccount accountAddress){
		storeAccountAddress[index] = accountAddress ;
	}
	
	
	UserRegisterAccount getAccountAddress(int num){
		for(int i = 0 ; i < index ; i++)
		{
			if(num == i)
				return storeAccountAddress[i];
		}
		return storeAccountAddress[num];
	}
	
	UserRegisterAccount classReturnObject(){
		return new UserRegisterAccount();
	}
	
	AdminRegisterAccount classReturnObject1(){
		return new AdminRegisterAccount();
	}
	
	
	public static void main(String args[]) {
		Main m = new Main();
		m.mainMenu();
	}
}
