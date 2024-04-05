class main {
    public static void main(String[]args) {
        System.out.println
        ("Inicianilizando...");
        System.out.println("car...");
        Car car = new Car ("AMQ123", new
        Account ("Andres loiza", "ADN1235","andresl@hotmail.com", "12365"));
        car.passenger= 4;
        car.printDataCar();

        Sysetem.out.println("Uberx..."); 
        Uberx uberx = new Uberx
        ("MKL185", new Account("Maria Loyola", "JKL12365","marial@hotmail.com", "125478"), "Toyota", "corolla");
    } 
} 