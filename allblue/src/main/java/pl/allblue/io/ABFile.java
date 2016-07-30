package pl.allblue.io;

import android.content.Context;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by SfTd on 27/06/2016.
 */
public class ABFile
{

    static public String GetContent(Context context, String file_name)
            throws IOException
    {
       /* Data */
        File file = new File(context.getFilesDir(), file_name);
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            String json_string = new String(data, "UTF-8");

            return json_string;
        }

        throw new FileNotFoundException();
    }

    static public void PutContent(Context context, String file_name,
            String content) throws IOException
    {
        File file = new File(context.getFilesDir(), file_name);
        FileOutputStream fos = new FileOutputStream(file);
        byte[] data_bytes = content.getBytes();
        fos.write(data_bytes);
        fos.close();
    }

}
