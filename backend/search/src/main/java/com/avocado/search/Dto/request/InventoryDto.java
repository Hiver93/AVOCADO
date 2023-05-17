package com.avocado.search.Dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDto {
    private int id;
    private int inventory;
}