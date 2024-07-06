package com.germanickeyboard;

public class WiligutRunesIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.wiligut_runes;
    }
}
