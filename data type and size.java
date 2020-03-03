//Every variable should have a type 
//Detects error before compiling because build automatically is selected in eclipse

public class add2num {

	public static void main(String[] args) {

		int i=10;  //4 byte
		int j=15;	//4 byte
		int k=i+j;
		
		
		short s=123;	//2 byte
		long l=123456;	//8 byte
		
		float f=14.456f;		//4 byte 
		//here 'f' is used at the end because bydefault java takes every floating number as  double
		double d=1.2333;		//8 byte
	
		char c ='a';		//2 byte
		
		boolean b= true;
		boolean otherb=false;  
		
		System.out.println(k);
		
	}

}
