package com.example.lisyscarvalho.atividadeturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lisyscarvalho.atividadeturismo.modelos.PontoTuristico;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String textViewZoologico;
    private String textViewCine;
    private String textViewCatedral;
    private List<PontoTuristico> PontoTuristico = new ArrayList<>();
    private ArrayAdapter<PontoTuristico> arrayAdapterPontoTuristico;
    private ListView list_view_Lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarPontoTuristico();

        arrayAdapterPontoTuristico = new PontoTuristico(MainActivity.this,(ArrayList<PontoTuristico>) list_view_Lugares);
        list_view_Lugares.setAdapter(arrayAdapterPontoTuristico);

        list_view_Lugares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //fazer alguma coisa!!
               /*Toast toast = Toast.makeText(getApplicationContext(),
                        tarefas.get(i).getNome(), Toast.LENGTH_LONG);

                toast.show();*/

                Intent intent = new Intent(MainActivity.this, PontoTuristico.class);
                intent.putExtra("TITULO", PontoTuristico.get(i).getNome());
                startActivity(intent);
            }
        });

        public void criarPontoTuristico() {

        }

    }
}
