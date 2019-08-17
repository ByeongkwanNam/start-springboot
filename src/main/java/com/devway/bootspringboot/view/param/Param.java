package com.devway.bootspringboot.view.param;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Param {
    private int pageNum;    // 전체 쪽 수
    private int pageSize;   // 쪽당 들어가는 검색 결과 개수
    private int total;      // 전체 검색 결과 수
}
