package controlstmnt;

public class Digitcount {

	public static void main(String[] args) {
		int i=3456;
		int count=0;
		while(i>0) {
			i=i/10;
			count++;
			
		}
		System.out.println("digit count="+count);	
	}

}
