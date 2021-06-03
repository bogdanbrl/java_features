package creationalPatterns.builder;

public class Pizza {

    private double diameter;

    private boolean hasCheese;
    private boolean hasSauce;
    private boolean hasCorn;
    private boolean hasOlive;
    private  boolean hasBacon;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.diameter = pizzaBuilder.diameter;
        this.hasBacon = pizzaBuilder.hasBacon;
        this.hasCheese = pizzaBuilder.hasCheese;
        this.hasSauce = pizzaBuilder.hasSauce;
        this.hasCorn = pizzaBuilder.hasCorn;
        this.hasOlive = pizzaBuilder.hasOlive;
    }

    public double getDiameter() {
        return diameter;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public boolean isHasSauce() {
        return hasSauce;
    }

    public boolean isHasCorn() {
        return hasCorn;
    }

    public boolean isHasOlive() {
        return hasOlive;
    }

    public boolean isHasBacon() {
        return hasBacon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + diameter +
                ", hasCheese=" + hasCheese +
                ", hasSauce=" + hasSauce +
                ", hasCorn=" + hasCorn +
                ", hasOlive=" + hasOlive +
                ", hasBacon=" + hasBacon +
                '}';
    }


    public static class PizzaBuilder {

        private double diameter;
        private boolean hasCheese;
        private boolean hasSauce;
        private boolean hasCorn;
        private boolean hasOlive;
        private  boolean hasBacon;

        public PizzaBuilder(double diameter) {
            this.diameter = diameter;
        }

        public PizzaBuilder addCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }

        public PizzaBuilder addSauce(boolean hasSauce){
            this.hasSauce = hasSauce;
            return this;
        }

        public PizzaBuilder addCorn(boolean hasCorn){
            this.hasCorn = hasCorn;
            return this;
        }

        public PizzaBuilder addOlive(boolean hasOlive){
            this.hasOlive = hasOlive;
            return this;
        }

        public PizzaBuilder addBacon(boolean hasBacon){
            this.hasBacon = hasBacon;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
