package site.iway.androidflowlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;

import java.util.Random;

import site.iway.androidhelpers.FlowLayout;
import site.iway.androidhelpers.UnitHelper;

public class MainActivity extends Activity implements OnClickListener {

    private Random mRandom;
    private FlowLayout mFlowLayout;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRandom = new Random();
        mFlowLayout = (FlowLayout) findViewById(R.id.flow_layout);
        mButton = (Button) findViewById(R.id.addTextView);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addTextView:
                View view = new View(this);
                view.setBackgroundColor(0xFFFF0000);
                int width = mRandom.nextInt(UnitHelper.dipToPxInt(this, 50)) + UnitHelper.dipToPxInt(this, 50);
                int height = mRandom.nextInt(UnitHelper.dipToPxInt(this, 20)) + UnitHelper.dipToPxInt(this, 30);
                MarginLayoutParams marginLayoutParams = new MarginLayoutParams(width, height);
                mFlowLayout.addView(view, marginLayoutParams);
                break;
        }
    }
}
