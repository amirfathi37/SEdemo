import com.sun.jnlp.PersistenceServiceNSBImpl;

public class Main3 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        Person person1 = personClass.newInstance();
        person1.setName("amir");
        System.out.println(person1.getName());
         }

  

}
class Person{
    private String name;
    private String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
