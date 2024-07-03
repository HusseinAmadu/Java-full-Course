package PersonalClass;

public abstract class Personal {
    public  String personName;
    private int personAge;
    private  long personPhone;
    public String country;
    public String city;
    public String street;
    Personal(String personName,int personAge,long personPhone,String country,String city,String street){
        this.personName = personName;
        this.personAge = personAge;
        this.personPhone = personPhone;
        this.country = country;
        this.city = city;
        this.street = street;
    }
    public void personCountryAndCity(){
        System.out.println(this.country);
        System.out.println(this.city);
    }
    public void personAddress(){
        System.out.println(this.street);
    }
    public void setCity(String city){
        this.city = city;
        System.out.println(this.city);
    }

    public static void main(String[] args) {

    }
}
