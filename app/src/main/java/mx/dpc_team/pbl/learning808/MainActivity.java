package mx.dpc_team.pbl.learning808;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    /*TextView textView;
    EditText editText;
    Button boton;*/

    @BindView(R.id.tvHelloWorld) TextView textView;
    @BindView(R.id.etUser) EditText editText;
    @OnClick(R.id.btnSubmit) void enviar() {
        textView.setText(editText.getText().toString());
    }

    ImageView imageViewMarker;
    ImageView imageViewResource;
    ImageView imageViewInternet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        imageViewMarker = (ImageView) findViewById(R.id.ivMarker);
        imageViewInternet = (ImageView) findViewById(R.id.ivInternet);
        // "file:///android_asset/marker_blue.png"
        Picasso.with(this).load("file:///android_asset/marker_blue.png").into(imageViewMarker);
        // Picasso.with(this).load(R.mipmap.ic_launcher_round).into(imageViewResource);
        Picasso.with(this).load("https://lh3.googleusercontent.com/wPCnFNIep3vZeBH4eIcDSLl6CrMVIO1bakv19NKDROmrcLc_tBl1ShuewLMr-kWxvsFr4nhXcNi6kDVTYIcozAE=w1920-h1080-p-k-nd-no")
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.drawable.ic_no_internet)
                .resize(600,300)
                .into(imageViewInternet);


        /*textView = (TextView) findViewById(R.id.tvHelloWorld);
        editText = (EditText) findViewById(R.id.etUser);
        boton = (Button) findViewById(R.id.btnSubmit);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });*/

    }
}
