public class pykanum{

    private char[] num;
    private int size;

    public pykanum(){
        nonRepRandom n = new nonRepRandom(9);
        size = 4; // default size of num for a pyka game is 4
        num = new char[size];
        for(int i = 0;i <= size -1; i++){
            num[i] = (char)(n.generateNum() + '0');
        }
    }

    public pykanum(int s){ // this constructor is here incase variable size games is something that could be wanted.
        nonRepRandom n = new nonRepRandom(9);
        size = s; 
        num = new char[size];
        for(int i = 0;i <= size -1; i++){
            num[i] = (char)(n.generateNum() + '0');
        }
    }

    public pykanum(String n){ // create a pykanum from a string
        size = n.length();
        num = new char[size];
        for(int i = 0; i < size; i++){
            num[i] = n.charAt(i);
        }
        
    }
    private boolean inArray(char n){ // checks if a value is in the array O(n^2) runtime, but that isn't a big issue since the size is garenteed to be small
        for(int i = 0; i <= size - 1; i++){
            if(n == num[i]){
                return true;
            }
        }
        return false;
    }

    public String compareNums(String guess){ // compares 2 pykanums
        int pyka = 0;
        int centra = 0;
        pykanum g = new pykanum(guess); // create a pykanum based on the string input
        for(int i = 0; i <= size - 1; i++){
            if(g.num[i] == num[i]){ // if two numsare are in the same spot, its centra
                centra++;
            } else if(inArray(g.num[i])){ // if its not a centra, check if its elsewhere in the array, pyka
                pyka++;
            }
        }
        return pyka + " pyka, " + centra + " centra."; // return num of pyka and centra
    }

    public String toString(){ // to string
        String output = "";
        for(int i = 0; i <= size -1 ; i++){
            output += ("" + num[i]);
        }
        return output;
    }
    
}