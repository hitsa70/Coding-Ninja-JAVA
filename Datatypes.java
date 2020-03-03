
public class DataType {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c + 3);
		
		int i = c + 10;
		System.out.println(i);
		
		i = c;
    //char abc = i;    NOT POSSIBLE
		
		long l = i;
		//i = l;      NOT POSSIBLE
		
		double d = i;
		//i = d;      NOT POSSIBLE
		
		float f = 1.23f;
		//f = d;      NOT POSSIBLE
		d = f;
		
		int j = 100;
		
	}

}
