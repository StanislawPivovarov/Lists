package com.example.lab3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class StateAdapter extends ArrayAdapter<State> {

    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public StateAdapter(Context context, int resource, List<State> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ImageView imgView = convertView.findViewById(R.id.image);
        TextView nameView = convertView.findViewById(R.id.name);
        TextView infoView = convertView.findViewById(R.id.info);

        State state = states.get(position);

        imgView.setImageResource(state.getImgId());
        nameView.setText(state.getName());
        infoView.setText(state.getInfo());

        return convertView;
    }
    private class ViewHolder {
        final ImageView imgView;
        final TextView nameView, infoView;
        ViewHolder(View view){
            imgView = view.findViewById(R.id.image);
            nameView = view.findViewById(R.id.name);
            infoView = view.findViewById(R.id.info);
        }
    }
}
