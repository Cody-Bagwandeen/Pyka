import java.util.Scanner;
public class game {

    // runs a game of player vs computer, the computer has a num that the player must guess
    // the player doesn't have a number that the computer must guess, 
    // that would be either boring to play if the computer just did random gueses 
    // or take too much time to develop an alogorithm to play pyka,

    public pykanum computernum;
    public boolean gamefinished;
    public int attemps = 0;   // how many tries it took 
    public int size;          
    Scanner s = new Scanner(System.in); // used to taking in player inputs

    public game(){
        size = 4;   // default size
        computernum = new pykanum();
        gamefinished = false;
      
    }

    public game(int s){
        size = s;
        computernum = new pykanum(size);
        gamefinished = false;
    }

    private boolean isInvalidNum(String n){ // checks if guess is a valid one, correct length and non repeating digits
        if(n.length() != size){
            return true;
        }
        for(int i = 0; i <= size-1; i++){
            for(int j = 0; j <= size-1; j++){
                if( i!= j && n.charAt(i) == n.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public void askForGuess(){ 
        System.out.println("Enter a guess.");
        String guess = s.nextLine();
        while(isInvalidNum(guess)){ // if guess is not valid, keep asking until user inputs a valid one
            System.out.println("Invalid Number, please enter a new guess.");
             guess = s.nextLine();
        }

        String result = computernum.compareNums(guess); // compare nums
        System.out.println(result); // return amount of pyka and centra
        attemps++;
        if(result.equals("0 pyka, " + size + " centra.")){ 
            gamefinished = true; // ends game
        }
    }
    
}
