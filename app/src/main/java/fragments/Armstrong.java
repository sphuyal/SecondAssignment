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
public class Armstrong extends Fragment implements View.OnClickListener {
    private Button btnArmstrong;
    private EditText etArmstrong;
    private TextView tvArmstrong;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etArmstrong = view.findViewById(R.id.etarmstrong);
        tvArmstrong = view.findViewById(R.id.tvarmstrong);
        btnArmstrong = view.findViewById(R.id.btnarmstrong);


        btnArmstrong.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        int num = Integer.parseInt(etArmstrong.getText().toString());

        int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            tvArmstrong.setText(num + " is an Armstrong number");
        else
            tvArmstrong.setText(num + " is not an Armstrong number");

    }
}
