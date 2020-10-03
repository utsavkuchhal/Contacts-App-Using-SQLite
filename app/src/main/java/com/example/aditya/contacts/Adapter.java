package com.example.aditya.contacts;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<ContactModel> {

    Activity context;
    ArrayList<ContactModel> list;
    public Adapter(Activity context, ArrayList<ContactModel> list) {
        super(context, R.layout.contact_pojo, list);
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.contact_pojo,null,true);

        TextView name =view.findViewById(R.id.tv_name);
        TextView number = view.findViewById(R.id.tv_number);
        TextView tv_char = view.findViewById(R.id.tv_char);

        String person = list.get(position).getPerson();
        name.setText(person);
        number.setText(list.get(position).getNumber());
        tv_char.setText(person.charAt(0) + "");
        return view;
    }
}
