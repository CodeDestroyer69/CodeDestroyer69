import java.util.Scanner; //integram functia Scanner

public class imput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("What is you're name? ");
                String name = scanner.nextLine();
            System.out.println("How old are you?");
                int age=scanner.nextInt();
scanner.nextLine();
            System.out.println("What is you're favourite food?");
                String food = scanner.nextLine();

            System.out.println("Hello "+name+"!");
            System.out.println("You are "+age+" years old!");
            System.out.println("My favourite food is "+food);
    }
}
