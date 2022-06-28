package print10;

public class Sushi8 {

	public static void main(String[] args) {
		int order = 0;
		int pay = 0;
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		int[] price = {500,200,400,100,300};
		neta[1] = "アマエビ";
		for(int i = 0; i < args.length ; i++){
			order = Integer.parseInt(args[i]);
			System.out.println(neta[order]);
			pay = pay + price[order];
		}
		System.out.println("合計は"+pay+"円です");
	}
}
