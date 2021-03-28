package com.example.foodboard.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foodItems")
public class foodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String name;

    @ManyToMany(mappedBy = "foodItems")
    private List<Board> boards;
}
