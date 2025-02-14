package org.example.personalizedmealplan;

public class Main {
    public static void main(String[] args) {
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(vegMeal);
        Meal<VeganMeal> veganMealPlan = new Meal<>(veganMeal);
        Meal<KetoMeal> ketoMealPlan = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>(highProteinMeal);

        System.out.println("Displaying meal plans:");
        vegetarianMeal.displayMealPlan();
        veganMealPlan.displayMealPlan();
        ketoMealPlan.displayMealPlan();
        highProteinMealPlan.displayMealPlan();

        System.out.println("\nGenerating personalized meal plans:");
        MealPlanGenerator.validateAndGenerateMealPlan(vegMeal);
        MealPlanGenerator.validateAndGenerateMealPlan(veganMeal);
        MealPlanGenerator.validateAndGenerateMealPlan(ketoMeal);
        MealPlanGenerator.validateAndGenerateMealPlan(highProteinMeal);
    }
}
