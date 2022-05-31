CREATE DATABASE cookbook;
USE cookbook;

CREATE TABLE difficulty(
    id INT AUTO_INCREMENT,
    level VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE category(
    id INT AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE region(
    id INT AUTO_INCREMENT,
    name VARCHAR(150) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE recipe(
    id INT AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    time VARCHAR(100) NOT NULL,
    difficulty_id INT,
	ingredients TEXT NOT NULL,
    instructions TEXT NOT NULL,
    category_id INT,
    region_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(difficulty_id) REFERENCES difficulty(id),
    FOREIGN KEY(category_id) REFERENCES category(id),
    FOREIGN KEY(region_id) REFERENCES region(id)
);

INSERT INTO difficulty(id, level) VALUES
	(0, 'Easy'),
    (0, 'Moderate'),
    (0, 'Challenging'),
    (0, 'Professional');
    
INSERT INTO category(id, name) VALUES
	(0, 'Apetizer'),
    (0, 'Salad'),
    (0, 'Main course'),
    (0, 'Dessert');
    
INSERT INTO region(id, name) VALUES
	(0, 'Bulgaria'),
    (0, 'France'),
    (0, 'Italy'),
    (0, 'Germany'),
    (0, 'China'),
    (0, 'Korea'),
    (0, 'Japan'),
	(0, 'UK'),
    (0, 'USA'),
    (0, 'Mexico'),
    (0, 'Africa'),
    (0, 'Europe'),
    (0, 'Asia'),
    (0, 'Oceania');
    
INSERT INTO recipe(id, title, ingredients, time, difficulty_id, instructions, category_id, region_id) VALUES
	(0, 'Guacamole', NULL, '10 mins', 1, 'In a medium bowl, mash together the avocados, lime juice, and salt. 
	Mix in onion, cilantro, tomatoes, and garlic. Stir in cayenne pepper. 
	Refrigerate 1 hour for best flavor, or serve immediately.', 1, NULL),
    (0, 'Banana bread', NULL, '65 mins', 2, 'Preheat the oven to 350°F (175°C), and butter a 4x8-inch loaf pan.
	In a mixing bowl, mash the ripe bananas with a fork until completely smooth. Stir the melted butter into the mashed bananas. 
	Mix in the baking soda and salt. Stir in the sugar, beaten egg, and vanilla extract. Mix in the flour. Pour the batter into your prepared loaf pan. 
	Bake for 50 minutes to 1 hour at 350°F (175°C), or until a toothpick or wooden skewer inserted into the center comes out clean. 
	A few dry crumbs are okay; streaks of wet batter are not. If the outside of the loaf is browned but the center is still wet, loosely tent the loaf with foil and continue baking until the loaf is fully baked. 
	Remove from oven and let cool in the pan for a few minutes. Then remove the banana bread from the pan and let cool completely before serving.', 4, NULL),
    (0, 'Mashed sweet potatoes', NULL, '55 mins', 1, 'Bring a large pot of salted water to a boil. Add potatoes and cook until tender, 20 to 30 minutes. 
	With an electric mixer on low, blend potatoes, slowly adding milk, about 1/2 a cup at a time. Use more or less to achieve desired texture. 
	Add butter and maple syrup to taste. Blend until smooth. Serve warm.', 3, 4),
    (0, 'Beef wellington', NULL, '2h 30min', 3, 'Heat oven to 220C/fan 200C.
	Sit the 1kg beef fillet on a roasting tray, brush with 1 tbsp olive oil and season with pepper, then roast for 15 mins for medium-rare or 20 mins for medium. 
	When the beef is cooked to your liking, remove from the oven to cool, then chill in the fridge for about 20 mins.
	While the beef is cooling, chop 250g chestnut (and wild, if you like) mushrooms as finely as possible so they have the texture of coarse breadcrumbs. 
	You can use a food processor to do this, but make sure you pulse-chop the mushrooms so they don’t become a slurry.
	Heat 2 tbsp of the olive oil and 50g butter in a large pan and fry the mushrooms on a medium heat, with 1 large sprig fresh thyme, for about 10 mins stirring often, until you have a softened mixture.
	Season the mushroom mixture, pour over 100ml dry white wine and cook for about 10 mins until all the wine has been absorbed. The mixture should hold its shape when stirred.
	Remove the mushroom duxelle from the pan to cool and discard the thyme.
	Overlap two pieces of cling film over a large chopping board. Lay 12 slices prosciutto on the cling film, slightly overlapping, in a double row.
	Spread half the duxelles over the prosciutto, then sit the fillet on it and spread the remaining duxelles over.
	Use the cling film’s edges to draw the prosciutto around the fillet, then roll it into a sausage shape, twisting the ends of cling film to tighten it as you go.
	Chill the fillet while you roll out the pastry.
	Dust your work surface with a little flour. Roll out a third of the 500g pack of puff pastry to a 18 x 30cm strip and place on a non-stick baking sheet.
	Roll out the remainder of the 500g pack of puff pastry to about 28 x 36cm.
	Unravel the fillet from the cling film and sit it in the centre of the smaller strip of pastry.
	Beat the 2 egg yolks with 1 tsp water and brush the pastry’s edges, and the top and sides of the wrapped fillet.
	Using a rolling pin, carefully lift and drape the larger piece of pastry over the fillet, pressing well into the sides.
	Trim the joins to about a 4cm rim. Seal the rim with the edge of a fork or spoon handle.
	Glaze all over with more egg yolk and, using the back of a knife, mark the beef Wellington with long diagonal lines taking care not to cut into the pastry.
	Chill for at least 30 mins and up to 24 hrs. Heat oven to 200C/fan 180C/gas 6.
	Brush the Wellington with a little more egg yolk and cook until golden and crisp – 20-25 mins for medium-rare beef, 30 mins for medium. Allow to stand for 10 mins before serving in thick slices.', 3, NULL);