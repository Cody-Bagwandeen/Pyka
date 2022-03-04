public class driver {

    public static void main(String[] args){

        /*
        nonRepRandom n = new nonRepRandom(9);

        for(int i = 0; i <= 10; i++){
            System.out.println("" + n.generateNum());
        }
        

        pykanum p = new pykanum("1432");

        System.out.println(p);
        System.out.println(p.compareNums("4509"));
        System.out.println(p.compareNums("5409"));
        System.out.println(p.compareNums("1432"));
        */
        

        if(args.length == 0){ // if no size given, do default
            game g = new game();

            while(!g.gamefinished){ // run until the game finishes
                g.askForGuess();
            }
            System.out.println("Solved in " + g.attemps + " attemps."); // display amount of attemps used
        } else if (args.length == 1 && Integer.parseInt(args[0]) <= 6 && Integer.parseInt(args[0]) >= 3 ){ // game size of > 6 and < 3 are horrible to actually play
            game g = new game(Integer.parseInt(args[0]));
            while(!g.gamefinished){ // run until the game finishes
                g.askForGuess();
            }
            System.out.println("Solved in " + g.attemps + " attemps.");  // display amount of attemps used
        } else {
            System.out.println("Invalid syntax. Either java driver with no arguments, or java driver with an integer between 3 and 6, which will be the size of the num.");
        }
        

    }
}