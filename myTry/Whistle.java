package myTry;

public class Whistle {
	private String sound;
	//static String sound;
    public Whistle(String whistleSound){
        sound=whistleSound;
    }
    public void sound(){
        System.out.println(sound); 
    }
    public static void main(String[] args){
        Whistle duckWhistle=new Whistle("Kvaak");
        Whistle roosterWhistle=new Whistle("Peef");
        System.out.println(roosterWhistle.sound);
        duckWhistle.sound();
        roosterWhistle.sound();
    }

}
