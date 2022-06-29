package print10;

public class Sushi9 {

	public static void main(String[] args) {
		//合計金額
		int total = 0;
		//注文数
		int count = 0;
		//配列neta（お寿司のネタの文字列型配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		int[] price = {500,200,400,100,300};
		//配列netaインデックス1番目(要素2番目)に「アマエビ」を代入
		neta[1] = "アマエビ";
		//引数の数だけ繰り返すループ
		for(int i = 0; i < args.length ; i++){
			//設定した引数を整数型に変換
			int order = Integer.parseInt(args[i]);
			if(count >= 5){
				//カウントした数字が5以上だった場合
				//画面に出力
				System.out.println("注文できるのは5個までです");
				//ループから抜け出す
				break;
			}
			//画面に出力「マグロ」
			System.out.println(neta[order]);
			//お寿司ごとの値段を合計
			total = total + price[order];
			//注文数を加算
			count++;
		}
		//合計を画面に出力
		//合計は○○円です。
		System.out.println("合計は"+total+"円です");
	}
}
