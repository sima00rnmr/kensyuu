package kadai_1;

/*
 * ・1つの位置座標と幅を指定することで、正方形を描画するクラス
 *・正方形描画メソッド							
 * 
 * */
public class Square extends Rectangle {

	public Square(int x, int y, int width) {
		super(x,y,width,width);
		
	}

	/*以下のメッセージを表示
	 * [正方形を描画] 点(0,0)を基準として幅・高さ200の正方形
	 * 
	 * */
	public void draw() {
		System.out.println("[正方形を描画] 点(" + p.getX()+","+p.getY() + ")を基準として幅・高さ" + width + "の正方形");

	}

}
