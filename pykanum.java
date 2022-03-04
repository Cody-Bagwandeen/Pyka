public class pykanum{

    private char[] num;
    private int size;

    public pykanum(){
        nonRepRandom n = new nonRepRandom(9);
        size = 4;
        num = new char[size];
        for(int i = 0;i <= size -1; i++){
            num[i] = (char)(n.generateNum() + '0');
        }
    }

    public pykanum(int s){
        nonRepRandom n = new nonRepRandom(9);
        size = s;
        num = new char[size];
        for(int i = 0;i <= size -1; i++){
            num[i] = (char)(n.generateNum() + '0');
        }
    }

    public pykanum(String n){
        size = n.length();
        num = new char[size];
        for(int i = 0; i < size; i++){
            num[i] = n.charAt(i);
        }
        
    }
    private boolean inArray(int n){
        for(int i = 0; i <= size - 1; i++){
            if(n == num[i]){
                return true;
            }
        }
        return false;
    }

    public String compareNums(String guess){
        int pyka = 0;
        int centra = 0;
        pykanum g = new pykanum(guess);
        for(int i = 0; i <= size - 1; i++){
            if(g.num[i] == num[i]){
                centra++;
            } else if(inArray(g.num[i])){
                pyka++;
            }
        }
        return pyka + " pyka, " + centra + " centra.";
    }

    public String toString(){
        String output = "";
        for(int i = 0; i <= size -1 ; i++){
            output += ("" + num[i]);
        }
        return output;
    }
    
}