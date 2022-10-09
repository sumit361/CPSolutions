import java.util.Scanner;

public class CPTemplate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x>y){
                if(x>z)
                    System.out.println("Setter");
                else
                    System.out.println("Editorialist");
            }
            else if(y>z)
                System.out.println("Tester");
            else
                System.out.println("Editorialist");
            T--;
        }
    }

}
