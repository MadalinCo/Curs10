import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bot();
    }

    static void bot(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==1){
            System.out.println("Order confirmed");
        } else if(number==2){
            System.out.println("info@sololearn.com");
        } else{System.out.println("Try again");
        }

    }
}