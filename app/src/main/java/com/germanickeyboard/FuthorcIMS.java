package com.germanickeyboard;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

public class FuthorcIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public View onCreateInputView()
    {
        KeyboardView keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard_view, null);
        keyboardView.setKeyboard(new Keyboard(this, R.xml.keyboard_content_futhorc));
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }
}
