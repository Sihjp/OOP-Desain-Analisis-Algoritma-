// Hirarki exception
class Animal extends Exception {
}
class Mammel extends Animal {
}

public class HirarkiException {
    public static void main(String[] args){
        try{
            throw new Mammel();
        }
        catch (Mammel m){
            System.out.println("It is Mammel");
        }
        catch (Animal a) {
            System.err.println("It is Animal");
        }
    }
}