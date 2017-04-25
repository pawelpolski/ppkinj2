package com.ppolski.Inne.miniProjekt_2;

/**
 * Created by macbook on 20.01.2017.
 */
public class MVC {

    public static void main(String[] args) {
        View theView = new View();
        Model theModel = new Model();

        Controller theController = new Controller(theView, theModel);
        theView.setVisible(true);

    }
}
