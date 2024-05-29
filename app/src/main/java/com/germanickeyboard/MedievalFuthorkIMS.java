package com.germanickeyboard;

public class MedievalFuthorkIMS extends AbstractGermanicKeyboardIMS
{
    @Override
    public int getKeyboardViewLayout()
    {
        return R.layout.keyboard_view;
    }

    @Override
    public int getKeyboardLayoutXML()
    {
        return R.xml.medieval_futhork;
    }

    @Override
    public int getKeyboardSecondLayoutXML()
    {
        return R.xml.medieval_futhork_qwerty;
    }
}
