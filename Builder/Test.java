package Builder;

public class Test {
    public static void main(String[] args) {
        PersonalDetails pd1 = new PersonalDetails.PersonalDetailsBuilder(123, "aaa@aa.com").build();
        PersonalDetails pd2 = new PersonalDetails.PersonalDetailsBuilder(55,"b@a.com").setAge((byte)18).setName("shsh").build();

    }
}
