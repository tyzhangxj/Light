package com.zhuzeyao.light;

import com.zhuzeyao.app.R;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;

public class LightActivity extends Activity {
    /** Called when the activity is first created. */
	Camera camera = Camera.open();  
    boolean islight=false; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
          
        if (!islight) {  
            Parameters mParameters = camera.getParameters();  
            mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);  
            camera.setParameters(mParameters);  
            islight = true;  
        } else {  
            Parameters mParameters = camera.getParameters();  
            mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);  
            camera.setParameters(mParameters);  
            islight = false;  
        }  
    }
}