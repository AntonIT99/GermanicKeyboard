package com.germanickeyboard;

public class ElderFutharkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.elder_futhark;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.elder_futhark_qwerty;
    }
}
