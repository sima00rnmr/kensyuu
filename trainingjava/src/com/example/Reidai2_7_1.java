package com.example;

public class Reidai2_7_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("ようこそ占いの館へ");
		System.out.print("貴方の名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("貴方の年齢を入力してください。");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age =Integer.parseInt(ageString);
		int a = 4;
		a++;
		int forture =new java.util.Random().nextInt(a);
		System.out.print("占いの結果が出ました");
		System.out.print( age + "歳の" + name +"さん、あなたの運気番号は" +forture +"です");
		System.out.print("(1:大吉 2:中吉 3:吉 4:凶)");
	}

}
