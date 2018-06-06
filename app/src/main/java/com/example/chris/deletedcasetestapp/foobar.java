package com.example.chris.deletedcasetestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;


public class foobar {
    public static void foo () throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(3);   //DOH! What if exception?
        fos.close();
    }
}
