import java.util.*;

class ProcessAName5026211031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nama = input.nextLine();
        int space = nama.indexOf(' ');
        

        String first = nama.substring(0,1);
        String last = nama.substring(space+1);

        int count = 0;

        for(int i = 0; i < last.length(); i++){
            
            count++;
        }
        
        System.out.println(count);
        System.out.println("Your name is: " + last + ", " + first);
    }
}