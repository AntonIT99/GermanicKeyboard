package com.germanickeyboard;

public class ModernFutharkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.modern_futhark;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.modern_futhark_qwerty;
    }
}
