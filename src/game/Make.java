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

		public int num() {//メソッド名：user 引数：なし

			System.out.println("\r\n1~8の重複しない数字を入力してください");

			Scanner scan= new Scanner(System.in);

			int num=scan.nextInt();//目的：ユーザーに数を入力してもらう

			return num;//戻り値：ユーザーの入力した数

		}

		public int[] randomarray(){//重複しない4っつの数字を入れた配列を作る

			System.out.println("重複しないランダムな4っつの数字を入れた配列");

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

		public int[] makearray(){//重複しない4っつの数字を入れた配列を作る

			int[] array=new int[4];

			Scanner scan = new Scanner(System.in);

			int num=0;

			int i=0;

			while(i<4) {

				num=this.num();

				if(i==0) {//配列０の時

					array[0]=num;

				}

				if(i==1) {//配列1の時

					if(num!=array[0]) {

						array[1]=num;

					}else {continue;}

				}

				if(i==2) {//配列2の時

					if(num!=array[0]&&num!=array[1]) {

						array[2]=num;

					}else {continue;}

				}

				if(i==3) {//配列3の時

					if(num!=array[0]&&num!=array[1]&&num!=array[2]) {

						array[3]=num;

					}else {continue;}

				}

				i++;

			}

			return array;

		}

}

