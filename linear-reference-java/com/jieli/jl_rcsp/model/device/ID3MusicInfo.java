package com.jieli.jl_rcsp.model.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ID3MusicInfo implements Parcelable {
    public static final Parcelable.Creator<ID3MusicInfo> CREATOR = null;
    private String album;
    private String artist;
    private int currentTime;
    private String genre;
    private int number;
    private boolean playStatus;
    private String title;
    private int total;
    private int totalTime;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ID3MusicInfo() {
        this.number = -1;
        this.currentTime = -1;
    }

    public static ID3MusicInfo cloneMySelf(ID3MusicInfo r2) {
        ID3MusicInfo r0 = new ID3MusicInfo();
        r0.setTotal(r2.getTotal());
        r0.setCurrentTime(r2.getCurrentTime());
        r0.setPlayStatus(r2.isPlayStatus());
        r0.setAlbum(r2.getAlbum());
        r0.setArtist(r2.getArtist());
        r0.setTitle(r2.getTitle());
        r0.setGenre(r2.getGenre());
        r0.setNumber(r2.getNumber());
        r0.setTotalTime(r2.getTotalTime());
        return r0;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6758clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getNumber() {
        return this.number;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotal() {
        return this.total;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public boolean isPlayStatus() {
        return this.playStatus;
    }

    public void setAlbum(String r1) {
        this.album = r1;
    }

    public void setArtist(String r1) {
        this.artist = r1;
    }

    public void setCurrentTime(int r1) {
        this.currentTime = r1;
    }

    public void setGenre(String r1) {
        this.genre = r1;
    }

    public void setNumber(int r1) {
        this.number = r1;
    }

    public void setPlayStatus(boolean r1) {
        this.playStatus = r1;
    }

    public void setTitle(String r1) {
        this.title = r1;
    }

    public void setTotal(int r1) {
        this.total = r1;
    }

    public void setTotalTime(int r1) {
        this.totalTime = r1;
    }

    public String toString() {
        return "ID3MusicInfo{title=" + this.title + ", artist='" + this.artist + "', album=" + this.album + ", number=" + this.number + ", total=" + this.total + ", totalTime=" + this.totalTime + ", genre='" + this.genre + "', currentTime='" + this.currentTime + "', playStatus='" + this.playStatus + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.title);
        r1.writeString(this.artist);
        r1.writeString(this.album);
        r1.writeInt(this.number);
        r1.writeInt(this.total);
        r1.writeInt(this.totalTime);
        r1.writeString(this.genre);
        r1.writeInt(this.currentTime);
        r1.writeByte(this.playStatus ? 1 : 0);
    }

    public ID3MusicInfo clone() throws CloneNotSupportedException {
        return (ID3MusicInfo) super.clone();
    }

    public ID3MusicInfo(Parcel r2) {
        this.number = -1;
        this.currentTime = -1;
        this.title = r2.readString();
        this.artist = r2.readString();
        this.album = r2.readString();
        this.number = r2.readInt();
        this.total = r2.readInt();
        this.totalTime = r2.readInt();
        this.genre = r2.readString();
        this.currentTime = r2.readInt();
        if (r2.readByte() == 0) goto L5;
        boolean r3 = true;
    L6:
        this.playStatus = r3;
        return;
    L5:
        r3 = false;
        goto L6
    }
}
