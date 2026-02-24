package kadai_1;

/*
 * 
 * ・2つの座標データを指定することで、線を描画するクラス
 * ・線描画メソッド
 * ・線の長さを取得するメソッド
 * */

public class Line implements Figure {
	private Point p1;//・線の始点を表すPoint型privateフィールド
	private Point p2;//・線の終点を表すPoint型privateフィールド
		
	
	
	/*・引数なしコンストラクタの定義
	 *・p1(x,y座標)、p2(x,y座標)全て0で初期化する。*/
	public void Line() {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
	}
	/*引数で受け取ったデータを用いて、
	 * 2つのPointオブジェクトを生成。
	 * p1フィールドとp2フィールドに
     * それぞれを代入する。						
	 * 
	 * */
	public Line(int x1,int y1,int x2,int y2) {
		Point p1 =new Point(int x1,int y1);
		Point p2 =new Point(int x2,int y2);
		 
	
	}
	public void draw() {
		System.out.println("[線を描画]始点"+this.p1+"から終点"+this.p2+"まで");
		
		
	}
	public double getPerimeter() {
		
		
		/*個人的メモ
		 * Math.powメソッド（累乗）
		 * double result = Math.pow(10, 2);　//10を二乗している
		 * 
		 * Math.sqrtメソッド（平方根）
		 * double result = Math.sqrt(16.0);　//結果4.0
		 * 
		 * */
		
	}
	
}
