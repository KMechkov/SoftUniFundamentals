package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileMover
{
    public static void main(String[] args)
    {
        String path1 = "C:/Users/kriss/IdeaProjects/honda.jpg";
        String path2 = "C:/Users/kriss/IdeaProjects/hondaCopy.jpg";

        File oldFile = new File( path1);
        File newFile = new File( path2);

        try
        {
            FileInputStream fis = new FileInputStream( oldFile );
            FileOutputStream fos = new FileOutputStream( newFile );

            try
            {
                int currentByte = fis.read();
                while( currentByte != -1 )
                {
                    fos.write( currentByte );
                    currentByte = fis.read();
                }
            }
            catch( IOException exception )
            {
                System.err.println( "IOException occurred!" );
                exception.printStackTrace();
            }
            finally
            {
                fis.close();
                fos.close();
                System.out.println( "Copied file!" );
            }
        }
        catch( IOException exception )
        {
            System.err.println( "Problems with files!" );
            exception.printStackTrace();
        }
    }
}