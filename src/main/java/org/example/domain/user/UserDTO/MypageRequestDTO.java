package org.example.domain.user.UserDTO;

import org.example.domain.user.UserEntity.Part;

public record MypageRequestDTO(
        String name,
        String email,
        Integer cardinal,
        Part part
) {
}
