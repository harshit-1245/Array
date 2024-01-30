package patterns;

/**
 * This program prints a square pattern of stars using recursion.
 */
public class question1 {
    public static void main(String[] args) {
       printPattern(5, 5);
    }
    public static void printPattern(int rows,int cols){
        printPatternSquare(rows,cols,0,0);
    }
    public static void printPatternSquare(int rows,int cols,int currentRows,int currentCols){
        //base case
        if(currentRows == rows){
            return;
        }

        System.out.print("*");

        if(currentCols+1 < cols){
            printPatternSquare(rows, cols, currentRows, currentCols+1);
            //if cols reach 5 then change line
        }else{
            System.out.println();
            printPatternSquare(rows, cols, currentRows+1, 0);
        }
    }
}