package Builder;

public class PersonalDetails {
    final int id;
    final String email;
    final String name;
    final String surname;
    final String middlename;
    final String webURL;
    final byte age;

    private PersonalDetails(PersonalDetailsBuilder pb) {
        this.id = pb.id;
        this.email = pb.email;
        this.name = pb.name;
        this.surname = pb.surname;
        this.middlename = pb.middlename;
        this.webURL = pb.webURL;
        this.age = pb.age;
    }

    public static class PersonalDetailsBuilder{
        final int id;
        final String email;
        String name;
        String surname;
        String middlename;
        String webURL;
        byte age;

        public PersonalDetailsBuilder(int id, String email) {
            this.id = id;
            this.email = email;
        }

        public PersonalDetailsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonalDetailsBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonalDetailsBuilder setMiddlename(String middlename) {
            this.middlename = middlename;
            return this;
        }

        public PersonalDetailsBuilder setWebURL(String webURL) {
            this.webURL = webURL;
            return this;
        }

        public PersonalDetailsBuilder setAge(byte age) {
            this.age = age;
            return this;
        }

        public PersonalDetails build(){
            return new PersonalDetails(this);
        }
    }
}
