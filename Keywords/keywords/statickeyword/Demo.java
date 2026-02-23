package keywords.statickeyword;

class Demo {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }
    
    Demo() {
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
    	
    	
        System.out.println("Main Method");
        
        staticMethod();
    	

        Demo obj = new Demo();
        obj.instanceMethod();
        
    }
}
