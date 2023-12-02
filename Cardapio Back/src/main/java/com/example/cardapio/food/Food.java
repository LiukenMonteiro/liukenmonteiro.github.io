package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "padaria")
@Entity(name = "padaria")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String image;
  private Integer price;
  private String title;

  public Food(FoodRequestDTO data) {
    this.image = data.image();
    this.price = data.price();
    this.title = data.title();
  }
}