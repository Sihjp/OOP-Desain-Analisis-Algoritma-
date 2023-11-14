package MClass;

class Classku {
    int height;
    Classku() {
        System.out.println("bricks");
        height = 0;
    }

    Classku(int i){
        System.out.println("Building new House that is " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("House is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println("House is " + height + " feet tall");
    }
}
