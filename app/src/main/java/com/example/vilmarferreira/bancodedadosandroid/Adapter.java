package com.example.vilmarferreira.bancodedadosandroid;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vilmarferreira on 16/11/2017.
 */

public class Adapter extends BaseAdapter {

    private final ArrayList<carroModel> carros;
    private final Activity activity;

    public Adapter(ArrayList<carroModel> carros, Activity act) {
        this.carros = carros;
        this.activity=act;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            convertView = this.activity.getLayoutInflater().inflate(R.layout.modelo, null);
        }

       carroModel carro = carros.get(position);

        TextView vrTxtNome= (TextView) convertView.findViewById(R.id.txtNome);
        TextView vrTxtPlaca= (TextView) convertView.findViewById(R.id.txtPlaca);
        TextView vrTxtAno= (TextView) convertView.findViewById(R.id.txtAno);


        vrTxtNome.setText("Nome: "+carro.getNome());
        vrTxtPlaca.setText("Placa: "+carro.getPlaca());
        vrTxtAno.setText("Ano: "+carro.getAno());


        return convertView;
    }
}
