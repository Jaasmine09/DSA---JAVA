import java.util.*;
public class area {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int rad = input.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println("Area of Circle is:" + area);
    }
}
