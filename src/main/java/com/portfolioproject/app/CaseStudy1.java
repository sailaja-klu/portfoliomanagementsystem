package com.portfolioproject.app;

import java.util.ArrayList;

public class CaseStudy1 {

    public static void main(String[] args) {

        // Create User
        User user = new User("32", "Sailaja", "sailaja.35612@gmail.com");

        // Create Asset
        Asset asset = new Asset("TCS");

        // Create Holding
        Holding holding = new Holding(asset, 10, 3500);

        // Add investment to User
        user.addInvestment(holding);

        // Display details
        user.display();
    }

    // User class
    static class User {
        String userId;
        String name;
        String email;

        ArrayList<Holding> investments = new ArrayList<>();

        User(String userId, String name, String email) {
            this.userId = userId;
            this.name = name;
            this.email = email;
        }

        void addInvestment(Holding holding) {
            investments.add(holding);
        }

        void display() {
            System.out.println("User ID: " + userId);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

            System.out.println("Stock: " + investments.get(0).asset.name);
            System.out.println("Quantity: " + investments.get(0).quantity);
            System.out.println("Purchase Price: ₹" + investments.get(0).purchasePrice);
        }
    }

    // Holding class
    static class Holding {
        Asset asset;
        int quantity;
        double purchasePrice;

        Holding(Asset asset, int quantity, double purchasePrice) {
            this.asset = asset;
            this.quantity = quantity;
            this.purchasePrice = purchasePrice;
        }
    }

    // Asset class
    static class Asset {
        String name;

        Asset(String name) {
            this.name = name;
        }
    }
}
