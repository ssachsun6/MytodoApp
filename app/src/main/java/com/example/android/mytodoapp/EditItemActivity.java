package com.example.android.mytodoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

//import static android.app.Activity.RESULT_OK;


public class EditItemActivity extends AppCompatActivity{

    String oldItem;
    int position;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Intent getIntent = getIntent();
        oldItem = getIntent.getStringExtra("item");
        //position = getIntent.getIntExtra("position", 0);

        etName =(EditText) findViewById(R.id.editText);
        etName.setText(oldItem);
        etName.setSelection(etName.getText().length());
    }

    public void onSubmit(View view) {
        Intent data = new Intent();
        data.putExtra("newItem", etName.getText().toString());
        //data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }

}
