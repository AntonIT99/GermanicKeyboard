package com.germanickeyboard;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputConnection;

import java.util.regex.Pattern;

public abstract class AbstractGermanicKeyboardIMS extends InputMethodService implements KeyboardView.OnKeyboardActionListener, IGermanicKeyboardLayoutsXML
{
    private KeyboardView keyboardView;
    private Keyboard keyboard, shiftedKeyboard, secondaryKeyboard, shiftedSecondaryKeyboard;
    protected boolean isSecondLayoutActive;

    public abstract int getKeyboardViewLayout();


    @Override
    public View onCreateInputView()
    {
        keyboardView = (KeyboardView) getLayoutInflater().inflate(getKeyboardViewLayout(), null);
        keyboard = new Keyboard(this, getKeyboardLayoutXML());
        shiftedKeyboard = new Keyboard(this, getKeyboardShiftedLayoutXML());
        secondaryKeyboard = new Keyboard(this, getKeyboardSecondLayoutXML());
        shiftedSecondaryKeyboard = new Keyboard(this, getKeyboardShiftedSecondLayoutXML());
        keyboardView.setKeyboard(keyboard);
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }

    @Override
    public void onPress(int primaryCode)
    {

    }

    @Override
    public void onRelease(int primaryCode)
    {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes)
    {
        InputConnection inputConnection = getCurrentInputConnection();
        if (inputConnection != null)
        {
            switch(primaryCode)
            {
                case 0:
                    break;
                case Keyboard.KEYCODE_DELETE :
                    CharSequence selectedText = inputConnection.getSelectedText(0);
                    if (TextUtils.isEmpty(selectedText))
                    {
                        inputConnection.deleteSurroundingText(1, 0);
                    }
                    else
                    {
                        inputConnection.commitText("", 1);
                    }
                    break;
                case Keyboard.KEYCODE_SHIFT:
                    keyboardView.setShifted(!keyboardView.isShifted());
                    updateKeyboardView();
                    break;
                case Keyboard.KEYCODE_MODE_CHANGE:
                    isSecondLayoutActive = !isSecondLayoutActive;
                    updateKeyboardView();
                    break;
                default:
                    char code = (char) primaryCode;
                    inputConnection.commitText(String.valueOf(code), 1);
            }
        }
    }

    private void updateKeyboardView()
    {
        if (isSecondLayoutActive && keyboardView.isShifted())
        {
            keyboardView.setKeyboard(shiftedSecondaryKeyboard);
        }
        else if (isSecondLayoutActive)
        {
            keyboardView.setKeyboard(secondaryKeyboard);
        }
        else if (keyboardView.isShifted())
        {
            keyboardView.setKeyboard(shiftedKeyboard);
        }
        else
        {
            keyboardView.setKeyboard(keyboard);
        }

    }

    @Override
    public void onText(CharSequence text)
    {
        InputConnection inputConnection = getCurrentInputConnection();
        if (inputConnection != null)
        {
            String REGEX = "UU";
            Pattern pattern = Pattern.compile(REGEX);
            for (String s : pattern.split(text, 2))
            {
                inputConnection.commitText(String.valueOf((char)(Integer.parseInt(s))), 1);
            }
        }
    }

    @Override
    public void swipeLeft()
    {

    }

    @Override
    public void swipeRight()
    {

    }

    @Override
    public void swipeDown()
    {

    }

    @Override
    public void swipeUp()
    {

    }
}
