package print10;

public class Sushi10 {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		String[] neta = {"マグロ","エビ","イクラ","イカ","サーモン"};
		int[] price = {500,200,400,100,300};
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
			System.out.println(neta[order]);
			total = total + price[order];
			count++;
		}
		System.out.println("合計は"+total+"円です");
	}
}
