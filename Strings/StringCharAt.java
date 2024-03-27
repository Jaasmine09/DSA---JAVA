
public class StringCharAt {
    //printing all characters:
public static void printCharacters(String name){
    for(int i = 0; i< name.length(); i++){
        System.out.print(name.charAt(i) + " ");
    }
}
    public static void main(String args[]){
        String name = "Jasmine";
        //Printing single character
        // System.out.println(name.charAt(1));

        printCharacters(name);
    }
}
