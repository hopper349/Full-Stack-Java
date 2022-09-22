package Concepts.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDirCreation {

    /**
     * This method will create a file at the specified Path
     *
     * @param path fileLocation
     */
    public void createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will create a folder at the specified Path
     *
     * @param path folderLocation
     */
    public void createDirectory(String path) {
        File file = new File(path);
        file.mkdir(); //for single folder
    }

    /**
     * This method will create a folder and sub-folders at the specified Path
     *
     * @param path folderLocation
     */
    public void createNestedDirectory(String path) {
        File file = new File(path);
        file.mkdirs(); //for nested folders
    }


    /**
     * This method will delete a file at the specified Path
     *
     * @param path file path
     */
    public void deleteFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("Delete Successful");
        } else {
            System.out.println("Delete Unsuccessful");
        }
    }

    public static void main(String[] args) {
//        new FileDirCreation().createDirectory("src\\main\\java\\Concepts\\FileHandling\\SampleFolder");
//        new FileDirCreation().createNestedDirectory("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder");
//        new FileDirCreation().createFile("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder\\FirstFile.txt");
        new FileDirCreation().deleteFile("src\\main\\java\\Concepts\\FileHandling\\SampleFolder\\SubFolder\\FirstFile.txt");

    }
}
