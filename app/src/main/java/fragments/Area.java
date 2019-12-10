package fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hello.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Area extends Fragment implements  View.OnClickListener {

    private Button btnArea;
    private EditText etRadius;
    private TextView tvArea;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area, container, false);

        etRadius = view.findViewById(R.id.etradius);
        tvArea = view.findViewById(R.id.tvarea);
        btnArea = view.findViewById(R.id.btnarea);


        btnArea.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f * radius * radius;

        tvArea.setText("Area of circle is " + area);
    }
}
