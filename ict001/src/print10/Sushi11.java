package print10;

public class Sushi11 {

	public static void main(String[] args) {
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		int[] price = {500,200,400,100,300};
		//ネタの注文個数
		int[] number = {0,0,0,0,0};	
		//合計金額
		int total = 0;	
		//注文数
		int count = 0;	
		neta[1] = "アマエビ";
		for(int i = 0; i < args.length ; i++){
			int order = Integer.parseInt(args[i]);
			if(count == 5){
				System.out.println("注文できるのは5個までです");
				break;
			}else if(order > 4){
				System.out.println("0～4を指定してください");
				continue;
			}
			count++;
			number[order]++;
			total = total + price[order];
		}
		for(int j = 0; j < neta.length ; j++){
			System.out.println(neta[j]+"："+number[j]+"個");
		}
		System.out.println("合計は"+total+"円です");
	}
}
