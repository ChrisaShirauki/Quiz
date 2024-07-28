

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CategoriesService {
    private static final String HISTORY = "History";
    private static final String GEOGRAPHY ="Geography";
    private static final String SCIENCE ="Science";
    private static final String HEALTH ="Health & Food";
    private static final String TECHNOLOGY ="Technology";
    private static final String ARTS = "Arts";
    private static final String MUSIC_CINEMA ="Music & Cinema";
    private static final String SPORTS ="Sports";
    private static final String ANIMALS ="Animals";
    private static final String POLITICS ="Politics";
    private static Map<String,List<Question>> categoriesMap = new HashMap<>();
    
    static {
        List<Question> historyQuestions = new ArrayList<>();
        historyQuestions.add(new Question("In which year World War I begin?", new String[]{"1912", "1915", "1914", "1918"}, 2));
        historyQuestions.add(new Question("In the Ancient Greek, what was the prize for the winners in the Olympic Games?",new String[]{"Fame", "Olive Wreath","Vase", "Medal"}, 1));
        historyQuestions.add(new Question("What were the Egyptians rulers called?",new String[] {"Pharaos", "Shahs", "Kings", "Sultans"},0));
        historyQuestions.add(new Question("Where did the Industrial Revolution begin?",new String[] {"France", "United States", "Australia", "United Kingdom"},3));
        historyQuestions.add(new Question("What Roman city was destroyed by the eruption of Mount Vesuvius in AD 79?", new String[] {"Rome", "Pompeii", "Messina", "Syracusa"},1));
        historyQuestions.add(new Question("The Peloponnesian War was between ___ and ___",new String[] {"Athens and Sparta", "Sicily and Athens", "Sparta and Syracuse", "Sparta and Macedonias"}, 0));
        historyQuestions.add(new Question("What was the historic capital of the Inca Empire?",new String[] {"Vilcabamba", "Cusco", "Pisac", "Vitcos"}, 1));
        historyQuestions.add(new Question("When did the French revolution start?", new String[]{"1917", "1804", "1821", "1789"}, 3));
        historyQuestions.add(new Question("When did WWII end?", new String[] {"1941", "1949","1945", "1950"}, 2));
        historyQuestions.add(new Question("In the Ancient Greek, what was a phalanx?",new String[] {"A monetary unit", "A military formation", "A market place", "A clothing"}, 1));
        historyQuestions.add(new Question("Who was rhe Roman emperor when Jesus was crucified?",new String[] {"Tiberius Caesar", "Julius Caesar", "Augustus Caesar", "Caligula"}, 0));
        historyQuestions.add(new Question("What King of France is known as the Sun King?", new String[]{"Charless VII", "Louis XIV", "Napoleon I", "Henry III"}, 1));
        historyQuestions.add(new Question("The Ancient Greek civilisation started to develop at which period of time?", new String[]{"300 years B.C", "2,500 years B.C.", " 1,500 years B.C.", "500 years B.C."}, 3));
        historyQuestions.add(new Question("Who was the Egyptian's sun God?", new String[]{"Isis", "Sol", "Giza", "Ra"}, 3));
        historyQuestions.add(new Question("Which stage of human history came after the Bronge Age?", new String[]{"Pre-History", "Iron Age", "Stone Age", "Classical Antiquity"}, 1));
        historyQuestions.add(new Question("Who was the mother of Mary I of England?", new String[]{"Anne of Cleves", "Anne Boleyn", "Catherine of Aragon", "Jane Seymour"}, 2));
        historyQuestions.add(new Question("In what battle were tanks first used?", new String[]{"Battle of Some", " Battle of Gallipoli", "Battle of Stalingrad", "Battle of France"}, 3));
        historyQuestions.add(new Question("Wher did Wars of Roses take place?", new String[]{"Germany", "England", "France", "Spain"}, 1));
        historyQuestions.add(new Question("Which language did the Romans speak?", new String[]{"Latin", "Greek", "Arabic", "Italian"}, 0));
        historyQuestions.add(new Question("When did the Great Fire of London happen?", new String[]{"1669", "1668", "1666", "1667"}, 2));
        categoriesMap.put(HISTORY, historyQuestions);
        
        List<Question> geographyQuestions = new ArrayList<>();
        geographyQuestions.add(new Question("Which country has the largest population in the world? ", new String[] {"China","India","America","Russia"},0));
        geographyQuestions.add(new Question("Where is the Eiffel Tower located? ", new String[]{"Italy","Germany","France","Belgium"},2));
        geographyQuestions.add(new Question("What is the name of the largest city in Australia? ", new String[]{"Sydney","Brisbane","Canberra","Perth"},1));
        geographyQuestions.add(new Question("What is the name of the driest continent on Earth? ", new String[]{"South America","Africa","Asia","Antartica"},3));
        geographyQuestions.add(new Question("Which continent is Cambodia located in?  ", new String[]{"Africa","Europe","Australia","Asia"},3));
        geographyQuestions.add(new Question("In what ocean is the Bermuda Triangle located?  ", new String[]{"Atlantic Ocean","Arctic Ocean","Indian Ocean","Pacific Ocean"},0));
        geographyQuestions.add(new Question("How many stars are on the Australian flag?  ", new String[]{"7","5","6","9"},2));
        geographyQuestions.add(new Question("What country was not part of the Soviet Union?  ", new String[]{"Ukraine","Khazakstan","Uzbekistan","Poland"},3));
        geographyQuestions.add(new Question("How many countries are there in Africa?  ", new String[]{"59","54","57","51"},1));
        geographyQuestions.add(new Question("Which is the tallest mountain in the world? ", new String[]{"Mouunt Everest","Makalu","K2","Lhotse"},0));
        geographyQuestions.add(new Question("Which is the longest river in the world? ", new String[]{"Amazon","The Nile","Mississippi","Yenisei"},1));
        geographyQuestions.add(new Question("What is the capital of Malta? ", new String[]{"St.Julian's","Mdina","Valletta","Marsaxlokk"},2));
        geographyQuestions.add(new Question("How many states does the European Union have? ", new String[]{"30","27","25","23"},1));
        geographyQuestions.add(new Question("In which country would you visit Machu Picchu? ", new String[]{"China","Japan","Peru","Indonesia"},2));
        geographyQuestions.add(new Question("Which is the largest desert in the world? ", new String[]{"Kalahari","Gobi","Patagonian","Sahara"},3));
        geographyQuestions.add(new Question("Which Italian city is famous for its leaning tower? ", new String[]{"Milan","Florence","Rome","Pisa"},3));
        geographyQuestions.add(new Question("Which is the capital of India? ", new String[]{"New Delphi","Tashkent","Mumbai","Beirut"},0));
        geographyQuestions.add(new Question("Where is the Great Bear Lake located? ", new String[]{"Bolivia","Canada","U.S.A.","Argetina"},1));
        geographyQuestions.add(new Question("What country also known as Persia? ", new String[]{"Iran","Syria","Egypt","Iraq"},0));
        geographyQuestions.add(new Question("Which city is the most polulated in Germany? ", new String[]{"Hamburg","Dresden","Munich","Berlin"},3));
        categoriesMap.put(GEOGRAPHY, geographyQuestions);
        
        List<Question> scienceQuestions = new ArrayList<>();
        scienceQuestions.add(new Question("What is the hardest natural substance on Earth?", new String[]{"Steel ","Diamond","Carbon","Alluminium"},1));
        scienceQuestions.add(new Question("Humans and chimpanzees share roughly how much DNA?", new String[]{"98% ","87%","89%","93%"},0));
        scienceQuestions.add(new Question("Roughly how long does it take for the sun’s light to reach Earth?", new String[]{"8 days ","8 hours","8 minutes","None Of The Above"},2));
        scienceQuestions.add(new Question("How many teeth does an adult human have?", new String[]{"32 ","28","38","42"},0));
        scienceQuestions.add(new Question("In geometry, how many sides are on a heptagon?", new String[]{"6 ","7","9","8"},1));
        scienceQuestions.add(new Question("What is the biggest planet in our solar system?", new String[]{"Jupiter ","Saturn","Venus","Neptune"},0));
        scienceQuestions.add(new Question("How many colours can be seen when white light is separated?", new String[]{"5","7","8","6"},1));
        scienceQuestions.add(new Question("What do the internal angles of a triangle add up to?", new String[]{"170 ","180","200","160"},1));
        scienceQuestions.add(new Question("What is the chemical equation for water?", new String[]{"H02 ","H20","2H02","2H0"},1));
        scienceQuestions.add(new Question("Ag is the chemical symbol for which element?", new String[]{"Actinium ","Gold","Argon","Silver"},3));
        scienceQuestions.add(new Question("What is the name of the element with the chemical symbol “He”?", new String[]{"Sulfur ","Sodium","Helium","Hydrogen"},2));
        scienceQuestions.add(new Question("How many vertebrae does the average human possess?", new String[]{"43 ","41","45","40"},3));
        scienceQuestions.add(new Question("Which is the main gas that makes up the Earth’s atmosphere?", new String[]{"Oxygen ","Hydrogen","Nitrogen","Carbon Dioxide"},2));
        scienceQuestions.add(new Question("What color are sapphires?", new String[]{"Blue","White","Red","Green"},0));
        scienceQuestions.add(new Question("How many months a year have?", new String[]{"11 ","13","10","12"},3));
        scienceQuestions.add(new Question("What kind of energy is stored in batteries?", new String[]{"Mechanical","Thermal","Kinetic","Chemical"},3));
        scienceQuestions.add(new Question("What source does solar power generate electricity from?", new String[]{"Air ","Oil","Sun","Water"},2));
        scienceQuestions.add(new Question("What is the square root of 81?", new String[]{"9","11","8","7"},0));
        scienceQuestions.add(new Question("A chronometer measures________?", new String[]{"Temperature ","Time","Frequency","Light Intensity"},1));
        scienceQuestions.add(new Question("Ni is the symbol of which element?", new String[]{"Nickel ","Niobium","Nitrogen","Neon"},2));
        categoriesMap.put(SCIENCE, scienceQuestions);         
                         
        List<Question> healthQuestions = new ArrayList<>();
        healthQuestions.add(new Question("Which country did brie cheese originate from?", new String[]{"Italy ","France","Greece","Spain"},2));
        healthQuestions.add(new Question("What year did the first Taco Bell open?", new String[]{"1962 ","1966","1973","1975"},0));
        healthQuestions.add(new Question("What is Marsala?", new String[]{"Cocktail ","Wine", "Soft Drink", "Alcoholic Drink"},2));
        healthQuestions.add(new Question("How many curries usually accompany rice at traditional S.Indian festivities?", new String[]{"6 ","9","4","7"},3));
        healthQuestions.add(new Question("Which soft drink was the most sold drink in 2018?", new String[]{"Fanta ","Pepsi","Sprite","Coca Cola"},3));
        healthQuestions.add(new Question("What type of beer is Guinness?", new String[]{"Stout ","Pale Ale","Lager","Wheat Beer"},0));
        healthQuestions.add(new Question("In which year did Coca-Cola release New Coke, with a reformulated recipe?", new String[]{"1985 ","1978","1981","1989"},0));
        healthQuestions.add(new Question("Shirley, Ailsa Craig and Mr. Stripey are all types of what?", new String[]{"Carrots","Potatoes","Onions","Tomato"},3));
        healthQuestions.add(new Question("Which food is considered to be family food in the USA?", new String[]{"Tacos ","Spaghetti","BBQ","Pizza"},1));
        healthQuestions.add(new Question("Where was the Caesar salad invented?", new String[]{"Italy ","France","Mexico","Equador"},2));
        healthQuestions.add(new Question("Stilton cheese is native to what country?", new String[]{"Italy ","Germany","England","Austria"},2));
        healthQuestions.add(new Question("An enchilada is from which cuisine?", new String[]{"Spain ","Mexico","Portugal","Argetina"},0));
        healthQuestions.add(new Question("What fast food restaurant sells the Big Mac?", new String[]{"KFC ","McDonald's","Goodys","Burger King"},2));
        healthQuestions.add(new Question("What country produces the most corn?", new String[]{"Germany ","China","Russia","U.S.A."},3));
        healthQuestions.add(new Question("What is the syrup grenadine made from?", new String[]{"Strawberries","Watermelons","Pomegranates","Cherries"},2));
        healthQuestions.add(new Question("What is tartar traditionally served with?", new String[]{"Pasta","Seafood","Vegetables","Meat Dishes"},1));
        healthQuestions.add(new Question("What gives green pasta its color", new String[]{"Cabbage","Lettuce","Green Peas","Spinach"},3));
        healthQuestions.add(new Question("What is cachaca made of?", new String[]{"Sugarcane ","Berry","Agave","Grains"},0));
        healthQuestions.add(new Question("What color is the chardonnay grape?", new String[]{"Brown ","White","Purple","Red"},1));
        healthQuestions.add(new Question("In what is sushi wrapped?", new String[]{"Tortilla","Vine Leaves","Seaweed","Bread"},2));
        categoriesMap.put(HEALTH, healthQuestions);  
 
        List<Question> technoQuestions = new ArrayList<>();
        technoQuestions.add(new Question("What is part of a database that holds only one type of information?", new String[]{"Report", "Field","Record","File"},1));
        technoQuestions.add(new Question("'OS' computer abbreviation usually means?", new String[]{"Operating System", "Order of Significance","Optical Sensor","Open Software"},0));
        technoQuestions.add(new Question("Who developed Yahoo? ", new String[]{"D.Ritchie & K.Thompson", "D.Filo & J.Yang","V.Cerf & R.Kahn","S.Case & J.Bezos"},1));
        technoQuestions.add(new Question("Who built the world's first binary digit computer: Z1...?", new String[]{"Alan Turing", "George Boole","Konrad Zuse","Ken Thompson"},2));
        technoQuestions.add(new Question("In what year was the \"@\" chosen for its use in e-mail addresses?", new String[]{"1972", "1980","1976","1984"},0));
        technoQuestions.add(new Question("'.TMP' extension refers usually to what kind of file?", new String[]{"Audio file", "Compressed Archive file","Temporary file","Image file"},1));
        technoQuestions.add(new Question("What does AM mean?", new String[]{"Angelo marconi", "Anno median","Amplitude modulation","Amperes"},2));
        technoQuestions.add(new Question("Which consists of two plates separated by a dielectric and can store a charge??", new String[]{"Inductor", "Transistor","Relay","Capacitor"},3));
        technoQuestions.add(new Question("'DB' computer abbreviation usually means ?", new String[]{"Database", "Double Byte","Data Block","Driver Boot"},0));
        technoQuestions.add(new Question("In which decade was the SPICE simulator introduced?", new String[]{"1970s", "1960s","1950s","1980s"},0));
        technoQuestions.add(new Question("Which is a type of Electrically-Erasable Programmable Read-Only Memory?", new String[]{"Fury", "FRAM","Flange","Flash"},1));
        technoQuestions.add(new Question("'.MOV' extension refers usually to what kind of file?", new String[]{"MS Office document", "Image file","Audio file","Animation/movie file"},3));
        technoQuestions.add(new Question("What needs less electric power?", new String[]{"CRT TV", "Electric Boiler","Electric Stove","Air Condition"},0));
        technoQuestions.add(new Question("What type of file is a .MP3 file?", new String[]{"Text", "Sound","Image","Video"},1));
        technoQuestions.add(new Question("Which inventor introduced telephones, in 1876??", new String[]{"Thomas Edison", "Michael Faraday","Graham Bell","Thomas Watson"},2));
        technoQuestions.add(new Question("Which browser is run by Mozilla Corporation?", new String[]{"Opera", "Chrome","Safari","Firefox"},3));
        technoQuestions.add(new Question("Which company developed <<The Legends of Zelda>>?", new String[]{"Ubisoft", "Nitendo","Epic Games","Blizzard"},1));
        technoQuestions.add(new Question("What does <<F>>stands for in the acronym FORTRAN ?", new String[]{"Faith", "Fox","Formula","Fair"},2));
        technoQuestions.add(new Question("Which game consoles was developed by Nintendo?", new String[]{"Saturn", "Gameboy","Xbox","PlayStation"},1));
        technoQuestions.add(new Question("Where is the Ferrari factory located?", new String[]{"Italy", "Spain","Greece","Germany"},0));
        categoriesMap.put(TECHNOLOGY, technoQuestions);  
        
        List<Question> artQuestions = new ArrayList<>();
        artQuestions.add(new Question("Which famous painter was also a sculptor, an architect, and an engineer?", new String[]{"Leornado Da vinci", "Pablo Picaso","Rebrant","Claude Monet"},0));
        artQuestions.add(new Question("Who painted the “Girl Before a Mirror” and “The Weeping Woman”?", new String[]{"Leornado Da vinci", "Tiziano","Pablo Picasso","Klont Mone"},2));
        artQuestions.add(new Question("Which French artist is most famous for his obsession with ballerinas?", new String[]{"Camille Pissaro", "Edgar Degas","Henri Matisse","Claude Monet"},1));
        artQuestions.add(new Question("Black and white are not colors, but…?", new String[]{"Primary", "Shades","Fonts","Nothing"},1));
        artQuestions.add(new Question("How many times has the Mona Lisa been stolen?", new String[]{"4", "2","0","1"},3));
        artQuestions.add(new Question("What is Pablo Picasso’s style of artwork known as?", new String[]{"Abstract", "Surrealism","Impressionist","Cubism"},0));
        artQuestions.add(new Question("The artist Kandinsky is considered the first for this type of art?", new String[]{"Pop Art", "Abstract","Surrealism","Cubism"},1));
        artQuestions.add(new Question("How many words long is Pablo Picasso’s full name?", new String[]{"20", "17","28","23"},3));
        artQuestions.add(new Question("Which one is a primary color?", new String[]{"Green", "White","Blue","Orange"},2));
        artQuestions.add(new Question("Which town in Italy was Leonardo Da Vinci born?", new String[]{"Vinci Village", "Rome","Venice","Florence"},0));
        artQuestions.add(new Question("Who painted the “Mona Lisa”?", new String[]{"Van Gogh", "Pablo Picaso","Michelangello","Leornado Da vinci"},3));
        artQuestions.add(new Question("Which of Picasso’s famous paintings was inspired by the bombings of civilians during the Spanish War?", new String[]{"The Old Guitarist", "Guernica","Blue Nude","La Vie"},1));
        artQuestions.add(new Question("Where was the writer Ander Breton born?", new String[]{"Switzerland", "Spain","France","Belgium"},2));
        artQuestions.add(new Question("Which musical was inspired by W.Shakespare's play <<Romeo and Juliet>>?", new String[]{"Blood Brothers", "West Side Story","Sweeney Todd","The Book of Mormon"},1));
        artQuestions.add(new Question("Who wrote the book <<Charlie & the Chocolate Factory>> in 1964?", new String[]{"Roald Dahl", "Lois Lowry","Alan Gibbons","Mark Twain"},0));
        artQuestions.add(new Question("Who wrote the book <<The adventures of Pinocchio>>?", new String[]{"Lewis Carroll", "Gianni Rodari","Carlo Collodi","Ludwig Bemelmas"},1));
        artQuestions.add(new Question("Who is famous for painting the ceiling of the Sistine Chapel in the Vatican?", new String[]{"Monet", "Leonardo da Vinci","Michelangelo","Raphael"},2));
        artQuestions.add(new Question("What color you will get if you mix blue and yellow?", new String[]{"Violet", "Green","Orange","Red"},1));
        artQuestions.add(new Question("Who wrote <<White Fang>>", new String[]{"Jack London", "Mark Twain","John Steinbeck","Edith Wharton"},0));
        artQuestions.add(new Question("Who painted the <<Starry Night>>?", new String[]{"Klimt", "Dali","Picasso","Van Gogh"},3));
        categoriesMap.put(ARTS, artQuestions); 
        
        
        List<Question> musicQuestions = new ArrayList<>();
        musicQuestions.add(new Question("What was Madonna‘s first top 10 hit?", new String[]{"Holiday", "Vogue","Hang Up","Sorry"},0));
        musicQuestions.add(new Question("The head of what kind of animal is front-and-center in an infamous scene from The Godfather?", new String[]{"Pig", "Dog","Horse","Rabbit"},2));
        musicQuestions.add(new Question("On what network does Game of Thrones air?", new String[]{"HBO", "Netflix","Hulu","Amazon"},3));
        musicQuestions.add(new Question("In Pokemon GO, what Pokemon's body is violet with a gold formation on its front?", new String[]{"Espeon", "Dewgong","Sparkie","Starmie"},3));
        musicQuestions.add(new Question("For which 1964 musical blockbuster did Julie Andrews win the Academy Award for Best Actress??", new String[]{"Sound Of Music", "Marry Poppins","Cinderella","Enchanted"},1));
        musicQuestions.add(new Question("What was Elvis Presley‘s first No. 1 hit in the United States?", new String[]{"Don't Be Cruel", "Hound Dog","Love Me Tender","Heartbreak Hotel"},3));
        musicQuestions.add(new Question("What’s the name of Charlie Chaplin’s most famous, recurring character?", new String[]{"The Tramp", "The Gentleman","The Groom","The classical"},0));
        musicQuestions.add(new Question("What calendar predicts the end of the world in 2012?", new String[]{"Mayan", "Aztec","Inkas","Apache"},3));
        musicQuestions.add(new Question("Who became the 7th artist ever to receive the Billboard Music Awards’ Icon Award?", new String[]{"Michael Jackson", "Mariah Carey","Janet Jackson","Whitney Houston"},2));
        musicQuestions.add(new Question("In The Matrix, does Neo take the blue pill or the red pill?", new String[]{"Blue", "Red","Both","None"},3));
        musicQuestions.add(new Question("Which famous classical composer was writting music even he didn't had the abillity to hear?", new String[]{"Beethoven", "Tchaikovsky","Mozart","Bach "},0));
        musicQuestions.add(new Question("Before Miley Cyrus recorded “Wrecking Ball,” it was offered to which singer?", new String[]{"Jennifer Lopez", "Britney Spears","Beyoncé","Madonna"},2));
        musicQuestions.add(new Question("Which singer starred as Petty Officer Cora Raikes in the film Bttleship?", new String[]{"Rihanna", "Diana Ross","Madonna","Beyonce"},0));
        musicQuestions.add(new Question("On what network does Game of Thrones air?", new String[]{"HBO", "Netflix","Hulu","Amazon"},3));
        musicQuestions.add(new Question("Who perfomed the 1985 hit <<Living in America>>?", new String[]{"Roy Ayers", "Prince","James Brown","Rick James"},2));
        musicQuestions.add(new Question("What in the name of the hero in << The Lion King?", new String[]{"Rafiki", "Mufasa","Simba","Scar"},2));
        musicQuestions.add(new Question("Stradovari was a famous make of _______", new String[]{"Pianos", "Violins","Guitars","Flutes"},1));
        musicQuestions.add(new Question("Which superhero does Peter Parker turn into?", new String[]{"Spiderman", "Aquaman","Superman","Batman"},0));
        musicQuestions.add(new Question("Which boy band was Justin Timberlake?", new String[]{"NSYNC", "Five","Westlife","Backstreet Boys"},0));
        musicQuestions.add(new Question("How many eyes does Stuart the Minion have?", new String[]{"4", "2","3","1"},3));
        categoriesMap.put(MUSIC_CINEMA, musicQuestions); 
         
        List<Question> sportsQuestions = new ArrayList<>();
        sportsQuestions.add(new Question("The Olympics are held every how many years?", new String[]{"4","6","2","8"},0));
        sportsQuestions.add(new Question("What color are the goalposts in football?", new String[]{"Red", "Yellow", "Green", "Blue"},1));
        sportsQuestions.add(new Question("Which sport uses a net, a racket, and a shuttlecock?", new String[]{"Badmiton", "Hockey", "Golf", "Handball"},0));
        sportsQuestions.add(new Question("In soccer, what body part can’t touch the ball?", new String[]{"Head", "Knees", "Hands", "Back"},2));
        sportsQuestions.add(new Question("How many sports were included in the 2008 Summer Olympics?", new String[]{"26", "24", "28", "25"},2));
        sportsQuestions.add(new Question("What African country was the first ever to qualify for a World Cup?", new String[]{"Egypt", "Nigeria", "Maroco", "Algeria"},0));
        sportsQuestions.add(new Question(" What’s the national sport of Canada?", new String[]{"Baseball", "Lacrosse", "Ice Hockey", "Gridiron"},1));
        sportsQuestions.add(new Question("How long is a marathon?", new String[]{"26.2 miles ", "30.8 miles", "24.7 miles", "33.5 miles"},0));
        sportsQuestions.add(new Question("Who has won more tennis grand slam titles?", new String[]{"Monica Seles", "Venus Williams","Martina Navratilova","Serena Williams"},3));
        sportsQuestions.add(new Question("Who was the youngest player to score 10,000 points in the NBA?", new String[]{"LeBron James", "Michael Jordan","Stefen Curry","Kevin Durant"},0));
        sportsQuestions.add(new Question("How many medals did China win at the Beijing Olympics?", new String[]{"80", "90","60","100"},3));
        sportsQuestions.add(new Question("What sport is best known as the ‘king of sports’?", new String[]{"Basketball", "Voleyball","Soccer","Hockey"},2));
        sportsQuestions.add(new Question("Where is the soccer player Leonel Messi from?", new String[]{"Spain", "Argetina","Brazil","Chile"},1));
        sportsQuestions.add(new Question("What color is the tennis ball?", new String[]{"Yellow", "White","Black","Red"},0));
        sportsQuestions.add(new Question("The shortiest women's Olympic track race is?", new String[]{"500m", "1000m","200m","100m"},3));
        sportsQuestions.add(new Question("How many holes does a regular bowling ball have?", new String[]{"3", "0","4","5"},0));
        sportsQuestions.add(new Question("How is a judo practitioner called?", new String[]{"Judor", "Judoka","Judekki","Judaki"},1));
        sportsQuestions.add(new Question("In which sport might you do a slam dunk?", new String[]{"Hockey", "Soccer","Basketball","Golf"},2));
        sportsQuestions.add(new Question("What award is given to the top goal scorer in World Cup?", new String[]{"Golden Glove", "Golden Shoe","Golden Helmet","Golden Shock"},1));
        sportsQuestions.add(new Question("Which country won the football World Cup in 2002?", new String[]{"Brazil", "Spain","Germany","France"},0));
        categoriesMap.put(SPORTS, sportsQuestions); 
         
        List<Question> animalsQuestions = new ArrayList<>();
        animalsQuestions.add(new Question("How long is an elephant pregnant before it gives birth?", new String[]{"25 Months", "20 Months","22 Months","28 Months"},2));
        animalsQuestions.add(new Question("Which animal is known to spend 90% of its day, sleeping??", new String[]{"Koalas", "Cat","Armadilos","Bat"},0));
        animalsQuestions.add(new Question("Which animal’s stripes are on their skin as well as their fur?", new String[]{"Snake", "Tiger","Zebra","Giraffe"},1));
        animalsQuestions.add(new Question("What is the name of the fastest land animal?", new String[]{"Lion", "Cheetah","Ostrich","Springbok"},1));
        animalsQuestions.add(new Question("What’s a group of kittens called?", new String[]{"Catties", "Kitties","Cats","Kindle"},3));
        animalsQuestions.add(new Question("What is the only mammals that can’t jump?", new String[]{"Hippopotamus", "Ox","Elephant","Cow"},2));
        animalsQuestions.add(new Question("How many eyes do caterpillars have?", new String[]{"8", "16","12","7"},2));
        animalsQuestions.add(new Question("Which mammal is known to have the most powerful bite in the world??", new String[]{"Hyena", "Gorilla","Hippopotamus"," Jaguar"},2));
        animalsQuestions.add(new Question("How much weight can ants lift over their body weight??", new String[]{"3,000 times", "5,000 times","1,000 times","2,000 times"},1));
        animalsQuestions.add(new Question("What kind of animal is a Komodo dragon?", new String[]{"Snake", "Tortoises","Crocodile","Lizards"},3));
        animalsQuestions.add(new Question("What animal is the largest mammal in the world?", new String[]{"White Rhinoceros", "Killer Whale","African Elephant","Blue Whale"},0));
        animalsQuestions.add(new Question("Which animal has a fur coat?", new String[]{"Elk", "Elephant","Hippopotamus","Turtle"},0));
        animalsQuestions.add(new Question("Which continent is Emperor Penguin naative to?", new String[]{"North America", "Asia","Australia","Antartica"},3));
        animalsQuestions.add(new Question("What sound does a dog usually make?", new String[]{"Bark", "Buzz","Quack","Meow"},0));
        animalsQuestions.add(new Question("What kind of animal is a Kiwi?", new String[]{"Fish", "Bird","Mammal","Reptile"},1));
        animalsQuestions.add(new Question("How many tentacles does an octopus have?", new String[]{"8", "10","9","7"},0));
        animalsQuestions.add(new Question("What type of animal is Beluga?", new String[]{"Sea Turtle", "Seal","Whale","Shark"},2));
        animalsQuestions.add(new Question("Which animal does not have horns?", new String[]{"Antelope", "Cat","Goat","Buffalo"},1));
        animalsQuestions.add(new Question("What continent do Lamas live on?", new String[]{"America", "Africa","Asia","Europe"},0));
        animalsQuestions.add(new Question("How many stomachs does a cow have?", new String[]{"2", "1","3","4"},3));
        categoriesMap.put(ANIMALS, animalsQuestions); 
         
          List<Question> politicsQuestions = new ArrayList<>();
        politicsQuestions.add(new Question("What was the name of the German Leader during WWII?", new String[]{"A.Hitler", "K.Adenauer","W.Churchill","A.Merkel"},0));
        politicsQuestions.add(new Question("Who was the Presidents of America before Barack Obama?", new String[]{"Abhraham Lincoln", "Donald Trump","George Bush","Bill Clinton"},2));
        politicsQuestions.add(new Question("When George Washington born?", new String[]{"1728", "1749","1743","1732"},3));
        politicsQuestions.add(new Question("Which country had the Dauphin as a ruler?", new String[]{"France", "England","Spain","Germany"},0));
        politicsQuestions.add(new Question("Who said <<I have a deam..>>?", new String[]{"Mahatma Gandhi", "Martin Luther King Jr.","Nelson Madela","Mother Teresa"},1));
        politicsQuestions.add(new Question("In 1962, from what country did Algeria gain independence?", new String[]{"Spain", "England","France","Netherlands"},2));
        politicsQuestions.add(new Question("Who was the president during the U.S Civil war?", new String[]{"George M.Dallas", "Abraham Lincoln","Rutherford B.Hayes","Ulysses S.Grant"},1));
        politicsQuestions.add(new Question("Who was the leader of UK during WW2?", new String[]{"W.Churchill", "C.Portal","I.Metaxas","E.Barclay"},0));
        politicsQuestions.add(new Question("Where was the US Declaration of Independence signed?", new String[]{"Washington", "New York City","Philadelphia","Alabama"},2));
        politicsQuestions.add(new Question("Which country sold Alaska to the USA in 1867?", new String[]{"Canada", "China","Russia","Mexico"},2));
        politicsQuestions.add(new Question("Who was the president of the USA  durring the twin towers attack in 2001?", new String[]{"B.Obama", "G.W.Bush","B.Clinton","Ronald Reagan"},1));
        politicsQuestions.add(new Question("Which American President was an actor?", new String[]{"Jimmy Carter", "Ronald Reagan","George Bush","Bill Clinton"},1));
        politicsQuestions.add(new Question("Which State operated as its own independent nation for a decade during the 19th century?", new String[]{"Texas", "California","Montana","Florida"},0));
        politicsQuestions.add(new Question("Who was the first predisdent of the USA?", new String[]{"Abraham Lincoln", "Jame Madison","John Adams","George Washington"},1));
        politicsQuestions.add(new Question("Who became Cuba’s Prime Minister in 1959??", new String[]{"Fidel Castro", "Oscar Gans","Fulgencio Batista","Raul Castro"},0));
        politicsQuestions.add(new Question("Who was the only candidate to run for President unopposed??", new String[]{"George Bush", "Jimmy Carter","George Washington","Abraham Lincoln"},2));
        politicsQuestions.add(new Question("Who is the current British head of state?", new String[]{"Lord Fowler", "Queen Elizabeth II","Boris Johnson","Rishi Sunak"},1));
        politicsQuestions.add(new Question("What does the ‘S’ in ‘Harry S Truman’ stand for?", new String[]{"Stewford", "Sir","Stomp","Nothing"},3));
        politicsQuestions.add(new Question("Which branch of government is responsible for making laws?", new String[]{"Legislative", "Judicial","Executive","None of Them"},0));
         politicsQuestions.add(new Question("Who was the 16th president of the U.S.A.?", new String[]{"Andrew Johnson", "James Buchanan","Abraham Lincol","Ulysses S.Great"},2));
        categoriesMap.put(POLITICS, politicsQuestions); 
         
        
    }
         
         
        
    
   public static List<Question> getQuestionsForCategory(String category){
    return categoriesMap.get(category);
}
}
