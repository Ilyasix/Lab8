package org.example;

/**
 * Фабрика для створення інструментів розробки для мови ObjectPascal.
 */
public class ObjectPascalToolFactory implements ToolFactory {
    @Override
    public DevelopmentTool createTool() {
        return new ObjectPascalTool();
    }
}
