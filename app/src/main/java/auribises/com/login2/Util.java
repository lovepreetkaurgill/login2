package auribises.com.login2;

import android.net.Uri;

public class Util {

    // Information for my Database
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "login2.db";

    // Information for my Table
    public static final String TAB_NAME = "Login";
    public static final String COL_ID = "_ID";

    public static final String COL_USERNAME = "USERNAME";
    public static final String COL_PASSWORD = "PASSWORD";

    public static final String CREATE_TAB_QUERY = "create table Login(" +
            "_ID integer primary key autoincrement," +
            "USERNAME varchar(256)" +
            "PASSWORD varchar(256)" +
            ")";


    public static final String PREFS_NAME = "visitorbook";

    public static final String KEY_USERNAME = "keyUsername";
    public static final String KEY_PASSWORD = "keyPassword";


    // URI
    public static final Uri LOGIN_URI = Uri.parse("content://com.auribises.Adminappointment.teacherprovider/"+TAB_NAME);


    final static String URI = "http://sheenu.esy.es/sheenu2017/";
    // URL
    public static final String INSERT_LOGIN_TPHP = "http://sheenu.esy.es/sheenu2017/insert.php";

    }
