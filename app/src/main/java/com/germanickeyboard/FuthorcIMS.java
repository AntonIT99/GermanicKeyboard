package com.germanickeyboard;

import com.germanickeyboard.AbstractGermanicKeyboardIMS;
import com.germanickeyboard.R;

public class FuthorcIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.futhorc;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.futhorc_qwerty;
    }
}
