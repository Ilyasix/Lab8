package org.example;

/**
 * Реалізація інструменту розробки для мови Java.
 */
public class JavaTool implements DevelopmentTool {
    @Override
    public void validateCode() {
        System.out.println("Перевірка коду для Java.");
    }

    @Override
    public void compileCode() {
        System.out.println("Компіляція коду для Java.");
    }

    @Override
    public void debugCode() {
        System.out.println("Налагодження коду для Java.");
    }
}
