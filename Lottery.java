import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a two digit number to win the Lottery:");
        int winNum = scan.nextInt();

        int ranNum = (int) (Math.random() * 89) +10;
        System.out.println("Computer #: " + ranNum);
        int userones = winNum % 10;
        int usertens = winNum /10;
        int randones = ranNum % 10;
        int randtens = ranNum /10;

        if (winNum == ranNum){
            System.out.println("YOU GOT IT!!!");
            System.out.println("You win the Jackpot of $10,000");
        }
        else if (userones == randones &&  randtens == usertens ){
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000");
        }
        else if (userones == randones ||  randtens == usertens ){
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else {
            System.out.println("You did not win anything :(");
        }











    }
}
