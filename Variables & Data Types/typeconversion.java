import java.util.*;
public class typeconversion {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // int a = input.nextFloat();
        // System.out.println(a); throws error, as int cannot store float value

        float b = input.nextInt();
        System.out.println(b); // float can store int value

    }
}
