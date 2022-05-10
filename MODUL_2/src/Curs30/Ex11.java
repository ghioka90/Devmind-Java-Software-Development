package Curs30;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tastati cuvanutul pe care vreti sa il inlocuiti:");
        String find = scanner.next();
        System.out.println("Tastati cuvantul cu care vreti sa il inlocuiti cuvantul \"" + find + "\":");
        String replacement = scanner.next();

        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt")));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))) {
            while(sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                outputFile.write(currentLine.replaceAll(find, replacement));
                if (sc.hasNextLine()) {
                    outputFile.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
