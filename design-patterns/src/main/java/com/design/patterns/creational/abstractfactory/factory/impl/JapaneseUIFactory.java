package com.design.patterns.creational.abstractfactory.factory.impl;

import com.design.patterns.creational.abstractfactory.factory.UIAbstractFactory;
import com.design.patterns.creational.abstractfactory.family.Help;
import com.design.patterns.creational.abstractfactory.family.Image;
import com.design.patterns.creational.abstractfactory.family.Locale;
import com.design.patterns.creational.abstractfactory.family.impl.japan.JapaneseHelpImpl;
import com.design.patterns.creational.abstractfactory.family.impl.japan.JapaneseImageImpl;
import com.design.patterns.creational.abstractfactory.family.impl.japan.JapaneseLocaleImpl;

public class JapaneseUIFactory extends UIAbstractFactory {

    public Help getHelp() {
        return new JapaneseHelpImpl();
    }

    public Image getImage() {
        return new JapaneseImageImpl();
    }

    public Locale getLocale() {
        return new JapaneseLocaleImpl();
    }
}
