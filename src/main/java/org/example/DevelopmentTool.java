package org.example;

/**
 * Загальний інтерфейс для інструментів розробки.
 * Включає методи для перевірки, компіляції та налагодження коду.
 */
public interface DevelopmentTool {
    void validateCode();
    void compileCode();
    void debugCode();
}
