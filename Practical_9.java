/* The problem is to check whether a given Sudoku solution is correct.*/
//21CE124-Aary Shah
public class Practical_9 {

    public static void main(String args[]) {

        int a[][] = { { 2, 4, 8, 3, 9, 5, 7, 1, 6 },
                      { 5, 7, 1, 6, 2, 8, 3, 4, 9 },
                      { 9, 3, 6, 7, 4, 1, 5, 8, 2 },
                      { 6, 8, 2, 5, 3, 9, 1, 7, 4 },
                      { 3, 5, 9, 1, 7, 4, 6, 2, 8 },
                      { 7, 1, 4, 8, 6, 2, 9, 5, 3 },
                      { 8, 6, 3, 4, 1, 7, 2, 9, 5 },
                      { 1, 9, 5, 2, 8, 6, 4, 3, 7 },
                      { 4, 2, 7, 9, 5, 3, 8, 6, 1 } };

        System.out.println(check(a));
        System.out.println("21CE124-Aary Shah");
    }

    public static boolean check(int arr[][]) {
        int i, j;
        int count[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int count1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean b = true;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {

                if (count[arr[j][i]] > i) {
                    b = false;
                    return b;
                }
                if (count1[arr[i][j]] > i) {
                    b = false;
                    return b;
                }
                count1[arr[i][j]]++;
                count[arr[j][i]]++;
            }

        }
        return b;
    }

}



