package com.rogerpeyer.dockerexample.persistence.model;

import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OrderItemPo {

  private Integer quantity;

  private String productId;
}
