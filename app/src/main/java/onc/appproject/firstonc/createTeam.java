package onc.appproject.firstonc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class createTeam extends AppCompatActivity {
   // private DatabaseReference mDatabase;
   private TextView teamname;
   private TextView teamregion;
   private CheckBox officialcheckbox;
   private Button createTeamwithinfo;
   String inputteamname;
   String inputteamregion;
   boolean inputofficial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);
        TypefaceUtil.overrideFont(this, "SERIF", "fonts/Roboto-Regular.ttf");
        teamname = (TextView)findViewById(R.id.textteamname);
        teamregion = (TextView)findViewById(R.id.textteamregion);
        officialcheckbox = (CheckBox)findViewById(R.id.officialcheckBox);
        if(officialcheckbox.isChecked()){
            inputofficial = true;
        }else{
            inputofficial = false;
        }
        inputteamname = teamname.getText().toString();
        inputteamregion = teamregion.getText().toString();
        Team team = new Team(inputteamname,inputteamregion,inputofficial);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("teams");
        String teamId = mDatabase.push().getKey();
        mDatabase.child(teamId).setValue(team);
    }
}
