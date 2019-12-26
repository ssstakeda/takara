package game;

public class Judge {//クラス：Judge

	public int goldjudge(int[] num , int[] ram) {//引数：コンピューターの配列とユーザーの配列
		//目的：コンピューターの選んだ数と入力された数を比較して、当たりがあるのか判定
		int gold=0;//ゴールド判定個数の初期化

		for(int i=0;i<num.length;i++) {

			if(num[i]==ram[i]) {//配列のどれかが一致

				gold++;

			}

		}

		return gold;//戻り値：ゴールド判定結果の数

	}

	public int silverjudge(int[] num , int[] ram) {//引数：コンピューターの配列とユーザーの配列
		//目的：コンピューターの選んだ数と入力された数を比較して、当たりがあるのか判定
		int silver=0;//ゴールド判定個数の初期化

		for(int n:num) {//配列のどれかが一致

			for(int r:ram) {//配列のどれかが一致

				if(n==r) {

					silver++;

				}

			}

		}

		return silver;//戻り値：ゴールド判定結果の数

	}

}
