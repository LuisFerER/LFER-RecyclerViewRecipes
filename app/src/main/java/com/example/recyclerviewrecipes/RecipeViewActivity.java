package com.example.recyclerviewrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeViewActivity extends AppCompatActivity {

    TextView recipeName;
    TextView recipeInstructions;
    ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_view);

        Receta miReceta = (Receta) getIntent().getSerializableExtra("receta");
        recipeName = (TextView) findViewById(R.id.recipe_name);
        recipeInstructions = (TextView) findViewById(R.id.recipe_description);
        recipeImage = (ImageView) findViewById(R.id.recipe_image);

        recipeName.setText(miReceta.getNombre());

        switch (miReceta.getNombre()){
            case "Paella Mixta":
                recipeImage.setImageResource(R.drawable.paella_mixta);
                break;
            case "Pizza de quinoa pesto y aguacate":
                recipeImage.setImageResource(R.drawable.pizza_de_quinoa_pesto_y_aguacate);
                break;
            case "Pastel de carne con glaseado de chipotle":
                recipeImage.setImageResource(R.drawable.pastel_de_carne_con_glaseado_de_chipotle);
                break;
            case "Tacos de pollo en tortilla de jícama":
                recipeImage.setImageResource(R.drawable.tacos_de_pollo_en_tortilla_de_jicama);
                break;
            case "Lasagna vegetariana":
                recipeImage.setImageResource(R.drawable.lasagna_vegetariana);
                break;
            case "Crema de chile morrón":
                recipeImage.setImageResource(R.drawable.crema_de_pimiento);
                break;
            default: break;
            }

        recipeInstructions.setText(miReceta.getIntrucciones());
    }
}