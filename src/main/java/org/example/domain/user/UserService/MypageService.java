package org.example.domain.user.UserService;

import lombok.RequiredArgsConstructor;
import org.example.domain.user.UserDTO.MypageResponseDTO;
import org.example.domain.user.UserEntity.User;
import org.example.domain.user.UserRepository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MypageService {
    private final UserRepository userRepository;

    // 마이페이지 조회 api
    public MypageResponseDTO getMypage(Long userId) {
        User user = userRepository.findById(userId);
        MypageResponseDTO response = MypageResponseDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .cardinal(user.getCardinal())
                .part(user.getPart())
                .build();

        return response;
    }
}
