import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

public class MenuClient {

    public static void main(String... args) {
        Menu submenu1 = MenuBuilder.createSubMenu("Submenu1", 1)
                .addSimpleOption(1, "S1-op1")
                .addSimpleOption(2, "S1-op2")
                .addSimpleOption(3, "S1-op3")
                .addSimpleOption(4, "S1-op4")
                .addExitOption(5, "Exit sub1")
                .build();
        Menu submenu2 = MenuBuilder.createSubMenu("Submenu2", 2)
                .addSimpleOption(1, "S2-op1")
                .addSimpleOption(2, "S3-op2")
                .addSimpleOption(3, "S4-op3")
                .addSimpleOption(4, "S5-op4")
                .addExitOption(5, "Exit sub2")
                .build();

        String selection = MenuBuilder.createMainMenu("AWESOME MENU")
                .addSubMenuOption("Submenu1", submenu1)
                .addSubMenuOption("Submenu2", submenu2)
                .addSimpleOption(3, "Simple optione1")
                .addExitOption(4, "Exit")
                .build().play();
        System.out.println("Selección " + selection);
    }
}
