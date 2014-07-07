package com.NikNitro.bpcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends Activity implements OnClickListener{
	
	private Button boton;
//	private EditText litros, precio, compra, preciofinal;
	private double dlitros, dprecio, dcompra, dpreciofinal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		boton = (Button)findViewById(R.id.button);
		boton.setOnClickListener(this);
//		litros = (EditText)findViewById(R.id.Cantidad);
//		precio = (EditText)findViewById(R.id.Precio);
//		compra = (EditText)findViewById(R.id.Compra);
//		preciofinal = (EditText)findViewById(R.id.Pago);
		
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
		Toast texto1 = Toast.makeText(getBaseContext(), "Cálculo completo", Toast.LENGTH_SHORT);
		texto1.show();
	}
}
