package com.germanickeyboard;

import com.germanickeyboard.AbstractGermanicKeyboardIMS;
import com.germanickeyboard.R;

public class YoungerFutharkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.younger_futhark;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.younger_futhark_qwerty;
    }
}
