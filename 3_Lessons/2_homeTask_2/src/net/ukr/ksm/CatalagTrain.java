package net.ukr.ksm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "trains")
public class CatalagTrain {

    @XmlElement(name = "train")
    private List<Train> trainList = new ArrayList<>();
    //private List<String> trainList = new ArrayList<>();

    void add(Train train){
        trainList.add(train);
    }

    public List<Train> getTrainList() {
        return trainList;
    }

    public void setTrainList(List<Train> trainList) {
        this.trainList = trainList;
    }
}
