package com.jieli.jl_rcsp.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class NotificationMsg implements Parcelable {
    public static final Parcelable.Creator<NotificationMsg> CREATOR = null;
    public static final int OP_PUSH = 0;
    public static final int OP_REMOVE = 1;
    private String appName;
    private String content;
    private int flag;
    private int op;
    private long time;
    private String title;

    static {
        CREATOR = new AnonymousClass1();
    }

    public NotificationMsg() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getContent() {
        return this.content;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getOp() {
        return this.op;
    }

    public long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public NotificationMsg setAppName(String r1) {
        this.appName = r1;
        return this;
    }

    public NotificationMsg setContent(String r1) {
        this.content = r1;
        return this;
    }

    public NotificationMsg setFlag(int r1) {
        this.flag = r1;
        return this;
    }

    public NotificationMsg setOp(int r1) {
        this.op = r1;
        return this;
    }

    public NotificationMsg setTime(long r1) {
        this.time = r1;
        return this;
    }

    public NotificationMsg setTitle(String r1) {
        this.title = r1;
        return this;
    }

    public String toString() {
        return "NotificationMsg{appName='" + this.appName + "', title='" + this.title + "', content='" + this.content + "', time='" + this.time + "', flag=" + this.flag + ", op=" + this.op + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeString(this.appName);
        r3.writeString(this.title);
        r3.writeString(this.content);
        r3.writeLong(this.time);
        r3.writeInt(this.flag);
        r3.writeInt(this.op);
    }

    public NotificationMsg(Parcel r3) {
        this.appName = r3.readString();
        this.title = r3.readString();
        this.content = r3.readString();
        this.time = r3.readLong();
        this.flag = r3.readInt();
        this.op = r3.readInt();
    }
}
