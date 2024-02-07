package BuilderPattern;

public class EcommerceApp {
    public static void main(String[] args) {
        Ecommerce user1 = new Ecommerce.Builder()
                .setFirstName("Ron")
                .setLastName("Sy")
                .setEmail("ron.sy@gmail.com")
                .build();

        Ecommerce user2 = new Ecommerce.Builder()
                .setFirstName("Jem")
                .setLastName("Anacio")
                .setEmail("jem.anacio@gmail.com")
                .setAddress("123 payatas")
                .build();

        Ecommerce user3 = new Ecommerce.Builder()
                .setFirstName("Marc")
                .setLastName("Capinpin")
                .setEmail("marc.capinpin@gmail.com")
                .setAddress("123 greenfields")
                .setPhone("123-123-5555")
                .setAge(30)
                .build();

        System.out.println("User 1:");
        System.out.println("First Name: " + user1.getFirstName());
        System.out.println("Last Name: " + user1.getLastName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Address: " + user1.getAddress());
        System.out.println("Phone: " + user1.getPhone());
        System.out.println("Age: " + user1.getAge());

        System.out.println("User 2:");
        System.out.println("First Name: " + user2.getFirstName());
        System.out.println("Last Name: " + user2.getLastName());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Address: " + user2.getAddress());
        System.out.println("Phone: " + user2.getPhone());
        System.out.println("Age: " + user2.getAge());

        System.out.println("User 3:");
        System.out.println("First Name: " + user3.getFirstName());
        System.out.println("Last Name: " + user3.getLastName());
        System.out.println("Email: " + user3.getEmail());
        System.out.println("Address: " + user3.getAddress());
        System.out.println("Phone: " + user3.getPhone());
        System.out.println("Age: " + user3.getAge());
    }
}

