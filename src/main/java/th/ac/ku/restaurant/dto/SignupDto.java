package th.ac.ku.restaurant.dto;

import lombok.Data;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String role;
}