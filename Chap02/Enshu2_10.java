import java.util.Scanner;

class Enshu2_10{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.print("姓：");
	String family = stdIn.next();
	System.out.print("名：");
	String first = stdIn.next();
  
	System.out.println("こんにちは" + family + first + "さん。");
    }
}
