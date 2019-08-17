package com.devway.bootspringboot.domain.store;


import com.devway.bootspringboot.domain.category.Category;
import com.devway.bootspringboot.view.store.StoreView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Store extends AbstractPersistable<Long> {

    @NotNull
    private String name;       // 상호명
    @NotNull
    private String addrNew;    // 도로명 주소
    private String addrOld;    // 구 주소
    private String tel;        // 대표 전화번호
    private String start;      // 영업 시작 시간
    private String end;        // 영업 종료 시간
    private String breakStart; // 브레이크 시작 시간
    private String breakEnd;   // 브레이크 종료 시간
    private String posYn;      // 가맹점 포스기 설치 여부
//    private Category category; // 업종

    public Store(final StoreView storeView) {
        this.name = storeView.getName();
        this.addrNew = storeView.getAddrNew();
        this.addrOld = storeView.getAddrOld();
        this.tel = storeView.getTel();
        this.start = storeView.getStart();
        this.end = storeView.getEnd();
        this.breakStart = storeView.getBreakStart();
        this.breakEnd = storeView.getBreakEnd();
        this.posYn = storeView.getPosYn();
    }
}
