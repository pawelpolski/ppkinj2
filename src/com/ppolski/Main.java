package com.ppolski;

import com.ppolski.Controller.Controller;
import com.ppolski.Model.Model;
import com.ppolski.View.View;



public class Main {

    public static void main(String[] args) {


        View theView = new View();

        Model theModel = new Model();

        Controller theController = new Controller(theView, theModel);


    }
}