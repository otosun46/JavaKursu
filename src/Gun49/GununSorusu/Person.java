/**
 * @Author:Otosun Tarih :04/08/2020
 */
package Gun49.GununSorusu;

public class Person {
    private String name;
    private String address;
    private School school;
    private UyeTipi uyeTipi;

    public Person(String name, String address,School school,UyeTipi uyeTipi) {
        setName(name);
        setAddress(address);
        setSchool(school);
        setUyeTipi(uyeTipi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }

    public void setUyeTipi(UyeTipi uyeTipi) {
        this.uyeTipi = uyeTipi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "school='" + school + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
/*
    // kisi Ogrenciden mi oluşturulmuş ?
        if (kisi instanceof Ogrenci)
    {
        System.out.println("Şubesi ="+ ((Ogrenci)kisi).getSube() );
    }

        if (kisi instanceof Calisan)
    {
        System.out.println("Departmanı ="+ ((Calisan)kisi).getDepartman() );
    }

 */
}
