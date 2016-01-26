package br.com.heiderlopes.androiddance;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView ivAndroid;
    private AnimationDrawable frameAnimation;

    FasterAnimationsContainer mFasterAnimationsContainer;
    private static final int[] IMAGE_RESOURCES = {
            R.drawable.android001, R.drawable.android002, R.drawable.android003,
            R.drawable.android004, R.drawable.android005, R.drawable.android006,
            R.drawable.android007, R.drawable.android008, R.drawable.android009,
            R.drawable.android010, R.drawable.android011, R.drawable.android012,
            R.drawable.android013, R.drawable.android014, R.drawable.android015,
            R.drawable.android016, R.drawable.android017, R.drawable.android018,
            R.drawable.android019, R.drawable.android020, R.drawable.android021,
            R.drawable.android022, R.drawable.android023, R.drawable.android024,
            R.drawable.android025, R.drawable.android026, R.drawable.android027,
            R.drawable.android028, R.drawable.android029, R.drawable.android030,
            R.drawable.android031, R.drawable.android032, R.drawable.android033,
            R.drawable.android034, R.drawable.android035, R.drawable.android036,
            R.drawable.android037, R.drawable.android038, R.drawable.android038,
            R.drawable.android039, R.drawable.android040, R.drawable.android041,
            R.drawable.android042, R.drawable.android043, R.drawable.android044,
            R.drawable.android045, R.drawable.android046, R.drawable.android047,
            R.drawable.android048, R.drawable.android049, R.drawable.android050,
            R.drawable.android051, R.drawable.android052, R.drawable.android053,
            R.drawable.android054, R.drawable.android055, R.drawable.android056,
            R.drawable.android057, R.drawable.android058, R.drawable.android059,
            R.drawable.android060, R.drawable.android061, R.drawable.android062,
            R.drawable.android063, R.drawable.android064, R.drawable.android065,
            R.drawable.android066, R.drawable.android067, R.drawable.android068,
            R.drawable.android069, R.drawable.android070, R.drawable.android071,
            R.drawable.android072, R.drawable.android073, R.drawable.android074,
            R.drawable.android075, R.drawable.android076, R.drawable.android077,
            R.drawable.android078, R.drawable.android079, R.drawable.android080,
            R.drawable.android081, R.drawable.android082, R.drawable.android083,
            R.drawable.android084, R.drawable.android085, R.drawable.android086,
            R.drawable.android087, R.drawable.android088, R.drawable.android089,
            R.drawable.android090, R.drawable.android091, R.drawable.android092,
            R.drawable.android093, R.drawable.android094, R.drawable.android095,
            R.drawable.android096, R.drawable.android097, R.drawable.android098,
            R.drawable.android099, R.drawable.android100, R.drawable.android101,
            R.drawable.android102, R.drawable.android103, R.drawable.android104,
            R.drawable.android105, R.drawable.android106, R.drawable.android107,
            R.drawable.android109, R.drawable.android110, R.drawable.android111,
            R.drawable.android112};

    private static final int ANIMATION_INTERVAL = 1;// 200ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivAndroid = (ImageView) findViewById(R.id.ivAndroid);

        mFasterAnimationsContainer = FasterAnimationsContainer
                .getInstance(ivAndroid);
        mFasterAnimationsContainer.addAllFrames(IMAGE_RESOURCES,
                ANIMATION_INTERVAL);
    }

    public void iniciarDanca(View v) {
        mFasterAnimationsContainer.start();
    }

    public void pararDanca(View v) {
        mFasterAnimationsContainer.stop();
    }
}
