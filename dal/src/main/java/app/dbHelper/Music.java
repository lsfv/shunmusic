package app.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Music extends SQLiteOpenHelper
{
    public static int defaultVersion=1;
    public static Music getInstance(Context context)
    {
        return new Music(context, "music.db", null, defaultVersion);
    }

    public Music(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.beginTransaction();
        try
        {
            String sql_create1 = new String("CREATE TABLE List ( `L_id` INTEGER PRIMARY KEY AUTOINCREMENT, `L_name` TEXT NOT NULL, `L_info` TEXT NOT NULL, `L_pic` TEXT NOT NULL, `L_ps` TEXT NOT NULL )");
            String sql_create2 = new String("CREATE TABLE Song ( `S_id` integer PRIMARY KEY AUTOINCREMENT, `S_musicName` text NOT NULL, `S_artist` text NOT NULL, `S_duration` integer NOT NULL, `S_path` text NOT NULL, `S_songID` integer NOT NULL, `S_version` integer NOT NULL, `S_ps` TEXT NOT NULL )");
            String sql_create3 = new String("CREATE TABLE LocalSong ( `LS_id` integer PRIMARY KEY AUTOINCREMENT, `LS_musicName` text NOT NULL, `LS_artist` text NOT NULL, `LS_duration` integer NOT NULL, `LS_path` text NOT NULL, `LS_songID` integer NOT NULL, `LS_version` INTEGER NOT NULL )");
            String sql_create4 = new String("CREATE TABLE List_Song ( `LS_id` integer PRIMARY KEY AUTOINCREMENT, `LS_lid` integer NOT NULL, `LS_sid` integer NOT NULL )");
            db.execSQL(sql_create1);
            db.execSQL(sql_create2);
            db.execSQL(sql_create3);
            db.execSQL(sql_create4);
            db.setTransactionSuccessful();
        }
        finally
        {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    }
}