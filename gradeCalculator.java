public class gradeCalculator {
    public static int calculatePercentage(int totalMarks) {
        int percentage = totalMarks/400;
        return percentage;
    }
    public static char calculateGrade() {
        char grade;
        int percentage = calculatePercentage();
        if(percentage>90){
            grade ='A';
        }
        if(percentage<90 && percentage>80){
            grade ='B';
        }
        if(percentage<80 && percentage>70){
            grade ='C';
        }
        else{
            grade='D';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3 + sub4 ;
        
    }
}
