package com.sebastian_martinez.mqtt;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class view extends AppCompatActivity {
private Sensor Item;
private TextView nombre ,ValorSensor,TipoSensor,UbicacionSensor,FechaRegistro;
private TextView ObservaSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Item = (Sensor) getIntent().getSerializableExtra("objetodata");
//Nombre
nombre = (TextView) findViewById(R.id.lbl_Nombre);
nombre.setText(Item.getNombreSensor());
//Valor
ValorSensor = (TextView) findViewById(R.id.lbl_Valor);
ValorSensor.setText(Item.getValorSensor());
//tipo
        TipoSensor = (TextView) findViewById(R.id.lbl_tipo);
        TipoSensor.setText(Item.getTipoSensor());
//Ubicacion
        UbicacionSensor = (TextView) findViewById(R.id.lbl_ubicacion);
        UbicacionSensor.setText(Item.getUbicacionSensor());
//Fecha
        FechaRegistro = (TextView) findViewById(R.id.lbl_fecha);
        FechaRegistro.setText(Item.getFechaRegistro());
//Observacion
        ObservaSensor = (TextView) findViewById(R.id.lbl_observacion);
        ObservaSensor.setText(Item.getObservacionSensor());
    }

}