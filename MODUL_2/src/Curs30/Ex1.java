package Curs30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tastati cuvanutul pe care vreti sa il inlocuiti:");
        String find = scanner.next();
        System.out.println("Tastati cuvantul cu care vreti sa il inlocuiti cuvantul \"" + find + "\":");
        String replacement = scanner.next();

        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt")))){
//             BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextInput.txt"))) {
            ArrayList<String> words = new ArrayList<>();
//            String currentWord;
            while(sc.hasNextLine()) {
                 String currentLine = sc.nextLine();
//                if (currentLine.contains(find))
                    String line = currentLine.replace(find,replacement);

                words.add(line);

                //outputFile.append(currentWord + " ");
            }
            System.out.println(words);
            BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextInput.txt"));
            for (int i  = 0;  i<words.size(); i++){
            outputFile.append(words.get(i) + " \n");
            outputFile.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            scanner.close();
        }

    }
}
