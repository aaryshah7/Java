
//21CE124-Aary Shah
import java.util.*;
import java.util.Scanner;
public class code8 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        char[][] marks = {
             {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
             {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E' ,'A' ,'D'},
             {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E' ,'A' ,'D'},
             {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E' ,'A', 'D'},
             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E' ,'A' ,'D'},
             {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
             {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
             {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
            };

       
        char [] ans = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E' ,'A' ,'D'};
        for(int i = 0 ; i<10; i++)
        {
            for(int j = 0; j<8; j++)
            {
              if(marks[i][j] == ans[i])
              {
                count++;
              }
            }
            System.out.println("Student of marks "+i+" : "+count);
            count = 0;
        }
        System.out.println("21CE124-Aary Shah");
    }
}