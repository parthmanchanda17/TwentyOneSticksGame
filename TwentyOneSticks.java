import java.util.*;
public class TwentyOneSticks {
    public static void main(String[] args){
        int sticks = 21;
        System.out.println("Do you want to play first? (y/n)");
        Scanner scan = new Scanner(System.in);
        String first_attempt = scan.nextLine();
        //Scanner read_next = new Scanner(System.in);
        int input_num = 0;
        while(sticks>0){
            if(first_attempt.equals("y") || first_attempt.equals("Y")){
                System.out.println("Currently "+sticks+" sticks are available");
                System.out.println("Pick your sticks (1 or 2):");
                input_num = scan.nextInt();
                if(input_num>2){
                    input_num = 2;
                }
                else if(input_num<1){
                    input_num = 1;
                }
                sticks -= input_num;
                if(sticks<=0){
                    System.out.println("You have lost the game !");
                }
                else{
                    if((sticks-2)%3==0){
                        input_num = 1;
                    }
                    else if(sticks>=2){
                        input_num = 2;
                    }
                    else{
                        input_num = 1;
                    }
                    System.out.println("Your opponent picks "+input_num+" sticks");
                    sticks -= input_num;
                    if(sticks<=0){
                        System.out.println("You have won the game !");
                    }
                }
            }
            else{
                if((sticks-2)%3==0){
                    input_num = 1;
                }
                else{
                    input_num = 2;
                }
                System.out.println("Your opponent picks "+input_num+" sticks");
                sticks -= input_num;
                if(sticks<=0){
                    System.out.println("You have won the game !");
                }
                else{
                    System.out.println("Currently "+sticks+" sticks are available");
                    System.out.println("Pick your sticks (1 or 2):");
                    input_num = scan.nextInt();
                    if(input_num>2){
                        input_num = 2;
                    }
                    else if(input_num<1){
                        input_num = 1;
                    }
                    sticks -= input_num;
                    if(sticks<=0){
                        System.out.println("You have lost the game !");
                    }
                }
            }
        }
    }
}