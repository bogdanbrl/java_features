package creationalPatterns.factoryMethod;

import java.util.Locale;
import java.util.Scanner;

public class MainFactoryMethod {

    public static void main(String[] args) {

        System.out.println("Choose your plan: ");

        Scanner scanner = new Scanner(System.in);
        String planChosen = scanner.next();
        System.out.println("Choose number of units to calculate the bill: ");
        double unitsChosen = scanner.nextDouble();

        try {
            PlanType planType = Enum.valueOf(PlanType.class, planChosen.toUpperCase(Locale.ROOT));

            Plan plan = PlanFactory.getPlan(planType);
            plan.calculateBill(unitsChosen);
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Plan doesn't exist!");
            System.out.println(illegalArgumentException.getMessage());
        }catch (NullPointerException nullPointerException){
            System.out.println("You cannot have a null plan!");
            System.out.println(nullPointerException.getMessage());
        }

    }
}
