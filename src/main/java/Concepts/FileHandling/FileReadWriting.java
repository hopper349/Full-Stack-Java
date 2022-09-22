package Concepts.FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileReadWriting {

    /**
     * File Writing using BufferedWriter
     * @param path filePath
     */
    public void writeInFile(String path) {

        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //try with resources closes the stream automatically
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write("Dipanshu");
            br.newLine();
            br.write("Sameer K");
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * File Reading using BufferedReader
     * @param path filePath
     */
    public void readFile(String path) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * File Reading using Scanner Class
     * @param path filePath
     */
    public void readFileScanner(String path) {

        try {
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
//        new FileReadWriting().writeInFile("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder\\SecondFile.txt");
//        new FileReadWriting().readFile("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder\\SecondFile.txt");
        new FileReadWriting().readFileScanner("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder\\SecondFile.txt");

    }
}
