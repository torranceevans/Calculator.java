public class MadLibs {
    /*
    The following code creates a MadLib. In this project, we’ll use Java to write a Mad Libs word game!
    Mad Libs have short stories with blank spaces that a player can fill in with any random adjective or noun.
    The result is usually funny (or strange).

    Mad Libs require:
         - A short story with blank spaces (asking for different types of words).
         - Words from the player to fill in those blanks.

    Author: Torrance Evans
    Date: 8/9/2022
    */

    public static void main(String[] args){
        String name1 = "Torrance";
        String adjective1 = "focused";
        String adjective2 = "driven";
        String adjective3 = "relentless";
        String verb1 = "flourish";
        String noun1 = "company";
        String noun2 = "stock";
        String noun3 = "real estate";
        String noun4 = "hedge fund";
        String noun5 = "investments";
        String noun6 = "dividend";
        String name2 = "Trina";
        int number = 34;
        String place1 = "Ghana";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}
