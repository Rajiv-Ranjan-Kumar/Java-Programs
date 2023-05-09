class Master{
	void sellingProduct(){}
	void buyProduct(){}
	void restProduct(){}
}

class FlipCard extends Master{
	
	//@Override
	void sellingProduct(){
		System.out.println("Selling Product = 70%");
	}
	
	//@Override
	void buyProduct(){
		System.out.println("Buy Product = 80%");
	}
	
	//@Override
	void restProduct(){
		System.out.println("Rest Product = 10%");
	}
}

class Amazon extends Master{
	
	//@Override
	void sellingProduct(){
		System.out.println("Selling Product = 70%");
	}
	
	//@Override
	void buyProduct(){
		System.out.println("Buy Product = 75%");
	}
	
	//@Override
	void restProduct(){
		System.out.println("Rest Product = 5%");
	}
}

class Mantra extends Master{
	
	//@Override
	void sellingProduct(){
		System.out.println("Selling Product = 80%");
	}
	
	//@Override
	void buyProduct(){
		System.out.println("Buy Product = 80%");
	}
	
	//@Override
	void restProduct(){
		System.out.println("Rest Product = 0%");
	}
}

class RunTimePolymorephisham{
	
	public static void main(String args[]){
		try{
			Class c = Class.forName(args[0]);
			Master m = (Master)c.newInstance();
			m.sellingProduct();
			m.buyProduct();
			m.restProduct();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}