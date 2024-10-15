/*package ie.atu.productapp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotBlank(message="This value cannot be blank")
    private String name;
    @Min(value = 1, message = ("Value greater than 1"))
    private int title;
    @Min(value = 1, message = ("Value greater than 1"))
    private int employeeId;
    @Min(value = 1, message = ("Value greater than 1"))
    private int age;
    @Email(message="Must be a real email")
    private String email;
    @NotBlank(message="This value cannot be blank")
    private int position;
    @NotBlank(message="This value cannot be blank")
    private int department;

}
*/