package DZ7.data;

public class Company extends ContactMain {

    private String companyName;
    private String occupation;

    public String getCompanyName() {
        return companyName;
    }

    public String getOccupation() {
        return occupation;
    }

    public Company(String name, String address, String key, String value, String companyName, String occupation) {
        super(name, address, key, value);
        this.companyName = companyName;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Company: [" +
                "Название компании: " + companyName + ", " +
                "Род деятельности: " + occupation + ", " +
                "Имя: " + name + ", " +
                communicationMethods + ", " +
                "Адрес: " + address +
                ']';
    }
}