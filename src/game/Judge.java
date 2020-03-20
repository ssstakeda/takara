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
		int silver=0;//シルバー判定個数の初期化

		for(int n:num) {//numを一個づつ取り出す

			for(int r:ram) {//ramを一個づつ取り出す

				if(n==r) {//配列のどれかが一致

					silver++;

				}

			}

		}

		return silver;//戻り値：ゴールド判定結果の数

	}

}