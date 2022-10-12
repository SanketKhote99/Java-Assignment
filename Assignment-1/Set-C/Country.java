import java.util.Scanner;
public class Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = scanner.nextLine();

        // Display country name decending order
        char[] ch = country.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                
                if (Character.toLowerCase(ch[j]) > Character.toLowerCase(ch[i])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("Descending order");
        System.out.println(String.valueOf(ch));
    }
}
