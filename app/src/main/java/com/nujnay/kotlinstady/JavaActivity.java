package com.nujnay.kotlinstady;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class JavaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv_test_click = findViewById(R.id.tv_test_click);
        TextView tv_test_click_2 = findViewById(R.id.tv_test_click_2);
        Utils.Companion.clickDelay(tv_test_click, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                Log.d("clickDelay", "111");
                return null;
            }
        });
        Utils.Companion.clickDelay(tv_test_click_2, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                Log.d("clickDelay", "222");
                return null;
            }
        });
    }
}
