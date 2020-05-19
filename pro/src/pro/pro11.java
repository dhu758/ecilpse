package pro;

public class pro11 {
	public static void main(String[] args) {
		int tray=4;
		Hanois ha=new Hanois(tray);
		int[][] a=ha.getRings();
		//HanoisUtil.showHanoi(a);
		HanoisUtil.moveHanoi(a,tray,'a','b','c');
	}
}
