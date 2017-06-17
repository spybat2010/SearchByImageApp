package com.manishm.imagefinder;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by manish on 6/17/2017.
 */

public class CommonUtils {

    public static void clipBoard(Context context,String text)
    {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("image_finer_app", text);
        clipboard.setPrimaryClip(clip);

        Toast.makeText(context,"Text is copied to clipboard",Toast.LENGTH_LONG).show();
    }
}
