package myTry;

public class objAndConstructor {
	int x=10;
	int y=20;
	
	public objAndConstructor(int y){
		x=30;
		y=y*2;
		
	}
	public static void main(String[] args) {
		objAndConstructor obj1=new objAndConstructor(89);
		//obj1.x=25;
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	
	}

}
