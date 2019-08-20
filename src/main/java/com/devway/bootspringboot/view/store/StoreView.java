package com.devway.bootspringboot.view.store;

import com.devway.bootspringboot.domain.store.Store;

public class StoreView {

    public StoreView(final Store store) {
        this.name = store.getName();
        this.addrNew = store.getAddrNew();
        this.addrOld = store.getAddrOld();
        this.tel = store.getTel();
        this.storeStart = store.getStoreStart();
        this.storeEnd = store.getStoreEnd();
        this.breakStart = store.getBreakStart();
        this.breakEnd = store.getBreakEnd();
        this.posYn = store.getPosYn();
    }

    private String name;       // 상호명
    private String addrNew;    // 도로명 주소
    private String addrOld;    // 구 주소
    private String tel;        // 대표 전화번호
    private String storeStart; // 영업 시작 시간
    private String storeEnd;   // 영업 종료 시간
    private String breakStart; // 브레이크 시작 시간
    private String breakEnd;   // 브레이크 종료 시간
    private String posYn;      // 가맹점 포스기 설치 여부
//    private Category category; // 업종


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrNew() {
        return addrNew;
    }

    public void setAddrNew(String addrNew) {
        this.addrNew = addrNew;
    }

    public String getAddrOld() {
        return addrOld;
    }

    public void setAddrOld(String addrOld) {
        this.addrOld = addrOld;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStoreStart() {
        return storeStart;
    }

    public void setStoreStart(String storeStart) {
        this.storeStart = storeStart;
    }

    public String getStoreEnd() {
        return storeEnd;
    }

    public void setStoreEnd(String storeEnd) {
        this.storeEnd = storeEnd;
    }

    public String getBreakStart() {
        return breakStart;
    }

    public void setBreakStart(String breakStart) {
        this.breakStart = breakStart;
    }

    public String getBreakEnd() {
        return breakEnd;
    }

    public void setBreakEnd(String breakEnd) {
        this.breakEnd = breakEnd;
    }

    public String getPosYn() {
        return posYn;
    }

    public void setPosYn(String posYn) {
        this.posYn = posYn;
    }
}
