package io.github.alibudi.androiddasar3list;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import static io.github.alibudi.androiddasar3list.konstanta.DATAGAMBAR;
import static io.github.alibudi.androiddasar3list.konstanta.DATANAMA;

public class DetailActivity extends AppCompatActivity {

    //logt
    private static final String TAG = "DetailActivity";

    TextView tvnamaBuah;
    ImageView ivgambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(konstanta.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(konstanta.DATAGAMBAR, 0);

        //log
        Log.d(TAG, "nama: "+ namabuah);
        Log.d(TAG, "gambar: "+ gambarbuah);

        tvnamaBuah = findViewById(R.id.tv_detail_nama);
        ivgambarBuah = findViewById(R.id.iv_detail_gambar);

        tvnamaBuah.setText(namabuah);
        ivgambarBuah.setImageResource(gambarbuah);
    }
}
