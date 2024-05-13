package com.germanickeyboard;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

public class YoungerFutharkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public View onCreateInputView()
    {
        KeyboardView keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard_view, null);
        keyboardView.setKeyboard(new Keyboard(this, R.xml.keyboard_content_younger_futhark));
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }
}
