package com.androidbolivia.androiddesignpatterns.patterns.builder;

import android.view.View;

/**
 * Created by Alvaro Orellana on 10/22/16.
 */

public interface ICampDialog {

    void setMessage(String message);

    void setPositiveButton(String name, View.OnClickListener listener);

    void setNegativeButton(String name, View.OnClickListener listener);

}
