package com.jieli.jl_fatfs.model;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class FileExtMsg {

    @SerializedName("prj_uuid")
    private String uuid;

    @SerializedName("version_id")
    private String versionID;

    public FileExtMsg() {
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getVersionID() {
        return this.versionID;
    }

    public void setUuid(String r1) {
        this.uuid = r1;
    }

    public void setVersionID(String r1) {
        this.versionID = r1;
    }

    public String toString() {
        return new GsonBuilder().create().toJson(this);
    }
}
