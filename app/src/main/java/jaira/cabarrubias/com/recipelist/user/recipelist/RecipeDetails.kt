package jaira.cabarrubias.com.recipelist.user.recipelist

import java.util.ArrayList

/**
 * Created by user on 17/12/2017.
 */
object RecipeDetails {
    val list: ArrayList<Items>
        get() {
            val itemsList = ArrayList<Items>()
            itemsList.add(
                    Items(
                            "Beef Enchiladas",
                            "Mexican food is one of my favorite types of food to eat when I’m going out to eat. \n" +
                                    "Italian usually pales in comparison to what I was used to eating at my grandma’s table\n" +
                                    "growing up, sushi and Chinese are typically reserved for takeout,\n " +
                                    "and one can only eat so many sandwiches. \n" +
                                    "I’ve found that it’s very hard to go wrong when going out for Mexican.\n " +
                                    "The meal typically starts off with a big basket of chips and either salsa,\n " +
                                    "queso or guacamole (or all three!), and it only goes up from there.\n" +
                                    " I like to try different dishes and don’t have one go-to choice when getting Mexican,\n" +
                                    " but one that I don’t order nearly enough is enchiladas.\n" +
                                    " I found myself craving them recently, and was in dire need of an awesome, \n" +
                                    "authentic-tasting recipe to make at home. Mission accomplished!"))
            itemsList.add(
                    Items(
                            "Buffalo Chicken Dip",
                            "Buffalo wing sauce, cream cheese and ranch or blue cheese dressing make a great party dip.\n" +
                                    " Everywhere I take it, people want this chicken wing dip recipe.\n" +
                                    " —Peggy Foster, Florence, Kentucky"))
            itemsList.add(
                    Items(
                            "Black Bean Dip", "2 (15 oz) cans black beans, rinsed and drained.\n" +
                            "1/2 cup chopped yellow onion.\n" +
                            "1/3 cup chopped cilantro..."))
            itemsList.add(
                    Items(
                            "Coconut Shrimp",
                            "I am so excited to share this coconut shrimp recipe with you today.\n" +
                                    "You may remember me talking about the Christmas Eve traditions in my mom’s family.\n" +
                                    " My grandma always adhered to the Italian “seven fishes” tradition,\n" +
                                    " and for a long time she made all of the old-time fish: eel, smelts, baccalà,\n" +
                                    " calamari, etc. We were, without a doubt, the best-smelling family at\n" +
                                    " midnight Mass (total sarcasm there!). \n" +
                                    "Not many of us really like all of those different types of fish,\n" +
                                    " so over the last few years we began revamping our menu so that expensive seafood isn’t wasted.\n" +
                                    " We played around with crab legs for a couple of years, but then found a crab cakes recipe \n" +
                                    " that everyone loved. In addition, this coconut shrimp has become a menu mainstay. \n" +
                                    " Everyone goes crazy for it; there would be a revolt if it wasn’t made!"))
            itemsList.add(
                    Items(
                            "Glazed Chicken wings",
                            "I received the recipe for these yummy wings from a cousin on Vancouver Island \n" +
                                    "during a visit there a few years ago. They're an appealing appetizer, \n" +
                                    "but also a favorite for Sunday lunch with rice and a salad.\n" +
                                    " —Joan Airey, Rivers, Manitoba"))
            itemsList.add(
                    Items(
                            "Chili Garlic Corn Chips",
                            "Corn, Vegetable Oil (Corn, Canola, and/or Sunflower Oil), Salt, Sugar, \n" +
                                    "Monosodium Glutamate, Fructose, Sodium Diacetate, Soy Sauce (Soybean, Wheat, Salt),..."))
            itemsList.add(
                    Items(
                            "Chilled Ginger Cantaloupe Soup",
                            "1 medium cantaloupe, cut into chunks.\n" +
                            "½ cup 0% fat plain Greek yogurt.\n" +
                            "1 tbsp grated fresh ginger (do not omit)..."))

            itemsList.add(
                    Items(
                            "Honey -  Garlic Glazed Meatballs",
                            "My husband and I raise cattle on our farm here in southwestern Ontario, \n" +
                                    " so it's no surprise that we're fond of these saucy meatballs. \n" +
                                    "I know your family will like them, too. —Marion Foster, Kirkton, Ontario"))

            return itemsList
        }


}
