package com.playdata.springbootproject.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
// 커맨드쉬프트 T 로 테스트 생성

class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        // given
        String name = "남민우";
        int amount = 100;

        // when
        // @RequireArgsConstructor가 정말 필요한 필드에 대해서 생성자를 생성하는지 확인
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}