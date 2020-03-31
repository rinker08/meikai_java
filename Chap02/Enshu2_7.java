import java.util.Random;

class Enshu2_7{
    public static void main(String[] args){
	Random rand = new Random();

	int lucky1 = rand.nextInt(9) + 1;
	int lucky2 = rand.nextInt(9) - 9;
	int lucky3 = rand.nextInt(90) + 10;

	System.out.println("今日のラッキーナンバー１は" + lucky1 + "です。");
	System.out.println("今日のラッキーナンバー２は" + lucky2 + "です。");
	System.out.println("今日のラッキーナンバー３は" + lucky3 + "です。");
    }
}
