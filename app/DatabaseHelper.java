import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper {
    private static final String DATABASE_NAME = "farmacia.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_PRODUTOS = "produtos";


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_PRODUTOS + "("
                + nomeProduto + " TEXT,"
                +  categoria + " TEXT,"
                +  preço + " REAL,"
                + quantidade + " INTEGER" + ")";
        db.execSQL(CREATE_PRODUCTS_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUTOS);
        onCreate(db);


    }
}












}
