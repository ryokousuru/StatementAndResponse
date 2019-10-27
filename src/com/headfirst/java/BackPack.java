package com.headfirst.java;

public class BackPack {
    public void whichColor(){
        String [] color = {"yellow", "white", "blue", "purple",
                "red", "pink", "brown", "beige"};

        int size = color.length;

        int which = (int) (Math.random() * size);

        String whichOne = color[which];

        System.out.println("I'd like to buy a " + whichOne + " backpack, please.");

        switch(whichOne){
            case "yellow":
                System.out.println("They\'re over there in aisle 4 on the right hand side.\n");
                break;
            case "white":
                System.out.println("It\'s in this direction; there\'s the very last one.\n");
                break;
            case "blue":
                System.out.println("Those are just across from the blue jean department.\n");
                break;
            case "purple":
                System.out.println("That\'s a really swell color; they\'re just over here in this direction.\n");
                break;
            case "red":
                System.out.println("They\'re just to the right of the lipstick department.\n");
                break;
            case "pink":
                System.out.println("You\'ll find them in the romance department.\n");
                break;
            case "beige":
                System.out.println("They\'re behind the jewelry department.\n");
                break;
            case "brown":
                System.out.println("Those are in the back of the store; I\'ll fetch you one and come right back with it.\n");
                break;
        }
    }
    public void remainingInventory(){
        int [] quantity = {7, 9, 2, 4, 11, 8, 10, 5};

        int total = quantity.length;

        int sum = (int) (Math.random() * total);

        int number = quantity[sum];

        String backpackColor = "orange";

        switch (number){
            case 7:
                backpackColor = "yellow";
                break;
            case 9:
                backpackColor = "white";
                break;
            case 2:
                backpackColor = "blue";
                break;
            case 4:
                backpackColor = "purple";
                break;
            case 11:
                backpackColor = "red";
                break;
            case 8:
                backpackColor = "pink";
                break;
            case 10:
                backpackColor = "brown";
                break;
            case 5:
                backpackColor = "beige";
                break;
        }
        System.out.println("Only " + number + " " + backpackColor + " backpacks remain on the shelf.");

    }
}