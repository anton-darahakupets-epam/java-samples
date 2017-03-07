package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.factory.UIAbstractFactory;
import com.design.patterns.creational.abstractfactory.factory.impl.UsaUIFactory;
import com.design.patterns.creational.abstractfactory.family.Help;

public class Client {
    public static void main(String[] args) {
        UIAbstractFactory abstractFactory = UsaUIFactory.getUIFactory(UIAbstractFactory.JAPAN);
        Help japaneseHelp = abstractFactory.getHelp();
        System.out.println(japaneseHelp.getHelpCountry()); // Print "Japan"
        abstractFactory = UsaUIFactory.getUIFactory(UIAbstractFactory.USA);
        Help usaHelp = abstractFactory.getHelp();
        System.out.println(usaHelp.getHelpCountry()); // Print "USA"
    }
}
