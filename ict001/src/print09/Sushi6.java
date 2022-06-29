package print09;

public class Sushi6 {

	public static void main(String[] args) {
		//配列neta（お寿司のネタの文字列配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		//Sushi8クラスで使用するためにコメントアウトしている
		//int[] price = {500,200,400,100,300};
		//インデックス１（２番目）を「アマエビ」に変更
		neta[1] = "アマエビ";
		//画面表示用番号
		int j = 1;
		//配列netaの文字を順番に表示する繰り返しループ
		for(int i = neta.length;i > 0;i--) {
			//画面表示用番号＋配列neta（i-1の値）
			//画面に出力
			System.out.println(j+neta[i-1]);
			//画面表示用番号をカウントアップ
			j++;
		}
	}
}
