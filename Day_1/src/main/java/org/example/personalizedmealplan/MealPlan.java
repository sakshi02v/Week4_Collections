package org.example.personalizedmealplan;

interface MealPlan {
    void displayPlan();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void displayPlan() {
        System.out.println("Vegetarian Meal Plan: Includes vegetables, fruits, grains, and dairy products.");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void displayPlan() {
        System.out.println("Vegan Meal Plan: Includes vegetables, fruits, grains, legumes, and nuts.");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void displayPlan() {
        System.out.println("Keto Meal Plan: Includes high-fat, low-carb foods like meat, fish, eggs, and leafy greens.");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void displayPlan() {
        System.out.println("High-Protein Meal Plan: Includes lean meats, poultry, fish, beans, and legumes.");
    }
}

