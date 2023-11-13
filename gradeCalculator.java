import java.util.Scanner;

public class gradeCalculator {
    public static int calculatePercentage(int totalMarks) {
        int percentage = totalMarks/4;
        return percentage;
    }
    public static char calculateGrade(int totalMarks) {
        char grade=' ';
        int percentage = calculatePercentage(totalMarks);
        if(percentage>=90){
            grade ='A';
        }
        else if(percentage<90 && percentage>=80){
            grade ='B';
        }
        else if(percentage<80 && percentage>=70){
            grade ='C';
        }
        else{
            grade='D';
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3 + sub4 ;
        char grade=calculateGrade(totalMarks);
        int percentage=calculatePercentage(totalMarks);
        System.out.print("The total marks is "+ totalMarks +
                         " \nThe percentage is "+ percentage+"%"+ "\nThe grade is "+grade);
        
    }
}
