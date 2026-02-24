package kadai_1;

/*・図形描画アプリケーションの
 *  共通機能2つを定義する。　　　							
 *・図形描画機能
 *・長さ測定機能
 * 
 * */
public abstract class Shape implements Figure {

	//図形描画機能の定義							
		public abstract void draw() ;
		//長さ測定機能の定義							
		public abstract double getPerimeter() ;
}
