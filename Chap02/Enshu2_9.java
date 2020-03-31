import java.util.Random;

class Enshu2_9{
    public static void main(String[] args){
	Random rand = new Random();

	double lucky1 = rand.nextDouble();
	double lucky2 = rand.nextDouble() * 10.0;
	double lucky3 = (rand.nextDouble() * 2.0 ) - 1.0;

	System.out.println("今日のラッキーナンバー１は" + lucky1 + "です。");
	System.out.println("今日のラッキーナンバー２は" + lucky2 + "です。");
	System.out.println("今日のラッキーナンバー３は" + lucky3 + "です。");
    }
}
