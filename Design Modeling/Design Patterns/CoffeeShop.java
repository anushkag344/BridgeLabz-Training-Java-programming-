interface Coffee{
    String getDescription();
    int getCost();
}
class SimpleCoffee implements Coffee{
    public String getDescription(){
        return "Simple Coffee";
    }
    public int getCost(){
        return 5;
    }
}

    abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
    this.coffee=coffee;
    }
}
    class EspressoDecorator extends CoffeeDecorator{
    public EspressoDecorator(Coffee coffee){
    super(coffee);
    }
     public String getDescription(){
        return coffee.getDescription()+"with espresso";
     }
    public int getCost(){
        return coffee.getCost()+4;

    }
    class MilkDecorator extends CoffeeDecorator{
        public MilkDecorator(Coffee coffee){
            super(coffee);

        }
        public String getDescription(){
            return coffee.getDescription()+"with milk";
        }
        public int getCost(){
            return coffee.getCost()+3;
             
        }
    }
}






