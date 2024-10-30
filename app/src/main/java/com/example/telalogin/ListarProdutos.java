package com.example.telalogin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

public class ListarProdutos extends AppCompatActivity {

    private ListarProdutos listarProdutos;
    private DatabaseHelper dbHelper;
    private ArrayAdapter <String> adapter;
    private ListarProdutos <String> produtoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);

         listarProdutos = findViewById(R.id.listaprodutos);
        dbHelper = new DatabaseHelper(this);
        produtoList = new ListarProdutos();

    }

    private void exibirproduto(){
        SQLiteDatabase db = dbHelper();
        Cursor cursor = db.query(DatabaseHelper.TABLE_PRODUCTS,
                new String[]{DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_categoria},
                null, null, null, null, null);

    }

    public ListarProdutos getListarProdutos() {
        return listarProdutos;
    }

    adapter = new ArrayAdapter<>(this, android.R.layout. );
        listarProdutos.setAdapter(adapter);
}

