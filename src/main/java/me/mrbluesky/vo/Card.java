package me.mrbluesky.vo;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Table(name="CRD_MASTER_MST")
public class Card {

    /**
     *
     * NAME     TYPR            NULLABLE
     * --------------------------------
     * id	    int(11)	        NO	    PRI		auto_increment
     * crd_no	varchar(16)	    NO
     * mbr_id	varchar(10)	    NO
     * crd_sts	varchar(20)	    NO
     * crd_cd	varchar(4)	    NO
     * register	varchar(10)	    YES
     * reg_dt	date	        YES
     * updater	varchar(10)	    YES
     * upd_dt	date	        YES
     *
     */

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String cardNo;
    private String mbrId;
    private String cardStatus;
    private String crdCode;
    private Date regDayTime;
    private String register;
    private Date updtDayTime;
    private String updater;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMbrId() {
        return mbrId;
    }

    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCrdCode() {
        return crdCode;
    }

    public void setCrdCode(String crdCode) {
        this.crdCode = crdCode;
    }

    public Date getRegDayTime() {
        return regDayTime;
    }

    public void setRegDayTime(Date regDayTime) {
        this.regDayTime = regDayTime;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getUpdtDayTime() {
        return updtDayTime;
    }

    public void setUpdtDayTime(Date updtDayTime) {
        this.updtDayTime = updtDayTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Card card = (Card) o;

        if (!id.equals(card.id)) return false;
        if (!cardNo.equals(card.cardNo)) return false;
        if (!mbrId.equals(card.mbrId)) return false;
        if (!cardStatus.equals(card.cardStatus)) return false;
        if (!crdCode.equals(card.crdCode)) return false;
        if (!regDayTime.equals(card.regDayTime)) return false;
        if (!register.equals(card.register)) return false;
        if (!updtDayTime.equals(card.updtDayTime)) return false;
        return updater.equals(card.updater);

    }

}
