package kadai_1;

/*
 * ・3つの座標データを指定することで、
 *    三角形を描画するクラス　						
 *・三角形描画メソッド
 *・三角形の周囲の長さを取得するメソッド"		
 * 
 * */
public class Triangle extends Polygon {
	private Point p1; //三角形の点1を表すPoint型privateフィールド
	private Point p2; //三角形の点2を表すPoint型privateフィールド
	private Point p3; //三角形の点3を表すPoint型privateフィールド

	/*引数で受け取ったデータを用いて、
	 *・3つのPointオブジェクトを生成
	 * スーパークラス内で定義されている
	 * 
	 * ・angleフィールドに3を代入する。
	 * */
	public void Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		Point p1 = new Point(x1, y1);//p1フィールドに代入するPoint型変数のx,y座標
		Point p2 = new Point(x2, y2);//p2フィールドに代入するPoint型変数のx,y座標
		Point p3 = new Point(x3, y3);//p3フィールドに代入するPoint型変数のx,y座標
		int angle = 3; //angleフィールドに3を代入

	}

	/*以下のメッセージを表示
	 *
	 * [三角形を描画] 点1(0,0)から点2(100,100)、点3(0, 200)の三角形
	 * */
	public void draw() {
		System.out.println("[三角形を描画] 点1(" + this.p1 + ")から点2(" + this.p2 + ")、点3(" + this.p3 + ")の三角形");

	}

	/*
	 * 3つの座標を使い、以下の計算式で算出した結果を返す。						
	 * p1からp2までの長さ + p2からp3までの長さ + p3からp1までの長さ
	 * */
	public double getPerimeter() {
			//p1、p2間の長さ
		double XPoint_1 = Math.pow((p2.x - p1.x), 2);
		double YPoint_1 = Math.pow((p2.y - p1.y), 2);
			//p1、p3間の長さ
		double XPoint_2 = Math.pow((p3.x - p1.x), 2);
		double YPoint_2 = Math.pow((p3.y - p1.y), 2);
			//p2、p3間の長さ
		double XPoint_3 = Math.pow((p3.x - p2.x), 2);
		double YPoint_3 = Math.pow((p3.y - p2.y), 2);

		double Perimeter = Math.sqrt(XPoint_1 + YPoint_1) + Math.sqrt(XPoint_2 + YPoint_2)
				+ Math.sqrt(XPoint_3 + YPoint_3);

		return Perimeter;

	}

}
