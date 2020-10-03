package com.example.aditya.contacts;

import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Data extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        listView = findViewById(R.id.lv_list);
        try
        {
            ContactsDB db = new ContactsDB(this);
            db.open();
            ArrayList<ContactModel> list = db.getData();
            listView.setAdapter(new Adapter(this,list));
            db.close();
        }

        catch (SQLException e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
