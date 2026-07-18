package com.java.devdojo.javacore.javacore.vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("/home/gustavotama/IdeaProjects/java-dev-dojo/src/com/java/devdojo/javacore/javacore/vio/files/file.txt");
        try {
//            boolean isDeleted = file.delete();
//            System.out.println("Foi deletado? " + isDeleted);
            boolean isCreated = file.createNewFile();
            System.out.println("Created? " + isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("path: " + file.getAbsolutePath());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("Is it hidden? " + file.isHidden());
            System.out.println("Last modification: " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted?" + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
