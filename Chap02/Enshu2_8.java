import java.util.Random;
import java.util.Scanner;

class Enshu2_8{
    public static void main(String[] args){
	Random rand = new Random();
	Scanner stdIn = new Scanner(System.in);

	System.out.print("整数値：");
	int integer = stdIn.nextInt();
	int lucky = rand.nextInt(11) + integer - 5;

	System.out.println("その値の+-5の乱数を生成しました。それは" + 
			   lucky + "です。");
    }
}
