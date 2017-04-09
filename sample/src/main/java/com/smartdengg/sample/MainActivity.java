package com.smartdengg.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.smartdengg.nullpredictor.annotation.MaybeNull;
import com.smartdengg.nullpredictor.annotation.NotNull;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    testNotNull(0, null, null);
  }

  @NotNull(debug = false)
  private void testNotNull(int i, String text, @MaybeNull(loggable = true) Callback callback) {
    callback.test();
  }
}
