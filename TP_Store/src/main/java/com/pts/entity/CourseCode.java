package com.pts.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "coursecode")
public class CourseCode {

    @ManyToOne
    @JoinColumn(name = "courseid")
    private Course courseCode;
    @Id
    String code;


//    @OneToMany(mappedBy = "courseCode")
//    List<Order> orders;
}
