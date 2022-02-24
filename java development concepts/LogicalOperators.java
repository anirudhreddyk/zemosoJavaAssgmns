package JavaGeneralPrograms;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean isRaining = true;

        boolean isWarm = true;

        boolean combined = isRaining && isWarm;

        System.out.println("Is it raining and rm?: " + combined);

        combined = isRaining || isWarm;

        System.out.println("Is it raining OR warm?: " + combined);

        combined = !isRaining;

        System.out.println("Is it NOT raining outside?: " + combined);

    }// end main
}