import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
        Path test = Path.of("src/test.txt");
        Path output = Path.of("src/output.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(test, StandardOpenOption.CREATE)){
            writer.write("micsoda tetű");
            writer.newLine();
            writer.write("második sor");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line;
        try (BufferedReader reader = Files.newBufferedReader(test, StandardCharsets.UTF_8 );
             BufferedWriter writer = Files.newBufferedWriter(output, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            while ((line = reader.readLine()) != null )  {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        scanner2.close();
        String asd = scanner.nextLine();
        System.out.println(asd);
    }
}