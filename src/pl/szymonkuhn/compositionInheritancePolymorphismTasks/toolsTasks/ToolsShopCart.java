package pl.szymonkuhn.compositionInheritancePolymorphismTasks.toolsTasks;

import javax.tools.Tool;
import java.util.Arrays;

public class ToolsShopCart {
    private Tools[] toolCart = new Tools[10];

    public ToolsShopCart (){}

    public void addToolToCart (Tools tool) {
        for (int i = 0; i < toolCart.length; i++) {
            if (toolCart[i] == null) {
                toolCart[i]= tool;
                return;
            }
        }
        System.out.println("Koszyk jest pełny");
    }

    public double sumCart () {
        double result = 0;
        for (int i = 0; i<toolCart.length; i++) {
            result += toolCart[i].getPrice();
        }
        return result;
    }


    @Override
    public String toString() {
        return "ToolsShopCart{" +
                "toolCart=" + Arrays.toString(toolCart) +
                '}';
    }
}
