package org.example;

/**
 * Головний клас для демонстрації роботи середовища розробки.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Розробка для Java:");
        ToolFactory javaFactory = new JavaToolFactory();
        IDE javaIDE = new IDE(javaFactory);
        javaIDE.runDevelopmentCycle();

        System.out.println("\nРозробка для C++:");
        ToolFactory cppFactory = new CppToolFactory();
        IDE cppIDE = new IDE(cppFactory);
        cppIDE.runDevelopmentCycle();

        System.out.println("\nРозробка для ObjectPascal:");
        ToolFactory pascalFactory = new ObjectPascalToolFactory();
        IDE pascalIDE = new IDE(pascalFactory);
        pascalIDE.runDevelopmentCycle();
    }
}
