package Validator;

import Menu.Menu;

public class Validator {

    public static boolean isValidMenuItem(int value) {

        if (value > -1 && value <= Menu.MENUMAXITEM | value == 99) {
            return true;
        } else {
            System.out.println("Please, enter valid menu item\n-----");
            return false;
        }
    }

}
