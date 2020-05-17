package brianosmondwan.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hook up the buttons and the onclick listeners on the main activity
        Button btnSingle = (Button) findViewById(R.id.btnPlaySingle); //Plays the single video
        Button btnStandalone = (Button) findViewById(R.id.btnStandalone); //Opens the standalone activity
        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch(view.getId()) {
            case R.id.btnPlaySingle:
                //YoutubeActivity.class is a class literal
                intent = new Intent(this, YoutubeActivity.class); //This passes the current context. Intent to start up the youtube activity
                break;

            case R.id.btnStandalone:
                intent = new Intent(this, StandaloneActivity.class); // Intent to start up the standalone activity
                break;

            default:
        }

        //Good practice to not call methods on null objects
        if(intent != null) {
            startActivity(intent);
        }
    }
}
