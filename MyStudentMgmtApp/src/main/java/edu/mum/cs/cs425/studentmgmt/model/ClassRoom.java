package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "classroom")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long classroomId;
    String buildingName;
    String roomNumber;
    @ManyToMany(mappedBy = "classRooms")
    Set<Student> students;

    public ClassRoom() {
    }

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
