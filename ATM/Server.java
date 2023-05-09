import java.util.*;
class Atm
{
	Scanner sc = new Scanner(System.in);

//With return without argument member function/method for Input Card Number
	int inputCard()
	{
		int carcNumber = 0 ;
		System.out.println("\t\t\t========================");
		System.out.println("\t\t\tSorry Card isn't Available\n\t\t\tBut Card Number is Available\n\t\t\tSo Please Input Card Number");
		System.out.println("\t\t\t========================");
		System.out.println("\t\t\t1st Card Number = 1234\n\t\t\t2nd Card Number = 1235\n\t\t\t3rd Card Number = 1236\n\t\t\t4th Card Number = 1237\n\t\t\t5th Card Number = 1238");
		System.out.println("\t\t\t========================");
		System.out.print("\t\t\tSelect Your Card : ");
		carcNumber = sc.nextInt();
		return carcNumber;
	}


//With return without argument member function/method for Display Message of Wrong Crad
	void disp()
	{
		System.out.println("\n\t\t\tInvalid Card");
	}


//With return without argument member function/method for Display Message of Wrong Pin
	void display()
	{
		System.out.println("\n\t\t\tInvalid Pin");
	}

//With return without argument member function/method for Select Language
	int selectLanguage()
	{
		int lang = 0 , x = 0;
		System.out.print("\n\n\t\t\t1 Hindi\t\t2 English\n\t\t\tSelect Your Language : ");
		lang = sc.nextInt();
		if(lang==1)
		{
			System.out.print("\n\t\t\tThis Language is Not Support Please Continue in English\n\t\t\tPlease Enter 2 and Continue : ");
			lang = sc.nextInt();
		}
		if(lang==2)
		{
			Atm a1 = new Atm();
			x=a1.inputPin();
			return x;
		}
		if(lang!=1||lang!=2)
			System.out.println("\n\t\t\tWrong Option");

		return 0;
	}


//With return without argument member function/method for Input Pin Number
	int inputPin()
	{
		int pin = 0 ;
		System.out.print("\n\n\t\t\tEnter Pin : ");
		pin = sc.nextInt();
		return pin;
	}


//With return without argument member function/method for Display Some Options And Input Choice
	int mainMenu()
	{
		int op = 0 , amo = 0;
		System.out.print("\n\n\t\t\t1 Withdrawal\t\t2 Balance Enquiry\n\t\t\t3 Change Password\t4 Exit\n\t\t\tSelect Option : ");
		op = sc.nextInt();
		if(op==1)
		{
			System.out.print("\n\t\t\tEnter Amount : ");
			amo = sc.nextInt();
			if(amo > 0)
				return amo ;
			else
				System.out.println("\t\t\tPlease Enter Valid Amount");
		}
		else if(op==2)
			return -1 ;
		else if(op==3)
			return -2;
		else if(op==4)
			return -3;
		else
			System.out.println("\t\t\tWrong Option");
		return 0;

	}


//With return with argument member function/method for Display Transaction Related Message
	void disp1(int b , int b2)
	{
		System.out.println("\n\t\t\tTransaction Succesfull\n\t\t\tTotal Amount = "+(b+b2));
		System.out.println("\t\t\tWithdrawal = "+b2);
		System.out.println("\t\t\tAvailable Amount = "+b);
	}


//With return with argument member function/method for Input New Pin Number
	int newPin(int p)
	{
		int p2=0 , p3=0 ;
		System.out.print("\n\n\t\t\tEnter Old pin : ");
		p2 = sc.nextInt();
		if(p==p2)
		{
			System.out.print("\n\t\t\tEnter New pin : ");
			p3 = sc.nextInt();
			return p3;
		}
		else
			System.out.println("\n\t\t\tEnvalid Old Pin");
		return 0;

	}


//With return with argument member function/method for Display Pin Changing Related message
	void disp3(int p5 , int p6)
	{
		System.out.println("\n\t\t\tPin Changing Succesfull");
		System.out.println("\t\t\tOld Pin = "+p6+"\t\tNew Pin = " +p5);
	}

//With return with argument member function/method for isplay Balance Enquiry message
	void disp4(int b)
	{
		System.out.println("\n\t\t\tTotal Amount = "+b);
	}

//Without return without argument member function/method for Exiting message
	void disp5()
	{
		System.out.println("\n\t\t\tThank You");
	}
}



class CustomerAccount
{
	int cardNo,pinCode;
	int blance ;


//Without return with argument member function/method for input data
	void inputData(int c , int p , int b)
	{
		cardNo = c ;
		pinCode= p ;
		blance = b ;
	}


//With return with argument member function/method for Chack Card Number
	String cardChack(int cn)
	{
		if(cardNo==cn)
			return "valid";
		else
			return "Invalid";
	}


//With return with argument member function/method for Chack Pin Number
	String chackPin(int cn,int pin2)
	{
		if(cardNo==cn && pinCode == pin2)
			return  "valid";
		else
			return"invalid";
	}

//With return with argument member function/method for Withdrawal Balance
	int withdrawal(int am)
	{
		blance = blance-am;
		return blance;
	}


//With return without argument member function/method for Chack Balance
	int chackAmount()
	{
		return blance;
	}


//With return with argument member function/method for Change Pin Number
	int changePin(int p)
	{
		pinCode = p ;
		return pinCode;

	}

}

