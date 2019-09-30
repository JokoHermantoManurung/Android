package com.manurung.joko.sepatuadidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSepatu;
//Make variable list have type ArrayList
    private ArrayList<Sepatu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        To find id recylerView
        rvSepatu = findViewById(R.id.rv_sepatu);
//        for automatic height and weight if setHasFixedSize have true its will automatic adjusted
        rvSepatu.setHasFixedSize(true);

        list.addAll(DataSepatu.getListData());
        ShowDataSepatu();

    }

    private void ShowDataSepatu() {
        rvSepatu.setLayoutManager(new LinearLayoutManager(this));
        SepatuAdapter listSepatuAdapter = new SepatuAdapter(list);
        rvSepatu.setAdapter(listSepatuAdapter);
    }

//    for Menu in Action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }
//   function when menu given action
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.toabout:
                Intent intent= new Intent(this, About.class);
                startActivity(intent);
                return true;
            default:
                return true;
        }
    }
}
