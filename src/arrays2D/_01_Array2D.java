package arrays2D;

public class _01_Array2D {
    public static void main(String[] args) {




        int[][] nums =new int[4][3];


        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
               nums[i][j]=(int) (Math.random()*10);

            }
           }
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums[i].length ; j++) {
                System.out.print(nums[i][j]+ " ");

            }
            System.out.println();
        }
   }

}
