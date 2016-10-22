package com.androidbolivia.androiddesignpatterns.patterns.builder;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androidbolivia.androiddesignpatterns.R;

/**
 * Created by Alvaro Orellana on 10/22/16.
 */

public class CampDialog extends Dialog implements ICampDialog {

    private Button btnCancel;
    private Button btnOK;
    private TextView txtMessage;

    public CampDialog(Context context) {
        super(context);
        setContentView(R.layout.camp_dialog);

        btnCancel = (Button) findViewById(R.id.btn_cancel);
        btnOK = (Button) findViewById(R.id.btn_ok);
        txtMessage = (TextView) findViewById(R.id.txt_message);
    }

    public void setMessage(String message) {
        txtMessage.setText(message);
    }

    public void setPositiveButton(String name, View.OnClickListener listener) {
        btnOK.setText(name);
        btnOK.setOnClickListener(listener);
    }

    @Override
    public void setNegativeButton(String name, View.OnClickListener listener) {
        btnCancel.setText(name);
        btnCancel.setOnClickListener(listener);
    }
}
