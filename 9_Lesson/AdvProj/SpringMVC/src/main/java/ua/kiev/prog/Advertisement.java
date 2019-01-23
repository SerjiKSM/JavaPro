package ua.kiev.prog;

import javax.persistence.*;

@Entity
@Table(name = "Advs")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // ksm +
    //add
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "photo_id")
//    private long photo_id;
    // ksm -

    private String name;

    @Column(name = "short_desc")
    private String shortDesc;

    @Column(name = "long_desc")
    private String longDesc;

    private String phone;
    private double price;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Photo photo;

    public Advertisement() {}

    public Advertisement(String name, String shortDesc, String longDesc, String phone, double price, Photo photo) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.phone = phone;
        this.price = price;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }



    // ksm +
    // add

//    public long getPhoto_id() {
//        return photo_id;
//    }
//
//    public void setPhoto_id(long photo_id) {
//        this.photo_id = photo_id;
//    }


//    public long getPhoto_id() {
//        return photo_id;
//    }
//
//    public void setPhoto_id(long id) {
//        this.photo_id = id;
//    }

    // ksm -



}

