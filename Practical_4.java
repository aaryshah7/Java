
//21CE124-Aary Shah
import java.util.Scanner;

public class Practical_4 {

        public static void main (String[] args)
        {
            int flag=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: "); 
            int n=sc.nextInt();
            int a[] = new int[10];
            System.out.println("Enter the elements of the array: ");  
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int i=0;i<(a.length-2);i++)
            {
                if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
                {
                    flag=1;
                }

            }
            if(flag==1){
                System.out.println("true");
            }else if(flag==0){
                System.out.println("flase");
            }
            System.out.println("21CE124-Aary Shah");
        }
    }




