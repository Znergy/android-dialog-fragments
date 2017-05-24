package com.example.guest.fragmentapp1;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MoodDialogFragment extends DialogFragment {
    private Button btnCancel;
    private Button btnSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);

        btnCancel = (Button) rootView.findViewById(R.id.btnCancel);
        btnSubmit = (Button) rootView.findViewById(R.id.btnSubmit);

        RadioGroup radioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cancel", selectedRadioButton.getText().toString());
                dismiss();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("submit", selectedRadioButton.getText().toString());
            }
        });
        return rootView;
    }

//    @Override
//    public void onClick(View v) {
//        if(v == btnCancel) {
//            Log.d("cancel", selectedRadioButton.getText().toString());
//            dismiss();
//        } else if (v == btnSubmit) {
//            // connect the radio group -> using id -> return selected value
//            Log.d("submit", selectedRadioButton.getText().toString());
//        }
//    }
}
