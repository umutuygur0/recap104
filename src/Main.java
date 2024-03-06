import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i=1 ,top=0 ,size,a=0,fail=0;
        System.out.println("please enter the class size ");
        size = keyboard.nextInt();
        int[] grade = new int[size];
        do{
            System.out.println("please enter the grade between 0 to 100 for student"+i+":");
            grade[a]= keyboard.nextInt();
            a++;
            i++;
        }while(i<=size);
        for(int j=0; j<size;j++) top=top+grade[j];
        double average=(double)top/(double)size;
        System.out.println("Average of the grades is: "+ average);
        for(int k=0;k<size;k++){
            if(grade[k]<55)fail++;
        }
        System.out.println("Number of failed students are: "+fail);

    }

}