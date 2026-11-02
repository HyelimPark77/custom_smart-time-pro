package com.sma.smartv3.ui.contactpicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.fv1;

/* JADX INFO: loaded from: classes19.dex */
public class PhoneNumber implements Parcelable {
    public static final Parcelable.Creator<PhoneNumber> CREATOR = null;
    private String number;
    private String typeLabel;

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ PhoneNumber(Parcel r1, fv1 r2) {
        this(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getNumber() {
        return this.number;
    }

    public String getTypeLabel() {
        return this.typeLabel;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.typeLabel);
        dest.writeString(this.number);
    }

    public PhoneNumber(String typeLabel, String number) {
        this.typeLabel = typeLabel;
        this.number = number;
    }

    private PhoneNumber(Parcel in) {
        this.typeLabel = in.readString();
        this.number = in.readString();
    }
}
