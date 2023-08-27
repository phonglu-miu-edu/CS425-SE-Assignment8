package edu.mum.cs.cs425.studentmgmt.model;

public class Transcript {
    long transcriptId;
    String degreeTitle;

    public Transcript(long transcriptId, String degreeTitle) {
        setTranscriptId(transcriptId);
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
