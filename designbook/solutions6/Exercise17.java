package designbook.solutions6;

public class Exercise17 {
    public static void main(String[] args) {
        Program3 program = new Program3();
        CommandProcessor2 processor = new CommandProcessor2();

        processor.consume(program.createAddCommand(
                new Movie("Movie 1", 2000, 120), Program3.Day.MONDAY));

        processor.undoLast();
        processor.redoLast();

        System.out.println("Exercise 17: Undo and Redo Result");
        System.out.println(program);
    }
}