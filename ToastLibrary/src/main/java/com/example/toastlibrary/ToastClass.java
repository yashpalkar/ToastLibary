package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    private static Context c;
    private static String message;

    public static void s(Context c, String message){
        ToastClass.c = c;
        ToastClass.message = message;

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
