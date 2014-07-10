package com.NikNitro.bpcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Activity implements OnClickListener{
	//Bot�n
	private Button boton;
	//Texto Editable por el usuario
	private EditText litros, precio;
	//Texto S�LO legible por el usuario
	private TextView compra, preciofinal;
	// Variables enteras
	private double dlitros, dprecio, dcompra, dpreciofinal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//�ste m�todo se ejecuta el primero al iniciar la aplicaci�n.
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		boton = (Button)findViewById(R.id.button);
		//A�ado al bot�n el controlador.
		boton.setOnClickListener(this);
		//As� es como se inicializan los objetos para que queden
		// linkeados con el activity.
		litros = (EditText)findViewById(R.id.Cantidad);
		precio = (EditText)findViewById(R.id.Precio);
		compra = (TextView)findViewById(R.id.Compra);
		preciofinal = (TextView)findViewById(R.id.Pago);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// Al hacer click en alg�n bot�n, se llama aqu�.
		//Si tuvieramos m�s de un bot�n tendr�amos que ver a cual se refiere. Para ello usamos la v que nos pasan.
		calcular();
		mostrarToast("C�lculo completo");
	}

	private void mostrarToast(String string) {
		//Muestra un mensaje
		Toast texto1 = Toast.makeText(getBaseContext(), string, Toast.LENGTH_SHORT);
		texto1.show();
		
	}

	private void calcular() {
		try {
			dlitros = Double.parseDouble(litros.getText().toString());
			dprecio = Double.parseDouble(precio.getText().toString());
			double prec = Math.rint(dprecio*100/dlitros)/100;
			compra.setText(prec+"");
			double desc = prec*0.05;
			preciofinal.setText((dprecio-desc)+"");
		} catch (Exception e) {
			mostrarToast("Rellene todos los campos correctamente, por favor");
		}
		
	}
	
	
}
