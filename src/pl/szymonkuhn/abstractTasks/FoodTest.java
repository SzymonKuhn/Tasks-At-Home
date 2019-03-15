package pl.szymonkuhn.abstractTasks;

public class FoodTest {

    public static void main(String[] args) {
        Carrot carrot = new Carrot("Carrot");
        Ham ham = new Ham("Ham");
        Salad salad = new Salad("Salad");
        Chicken chicken = new Chicken("Chicken");

        System.out.println(chicken.describe());
        System.out.println(ham.describe());
        System.out.println(carrot.describe());
        System.out.println(salad.describe());

        Recipe recipe1 = new Recipe("Recipe nr 1", ham, carrot, chicken);
        Recipe recipe2 = new Recipe("Recipe nr 2", 4);

        recipe2.addFoodToRecipe(ham);
        recipe2.addFoodToRecipe(chicken);
        recipe2.addFoodToRecipe(carrot);
        recipe2.addFoodToRecipe(salad);
        recipe2.addFoodToRecipe(ham);

        System.out.println(recipe1.getNamesOfFood());
        System.out.println(recipe2.getNamesOfFood());
        System.out.println(recipe1.getDescriptionsOfFood());
        System.out.println(recipe2.getDescriptionsOfFood());



    }
}
