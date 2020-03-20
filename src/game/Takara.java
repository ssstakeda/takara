package game;

public class Takara {

	public static void main(String[] args) {

		Make make=new Make();

		//ランダムに生成した4っつの数字がある配列を用意する（１～８）
		int[] com =make.randomarray();//comがランダムで作成した配列の受け取り

		for (int n : com) {

		   System.out.print(n+" ");

		}

		for(int i=0;i<10;i++) {

			System.out.print("\r\n\r\n"+(i+1)+"回目");

		//userが入力した配列の表示
		System.out.println("\r\n1~8の重複しない数字を入力してください");

		int[] user =make.makearray();//ユーザー入力した配列の受け取り

		for (int n : user) {

		   System.out.print(n+" ");

		}

		Judge jud =new Judge();

		int gold=jud.goldjudge( user , com);

		int silver=jud.silverjudge( user , com);

		System.out.print("\r\nゴールド "+gold);

		System.out.print(" : シルバー"+(silver-gold));

			if(gold==4) {

				System.out.println("\r\n正解！さすがだね！");

				break;

			}

			if(i==9) {

				System.out.println("\r\n10回間違いましたね？ G A M E O V E R");

				break;

			}

			System.out.print("\r\n 残念もう一回！");

		}

	}

}