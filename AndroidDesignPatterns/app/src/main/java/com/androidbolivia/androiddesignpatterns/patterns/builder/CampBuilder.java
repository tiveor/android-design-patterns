package com.androidbolivia.androiddesignpatterns.patterns.builder;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;

/**
 * Created by Alvaro Orellana on 10/22/16.
 */

public class CampBuilder {

    private CampDialog dialog;
    private Activity activity;

    public CampBuilder(Activity activity) {
        this.activity = activity;
        this.dialog = new CampDialog(activity);
    }

    public CampBuilder setTitle(String title) {
        this.dialog.setTitle(title);
        return this;
    }

    public CampBuilder setMessage(String message) {
        this.dialog.setMessage(message);
        return this;
    }

    public CampBuilder setPositiveButton(String name, View.OnClickListener listener) {
        this.dialog.setPositiveButton(name, listener);
        return this;
    }


}
