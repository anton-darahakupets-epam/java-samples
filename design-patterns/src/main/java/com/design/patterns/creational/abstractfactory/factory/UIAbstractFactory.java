package com.design.patterns.creational.abstractfactory.factory;

import com.design.patterns.creational.abstractfactory.factory.impl.JapaneseUIFactory;
import com.design.patterns.creational.abstractfactory.factory.impl.UsaUIFactory;
import com.design.patterns.creational.abstractfactory.family.Help;
import com.design.patterns.creational.abstractfactory.family.Image;
import com.design.patterns.creational.abstractfactory.family.Locale;

public abstract class UIAbstractFactory {

    public static final int JAPAN = 0;
    public static final int USA = 1;

    public abstract Help getHelp();

    public abstract Image getImage();

    public abstract Locale getLocale();

    public static UIAbstractFactory getUIFactory(int factory) {
        switch (factory) {
            case JAPAN:
                return new JapaneseUIFactory();
            case USA:
                return new UsaUIFactory();
            default:
                return null;
        }
    }
}