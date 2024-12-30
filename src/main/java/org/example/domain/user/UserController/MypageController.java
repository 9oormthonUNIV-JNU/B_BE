package org.example.domain.user.UserController;

import lombok.RequiredArgsConstructor;
import org.example.domain.user.UserDTO.MypageResponseDTO;
import org.example.domain.user.UserService.MypageService;
import org.example.global.response.ResponseEntityProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class MypageController {

    private final MypageService mypageService;
    private final ResponseEntityProvider<?> responseEntityProvider;

    // 마이페이지 조회 api
    @GetMapping("/user/mypage/{user_id}")
    public ResponseEntity<?> getMypage(@PathVariable("user_id") Long userId) {
        MypageResponseDTO response = mypageService.getMypage(userId);

        return responseEntityProvider.successWithData("조회에 성공했습니다.", response);
    }
}
