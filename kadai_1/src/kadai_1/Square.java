package kadai_1;

/*
 * ・1つの位置座標と幅を指定することで、正方形を描画するクラス
 *・正方形描画メソッド							
 * 
 * */
public class Square extends Rectangle {

	public void Square(int x, int y, int width) {
		Point p = new Point(x, y);//pフィールドに代入するPoint型変数のx,y座標値
		this.width = width;//正方形の一辺の長さ

	}

	/*以下のメッセージを表示
	 * [正方形を描画] 点(0,0)を基準として幅・高さ200の正方形
	 * 
	 * */
	public void draw() {
		System.out.println(" [正方形を描画] 点(" + this.p + ")を基準として幅・高さ" + width + "の正方形");

	}

}
