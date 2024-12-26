package org.example;

/**
 * Реалізація інструменту розробки для мови C++.
 */
public class CppTool implements DevelopmentTool {
    @Override
    public void validateCode() {
        System.out.println("Перевірка коду для C++.");
    }

    @Override
    public void compileCode() {
        System.out.println("Компіляція коду для C++.");
    }

    @Override
    public void debugCode() {
        System.out.println("Налагодження коду для C++.");
    }
}
