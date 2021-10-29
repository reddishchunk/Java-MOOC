
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;


public class FileReader {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        System.out.println("FileReader initialized.");
        System.out.println("Options: read, help, exit");
        
        while (true) {
            if (scanner.nextLine().equals("read")) {
                System.out.println("Enter file name: ");
                String fileName = scanner.nextLine();
                
                try (Scanner reader = new Scanner(Paths.get(fileName))) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");
                        data.addEntry(parts[0], Integer.valueOf(parts[1]));
                    }
                    
                    for (Data entry : data) {
                        System.out.println(entry);
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (scanner.nextLine().equals("help")) {
                System.out.println("This program is designed to parse data files in csv format. The data should be in two columns with the name first and the data second");
            } else if (scanner.nextLine().equals("exit")) {
                System.out.println("Exit requested.");
                break;
            } else {
                System.out.println("Invalid input!");
                continue;
            }
        }   
    }
    
    
}
