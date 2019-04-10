package me.mrbluesky.vo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="`MBR_MASTER_MST`")
public class Member {

    /**
     * NAME             TYPE            NULABLE
     * -------------------------------------
     * id	            int(11)	        NO	    PRI		auto_increment
     * mbr_id	        varchar(10)	    NO
     * name	            varchar(30)	    NO
     * mdn_no	        varchar(12)	    NO
     * birthday	        varchar(8)	    NO
     * mbr_sts	        varchar(10)	    NO
     * last_sales_date	datetime(6)	    NO
     * register	        varchar(10)	    YES
     * reg_dt	        date	        YES
     * updater	        varchar(10)	    YES
     * upd_dt	        date	        YES
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mbr_id")
//    @ManyToOne
    private String memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "mdn_no")
    private String mdnNo;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "mbr_sts")
    private String mbrSatus;

    @Column(name = "last_sales_date")
    private Date lastSaleDayTime;

    @Column(name = "reg_dt")
    private Date regDayTime;

    @Column(name = "register")
    private String register;

    @Column(name = "upd_dt")
    private Date updtDayTime;

    @Column(name = "updater")
    private String updater;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMdnNo() {
        return mdnNo;
    }

    public void setMdnNo(String mdnNo) {
        this.mdnNo = mdnNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMbrSatus() {
        return mbrSatus;
    }

    public void setMbrSatus(String mbrSatus) {
        this.mbrSatus = mbrSatus;
    }

    public Date getLastSaleDayTime() {
        return lastSaleDayTime;
    }

    public void setLastSaleDayTime(Date lastSaleDayTime) {
        this.lastSaleDayTime = lastSaleDayTime;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return       id.equals(member.id)          &&
               memberId.equals(member.memberId)    &&
                   name.equals(member.name)        &&
                  mdnNo.equals(member.mdnNo)       &&
               birthday.equals(member.birthday)    &&
               mbrSatus.equals(member.mbrSatus)    &&
             regDayTime.equals(member.regDayTime)  &&
               register.equals(member.register)    &&
            updtDayTime.equals(member.updtDayTime) &&
                updater.equals(member.updater);
    }

}
