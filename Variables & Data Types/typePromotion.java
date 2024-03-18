public class typePromotion {

  public static void floysTriangle(int n) {
    // int number = 1;
    // outer Loop
    for (int i = 1; i <= n; i++) {
      // inner Loop
      for (int j = 1; j <= i; j++) {
         if((i+j) % 2 == 0){
          System.out.print("1");
         }else{
          System.out.print("0");
         }
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {

     floysTriangle(5);    

  }

}
