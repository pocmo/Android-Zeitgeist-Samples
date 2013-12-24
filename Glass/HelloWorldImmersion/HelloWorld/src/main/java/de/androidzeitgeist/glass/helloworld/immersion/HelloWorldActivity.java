package de.androidzeitgeist.glass.helloworld.immersion;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.glass.app.Card;

public class HelloWorldActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Card card = new Card(this);
        card.setText("Hello world!");
        card.setFootnote("androidzeitgeist.com");

        setContentView(card.toView());
    }
}
