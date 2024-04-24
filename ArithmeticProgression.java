public class ArithmeticProgression {

    private int firstMember;
    private int difference;

    public ArithmeticProgression(int firstMember, int difference){
        this.firstMember = firstMember;
        this.difference = difference;
    }

    public ArithmeticProgression(ArithmeticProgression other){
        this.firstMember = other.firstMember;
        this.difference = other.difference;

    }

    public void printGeneralSeries(){

        System.out.println("a_n = " + firstMember + " + " + difference + "(n - 1)");

    }

    public int memberCalculation(int n){

        int member = firstMember + (difference * (n-1));
        return member;
    }

    public int calculateN(int an){

        int n = ((an - firstMember) / difference) + 1;

        if(an != firstMember + (difference * (n-1)))
            return 0;
        return n;
    }

    public String toString(){
        return ("an = " + firstMember + "+" + difference + "(n-1)" );
    }

    public int getX(){
        return firstMember;
    }

    public int getY(){
        return difference;
    }

    public void setX(int firstMember){
        this.firstMember= firstMember;
    }

    public void setY(int difference){
        this.difference = difference;
    }

    public boolean equals(ArithmeticProgression other){

        if (this.firstMember == other.firstMember && this.difference == other.difference)
            return true;
        else
            return false;

    }

    public boolean smallDiff (ArithmeticProgression other){

        if (other.difference < this.difference)
            return true;
        else
            return false;
    }


}
