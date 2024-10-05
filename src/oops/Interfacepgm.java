package oops;

interface Bike
{
public void speedlimit();

}
class Honda implements Bike{

	@Override
	public void speedlimit() {
System.out.println("honda speed limit");		
	}
	
}

class Splendor implements Bike{

	@Override
	public void speedlimit() {
System.out.println("splendor speedlimit");		
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
Splendor sp=new Splendor();
sp.speedlimit();
	}

}
