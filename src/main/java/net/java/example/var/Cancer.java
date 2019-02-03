package net.java.example.var;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cancer {

    private String region;

    private String maleCount;

    private String femaleCount;
}
