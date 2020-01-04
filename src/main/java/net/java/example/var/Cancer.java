package net.java.example.var;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Cancer {

    private String region;

    private String maleCount;

    private String femaleCount;
}
