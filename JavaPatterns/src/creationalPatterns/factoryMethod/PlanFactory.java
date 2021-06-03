package creationalPatterns.factoryMethod;

public class PlanFactory {

    public static Plan getPlan(PlanType planType){
        switch (planType){
            case DOMESTIC : return new DomesticPlan();
            case COMERCIAL : return new ComercialPlan();
            case INSTITUTIONAL : return new InstitutionalPlan();
            default: throw new IllegalStateException("Type of plan "+ planType +" doesn't exist");
        }
    }

}
