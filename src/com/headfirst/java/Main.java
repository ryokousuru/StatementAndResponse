package com.headfirst.java;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        backpackChoice();
        //backpackInventory();

    }
        public static void backpackChoice(){
        BackPack bp = new BackPack();
        bp.whichColor();
        }
        public static void backpackInventory(){
        BackPack bi = new BackPack();
        bi.remainingInventory();
        }
    }

