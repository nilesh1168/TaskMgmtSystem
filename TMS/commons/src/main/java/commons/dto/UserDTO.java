package commons.dto;

import commons.model.Roles;

public record UserDTO(String userName,
		String email,
		Roles role) {
}
