package pl.allblue.app;

import android.content.Context;

/**
 * Created by SfTd on 28/07/2016.
 */
public class ABApp
{

    static final String Path = "pl.allblue.";

    static private Context Context = null;

    static public Context GetContext()
    {
        return ABApp.Context;
    }

    static public void Initialize(Context context)
    {
        if (ABApp.Context == null)
            ABApp.Context = context;

        if (context != ABApp.Context)
            throw new AssertionError("ABApp contexts do not match.");
    }

}