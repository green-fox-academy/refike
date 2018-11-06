public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder todoText1 = new StringBuilder("\n - Buy milk\n");
        String addMy = "My todo: ";
        todoText1.insert(0, addMy);
        todoText1.insert(todoText1.length(), " - Download games");
        todoText1.insert(todoText1.length(), "\n \t - Diablo");

        System.out.println(todoText1);
    }
}
