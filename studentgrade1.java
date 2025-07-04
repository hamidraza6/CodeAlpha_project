import java.util.*;
public class studentgrade1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        if (marks>90) {
            System.out.println("+A Grade");
            
        }else if(marks>80){
            System.out.println("A Grade");
        }
        else if(marks>70){
            System.out.println("+B Grade");
        }
        else if(marks>60){
            System.out.println("B Grade");
        }
        else  if(marks>50){
            System.out.println("C+");
        }
        else if(marks>40){
            System.out.println("C");
        }
        else if(marks==40){
               System.out.println("just pass");
        }
        else{
            System.out.println("F");
        }  
    }
}


