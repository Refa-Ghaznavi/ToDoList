package app.auaf.todolist.utils;

import android.content.Context;
import android.content.SharedPreferences;

//Class For Session We should save some Key-Value here
//
public class SessionManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    //  Activity/Fragment/Class I am calling the SessionManger
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;
    // Shared preferences file name
    private static final String PREF_NAME = "todoApp";
    //Key For SavinG FirstTimeApp App
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    //SessionManger Constructor
    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    //IF this called set isFirstTime=true
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
    //Return the Value of isFirstTimeLaunch
    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, false);
    }
}