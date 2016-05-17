package meliismyself.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_hello1)
    TextView tvHello1;
    @Bind(R.id.tv_hello2)
    TextView tvHello2;
    @Bind(R.id.tv_hello3)
    TextView tvHello3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvHello1.setText("Hallo 1");
        tvHello2.setText("Hallo 2");
        tvHello3.setText("Hallo 3");
    }
}
