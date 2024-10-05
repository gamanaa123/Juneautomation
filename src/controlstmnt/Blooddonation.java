package controlstmnt;

public class Blooddonation {

	public static void main(String[] args) {
		int age=18,weight=60;
		if(age>=18) {
			if(weight>=55){
				System.out.println("elegible");
			}
		  	else {
				System.out.println("not eligible");
			}
		}
		else {
			System.out.println("under age");
		}
	}

}
