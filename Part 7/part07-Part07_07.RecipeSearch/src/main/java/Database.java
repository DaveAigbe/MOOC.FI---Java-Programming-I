import java.util.ArrayList;

public class Database {
    private final ArrayList<Recipe> recipes;


    public Database() {
        this.recipes = new ArrayList<>();
    }


    public void addRecipe(String name, int time, ArrayList<String> ingredients) {
        recipes.add(new Recipe(name, time, ingredients));
    }

    public void listAll() {
        if (!recipes.isEmpty()) {
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }

    public void findName(String name) {
        if (!recipes.isEmpty()){
            for (Recipe recipe : recipes) {
                if (recipe.getName().contains(name)){
                    System.out.println(recipe);
                }
            }
        }
    }

    public void findCookingTime(int time){
        if (!recipes.isEmpty()) {
            for (Recipe recipe : recipes) {
                if (recipe.getTime() <= time){
                    System.out.println(recipe);
                }
            }
        }
    }

    public void findIngredient(String ingredient){
        if (!recipes.isEmpty()) {
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(ingredient)){
                    System.out.println(recipe);
                }
            }
        }
    }


}
