package Curs30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner scanNo1 = new Scanner(new BufferedReader(new FileReader("Numbers1.txt")));
             Scanner scanNo2 = new Scanner(new BufferedReader(new FileReader("Numbers2.txt")))){
            BufferedWriter outputFile = new BufferedWriter(new FileWriter("NumbersMerge.txt"));

            Boolean isReadFrom1 = true;
            Boolean isReadFrom2 = true;
            int no1 = 0;
            int no2 = 0;

            while(scanNo1.hasNext() && scanNo2.hasNext() ) {
                if (isReadFrom1) {
                    no1 = scanNo1.nextInt();
                }
                if (isReadFrom2) {
                    no2 = scanNo2.nextInt();
                }

                if (no1 <= no2){
                    outputFile.write(no1 + " ");
                    isReadFrom1 = true;
                    isReadFrom2 = false;
//                    outputFile.write(no2 + " ");
                }else{
                    outputFile.write(no2 +  " ");
                    isReadFrom1 = false;
                    isReadFrom2 = true;
//                    outputFile.write(no1 + " ");
                }
            }
            if (!isReadFrom1) {
                outputFile.write(no1 + " ");
            }
            if (!isReadFrom2) {
                outputFile.write(no2 + " ");
            }

            while(scanNo1.hasNext()){
                no1 = scanNo1.nextInt();
                outputFile.write(no1 + "");
            }
            while(scanNo2.hasNext()){
                no2 = scanNo2.nextInt();
                outputFile.write(no2 + " ");
            }
            outputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
