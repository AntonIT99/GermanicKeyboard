package com.germanickeyboard;

public class YoungerFutharkShortIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.younger_futhark_short;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.younger_futhark_short_qwerty;
    }
}
