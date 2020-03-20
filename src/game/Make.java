package game;

import java.util.Random;
import java.util.Scanner;

public class Make {//メソッドクラス

		public int ram() {// 引数：なし

			Random ran = new Random();

			int ram =ran.nextInt(8);//乱数を使って0-7の中からコンピューターの数を決める

			ram++;//1~8のどれか

			return ram;//戻り値：コンピューターの選んだ数

		}

		public int[] makearray() {//メソッド名：user 引数：なし

			Scanner scan= new Scanner(System.in);

			int[] array=new int[4];

			int a,b,c,d=0;

			for(;;) {

				System.out.println("1~8の重複しない4桁の整数を入力してください（橋元さんに詰められたので追加）");

				int num=scan.nextInt();//目的：ユーザーに数を入力してもらう

				if(num>1233&&num<9877) {//4桁の数

					//num=1000a+100b+10c+d;	(xの範囲と重複チェック)
					a=num/1000;

					b=(num-1000*a)/100;

					c=(num-1000*a-100*b)/10;

					d=num-1000*a-100*b-10*c;

					array[0]=a;//配列０の時

					if(a!=b) {

						array[1]=b;//配列1の時

						if(b!=c&&a!=c) {

							array[2]=c;

							if(a!=d&&b!=d&&c!=d) {

								array[3]=d;

								break;

							}else {continue;}

						}else {continue;}

					}else {continue;}

				}else {continue;}

			}

			return array;

		}

		public int[] randomarray(){//重複しない4っつの数字を入れた配列を作る

			System.out.println("\r\n1~8の重複しないランダムな4っつの数字を入れた配列");

			int[] array=new int[4];

			//乱数で決める。

			int ram=0;

			int i=0;

			while(i<4) {

				ram=this.ram();

				if(i==0) {//配列０の時

					array[0]=ram;

				}

				if(i==1) {//配列1の時

					if(ram!=array[0]) {

						array[1]=ram;

					}else {continue;}

				}

				if(i==2) {//配列2の時

					if(ram!=array[0]&&ram!=array[1]) {

						array[2]=ram;

					}else {continue;}

				}

				//配列3の時
				if(i==3) {

					if(ram!=array[0]&&ram!=array[1]&&ram!=array[2]) {

						array[3]=ram;

					}else {continue;}

				}

				i++;

			}

			return array;

		}

}