package methods;

public class _05_MethodsAndArray {
    public static void main(String[] args) {
         /*
         Bir dizinin tum elemanlarinin toplamini ve çarpimini bulan bir program yazin.
          */



        int [] nums=new int[10];
        int sum=0;
        int carpim=1;

        for (int i = 0; i <= nums.length ; i++) {
            sum+=i;
        }
        for (int i = 1; i <= nums.length ; i++) {
            carpim*=i;

        }
        System.out.println("result of carpim =" +carpim);
        System.out.println("result of summ ="+ sum);
  }
}
