public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Bolesław","Prus",55);
         Author author2 = new Author("Bolesław","Leśmian",55);
        Author author3 = new Author("Eliza","Orzeszkowa",34);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        System.out.print("Name: "+author1.getName());
        System.out.println(" Age:"+ author1.getAge());

    }



}
