package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateCartItemRequest {
    @NotNull(message = "Quantity must be provided")
    @Min(value = 1,message = "Quantity must be greater then zero.")
    @Max(value = 10000, message = "Quantity must be less then 10000.")
    private Integer quantity;
}
