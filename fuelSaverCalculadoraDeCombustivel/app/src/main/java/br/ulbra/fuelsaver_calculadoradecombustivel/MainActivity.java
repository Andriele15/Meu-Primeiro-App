package br.ulbra.fuelsaver_calculadoradecombustivel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtNomeV, edtPlacaV, edtDistancia, edtConsumo, edtPreco;
    Button btnCalcular;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Vincular os componentes
        edtNomeV = findViewById(R.id.edtNomeV);
        edtPlacaV = findViewById(R.id.edtPlacaV);
        edtDistancia = findViewById(R.id.edtDistancia);
        edtConsumo = findViewById(R.id.edtConsumo);
        edtPreco = findViewById(R.id.edtPreco);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        // Ação do botão
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validando entradas
                if (edtDistancia.getText().toString().isEmpty() ||
                        edtConsumo.getText().toString().isEmpty() ||
                        edtPreco.getText().toString().isEmpty()) {
                    Toast.makeText(view.getContext(), "Por favor preencha todos os campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Pegando os valores digitados
                double distancia = Double.parseDouble(edtDistancia.getText().toString());
                double consumo = Double.parseDouble(edtConsumo.getText().toString());
                double preco = Double.parseDouble(edtPreco.getText().toString());

                // Fórmula de cálculo
                double litrosNecessarios = distancia / consumo;
                double custoViagem = litrosNecessarios * preco;

                // Exibindo o resultado
                String resultado = String.format("Litros necessários: %.2f\n\nCusto da viagem: %.2f", litrosNecessarios, custoViagem);
                txtResultado.setText(resultado);
            }
        });
    }
}

