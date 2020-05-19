package pro;

public class pro08 {
	public static void main(String[] args) {
		int tray=3;
		Hanoi ha=new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');
	}
}
