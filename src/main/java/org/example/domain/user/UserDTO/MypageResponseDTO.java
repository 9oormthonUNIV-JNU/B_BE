package org.example.domain.user.UserDTO;

import lombok.Builder;
import lombok.Getter;
import org.example.domain.user.UserEntity.Part;

@Getter
public class MypageResponseDTO {
    private final String name;
    private final String email;
    private final int cardinal;
    private final Part part;

    @Builder
    public MypageResponseDTO(String name, String email, int cardinal, Part part) {
        this.name = name;
        this.email = email;
        this.cardinal = cardinal;
        this.part = part;
    }
}
