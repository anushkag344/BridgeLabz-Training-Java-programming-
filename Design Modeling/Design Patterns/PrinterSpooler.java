//singleton 
class PrinterSpooler{
    private static PrinterSpooler instance;

    private PrinterSpooler() {
        System.out.println("Printer spooler created");

    }
    public static PrinterSpooler getInstance(){
        if(instance==null){
            instance=new PrinterSpooler();
        }
        return instance;
    }


    class PrintJob{
        private String documentName;
        public PrintJob(String documentName){
            this.documentName=documentName;
        }
    }

    class Main{
        public static void main(String[] args){
            PrinterSpooler spooler =PrinterSpooler.getInstance();
            PrinterSpooler spooler2=PrinterSpooler.getInstance();
            System.out.println(spooler);
            System.out.println(spooler2);

        }
    }

}
