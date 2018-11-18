package com.rogerpeyer.orderservice.service.pricing;

import com.rogerpeyer.orderservice.persistence.model.OrderPo;
import com.rogerpeyer.orderservice.service.pricing.model.OrderPricing;
import java.util.List;
import java.util.Map;

public interface OrderPricingService {

  /**
   * Get the order pricing.
   *
   * @param orderPo the order to be priced
   * @return the order pricing
   */
  OrderPricing getOrderPricing(OrderPo orderPo);

  /**
   * Get the order pricing per order id map.
   *
   * @param orders the orders to be priced
   * @return the order pricing per order id map
   */
  Map<String, OrderPricing> getOrderIdOrderPricingMap(List<OrderPo> orders);
}