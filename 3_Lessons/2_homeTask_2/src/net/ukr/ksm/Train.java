package net.ukr.ksm;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement(name = "train")
//@XmlType(propOrder = {"id", "from", "to", "date", "departure"})
public class Train {

    private int id;
    private String from;
    private String to;

    @XmlElement(name = "date", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date date;
    //private String data;
    //private Date departure;
    private String departure;

    public Train() {
    }

    //public Train(int id, String from, String to, Date data, Date departure) {
    public Train(int id, String from, String to, Date date, String departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }

//    public Date getDeparture() {
//        return departure;
//    }
//
//    public void setDeparture(Date departure) {
//        this.departure = departure;
//    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

}
