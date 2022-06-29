package print10;

public class Sushi7 {

	public static void main(String[] args) {
		//配列neta（お寿司のネタの文字列型配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		//Sushi8クラスで使用するためにコメントアウトしている
		//int[] price = {500,200,400,100,300};
		//インデックス１（２番目）を「アマエビ」に変更
		neta[1] = "アマエビ";
		//引数を代入する変数
		int order = 0;
		//引数の数だけ繰り返すループ
		for(int i = 0; i < args.length ; i++){
			//設定した引数を整数型に変換
			order = Integer.parseInt(args[i]);
			//画面に出力「マグロ」
			System.out.println(neta[order]);
		}
	}
}
