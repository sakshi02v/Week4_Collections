package org.example.dynamiconlinemarketplace;

abstract class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class BookCategory extends Category {
    public BookCategory(String name) {
        super(name);
    }
}

class ClothingCategory extends Category {
    public ClothingCategory(String name) {
        super(name);
    }
}

class GadgetCategory extends Category {
    public GadgetCategory(String name) {
        super(name);
    }
}

