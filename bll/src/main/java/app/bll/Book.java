package app.bll;

import android.content.Context;

public class Book
{
    private app.dal.Book mDAL_Book;

    public Book(Context context)
    {
        mDAL_Book=new app.dal.Book(context);
    }

    public app.model.Book getBook()
    {
        return mDAL_Book.getBook();
    }

    public int getListCount()
    {
        return  mDAL_Book.getListCount();
    }
}