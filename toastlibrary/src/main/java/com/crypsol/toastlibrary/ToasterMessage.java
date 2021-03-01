package com.crypsol.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public   class ToasterMessage {

    public static void ShowMyToaster(Context cxt,String Message){
        Toast.makeText(cxt, "elison : "+Message, Toast.LENGTH_SHORT).show();
    }
}
