public class TowersOfHanoi {
    public void solveTheTowerProblem(int discs , char origin, char destination, char free){
        if(discs==1){
            System.out.println("Move disk " + discs + " from " + origin +" to " + destination);
        }
        else{
            solveTheTowerProblem(discs-1, origin, free,destination);
            System.out.println("Move disk " + discs + " from " + origin +" to " + destination);
            solveTheTowerProblem(discs-1, free, destination,origin);
        }
    }

    public int getMinDiscMovesCount(int discs){
        if(discs==1){
            return 1;
        }
        else{
            return 1 + getMinDiscMovesCount(discs-1) + getMinDiscMovesCount(discs-1);
        }
    }
}
