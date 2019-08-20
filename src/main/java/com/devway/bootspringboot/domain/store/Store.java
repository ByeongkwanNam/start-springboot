package com.devway.bootspringboot.domain.store;


import com.devway.bootspringboot.domain.category.Category;
import com.devway.bootspringboot.view.store.StoreView;
import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;       // 상호명
    @NotNull
    private String addrNew;    // 도로명 주소
    private String addrOld;    // 구 주소
    private String tel;        // 대표 전화번호
    private String storeStart; // 영업 시작 시간
    private String storeEnd;   // 영업 종료 시간
    private String breakStart; // 브레이크 시작 시간
    private String breakEnd;   // 브레이크 종료 시간
    private String posYn;      // 가맹점 포스기 설치 여부

    public Store(final StoreView storeView) {
        this.name = storeView.getName();
        this.addrNew = storeView.getAddrNew();
        this.addrOld = storeView.getAddrOld();
        this.tel = storeView.getTel();
        this.storeStart = storeView.getStoreStart();
        this.storeEnd = storeView.getStoreEnd();
        this.breakStart = storeView.getBreakStart();
        this.breakEnd = storeView.getBreakEnd();
        this.posYn = storeView.getPosYn();
    }
}
