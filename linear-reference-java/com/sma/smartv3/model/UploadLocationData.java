package com.sma.smartv3.model;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadLocationData {
    private int altitude;
    private float latitude;
    private float longitude;
    private int source;
    private long time;

    public UploadLocationData() {
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAltitude(int r1) {
        this.altitude = r1;
    }

    public final void setLatitude(float r1) {
        this.latitude = r1;
    }

    public final void setLongitude(float r1) {
        this.longitude = r1;
    }

    public final void setSource(int r1) {
        this.source = r1;
    }

    public final void setTime(long r1) {
        this.time = r1;
    }
}
