package org.example.personalizedmealplan;

class MealPlanGenerator {
    public static <T extends MealPlan> void validateAndGenerateMealPlan(T mealPlan) {
        // Validation logic can be added here
        System.out.println("Validating meal plan...");
        mealPlan.displayPlan();
    }
}
