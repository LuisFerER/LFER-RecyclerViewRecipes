package com.example.recyclerviewrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<Receta> mRecipeList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecipeList.addLast(new Receta("Paella Mixta", "El arroz de Calasparra tiene " +
                "denominación de origen de Calasparra en Murcia, España. Este arroz es con el que " +
                "se prepara la paella tradicional; se usa porque absorbe más el caldo que un arroz " +
                "común.", "Ingredientes\n\n" +
                "Para el sofrito:\n\n" +
                "2 dientes de ajo.\n" +
                "½ cebolla blanca.\n" +
                "1 pimiento verde.\n" +
                "2 tomates bola.\n" +
                "50 g de jamón serrano picado fino.\n" +
                "5 g de pimentón de la vera.\n" +
                "100 ml de Oli de Nutrioli® Aceite de Oliva.\n" +
                "12 hebras de azafrán español.\n\n" +
                "Para el arroz:\n\n" +
                "160 g de arroz calasparra.\n\n" +
                "Para la proteína:\n\n" +
                "120 g de muslo de pollo limpio.\n" +
                "120 g de costilla de cerdo\n" +
                "120 g de calamar limpio.\n" +
                "12 almejas manila.\n" +
                "120 g de camarón de pacotilla.\n" +
                "8 camarones 25/21, con cabeza.\n\n" +
                "Para el caldo:\n\n" +
                "1 L de caldo concentrado, hecho base de pollo, cáscaras de camarón, espinas de pescado, puerros, tomates, perejil, cebolla y ajo.\n\n" +
                "Para la decoración:\n" +
                "4 pimientos del piquillo.\n" +
                "20 g de perejil picado.\n" +
                "1 limón amarillo entero.\n" +
                "80 g de alioli.\n\n" +
                "Preparación\n\n" +
                "1. Coloca el pollo y la costilla de cerdo en la paellera, con 100 ml de Oli de Nutrioli® Aceite de Oliva y una pizca de sal. Dora la carne y retírala. En el mismo aceite, dora los calamares cortados en discos, y retíralos.\n" +
                "\n2. Retirar la proteína y reservar. En el mismo aceite, agrega los ingredientes del sofrito: 2 dientes de ajo finamente picados hasta que flote, agregamos la cebolla finamente picada, un poco de sal, jamón serrano, tiras de pimiento y el tomate cortado en pequeños cuadros, esperar a que el sofrito se impregne de todo el sabor de las carnes\n" +
                "\n3. Una vez hecho el sofrito, agrega el pollo, la costilla de cerdo y los calamares.\n" +
                "\n4. Revuelve y deja que se cocine por un minuto más.\n" +
                "\n5. Agrega el arroz y remueve por un minuto. Agrega el caldo concentrado caliente y agrega sal, pimentón de la vera, terminando con el azafrán. Deja el arroz cocinándose por 10 minutos y coloca los camarones y las almejas, deja 7 minutos más a fuego medio.\n" +
                "\n6. Corta los camarones 25/21 por el vientre, a lo largo, sin partirlos. Colócalos encima del arroz durante los últimos 5 minutos de cocción.\n" +
                "\n7. Apaga el fuego y coloca los pimientos del piquillo en tiras, y perejil picado. Tapa con papel aluminio durante 5 minutos. Sirve con alioli y limones cortados por la mitad."));

        mRecipeList.addLast(new Receta("Pizza de quinoa pesto y aguacate",
                "La quinoa por su alto contenido en fibra es perfecta para mejorar la " +
                        "digestión, además aporta ácidos grasos omega 3. Al no estar elaborada con " +
                        "harina de trigo que contiene gluten, es una alternativa perfecta para " +
                        "personas con intolerancia a esta proteína.",
                "Ingredientes\n\n" +
                "2 disparos de aceite Nutrioli® Spray.\n" +
                "1 ¼ taza de harina de quinoa.\n" +
                "½ cucharadita de polvo para hornear.\n" +
                "½ cucharadita de ajo en polvo.\n" +
                "½ cucharadita de sal.\n" +
                "2 cucharaditas de azúcar morena.\n" +
                "2 cucharaditas de sazonador italiano (orégano, albahaca y mejorana).\n" +
                "1 cucharadas de aceite de Oliva Extra Virgen Oli de Nutrioli®.\n" +
                "1 ¼ tazas de agua.\n" +
                "¾ taza de salsa pesto.\n" +
                "8 jitomates cherry partidos por la mitad.\n" +
                "1 ½ tazas de queso mozzarella rallado.\n" +
                "4 ó 5 hojas de albahaca cortada en tiritas.\n" +
                "1 aguacate rebanado.\n" +
                "Sal y pimienta.\n\n" +
                "Preparación\n\n" +
                "1.Precalienta el horno a 200°C, rocía con el aceite Nutrioli Spray una charola para pizza.\n" +
                "\n2. Mezcla la harina de quinoa con polvo para hornear, el ajo en polvo, la sal, la azúcar, el sazonador italiano, una cucharada de aceite de Oliva Extra Virgen Oli de Nutrioli® y el agua, debe tener la consistencia de masa de hotcakes. Vierte la masa en la charola para horno, hornea por 20 minutos, pasado este tiempo retira del horno y voltea la pizza, cocina por 5 minutos más.\n" +
                "\n3. En este punto unta el pesto sobre toda la pizza, añade el queso mozzarella y sazona con la sal y la pimienta, vuelve a hornear hasta que el queso se funda, añade ahora el aguacate, el jitomate cherry y la albahaca."));

        mRecipeList.addLast(new Receta("Pastel de carne con glaseado de chipotle",
                "El chipotle es rico en vitaminas A, B1, B2 y B3, tiene efecto " +
                        "antioxidante y su contenido de capsaicina relaja los vasos sanguíneos, " +
                        "lo que puede reducir la presión arterial.",
                "Ingredientes\n\n" +
                        "Para el pastel de carne:\n" +
                        "\n" +
                        "1 cucharada de Oli de Nutrioli® Aceite de\n" +
                        "½ cebolla picada.\n" +
                        "1 diente de ajo picado.\n" +
                        "800 g de carne molida de res.\n" +
                        "2 huevos.\n" +
                        "⅔ de taza de pan integral molido.\n" +
                        "1 pizca de páprika.\n" +
                        "Sal y pimienta al gusto.\n" +
                        "1 taza de queso mozzarella, picado.\n" +
                        "½ taza de salsa BBQ.\n" +
                        "2 cucharadas de chipotles adobados molidos.\n\n" +
                        "Preparación\n\n" +
                        "1. Calienta en una sartén una cucharada de Oli de Nutrioli® Aceite de Oliva y fríe la cebolla y el ajo hasta que estén transparentes, deja enfriar.\n" +
                        "\n2. Calienta el horno a 180º C.\n" +
                        "\n3. En un tazón, mezcla la carne, la cebolla, el ajo, los huevos, el pan molido, la paprika, la sal y la pimienta.\n" +
                        "\n4. Cubre un molde rectangular de 9 x 5 pulgadas con papel encerado. Coloca la carne en el centro del molde, haz un hueco en el medio a todo lo largo de la carne y coloca el queso, cubre con carne.\n" +
                        "\n5. Para el glaseado, revuelve la salsa BBQ con el chipotle molido. Cubre la parte superior de la carne con esta salsa.\n" +
                        "\n6. Hornea de 45 minutos a 1 hora y retira del horno. Deja reposar 5 minutos, rebana y sirve bien caliente. Acompaña con más salsa, si así lo deseas."));

        mRecipeList.addLast(new Receta("Tacos de pollo en tortilla de jícama",
                "La jícama es rica en agua y fibra que mejora la digestión, además " +
                        "es baja en calorías y en sodio evitando la retención de líquidos.",
                "Ingredientes\n\n" +
                        "12 tortillas de jícama.\n" +
                        "1 pechuga de pollo, cortada en cubitos.\n" +
                        "2 zanahorias ralladas.\n" +
                        "1 taza de col morada rallada.\n" +
                        "2 cucharadas de aceite Nutrioli.\n" +
                        "2 cucharadas de salsa teriyaki.\n" +
                        "2 cucharadas de salsa de soya baja en sodio.\n\n" +
                        "Preparación\n\n" +
                        "1. Rebana la jícama pelada lo más delgada posible, reserva.\n" +
                        "\n2. Calienta en un sartén con teflón el aceite Nutrioli, añade el pollo y cocina hasta que se dore ligeramente y esté bien cocido.\n" +
                        "\n3. Añade la zanahoria rallada y la col, cocina por 2 minutos.\n" +
                        "\n4. Añade las salsas, revuelve bien y deja cocinar por 1 minuto más a fuego bajo.(6708)\n" +
                        "\n5.Sirve el pollo dentro de las tortillas de jícama, si deseas puedes servir con jugo de limón."));

        mRecipeList.addLast(new Receta("Lasagna vegetariana",
                "Conoce una versión vegetariana de la tradicional receta de lasaña. " +
                        "Su ingrediente principal, las espinacas, aportan folatos, hierro y " +
                        "vitamina A, que previene la degeneración de la retina.",
                "Ingredientes\n\n" +
                        "Para el relleno:\n" +
                        "\n" +
                        "250 g de queso ricotta.\n" +
                        "150 g de queso cottage light.\n" +
                        "3 cucharadas de queso parmesano.\n" +
                        "2 cucharadas de perejil fresco.\n" +
                        "1 cucharada de albahaca fresca.\n" +
                        "½ cucharadita de sal.\n" +
                        "¼ de cucharadita de ajo triturado.\n" +
                        "1 pizca de hojuelas de chile.\n" +
                        "Pimienta al gusto.\n\n" +
                        "Para la lasagna:\n" +
                        "\n" +
                        "2 calabazas grandes rebanadas en forma horizontal muy delgadas.\n" +
                        "1 taza de salsa de jitomate preparada para pasta.\n" +
                        "½ taza de queso mozarella rallado.\n" +
                        "Sal y pimienta para sazonar.\n" +
                        "2 disparos de Nutrioli Spray®.\n\n" +
                        "Preparación\n\n" +
                        "Para el relleno:\n" +
                        "\n" +
                        "1. Coloca todos los ingredientes en un tazón, revuelve hasta que se mezclen bien, reserva en refrigeración por 40 minutos.\n" +
                        "Para hacer la lasaña:\n" +
                        "\n" +
                        "2. Calienta una parrilla, rocía con 1 disparo de aceite Nutrioli Spray®, coloca las rebanadas de calabacita y cocina por 2 minutos de cada lado, sazona con sal y pimienta.\n" +
                        "\n3. Precalienta el horno a 180° C, rocía un molde refractario con 1 disparo de aceite Nutrioli Spray®. Vierte una capa de salsa de tomate sobre el molde hasta " +
                        "cubrir toda la superficie. Retira la humedad de las calabacitas sobre papel absorbente. Aparte en un plato extendido acomoda dos tiras de " +
                        "calabacitas en forma de cruz, coloca una cucharada de relleno en el centro de las calabacitas, dobla y acomoda sobre el molde refractario. " +
                        "Cubre las calabacitas con el resto de la salsa y añade encima el queso mozzarella rallado. Hornea hasta que el queso se derrita un poco."));

        mRecipeList.addLast(new Receta("Crema de chile morrón",
                "Los pimientos son ricos en vitamina C que favorece la absorción de " +
                        "hierro y licopeno, un antioxidante que ayuda a proteger las células.",
                "Ingredientes\n\n" +
                        "2 cucharadas Aceite de Oliva Oli de Nutrioli®.\n" +
                        "4 pimientos rojos, sin semillas y troceados.\n" +
                        "1 cebolla picada.\n" +
                        "4 dientes de ajo, machacados.\n" +
                        "3 tazas de caldo de pollo.\n" +
                        "½ taza de crema.\n" +
                        "Sal y pimienta negra recién molida al gusto.\n\n" +
                        "Preparación\n\n" +
                        "1. Calienta el aceite de Oliva Oli de Nutrioli® en una olla y agrega el pimiento, la cebolla y el ajo, y sofríe durante 5 a 10 minutos o hasta que se hayan ablandado.\n" +
                        "\n2. Pasa a un procesador de alimentos o licuadora. Vierte el caldo de pollo, licúa bien, vierte en la misma olla colando la sopa y luego reduce la " +
                        "temperatura a fuego bajo. Cocina durante 30 minutos.\n" +
                        "\n3. Toma una porción de sopa y muele con la crema, regresa a la olla y sazona con la sal y la pimienta. Sirve de inmediato."));

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecipeListAdapter(this, mRecipeList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, new LinearLayoutManager(this).getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);
    }
}