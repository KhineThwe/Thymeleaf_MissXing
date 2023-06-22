package domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @NotNull(message = "Id cannot be null")
    private Integer id;
    
    @NotBlank
    @Size(min=2,max=18,message = "First Name must be between 2 and 18")
    private String firstName;
    private String lastName;
    
    @Valid
    private Address address;
}

