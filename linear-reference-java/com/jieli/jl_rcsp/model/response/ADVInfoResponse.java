package com.jieli.jl_rcsp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class ADVInfoResponse extends CommonResponse implements Parcelable {
    public static final Parcelable.Creator<ADVInfoResponse> CREATOR = null;
    private int chargingBinQuantity;
    private String deviceName;
    private int inEarSettings;
    private boolean isDeviceCharging;
    private boolean isLeftCharging;
    private boolean isRightCharging;
    private String language;
    private int leftDeviceQuantity;
    private List<KeySettings> mKeySettingsList;
    private List<LedSettings> mLedSettingsList;
    private int micChannel;
    private byte[] modes;
    private int pid;
    private int rightDeviceQuantity;
    private int uid;
    private int vid;
    private int workModel;

    public static class KeySettings implements Parcelable {
        public static final Parcelable.Creator<KeySettings> CREATOR = null;
        private int action;
        private int function;
        private int keyNum;

        static {
            CREATOR = new AnonymousClass1();
        }

        public KeySettings() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getAction() {
            return this.action;
        }

        public int getFunction() {
            return this.function;
        }

        public int getKeyNum() {
            return this.keyNum;
        }

        public void setAction(int r1) {
            this.action = r1;
        }

        public void setFunction(int r1) {
            this.function = r1;
        }

        public void setKeyNum(int r1) {
            this.keyNum = r1;
        }

        public byte[] toData() {
            return new byte[]{CHexConver.intToByte(this.keyNum), CHexConver.intToByte(this.action), CHexConver.intToByte(this.function)};
        }

        public String toString() {
            return "KeySettings{, keyNum=" + this.keyNum + ", action=" + this.action + ", function=" + this.function + i0XO1.IO;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r1, int r2) {
            r1.writeInt(this.keyNum);
            r1.writeInt(this.action);
            r1.writeInt(this.function);
        }

        public KeySettings(Parcel r2) {
            this.keyNum = r2.readInt();
            this.action = r2.readInt();
            this.function = r2.readInt();
        }
    }

    public static class LedSettings implements Parcelable {
        public static final Parcelable.Creator<LedSettings> CREATOR = null;
        private int effect;
        private int scene;

        static {
            CREATOR = new AnonymousClass1();
        }

        public LedSettings() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getEffect() {
            return this.effect;
        }

        public int getScene() {
            return this.scene;
        }

        public void setEffect(int r1) {
            this.effect = r1;
        }

        public void setScene(int r1) {
            this.scene = r1;
        }

        public byte[] toData() {
            return new byte[]{CHexConver.intToByte(this.scene), CHexConver.intToByte(this.effect)};
        }

        public String toString() {
            return "LedSettings{scene=" + this.scene + ", effect=" + this.effect + i0XO1.IO;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r1, int r2) {
            r1.writeInt(this.scene);
            r1.writeInt(this.effect);
        }

        public LedSettings(Parcel r2) {
            this.scene = r2.readInt();
            this.effect = r2.readInt();
        }
    }

    static {
        CREATOR = new AnonymousClass1();
    }

    public ADVInfoResponse() {
    }

    public static boolean baseInfoCompare(ADVInfoResponse r4, ADVInfoResponse r5) {
        if (r4 == null) goto L36;
        if (r5 == null) goto L36;
        if (r4 != r5) goto L10;
        return true;
    L10:
        if (r4.pid != r5.pid) goto L36;
        if (r4.vid != r5.vid) goto L36;
        if (r4.uid != r5.uid) goto L36;
        if (r4.leftDeviceQuantity != r5.leftDeviceQuantity) goto L36;
        if (r4.isLeftCharging != r5.isLeftCharging) goto L36;
        if (r4.rightDeviceQuantity != r5.rightDeviceQuantity) goto L36;
        if (r4.isRightCharging != r5.isRightCharging) goto L36;
        if (r4.chargingBinQuantity != r5.chargingBinQuantity) goto L36;
        if (r4.isDeviceCharging != r5.isDeviceCharging) goto L36;
        if (r4.micChannel != r5.micChannel) goto L36;
        if (r4.workModel != r5.workModel) goto L36;
        if (r4.inEarSettings != r5.inEarSettings) goto L36;
        if (Objects.equals(r4.deviceName, r5.deviceName) == false) goto L36;
        return true;
    L36:
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getChargingBinQuantity() {
        return this.chargingBinQuantity;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getInEarSettings() {
        return this.inEarSettings;
    }

    public List<KeySettings> getKeySettingsList() {
        return this.mKeySettingsList;
    }

    public String getLanguage() {
        return this.language;
    }

    public List<LedSettings> getLedSettingsList() {
        return this.mLedSettingsList;
    }

    public int getLeftDeviceQuantity() {
        return this.leftDeviceQuantity;
    }

    public int getMicChannel() {
        return this.micChannel;
    }

    public byte[] getModes() {
        return this.modes;
    }

    public int getPid() {
        return this.pid;
    }

    public int getRightDeviceQuantity() {
        return this.rightDeviceQuantity;
    }

    public int getUid() {
        return this.uid;
    }

    public int getVid() {
        return this.vid;
    }

    public int getWorkModel() {
        return this.workModel;
    }

    public boolean isDeviceCharging() {
        return this.isDeviceCharging;
    }

    public boolean isLeftCharging() {
        return this.isLeftCharging;
    }

    public boolean isRightCharging() {
        return this.isRightCharging;
    }

    public ADVInfoResponse setChargingBinQuantity(int r1) {
        this.chargingBinQuantity = r1;
        return this;
    }

    public ADVInfoResponse setDeviceCharging(boolean r1) {
        this.isDeviceCharging = r1;
        return this;
    }

    public ADVInfoResponse setDeviceName(String r1) {
        this.deviceName = r1;
        return this;
    }

    public ADVInfoResponse setInEarSettings(int r1) {
        this.inEarSettings = r1;
        return this;
    }

    public ADVInfoResponse setKeySettingsList(List<KeySettings> r1) {
        this.mKeySettingsList = r1;
        return this;
    }

    public ADVInfoResponse setLanguage(String r1) {
        this.language = r1;
        return this;
    }

    public ADVInfoResponse setLedSettingsList(List<LedSettings> r1) {
        this.mLedSettingsList = r1;
        return this;
    }

    public ADVInfoResponse setLeftCharging(boolean r1) {
        this.isLeftCharging = r1;
        return this;
    }

    public ADVInfoResponse setLeftDeviceQuantity(int r1) {
        this.leftDeviceQuantity = r1;
        return this;
    }

    public ADVInfoResponse setMicChannel(int r1) {
        this.micChannel = r1;
        return this;
    }

    public ADVInfoResponse setModes(byte[] r1) {
        this.modes = r1;
        return this;
    }

    public ADVInfoResponse setPid(int r1) {
        this.pid = r1;
        return this;
    }

    public ADVInfoResponse setRightCharging(boolean r1) {
        this.isRightCharging = r1;
        return this;
    }

    public ADVInfoResponse setRightDeviceQuantity(int r1) {
        this.rightDeviceQuantity = r1;
        return this;
    }

    public ADVInfoResponse setUid(int r1) {
        this.uid = r1;
        return this;
    }

    public ADVInfoResponse setVid(int r1) {
        this.vid = r1;
        return this;
    }

    public ADVInfoResponse setWorkModel(int r1) {
        this.workModel = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "ADVInfoResponse{pid=" + this.pid + ", vid=" + this.vid + ", uid=" + this.uid + ", leftDeviceQuantity=" + this.leftDeviceQuantity + ", isLeftCharging=" + this.isLeftCharging + ", rightDeviceQuantity=" + this.rightDeviceQuantity + ", isRightCharging=" + this.isRightCharging + ", chargingBinQuantity=" + this.chargingBinQuantity + ", isDeviceCharging=" + this.isDeviceCharging + ", deviceName='" + this.deviceName + "', micChannel=" + this.micChannel + ", workModel=" + this.workModel + ", mKeySettingsList=" + this.mKeySettingsList + ", mLedSettingsList=" + this.mLedSettingsList + ", inEarSettings=" + this.inEarSettings + ", language=" + this.language + ", modes=" + CHexConver.byte2HexStr(this.modes) + "} " + super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.vid);
        r1.writeInt(this.uid);
        r1.writeInt(this.pid);
        r1.writeInt(this.leftDeviceQuantity);
        r1.writeByte(this.isLeftCharging ? 1 : 0);
        r1.writeInt(this.rightDeviceQuantity);
        r1.writeByte(this.isRightCharging ? 1 : 0);
        r1.writeInt(this.chargingBinQuantity);
        r1.writeByte(this.isDeviceCharging ? 1 : 0);
        r1.writeString(this.deviceName);
        r1.writeInt(this.micChannel);
        r1.writeInt(this.workModel);
        r1.writeTypedList(this.mKeySettingsList);
        r1.writeTypedList(this.mLedSettingsList);
        r1.writeInt(this.inEarSettings);
        r1.writeString(this.language);
        r1.writeByteArray(this.modes);
    }

    public ADVInfoResponse(Parcel r4) {
        this.vid = r4.readInt();
        this.uid = r4.readInt();
        this.pid = r4.readInt();
        this.leftDeviceQuantity = r4.readInt();
        boolean r1 = false;
        if (r4.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.isLeftCharging = r0;
        this.rightDeviceQuantity = r4.readInt();
        if (r4.readByte() == 0) goto L9;
        boolean r2 = true;
    L10:
        this.isRightCharging = r2;
        this.chargingBinQuantity = r4.readInt();
        if (r4.readByte() == 0) goto L13;
        r1 = true;
    L13:
        this.isDeviceCharging = r1;
        this.deviceName = r4.readString();
        this.micChannel = r4.readInt();
        this.workModel = r4.readInt();
        this.mKeySettingsList = r4.createTypedArrayList(KeySettings.CREATOR);
        this.mLedSettingsList = r4.createTypedArrayList(LedSettings.CREATOR);
        this.inEarSettings = r4.readInt();
        this.language = r4.readString();
        this.modes = r4.createByteArray();
        return;
    L9:
        r2 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
