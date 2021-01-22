public class MadLibs {
    /* This program generates a mad libbed story. 
    Author: Arcade
    Date: 22/01/2021
    */
    public static void main(string[] args){
        // story template
        String name1 = "Mary";
        String adjective1 = "Cheerful";
        String adjective2 = "Happy";
        String adjective3 = "Rosy";
        String verb1 = "dance";
        String noun1 = "Food";
        String noun2 = "Phones";
        String noun3 = "Cat";
        String noun4 = "Toast";
        String noun5 = "Coat";
        String noun6 = "Cupboard";
        String name2 = "Mike";
        int number = 6;
        String place1 = "Sydney";


       String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);

    }
}