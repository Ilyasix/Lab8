package org.example;

/**
 * Фабрика для створення інструментів розробки для мови Java.
 */
public class JavaToolFactory implements ToolFactory {
    @Override
    public DevelopmentTool createTool() {
        return new JavaTool();
    }
}
