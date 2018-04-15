package cr.ac.unadeca.todofrank.fragments;

import com.raizlabs.android.dbflow.annotation.Database;



@Database(name = TodoDatabase.NAME, version = TodoDatabase.VERSION)
public class TodoDatabase {
    public static final String NAME = "todofrank";
    public static final int VERSION = 3;
}
