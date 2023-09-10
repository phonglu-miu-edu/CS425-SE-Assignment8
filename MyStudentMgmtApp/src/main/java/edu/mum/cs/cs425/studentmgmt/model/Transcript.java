package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;

@Entity
@Table(name = "transcript")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long transcriptId;
    @Column(nullable = false)
    String degreeTitle;

    public Transcript() {
    }

    public Transcript(String degreeTitle) {
        setDegreeTitle(degreeTitle);
    }

    public long getTranscriptId() {
        return this.transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return this.degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
