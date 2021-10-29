
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;


public class FileReader {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Data> dataList = new ArrayList<>();
        System.out.println("FileReader initialized.");
        System.out.println("Options: read, help, exit");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("read")) {
                System.out.println("Enter file name: ");
                String fileName = scanner.nextLine();
                
                try (Scanner reader = new Scanner(Paths.get(fileName))) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.isEmpty()) {
                            continue;
                        }
                        String[] parts = line.split(",");
                        String name = parts[0];
                        double price = Double.valueOf(parts[1]);
                        dataList.add(new Data(name, price));
                    }
                    
                    for (Data entry : dataList) {
                        System.out.println(entry.toString()); //NOT PRINTING!
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else if (input.equals("help")) {
                System.out.println("This program is designed to parse data files in csv format. The data should be in two columns with the name first and the data second");
                continue;
            } else if (input.equals("exit")) {
                System.out.println("Exit requested.");
                break;
            } else {
                System.out.println("Invalid input!");
                continue;
            }
        }   
    }
    
    
}
