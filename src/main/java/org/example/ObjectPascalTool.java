package org.example;

/**
 * Реалізація інструменту розробки для мови ObjectPascal.
 */
public class ObjectPascalTool implements DevelopmentTool {
    @Override
    public void validateCode() {
        System.out.println("Перевірка коду для ObjectPascal.");
    }

    @Override
    public void compileCode() {
        System.out.println("Компіляція коду для ObjectPascal.");
    }

    @Override
    public void debugCode() {
        System.out.println("Налагодження коду для ObjectPascal.");
    }
}
