public class StringBuilderOperationsDemo {
    public static void main(String[] args) {

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Java Programming");

        System.out.println("Initial StringBuilder:");
        System.out.println(sb);

        // Append text
        sb.append(" Language");
        System.out.println("\nAfter append():");
        System.out.println(sb);

        // Insert text
        sb.insert(5, "Core ");
        System.out.println("\nAfter insert():");
        System.out.println(sb);

        // Delete text
        sb.delete(5, 10); // Removes "Core "
        System.out.println("\nAfter delete():");
        System.out.println(sb);
    }
}