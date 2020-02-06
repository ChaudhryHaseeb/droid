package com.example.global_td_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class CertifActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certif);

        Button bget = findViewById(R.id.btn_get);
        bget.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.btn_get)
        {
            try
            {
                EditText edt1 = findViewById(R.id.edt1);
                URL url = new URL(edt1.getText().toString());
                HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
                con.getPeerPrincipal();
                System.out.println(con.getPeerPrincipal());
                System.out.println(con.getServerCertificates());
            }
            catch (MalformedURLException e)
            {

            } catch (SSLPeerUnverifiedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
