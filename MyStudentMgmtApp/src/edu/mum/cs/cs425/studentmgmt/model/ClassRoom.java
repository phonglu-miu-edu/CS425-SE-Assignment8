package edu.mum.cs.cs425.studentmgmt.model;

public class ClassRoom {
    long classroomId;
    String buildingName;
    String roomNumber;

    public ClassRoom(long classroomId, String buildingName, String roomNumber) {
        setClassroomId(classroomId);
        setBuildingName(buildingName);
        setRoomNumber(roomNumber);
    }

    public long getClassroomId() {
        return this.classroomId;
    }

    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return this.buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
