public class Main {

    public static void main(String[] args) {

        TowersOfHanoi hanoi= new TowersOfHanoi();
        hanoi.solveTheTowerProblem(3, 'A', 'C', 'B');
        System.out.println(hanoi.getMinDiscMovesCount(3, 'A', 'C', 'B'));
    }
}
