package com.example.telalogin;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdicionarProduto extends AppCompatActivity {

   protected void onCreate(Bundle saveInstancesStates){
       super.onCreate(saveInstancesStates);
       setContentView(R.layout.activity_adicionar_produto);

       nomeProduto = findViewById(R.id.nomeProduto);
       categoria = findViewById(R.id.categoria);
       Preço = findViewById(R.id.preço);
       quantidade = findViewById(R.id.quantidade);
       Button btnsalvarprotudo = findViewById(R.id.btnsalvarprotudo);

       Button btnSaveProduct = findViewById(R.id.btnsalvarprotudo);

       dbHelper = new DatabaseHelper(this);

       btnSaveProduct.setOnClickListener(v -> btnsalvarprotudo());
       private void saveProduct() {
           String name = btnsalvarprotudo.getText().toString();
           String category = Categoria.getText().toString();
           double price = Double.parseDouble(etPrice.getText().toString());
           int quantity = Integer.parseInt(etQuantity.getText().toString());

            SQLiteDatabase db = dbHelper.getWritableDatabase();
           ContentValues values = new ContentValues();
           (DatabaseHelper.COLUMN_NOME, name);
           values.put(DatabaseHelper.COLUMN_Categoria, categoria);
           values.put(DatabaseHelper.COLUMN_preço, preço);
           values.put(DatabaseHelper.COLUMN_quantidade, quantidade);

           long newRowId = db.insert(DatabaseHelper.TABLE_PRODUCTS, null, values);
           if (newRowId != -1) {
               Toast.makeText(this, "", Toast.LENGTH_SHORT).show();(this, "Produto adicionado com sucesso", Toast.LENGTH_SHORT).show();
               finish();
           } else {
               Toast.makeText(this, "Erro ao adicionar produto.", Toast.LENGTH_SHORT).show();
           }
       }
   }


       }
}