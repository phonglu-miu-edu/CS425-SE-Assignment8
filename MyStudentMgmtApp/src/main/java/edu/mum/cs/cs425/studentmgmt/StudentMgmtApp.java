package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassRoomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMgmtApp {
    @Autowired
    private ClassRoomRepository classRoomRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TranscriptRepository transcriptRepository;

    public void saveClassRoom(ClassRoom classRoom) {
        this.classRoomRepository.save(classRoom);
    }

    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    public void saveTranscript(Transcript transcript) {
        this.transcriptRepository.save(transcript);
    }

}
