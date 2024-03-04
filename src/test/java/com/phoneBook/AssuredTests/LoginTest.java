package com.phoneBook;

import com.phoneBoo.dto.AuthRequestDto;

public class LoginTest {
    AuthRequestDto auth = AuthRequestDto.builder()
            .username("rambo23@gm.com")
            .password("Rambo23$")
            .build();
}
//AssuredTests