import java.util.Scanner;

public class GPA {

    public static void main(String[] args){

        System.out.println("How many course you had this semester");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nbcourses = new double[x];
        double sum = 0;

        for(int i = 0; i< nbcourses.length; i++){
            System.out.println("Enter your average of the course"+ (i+1) + ":");
            nbcourses[i] = scan.nextDouble();
            sum += nbcourses[i];
        }

        double average = sum/nbcourses.length;

        if(average>90){
            System.out.println("You have A");
        }else if(average>=80){
            System.out.println("You have B");
        }else if(average>=60){
            System.out.println("You have C");
        }else if(average>=45){
            System.out.println("You have S");
        }else{
            System.out.println("You have F");
        }
        
    }
}
