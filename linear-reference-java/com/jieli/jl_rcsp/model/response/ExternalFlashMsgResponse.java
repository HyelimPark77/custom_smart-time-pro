package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class ExternalFlashMsgResponse extends CommonResponse {
    private int blockSize;
    private int cluster;
    private int fatSize;
    private int flashSize;
    private String[] matchVersions;
    private int receiveMtu;
    private int screenHeight;
    private int screenWidth;
    private int sysStatus;
    private int system;
    private int watchVersionCode;

    public ExternalFlashMsgResponse() {
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCluster() {
        return this.cluster;
    }

    public int getFatSize() {
        return this.fatSize;
    }

    public int getFlashSize() {
        return this.flashSize;
    }

    public String[] getMatchVersions() {
        return this.matchVersions;
    }

    public int getReceiveMtu() {
        return this.receiveMtu;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int getSysStatus() {
        return this.sysStatus;
    }

    public int getSystem() {
        return this.system;
    }

    public int getWatchVersionCode() {
        return this.watchVersionCode;
    }

    public ExternalFlashMsgResponse setBlockSize(int r1) {
        this.blockSize = r1;
        return this;
    }

    public ExternalFlashMsgResponse setCluster(int r1) {
        this.cluster = r1;
        return this;
    }

    public ExternalFlashMsgResponse setFatSize(int r1) {
        this.fatSize = r1;
        return this;
    }

    public ExternalFlashMsgResponse setFlashSize(int r1) {
        this.flashSize = r1;
        return this;
    }

    public ExternalFlashMsgResponse setMatchVersions(String[] r1) {
        this.matchVersions = r1;
        return this;
    }

    public ExternalFlashMsgResponse setReceiveMtu(int r1) {
        this.receiveMtu = r1;
        return this;
    }

    public ExternalFlashMsgResponse setScreenHeight(int r1) {
        this.screenHeight = r1;
        return this;
    }

    public ExternalFlashMsgResponse setScreenWidth(int r1) {
        this.screenWidth = r1;
        return this;
    }

    public ExternalFlashMsgResponse setSysStatus(int r1) {
        this.sysStatus = r1;
        return this;
    }

    public ExternalFlashMsgResponse setSystem(int r1) {
        this.system = r1;
        return this;
    }

    public ExternalFlashMsgResponse setWatchVersionCode(int r1) {
        this.watchVersionCode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "ExternalFlashMsgResponse{flashSize=" + this.flashSize + ", system=" + this.system + ", blockSize=" + this.blockSize + ", sysStatus=" + this.sysStatus + ", cluster=" + this.cluster + ", fatSize=" + this.fatSize + ", matchVersions=" + Arrays.toString(this.matchVersions) + ", watchVersionCode=" + this.watchVersionCode + ", blockSize=" + this.blockSize + ", receiveMtu=" + this.receiveMtu + ", screenWidth=" + this.screenWidth + ", screenHeight=" + this.screenHeight + "} " + super.toString();
    }
}
