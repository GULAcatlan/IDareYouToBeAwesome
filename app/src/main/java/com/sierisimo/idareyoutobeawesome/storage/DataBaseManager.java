package com.sierisimo.idareyoutobeawesome.storage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Sier <sier@tr3sco.com> on 6/30/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class DataBaseManager implements DatabaseErrorHandler{


    @Override
    public void onCorruption(SQLiteDatabase dbObj) {

    }
}
