package designbook.solutions6;

public class Exercise16 {
    public static void main(String[] args) {
        Program3 program = new Program3();
        CommandProcessor processor = new CommandProcessor();

        processor.consume(program.createAddCommand(
                new Movie("Movie 1", 2000, 120), Program3.Day.MONDAY));

        processor.undoLast();

        System.out.println("Exercise 16: Undo Result");
        System.out.println(program);
    }
}