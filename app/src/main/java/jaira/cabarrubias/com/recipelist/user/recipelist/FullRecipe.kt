package jaira.cabarrubias.com.recipelist.user.recipelist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by user on 17/12/2017.
 */
class FullRecipe : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var imageview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.full_recipe)

        textView = findViewById(R.id.textviewFullDesc)
        imageview = findViewById(R.id.imageView)

        val intent = intent
        val result = intent.extras!!.getString("Send")


        if (result == "Beef Enchiladas") {
            textView.text = "•3 cloves garlic, minced\n" +
                    "•2 teaspoons ground cumin\n" +
                    "•2 teaspoons ground coriander\n" +
                    "•1 teaspoon granulated sugar\n" +
                    "•1 teaspoon salt\n" +
                    "•1¼ pounds boneless chuck steaks, trimmed of fat\n" +
                    "•1 tablespoon vegetable oil\n" +
                    "•2 yellow onions, finely chopped\n" +
                    "•1 (15-ounce) can tomato sauce\n" +
                    "•½ cup water\n" +
                    "•4 ounces Monterey Jack cheese, shredded, divided\n" +
                    "•4 ounces sharp cheddar cheese, shredded, divided\n" +
                    "•⅓ cup chopped fresh cilantro\n" +
                    "•¼ cup chopped canned pickled jalapeños\n" +
                    "•12 (6-inch) corn tortillas\n"
            imageview.setImageResource(R.drawable.beefenchiladas)


        } else if (result == "Buffalo Chicken Dip") {
            textView.text = "	•1 package (8 ounces) cream cheese, softened\n" +
            "•1 cup cooked chicken breast\n" +
            "•1/2 cup Buffalo wing sauce\n" +
            "•1/2 cup ranch or blue cheese salad dressing\n" +
            "•2 cups shredded Colby-Monterey Jack cheese\n" +
            "•French bread baguette slices, celery ribs or tortilla chips"

            imageview.setImageResource(R.drawable.buffalochickendip)


        } else if (result == "Black Bean Dip") {
            textView.text = "•2 (15 oz) cans black beans, rinsed and drained.\n" +
                    "•1/2 cup chopped yellow onion.\n" +
                    "•1/3 cup chopped cilantro.\n" +
                    "•1 clove garlic, minced.\n" +
                    "•1 small jalapeño, seeds removed and diced.\n" +
                    "•2 tablespoons fresh lime juice.\n" +
                    "•1/4 teaspoon ground cumin.\n" +
                    "•1/4 teaspoon chili powder."

            imageview.setImageResource(R.drawable.easyblackbeandip)


        } else if (result == "Coconut Shrimp") {
            textView.text = "For the Shrimp:\n" +
                    "•1 pound extra-large shrimp (21 to 25 count), peeled and deveined\n" +
                    "•1 cup all-purpose flour\n" +
                    "•½ teaspoon paprika\n" +
                    "•½ teaspoon ground white pepper\n" +
                    "•¼ teaspoon cayenne pepper\n" +
                    "•¼ teaspoon table salt\n" +
                    "•¼ teaspoon sugar\n" +
                    "•2 eggs\n" +
                    "•1 tablespoon water\n" +
                    "•1 cup unsweetened shredded coconut\n" +
                    "•1 cup panko bread crumbs\n" +
                    "•1 to 2 quarts vegetable oil, for frying\n\n" +
                    "For the Mango Dipping Sauce:\n" +
                    "•1 cup frozen mango chunks, thawed\n" +
                    "•1 cup mayonnaise\n" +
                    "•¼ cup fresh cilantro leaves\n" +
                    "•2 tablespoons honey\n" +
                    "•1 teaspoon lemon juice\n" +
                    "•6 to 8 drops Sriracha sauce (add more if you like it a bit more spicy)\n" +


            imageview.setImageResource(R.drawable.coconutshrimp)


        } else if (result == "Glazed Chicken wings") {
            textView.text = "•12 whole chicken wings* (about 2-1/2 pounds)\n" +
                    "•1/2 cup barbecue sauce\n" +
                    "•1/2 cup honey.\n" +
                    "•1/2 cup soy sauce\n"

            imageview.setImageResource(R.drawable.glazedchickenwings)


        } else if (result == "Chili Garlic Corn Chips") {
            textView.text = "•Corn, Vegetable Oil (Corn, Canola, and/or Sunflower Oil), Salt, Sugar, \n" +
                    "•Monosodium Glutamate, Fructose, Sodium Diacetate, Soy Sauce (Soybean, Wheat, Salt), \n" +
                    "•Onion Powder, Maltodextrin (Made From Corn), Hydrolyzed Soy Protein, Hydrolyzed Corn Protein, \n" +
                    "•Garlic Powder, Torula Yeast, Malic Acid, Extractives of Paprika, Spices, Caramel Color, \n" +
                    "•Disodium Inosinate, Disodium Guanylate, Dextrose, and Natural Flavor"

            imageview.setImageResource(R.drawable.imgs)


        } else if (result == "Chilled Ginger Cantaloupe Soup") {
            textView.text = "•1 medium cantaloupe, cut into chunks.\n" +
                    "•½ cup 0% fat plain Greek yogurt.\n" +
                    "•1 tbsp grated fresh ginger (do not omit)\n" +
                    "•Juice from one lemon.\n" +
                    "•1 or 2 pinches of sea salt.\n" +
                    "•Dash of ground cinnamon or nutmeg.\n" +
                    "•A few fresh basil or mint leaves, chopped."

            imageview.setImageResource(R.drawable.tattooedmarthabruschettathreewaysheader)
        }


    else if (result == "Honey -  Garlic Glazed Meatballs") {
    textView.text = "•2 large eggs\n" +
            "•3/4 cup milk\n" +
            "•1 cup dry bread crumbs\n" +
            "•1/2 cup finely chopped onion\n" +
            "•2 teaspoons salt.\n" +
            "•2 pounds ground beef\n" +
            "•4 garlic cloves, minced\n" +
            "•1 tablespoon butter\n" +
            "•3/4 cup ketchup\n" +
            "•1/2 cup honey\n" +
            "•3 tablespoons of soy sauce"

    imageview.setImageResource(R.drawable.honeymeatballs)
    }


    }

}

