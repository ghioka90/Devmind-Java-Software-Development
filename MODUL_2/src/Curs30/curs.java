package Curs30;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class curs {

    private static String[] getData() {
        String[] cities =  {"London", "Bucharest", "Berlin", "Moscow", "Bucharest"};
        return cities;
    }

    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();
        try(Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            while(scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                // use the next line in program
                System.out.println(nextLine);
            }
        }

        try(FileWriter outputFile = new FileWriter("output.txt")) {
            for (String city : dataToWrite) {
                outputFile.write(city + " ");
            }
        }
    }

}
