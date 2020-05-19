package pro;

public class Hanoi {
	private int tray=3;
	private int bar=3;
	int count=0;
	public Hanoi(int tray) {
		this.tray=tray;
	}
	public void moveHanoi(int tray, char a, char b, char c) {
		// TODO Auto-generated method stub
		if(tray==1) {
			++count;
			System.out.println(a+"->"+b);
		}
		else {
			moveHanoi(tray-1,a,c,b);
			++count;
			System.out.println(a+"->"+b);
			moveHanoi(tray-1,c,b,a);
		}
	}
}
