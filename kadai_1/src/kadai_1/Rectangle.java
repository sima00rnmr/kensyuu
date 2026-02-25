package kadai_1;
/*
 * 
 *・1つの位置座標と幅、長さを指定することで、
 *    長方形(矩形)を描画するクラス　					
 *・長方形描画メソッド	
 *・長方形の周囲の長さを取得するメソッド
 * 
 * */

public class Rectangle extends Polygon {
	protected Point p; //長方形の基準の位置を表すPoint型protectedフィールド
	protected int width; //長方形の横幅を表すprotectedフィールド
	protected int height; //長方形の縦幅を表すprotectedフィールド

	public Rectangle(int x, int y, int width, int height) {
		this.p = new Point(x, y);//pフィールドに代入
		//第3引数と第4引数をそれぞれwidthフィールド、heightフィールドに代入
		this.width = width;
		this.height = height;

		this.angle = 4;//angleフィールドに4を代入

	}

	/*以下のメッセージを表示
	 * [長方形(矩形)を描画] 点(0,0)を基準として幅100、高さ50の長方形
	 * 
	 * 
	 * 
	 * */
	public void draw() {
		System.out.println("[長方形(矩形)を描画] 点(" +p.getX()+","+p.getY() + ")を基準として幅" + width + "、高さ" + height + "の長方形");
		System.out.flush();
	}

	/*
	 * 横幅と縦幅を使い、以下の計算式で算出した結果を返す。
	 * ( width + height ) * 2
	 * */
	public double getPerimeter() {
		double Perimeter = (width + height) * 2;

		return Perimeter;
	}

}
