package com.germanickeyboard;

public interface IGermanicKeyboardLayoutsXML
{
    int getKeyboardLayoutXML();

    default int getKeyboardShiftedLayoutXML()
    {
        return getKeyboardLayoutXML();
    }

    default int getKeyboardSecondLayoutXML()
    {
        return getKeyboardLayoutXML();
    }

    default int getKeyboardShiftedSecondLayoutXML()
    {
        return getKeyboardSecondLayoutXML();
    }
}
