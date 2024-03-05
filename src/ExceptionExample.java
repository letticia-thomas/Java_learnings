public class ExceptionExample extends Exception{
    public void exceptionExample() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void main(String[] args){
        ExceptionExample example = new ExceptionExample();
        try {
            example.exceptionExample();
        }
        catch(RuntimeException exception){
            System.out.println("Handles properly");
        }
    }
}

