package domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotBlank
    @Size(min = 5,max = 20,message = "First Name must be between 2 and 18")
    private String street;

    @Size(min = 2,max=2,message = "State only allows 2 characters")
    private String state;
    private String zipCode;
}
