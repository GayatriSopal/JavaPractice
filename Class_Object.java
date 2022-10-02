    class Pen{
        String Colour;
        String Type;
        int Refill;
        
        //Method
        public void writing(){
            System.out.println("Writing test passed");
        }
        
        
        public static void main(String[] args){
            Pen gel = new Pen();
            gel.Colour="Blue";
            gel.Type="Gel Pen";
            gel.Refill=3;
            
            System.out.println(gel.Type);
            System.out.println();
            gel.writing();
        }
    }
