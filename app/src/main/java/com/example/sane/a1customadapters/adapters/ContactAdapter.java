package com.example.sane.a1customadapters.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.sane.a1customadapters.Main2Activity;
import com.example.sane.a1customadapters.R;
import com.example.sane.a1customadapters.models.Contact;

import java.util.List;

/**
 * Created by Sane on 10/1/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    class ViewHolder {
        TextView vname, vphonenumber;
        Button vbutton;

    }

    public ContactAdapter(@NonNull Context context, @NonNull List<Contact> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        ViewHolder viewholder;

        final Contact c = getItem(position);

        if (view == null) {

            view = LayoutInflater.from(getContext()).inflate(R.layout.user_list, parent, false);

            TextView tvname = (TextView) view.findViewById(R.id.name);
            TextView tvphonenumber = (TextView) view.findViewById(R.id.number);
            Button vbtn = (Button) view.findViewById(R.id.callButton);

            viewholder = new ViewHolder();
            viewholder.vname = tvname;
            viewholder.vphonenumber = tvphonenumber;
            viewholder.vbutton = vbtn;

            view.setTag(viewholder);
        }


        viewholder = (ViewHolder) view.getTag();

        viewholder.vname.setText(c.getName());
        viewholder.vphonenumber.setText(c.getPhoneNumber());

        viewholder.vbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( );
                intent.setData(Uri.parse("tel:" + c.getPhoneNumber()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                intent.putExtra("name",c.getName());
                getContext().startActivity(intent);
            }
        });


        return view;

    }
}
