package kadai_1;
/*
 * ・中心座標と半径を指定することで、円を描画するクラス　　　							
 * ・円描画メソッド
 * ・円周の長さを取得するメソッド"	
 * 
 * */

public class Circle extends Shape {
	private Point center;//円の中心の座標
	private int radius;// 半径

	/*
	 * 引数なしコンストラクタの定義
	 * center(x,y座標)、半径全て0で初期化する
	 * 
	 * */
	public Circle() {
		this.center = new Point(0, 0);
	}

	/*
	 * 3つのint型データ							
	 * xとy...centerフィールドに代入するPoint型変数のx,y座標値
	 * r...円の半径
	 * */
	public void Circle(int x, int y, int r) {
		Point center = new Point(x, y);
		this.radius = r;

	}

	/*以下のメッセージを表示
	 * 　"[円を描画] 中心点(100,100)から半径20"
	 * */
	public void draw() {
		System.out.println("[円を描画] 中心点(" + this.center + "から半径" + this.radius);

	}

	/*半径を使い、以下の計算式で算出した結果を返す
	 *半径 * 2 * 円周率()
	 * 
	 * 
	 * */
	public double getPerimeter() {

		double Perimeter = 2 * Math.PI * radius;
		return Perimeter;

	}

}

/*
 *自分用メモ
 *　Math.PIフィールド
 *
 * let circumference = 2 * Math.PI * radius;
 * */
