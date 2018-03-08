package com.example.android.text2speech;

import android.content.Intent;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    TextToSpeech ttsobject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttsobject=new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int status){}
        });

    }
    public void sound(View v)
    {
        EditText text=(EditText) findViewById(R.id.text);
        String et=text.getText().toString();
        ttsobject.speak(et,TextToSpeech.QUEUE_FLUSH,null,null);
        ttsobject.setLanguage(Locale.ENGLISH);
    }


}
