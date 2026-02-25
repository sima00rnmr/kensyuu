package kadai_1;

public class Main {

	public static void main(String[] args) {
		//分岐するやつ
		//場合分け
		//結果を表示したらプログラム終了

		

		System.out.println("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] ");
		java.util.Scanner scanner = new java.util.Scanner(System.in); // 変数に代入
		int number = scanner.nextInt(); // 入力を受け取る

		switch (number) {
		/*図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >0
		*[円を描画] 中心点(100,100)から半径20
		*周囲の長さは、125.66370614359172
		*/
		case 0 -> {
			/*int r=20;
			int x=100;
			int y=100;*/
			Circle circle = new Circle(100, 100, 20);
			circle.draw();
			System.out.println("周囲の長さは、"+circle.getPerimeter());
			
		}
		/*図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >2
		  [線を描画] 始点(0,0)から終点(100,100)まで
		  周囲の長さは、141.4213562373095
		 * 
		 */
		case 2 -> {
			/*int x1=0;
			int y1=0;
			int x2=100;
			int y2=100;*/
			Line line = new Line(0,0,100,100);
			line.draw();
			System.out.println("周囲の長さは、"+line.getPerimeter());

		}
		case 3 -> {
			/*int x1=0;
			int y1=0;
			int x2=100;
			int y2=100;
			int x3=0;
			int y3=200;*/
			Triangle triangle = new Triangle(0,0,100,100,0,200);
			triangle.draw();
			System.out.println("周囲の長さは、"+triangle.getPerimeter());
			System.out.println("内角の和は、"+(triangle.angle-2)*180);
		}
		case 4 -> {
			/*int x1=0;
			int y1=0;
			int x2=100;
			int y2=100;
			int width = 100;
			int height = 50;*/
			Rectangle rectangle = new Rectangle(100,100,100,50);
			rectangle.draw();
			System.out.println("周囲の長さは、"+rectangle.getPerimeter());
			System.out.println("内角の和は、"+(rectangle.angle-2)*180);
		}
		case 44 -> {
			/*int x=100;
			int y=100;
			int width = 200;*/
			Square square = new Square(100,100,200);
			square.draw();
			System.out.println("周囲の長さは、"+square.getPerimeter());
			System.out.println("内角の和は、"+(square.angle-2)*180);
		}
		default -> {
			System.out.println("未対応の番号です");
		}
		}
		scanner.close();// 変数で閉じる

	}




	
}
