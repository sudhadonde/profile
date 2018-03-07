package kodwell.com.profile;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView profile;
    TextView name,bg,age,gender,email,pincode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_four);

        profile = (CircleImageView) findViewById(R.id.profile_image);
        name=(TextView) findViewById(R.id.name);
        bg=(TextView) findViewById(R.id.bloodgroup);
        age=(TextView) findViewById(R.id.age);
        gender=(TextView) findViewById(R.id.gender);
        email=(TextView) findViewById(R.id.email);
        pincode=(TextView) findViewById(R.id.pincode);



        Animation flip = AnimationUtils.loadAnimation(this, R.anim.bounce);
        profile.startAnimation(flip);

        Animation fade = AnimationUtils.loadAnimation(this, R.anim.fadein);
        name.startAnimation(fade);
        bg.startAnimation(flip);
        age.startAnimation(flip);
        gender.startAnimation(flip);
        email.startAnimation(flip);
        pincode.startAnimation(flip);






    }
}
