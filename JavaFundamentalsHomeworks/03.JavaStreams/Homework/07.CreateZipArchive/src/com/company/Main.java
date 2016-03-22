package com.company;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            String zipFile = "resources/zipDemo.zip";
            String[] sourceFiles = {"resources/lines.txt", "resources/count-chars.txt", "resources/words.txt"};

            byte[] buffer = new byte[1024];

            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);

            for (int i = 0; i < sourceFiles.length; i++) {

                System.out.println("Adding " + sourceFiles[i]);

                FileInputStream fis = new FileInputStream(sourceFiles[i]);

                zos.putNextEntry(new ZipEntry(sourceFiles[i]));

                int length;

                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);

                }


            }
            zos.close();
        }
        catch (IOException ioe){
            System.out.println("IOException" + ioe);
        }
    }
}
