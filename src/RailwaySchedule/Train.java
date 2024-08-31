package RailwaySchedule;

public class Train {
    private String TrainId;
    private String TrainName;
    private String TrainType;

    public Train(String trainId, String trainName, String trainType) {
        TrainId = trainId;
        TrainName = trainName;
        TrainType = trainType;
    }

    public String getTrainId() {
        return TrainId;
    }

    public void setTrainId(String trainId) {
        TrainId = trainId;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public String getTrainType() {
        return TrainType;
    }

    public void setTrainType(String trainType) {
        TrainType = trainType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainId='" + TrainId + '\'' +
                ", TrainName='" + TrainName + '\'' +
                ", TrainType='" + TrainType + '\'' +
                '}';
    }
}
