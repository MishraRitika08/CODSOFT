import java.util.*;
class numberGuess{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = 10;
        int n = (int) (Math.random() * 100) + 1;
      
        while(k>0){
              System.out.println("Enter a number\n");
            //System.out.println("Guess again");
            int g = sc.nextInt();
            if(g==n){
                System.out.println("HOORAY! you guessed the number right\n");
                break;
            }
            else if (g>n) {
                System.out.println("The number you entered is greater than the number I guessed\n");
            }
            else{
                System.out.println("The number you entered is less than the number I guessed \n give it another try\n");
            }
            k--;
        }
        if(k==0){
            System.out.println("The number was"+ n);
        }
        sc.close();
    }
}