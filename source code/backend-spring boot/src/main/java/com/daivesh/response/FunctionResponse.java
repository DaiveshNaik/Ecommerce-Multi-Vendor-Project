package com.daivesh.response;

import com.daivesh.dto.OrderHistory;
import com.daivesh.model.Cart;
import com.daivesh.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
