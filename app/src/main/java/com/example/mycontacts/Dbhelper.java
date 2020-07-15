package com.example.mycontacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import com.example.mycontacts.Contract.ContactEntry;

public class Dbhelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "todaycontact.db";
    public static final int DATABASE_VERSION = 1;



    public Dbhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_TABLE = "CREATE TABLE " + ContactEntry.TABLE_NAME + " ("
                + ContactEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," // THIS AUTOMATICALLY INCREMENTS THE ID BY 1
                + ContactEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_EMAIL + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_PHONENUMBER + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_TYPEOFCONTACT + " TEXT NOT NULL, "
                + ContactEntry.COLUMN_PICTURE  + " TEXT);";


                db.execSQL(SQL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
