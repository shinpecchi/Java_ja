package print10;

public class Sushi12 {

	public static void main(String[] args) {
		//配列neta（お寿司のネタの文字列型配列）
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		//配列price（お寿司の値段の整数型配列）
		int[] price = {500,200,400,100,300};
		//配列number（お寿司のネタの注文個数）
		int[] number = {0,0,0,0,0};	
		//合計金額
		int total = 0;
		//注文数
		int count = 0;
		//配列netaインデックス1番目(要素2番目)に「アマエビ」を代入
		neta[1] = "アマエビ";
		//引数の数だけ繰り返すループ
		for(int i = 0; i < args.length ; i++){
			//設定した引数を整数型に変換
			int order = Integer.parseInt(args[i]);
			if(count  == 5){
				//カウントした数字が5と一致した場合
				//画面に出力
				System.out.println("注文できるのは5個までです");
				//ループから抜け出す
				break;
			}else if(order > 4){
				//引数の値が4よりも大きい場合
				//画面に出力
				System.out.println("0～4を指定してください");
				//ループを最初に戻る
				continue;
			}
			//注文数を加算
			count++;
			//お寿司ごとの注文個数を加算
			number[order]++;
			//お寿司ごとの値段を合計
			total = total + price[order];
		}
		//配列netaの数だけ繰り返すループ
		for(int j = 0; j < neta.length ; j++){
			if(number[j] == 0) {
				//お寿司のネタの注文個数が0と一致する場合
				//画面に出力
				//「マグロ：0個」
				System.out.println(neta[j]+"："+number[j]+"個");
			}else {
				//お寿司のネタの注文個数が0以外の場合
				//画面に出力
				//「マグロ：1個500円」
				System.out.println(neta[j]+"："+number[j]+"個"+(number[j]*price[j])+"円");
			}
			
		}
		//合計を画面に出力
		//合計は○○円です。
		System.out.println("合計は"+total+"円です");
	}
}
