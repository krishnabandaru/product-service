package com.microservices.productservice.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@ToString
@Table(schema = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
  @SequenceGenerator(name = "book_generator", sequenceName = "book_seq", allocationSize = 50)
  private Long id;

  private String name;
  private String description;
  private BigDecimal price;
}
