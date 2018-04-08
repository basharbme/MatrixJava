import java.util.Random;

class A{
    public static void mm(){
        int[][] matrix = new int [5][5];

        for(int i = 0 ; i < 5 ; i++){
            for(int j =  0 ; j < 5 ; j++){
                Random rand = new Random();
                int n = rand.nextInt(50) + 1;
                matrix[i][j] = n ;
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            for(int j =  0 ; j < 5 ; j++){
                System.out.print(matrix[i][j]+"| ");
            }
            System.out.println();
        }
        System.out.println();
        //find min and maximum on the main diagonal
        int min=0 , max=0 , temp=0;
        int minRow=0 , minColumn=0;
        int maxRow=0 , maxColumn=0;
        for(int i = 0 ; i < 5 ; i++){
            for(int j =  0 ; j < 5 ; j++){
                if(i == j){
                    temp = matrix[i][j];
                    System.out.print(temp+" ");
                    //take initial value
                    if(i == 0 && j == 0){
                        //take the indexes
                        minRow = i;
                        minColumn = j;
                        min = matrix[i][j];
                    }else if(temp<min){
                        minRow = i;
                        minColumn = j;
                        min = temp;
                    }
                    //maximum
                    if(temp>max){
                        maxRow = i;
                        maxColumn = j;
                        max = temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("minimum: "+min+" row: "+minRow + " column:"+minColumn);
        System.out.println("maximum: "+max+" row: "+maxRow + " column:"+maxColumn);
        System.out.println();
        //now swap the places
        matrix[minRow][minColumn]= max;
        matrix[maxRow][maxColumn]= min;
        for(int i = 0 ; i < 5 ; i++){
            for(int j =  0 ; j < 5 ; j++){
                System.out.print(matrix[i][j]+"| ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        A ob = new A();
        ob.mm();
    }
}
