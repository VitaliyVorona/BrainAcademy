package com.brainacad.LABS_3_3_MyFileCopy;

import java.io.*;

/**
 * Created by vitaliy.vorona on 10/13/2015.
 */
public class MyFileCopy {

    public static void main(String[] args) throws IOException {
        File fileIn = new File(args[0]);
        File fileOut = new File(args[1]);
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(fileIn);
            outputStream = new FileOutputStream(fileOut);
            int value;
            while ((value = inputStream.read()) != -1){
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }



}
