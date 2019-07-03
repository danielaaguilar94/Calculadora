package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    EditText etdisplay;
    double resultado;
    String operador, res , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etdisplay=findViewById(R.id.tvResu);


    }

    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnC:
                res="";
                etdisplay.setText("");
                reserva="";
                operador="";
                break;
            case R.id.btnCE:
                res = etdisplay.getText().toString();
                if(res.length()!= 0) {
                    res = res.substring(0, res.length() - 1);
                    etdisplay.setText(res);
                }
                break;
            case R.id.btnRaiz:
                reserva = etdisplay.getText().toString();
                if(reserva.length()!=0) {
                    operador = "√";
                    etdisplay.setText("");
                    obtenerResultado();
                }
                else
                {
                    etdisplay.setText("0");
                }
                break;
            case R.id.btnPorcentaje:

                reserva = etdisplay.getText().toString();
                operador = "%";
                etdisplay.setText("");

                //float porciento;
                //float resultado_porciento;

                //reserva=etdisplay.getText().toString();

               // operador = "%";
               // resultado_porciento=Float.parseFloat(reserva)/100;

                /*float porciento;
              /* // etdisplay.setText("");

                /*float porciento = (float) ((resta/ini) *100);

                String porcentaje = Float.toString(porciento);

                tvporcentaje.setText(porcentaje);*/

                //reserva =etdisplay.getText().toString();
                //porciento = Double.parseDouble(reserva) * (Double.parseDouble(etdisplay.getText().toString())/100);
                //porciento = (Float.parseFloat(reserva) * Float.parseFloat(etdisplay.getText().toString())/100);


               // etdisplay.setText("");
               // operador = "%";
                /*reserva =etdisplay.getText().toString();
                if (reserva.length()!=0) {

                    etdisplay.setText("");
                }*/
                break;

            case R.id.btnNum7:
                res= etdisplay.getText().toString();
                res = res+"7";
                etdisplay.setText(res);
                break;
            case R.id.btnNum8:
                res= etdisplay.getText().toString();
                res = res+"8";
                etdisplay.setText(res);
                break;
            case R.id.btnNum9:
                res= etdisplay.getText().toString();
                res = res+"9";
                etdisplay.setText(res);
                break;
            case R.id.btnDiv:
                reserva = etdisplay.getText().toString();
                operador = "/";
                etdisplay.setText("");
                break;
            case R.id.btnNum4:
                res= etdisplay.getText().toString();
                res = res+"4";
                etdisplay.setText(res);
                break;
            case R.id.btnNum5:
                res= etdisplay.getText().toString();
                res = res+"5";
                etdisplay.setText(res);
                break;
            case R.id.btnNum6:
                res= etdisplay.getText().toString();
                res = res+"6";
                etdisplay.setText(res);
                break;
            case R.id.btnMult:
                reserva = etdisplay.getText().toString();
                operador = "*";
                etdisplay.setText("");

                break;
            case R.id.btnNum1:
                res= etdisplay.getText().toString();
                res = res+"1";
                etdisplay.setText(res);
                break;
            case R.id.btnNum2:
                res= etdisplay.getText().toString();
                res = res+"2";
                etdisplay.setText(res);
                break;
            case R.id.btnNum3:
                res= etdisplay.getText().toString();
                res = res+"3";
                etdisplay.setText(res);
                break;
            case R.id.btnResta:
                reserva = etdisplay.getText().toString();
                operador="-";
                etdisplay.setText("");
                break;
            case R.id.btnNum0:
                res= etdisplay.getText().toString();
                res = res+"0";
                etdisplay.setText(res);
                break;
            case R.id.btnPunto:
                res = etdisplay.getText().toString();
                res = res+".";
                etdisplay.setText(res);
                break;
            case R.id.btnIgual:
                obtenerResultado();
                break;
            case R.id.btnSuma:
                reserva = etdisplay.getText().toString();
                operador = "+";
                etdisplay.setText("");

                break;
        }
    }

    private void obtenerResultado() {

        //res = etdisplay.getText().toString();
         //res = res + "1";
        if (operador.equals("-"))
        {
            resultado= Double.parseDouble(reserva) - Double.parseDouble(etdisplay.getText().toString());
            etdisplay.setText(String.valueOf(resultado));
        }
        if (operador.equals("+"))
        {
            resultado= Double.parseDouble(reserva) + Double.parseDouble(etdisplay.getText().toString());
            etdisplay.setText(String.valueOf(resultado));
        }
        if (operador.equals("*"))
        {
            resultado= Double.parseDouble(reserva) * Double.parseDouble(etdisplay.getText().toString());
            etdisplay.setText(String.valueOf(resultado));
        }
        if (operador.equals("/"))
        {
            resultado= Double.parseDouble(reserva) / Double.parseDouble(etdisplay.getText().toString());
            etdisplay.setText(String.valueOf(resultado));
        }
        if (operador.equals("√"))
        {
                resultado = Math.sqrt(Double.parseDouble(reserva));
                etdisplay.setText(String.valueOf(resultado));
        }
        if (operador.equals("%")){
            try {
                resultado= (Double.parseDouble(reserva)/100) * Double.parseDouble(etdisplay.getText().toString());
                etdisplay.setText(String.valueOf(resultado));
            }
            catch (Exception e)
            {
                etdisplay.setText("0");
                Toast toast = Toast.makeText(getApplicationContext(),"Orden: Valor1%Valor2",Toast.LENGTH_LONG);
                toast.show();

                //o también Toast.makeText(getApplicationContext(),"Orden: Valor1%Valor2",Toast.LENGTH_LONG).show();
                //

            }


        }


    }
}
