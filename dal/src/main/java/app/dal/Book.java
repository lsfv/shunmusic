package app.dal;

import android.content.Context;
import android.database.Cursor;

import app.dbHelper.Music;
import app.lslibrary.androidHelper.LSLog;

public class Book
{
    private Music DB;
    public Book(Context context)
    {
        DB=Music.getInstance(context);
    }

    public int getListCount()
    {
        try
        {
            Cursor cursor = DB.getReadableDatabase().rawQuery("select sum(1) from list ", null);
            if (cursor.moveToFirst())
            {
                return cursor.getInt(0);
            } else
            {
                return -1;
            }

        } catch (Exception e)
        {
            LSLog.Log_Exception(e);
            return -2;
        }
    }

    public app.model.Book getBook()
    {
        app.model.Book book_temp=new app.model.Book();
        book_temp.name="c++";
        book_temp.id=4;
        return book_temp;
    }
}