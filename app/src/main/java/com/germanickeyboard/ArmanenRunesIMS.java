package com.germanickeyboard;

public class ArmanenRunesIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.armanen_runes;
    }
}
