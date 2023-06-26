import java.io.*;

public class Priyanshu {
    public static void main(String[] args) {
       String filename = "D:/NETBEANS/example.txt";

        try {
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            // Read the content of the file
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Convert the content to uppercase
            String uppercaseContent = content.toString().toUpperCase();

            // Write the uppercase content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(uppercaseContent);
            writer.close();

            System.out.println("File content converted to uppercase and saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}