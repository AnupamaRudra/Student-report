package com.anu.entity;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;

@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {

    private static final long serialVersionUID = -2107661175822965352L;
    private String studentId;
    private String studentName;

    private int maths;
    private int physics;
    private int chemistry;
    private int total;

    public Student() {
    }


    @Id
    @Column(name = "id", unique = true, nullable = false)
    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String catGuid) {
        this.studentId = catGuid;
    }

    @Column(name = "name", unique = true, nullable = false)
    @XmlAttribute(name="name")
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String catName) {
        this.studentName = catName;
    }

    @Column(name = "maths")
    public int getMaths() {
        return this.maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    @Column(name = "physics")
    public int getPhysics() {
        return this.physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    @Column(name = "total")
    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
