package com.javaproject.springbootproject.model;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserMaster")
  public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "phone_number")
    private String phoneNumber;



    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "date_Of_Registration")
    private Date dateOfRegistration;
    @PrePersist
    private void onCreate(){
      dateOfRegistration = new Date();
    }

    @Column(name = "status")
    private boolean status;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_user_id", referencedColumnName="user_id")
  private List<Addresses> addresses;
}

