package org.example.dynamiconlinemarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void testBookCategoryName() {
        BookCategory bookCategory = new BookCategory("Fiction");
        assertEquals("Fiction", bookCategory.getName(), "BookCategory name should be Fiction");
    }

    @Test
    void testClothingCategoryName() {
        ClothingCategory clothingCategory = new ClothingCategory("Men's Wear");
        assertEquals("Men's Wear", clothingCategory.getName(), "ClothingCategory name should be Men's Wear");
    }

    @Test
    void testGadgetCategoryName() {
        GadgetCategory gadgetCategory = new GadgetCategory("Smartphones");
        assertEquals("Smartphones", gadgetCategory.getName(), "GadgetCategory name should be Smartphones");
    }
}
