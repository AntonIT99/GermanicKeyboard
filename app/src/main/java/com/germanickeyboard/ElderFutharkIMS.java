package com.germanickeyboard;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

public class ElderFutharkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    int getKeyboardXML()
    {
        return R.xml.keyboard_content_elder_futhark;
    }

    @Override
    int getKeyboardShiftXML()
    {
        return R.xml.keyboard_content_elder_futhark;
    }
}
