package org.example;

/**
 * Фабрика для створення інструментів розробки для мови C++.
 */
public class CppToolFactory implements ToolFactory {
    @Override
    public DevelopmentTool createTool() {
        return new CppTool();
    }
}
