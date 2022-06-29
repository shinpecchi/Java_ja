package print09;

public class Sushi4 {

	public static void main(String[] args) {
		//配列neta（お寿司のネタの文字列配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		int[] price = {500,200,400,100,300};
		//インデックス１（２番目）を「アマエビ」に変更
		neta[1] = "アマエビ";
		//引数インデックス０（１番目）を整数型に変換
		int neta1 = Integer.parseInt(args[0]);
		//引数インデックス０（１番目）を表示
		System.out.println(neta[neta1]);
		//引数インデックス１（２番目）を整数型に変換
		int neta2 = Integer.parseInt(args[1]);
		//引数インデックス１（２番目）を表示
		System.out.println(neta[neta2]);
		//引数インデックス２（３番目）を整数型に変換
		int neta3 = Integer.parseInt(args[2]);
		//引数インデックス２（３番目）を表示
		System.out.println(neta[neta3]);
		//配列priceの引数インデックス０～２（１番目～３番目）を合計
		int Gokei = price[neta1]+price[neta2]+price[neta3];
		//合計結果を画面に表示
		//「合計は○○円です。」
		System.out.println("合計は"+ Gokei +"円です。");
	}
}
