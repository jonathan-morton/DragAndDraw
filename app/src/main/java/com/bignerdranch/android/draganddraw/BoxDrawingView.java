package com.bignerdranch.android.draganddraw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by larrikin on 3/3/15.
 */
public class BoxDrawingView extends View {

    //Used when creating the view in code
    public BoxDrawingView(Context context){
        this(context, null);
    }

    //Used when inflating the view from XML
    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}