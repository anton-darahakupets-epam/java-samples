package com.design.patterns.creational.abstractfactory.factory.impl;

import com.design.patterns.creational.abstractfactory.factory.UIAbstractFactory;
import com.design.patterns.creational.abstractfactory.family.Help;
import com.design.patterns.creational.abstractfactory.family.Image;
import com.design.patterns.creational.abstractfactory.family.Locale;
import com.design.patterns.creational.abstractfactory.family.impl.usa.USAHelpImpl;
import com.design.patterns.creational.abstractfactory.family.impl.usa.USAImageImpl;
import com.design.patterns.creational.abstractfactory.family.impl.usa.USALocaleImpl;

public class UsaUIFactory extends UIAbstractFactory {

    public Help getHelp() {
        return new USAHelpImpl();
    }

    public Image getImage() {
        return new USAImageImpl();
    }

    public Locale getLocale() {
        return new USALocaleImpl();
    }
}
