package com.oracle.labor.po;

public class BipForeignlanguage {
    private String bipFlId;

    private String bipId;

    private String bipFlSlcd;

    private String bipFlJywy;

    private String bipFlWysm;

    public String getBipFlId() {
        return bipFlId;
    }

    public void setBipFlId(String bipFlId) {
        this.bipFlId = bipFlId == null ? null : bipFlId.trim();
    }

    public String getBipId() {
        return bipId;
    }

    public void setBipId(String bipId) {
        this.bipId = bipId == null ? null : bipId.trim();
    }

    public String getBipFlSlcd() {
        return bipFlSlcd;
    }

    public void setBipFlSlcd(String bipFlSlcd) {
        this.bipFlSlcd = bipFlSlcd == null ? null : bipFlSlcd.trim();
    }

    public String getBipFlJywy() {
        return bipFlJywy;
    }

    public void setBipFlJywy(String bipFlJywy) {
        this.bipFlJywy = bipFlJywy == null ? null : bipFlJywy.trim();
    }

    public String getBipFlWysm() {
        return bipFlWysm;
    }

    public void setBipFlWysm(String bipFlWysm) {
        this.bipFlWysm = bipFlWysm == null ? null : bipFlWysm.trim();
    }
}