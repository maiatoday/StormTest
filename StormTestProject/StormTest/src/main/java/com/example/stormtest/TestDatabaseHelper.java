package com.example.stormtest;
import android.content.Context;

import com.turbomanage.storm.DatabaseHelper;
import com.turbomanage.storm.api.Database;
import com.turbomanage.storm.api.DatabaseFactory;

@Database(name = TestDatabaseHelper.DB_NAME, version = TestDatabaseHelper.DB_VERSION)
public class TestDatabaseHelper extends DatabaseHelper {

    public TestDatabaseHelper(Context ctx, DatabaseFactory dbFactory) {
        super(ctx, dbFactory);
    }

    public static final String DB_NAME = "testDb";
    public static final int DB_VERSION = 2;

    @Override
    public UpgradeStrategy getUpgradeStrategy() {
        return UpgradeStrategy.DROP_CREATE;
    }

}
