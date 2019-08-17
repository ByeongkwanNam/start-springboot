package com.devway.bootspringboot.view.param;

import lombok.Getter;

@Getter
public class StoreParam extends Param{
    private String keywords;    // 사용자 검색어: 우선 상호명에만 이용
    private String lat;         // 위치용 지오코드: 위도
    private String lng;         // 위치용 지오코드: 경도
    // 앞으로 카테고리 등이 추가될 수 있음
}