class Server
{


	public static void main(String args[])
    {
		int cn = 0 , pin2 = 0 , t = 0 , b=0,p2=0,p3=0 ,amount = 0,bl = 0 ;
		String verify="",p1="";

		CustomerAccount Ac1 = new CustomerAccount();
		CustomerAccount Ac2 = new CustomerAccount();
		CustomerAccount Ac3 = new CustomerAccount();
		CustomerAccount Ac4 = new CustomerAccount();
		CustomerAccount Ac5 = new CustomerAccount();

		Ac1.inputData(1234,1424,10000);
		Ac2.inputData(1235,1425,15000);
		Ac3.inputData(1236,1426,20000);
		Ac4.inputData(1237,1427,50000);
		Ac5.inputData(1238,1428,70000);

		Atm a = new Atm();
		cn = a.inputCard();


		verify=Ac1.cardChack(cn);
		if(verify=="valid")
			pin2 = a.selectLanguage();
		else
		{
			verify=Ac2.cardChack(cn);
			if(verify=="valid")
				pin2 = a.selectLanguage();

			else
			{
				verify=Ac3.cardChack(cn);
				if(verify=="valid")
					pin2 = a.selectLanguage();
				else
				{
					verify=Ac4.cardChack(cn);
					if(verify=="valid")
						pin2 = a.selectLanguage();
					else
					{
						verify=Ac5.cardChack(cn);
						if(verify=="valid")
							pin2 = a.selectLanguage();
						else
						{	a.disp(); t=1; }
					}
				}
			}
		}





		p1=Ac1.chackPin(cn , pin2);
		if(p1=="valid")
		{
			amount=a.mainMenu();
			if(amount==-1)
			{
				bl=Ac1.chackAmount();
				a.disp4(bl);
			}
			else if(amount==-2)
			{
				p2=a.newPin(pin2);
				if(p2!=0)
				{
					p3=Ac1.changePin(p2);
					a.disp3(p3,pin2);
				}
			}
			else if(amount==-3||amount==0)
			{
				a.disp5();
			}
			else
			{	b=Ac1.withdrawal(amount);
				a.disp1(b ,amount);
			}
		}
		else
		{
			p1=Ac2.chackPin(cn , pin2);
			if(p1=="valid")
			{
				amount=a.mainMenu();
				if(amount==-1)
				{
					bl=Ac2.chackAmount();
					a.disp4(bl);
				}
				else if(amount==-2)
				{
					p2=a.newPin(pin2);
					if(p2!=0)
					{
						p3=Ac2.changePin(p2);
						a.disp3(p3,pin2);
					}
				}
				else if(amount==-3||amount==0)
				{
					a.disp5();
				}
				else
				{
					b=Ac2.withdrawal(amount);
					a.disp1(b ,amount);
				}
			}
			else
			{
				p1=Ac3.chackPin(cn , pin2);
				if(p1=="valid")
				{
					amount=a.mainMenu();
					if(amount==-1)
					{
						bl=Ac3.chackAmount();
						a.disp4(bl);
					}
					else if(amount==-2)
					{
						p2=a.newPin(pin2);
						if(p2!=0)
						{
							p3=Ac3.changePin(p2);
							a.disp3(p3,pin2);
						}
					}
					else if(amount==-3||amount==0)
					{
						a.disp5();
					}
					else
					{	b=Ac3.withdrawal(amount);
						a.disp1(b ,amount);
					}
				}
				else
				{
					p1=Ac4.chackPin(cn , pin2);
					if(p1=="valid")
					{
						amount=a.mainMenu();
						if(amount==-1)
						{
						bl=Ac4.chackAmount();
						a.disp4(bl);
						}
						else if(amount==-2)
						{
							p2=a.newPin(pin2);
							if(p2!=0)
							{
								p3=Ac4.changePin(p2);
								a.disp3(p3,pin2);
							}
						}
						else if(amount==-3||amount==0)
						{
							a.disp5();
						}
						else
						{
							b=Ac4.withdrawal(amount);
							a.disp1(b ,amount);
						}
					}
					else
					{
						p1=Ac5.chackPin(cn , pin2);
						if(p1=="valid")
						{
							amount=a.mainMenu();
							if(amount==-1)
							{
								bl=Ac5.chackAmount();
								a.disp4(bl);
							}
							else if(amount==-2)
							{
								p2=a.newPin(pin2);
								if(p2!=0)
								{
								p3=Ac5.changePin(p2);
								a.disp3(p3,pin2);
								}
							}
							else if(amount==-3||amount==0)
							{
								a.disp5();
							}
							else
							{	b=Ac5.withdrawal(amount);
								a.disp1(b ,amount);
							}
						}
						else
						{
							if(t==0&&pin2!=0)
								a.display();
						}
					}
				}
			}
		}

	}
}