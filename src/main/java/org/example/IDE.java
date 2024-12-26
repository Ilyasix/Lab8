package org.example;

/**
 * Клієнтський клас для роботи з інструментами розробки.
 */
public class IDE {
    private DevelopmentTool tool;

    public IDE(ToolFactory factory) {
        this.tool = factory.createTool();
    }

    /**
     * Запускає весь процес розробки: валідація, компіляція, налагодження.
     */
    public void runDevelopmentCycle() {
        tool.validateCode();
        tool.compileCode();
        tool.debugCode();
    }
}
