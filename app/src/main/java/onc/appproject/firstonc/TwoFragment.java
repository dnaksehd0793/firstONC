package onc.appproject.firstonc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TwoFragment extends Fragment {
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TypefaceUtil.overrideFont(getActivity(), "SERIF", "fonts/Roboto-Regular.ttf");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        Button button = (Button) rootView.findViewById(R.id.createTeam);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updetail();
            }
        });
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_two, container, false);
        return rootView;
    }
    public void updetail()
    {
        Intent intent = new Intent(getActivity(), createTeam.class);
        startActivity(intent);
    }
}
