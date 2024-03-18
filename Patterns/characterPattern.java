public class characterPattern {

    public static void character_pattern(int ch){
        char counter = 'A';
      //outer loop
      for(int i =1; i<=ch; i++){
        //inner loop
        for(int j = 1; j<=i; j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
        character_pattern(6);
    }
}
