public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name,String surname,int age){
        this.age=age;
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return(this.age);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return( "Author " +
                " name=" + name  +
                " surname=" + surname  +
                ", age=" + age );
    }
}
