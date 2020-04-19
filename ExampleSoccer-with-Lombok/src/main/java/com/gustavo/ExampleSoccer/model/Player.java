package com.gustavo.ExampleSoccer.model;

import lombok.*;

/**
 * @author Gustavo Cigaran
 * @since 15/04/2020
 * @version 1.0
 */
@ToString
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Player {
    private String name;
    private String team;
}