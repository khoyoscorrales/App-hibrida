package com.example.quicknotes;
import android.content.Context;
import android.widget.Toast;
public class utility {

    static void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
