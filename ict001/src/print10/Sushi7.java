package print10;

public class Sushi7 {

	public static void main(String[] args) {
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//int[] price = {500,200,400,100,300};
		neta[1] = "アマエビ";
		int order = 0;
		for(int i = 0; i < args.length ; i++){
			order = Integer.parseInt(args[i]);
			System.out.println(neta[order]);
		}
	}
}
