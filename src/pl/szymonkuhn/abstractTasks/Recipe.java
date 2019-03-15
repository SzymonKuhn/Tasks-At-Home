package pl.szymonkuhn.abstractTasks;

public class Recipe {
    private String recipeName;
    Food[] foods;


    public Recipe (String recipeName, Food... foods) {
        this.recipeName = recipeName;
        this.foods = foods;
    }

    public Recipe (String recipeName, int foodNumber) {
        this.recipeName = recipeName;
        this.foods = new Food[foodNumber];
    }

    public void addFoodToRecipe (Food food) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                foods[i]=food;
                return;
            }
        }
        System.out.println("List is full.");
    }

    public String getNamesOfFood() {
        String result="";
        for (Food food : foods) {
            result += food.getName();
        }
        return result;
    }

    public String getDescriptionsOfFood() {
        String result="";
        for (Food food : foods){
            result += " " + food.describe();
        }
        return result;
    }

}
