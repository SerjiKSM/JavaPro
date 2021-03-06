package net.ukr.ksm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "foo")
public class Foo {

    // Other fields omitted

    public Foo(Date timestamp) {
        this.timestamp = timestamp;
    }

    @XmlElement(name = "timestamp", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date timestamp;

    public Foo() {}

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

}
