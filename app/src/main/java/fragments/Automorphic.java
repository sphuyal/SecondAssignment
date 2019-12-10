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
public class Automorphic extends Fragment implements View.OnClickListener {

    private Button btnAutomorphic;
    private EditText etAutomorphic;
    private TextView tvAutomorphic;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

         etAutomorphic= view.findViewById(R.id.etautomorphic);
        tvAutomorphic = view.findViewById(R.id.tvautomorphic);
        btnAutomorphic = view.findViewById(R.id.btnautomorphic);

        btnAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num=Integer.parseInt(etAutomorphic.getText().toString());



        int d=1; int i;
        for(i=num;i>0;i=i/10)
        {
            d=d*10;
        }
        if((num*num)%d==num)
        {
            tvAutomorphic.setText(num+"\t"+"is Automorphic Number");
        }
        else
        {
            tvAutomorphic.setText(num+"\t"+"is not Automorphic Number");
        }


    }
}
