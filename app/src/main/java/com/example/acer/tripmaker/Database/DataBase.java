package com.example.acer.tripmaker.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by acer on 19-04-2018.
 */

public class DataBase {

    private ContactsDBHelper dbHelper;

    private SQLiteDatabase DB;


    public DataBase(Context context){
        dbHelper = new ContactsDBHelper(context);
        DB = dbHelper.getWritableDatabase();
    }


    public SQLiteDatabase getDB()
    {
        return DB;
    }
    public void close()
    {
        DB.close();
    }

}
