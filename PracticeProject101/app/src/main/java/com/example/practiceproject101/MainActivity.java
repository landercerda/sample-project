package com.example.practiceproject101;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.firestore.FirebaseFirestore;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.editText_main_password)
    TextInputEditText textInputEditTextPassword;
    @BindView(R.id.editText_main_username)
    TextInputEditText textInputEditTextUsername;
    @BindView(R.id.button_main_getIn)
    Button buttonGetIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
    }
}
