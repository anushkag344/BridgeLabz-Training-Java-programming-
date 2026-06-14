// create private constructor
//create private static object reference 
//create getInstance method 
class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Object created");

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;

    }

}
class Main{
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}