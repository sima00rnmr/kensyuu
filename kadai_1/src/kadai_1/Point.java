package kadai_1;

/*
 * 
 * ・座標位置情報を表すクラス
 * 
 * */
public class Point {

	int x;//・x座標を表すprivateフィールド
	int y;//・y座標を表すprivateフィールド

	/*"・引数なしコンストラクタの定義
	　   *x座標、y座標ともに0で初期化する。"							
	 * */
	public Point() {
		x = 0;
		y = 0;
	}

	/* x座標、y座標を受け取りその値で初期化するコンストラクタの定義					
	 */
	public Point(int x, int y) {

		//第1引数で渡された値をxフィールドに代入する。
		this.x=x;
		//第2引数で渡された値をyフィールドに代入する。
		this.y=y;
	}

	//xフィールドの値を返すメソッド							
	public int getX() {
		return this.x;
	}

	//・引数で渡された値を、xフィールドにセットするメソッド							
	public void setX(int x) {
		this.x = x;

	}

	//xフィールドの値を返すメソッド							
	public int getY() {
		return this.y;
	}

	//・引数で渡された値を、xフィールドにセットするメソッド							
	public void setY(int y) {
		this.y = y;

	}

}
