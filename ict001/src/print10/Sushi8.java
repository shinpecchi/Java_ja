package print10;

public class Sushi8 {

	public static void main(String[] args) {
		//引数を代入する変数
		int order = 0;
		//合計金額
		int pay = 0;
		//配列neta（お寿司のネタの文字列型配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		int[] price = {500,200,400,100,300};
		//配列netaインデックス1番目(要素2番目)に「アマエビ」を代入
		neta[1] = "アマエビ";
		//引数の数だけ繰り返すループ
		for(int i = 0; i < args.length ; i++){
			//設定した引数を整数型に変換
			order = Integer.parseInt(args[i]);
			//画面に出力「マグロ」
			System.out.println(neta[order]);
			//お寿司ごとの値段を合計
			pay = pay + price[order];
		}
		//合計を画面に出力
		//合計は○○円です。
		System.out.println("合計は"+pay+"円です");
	}
}
