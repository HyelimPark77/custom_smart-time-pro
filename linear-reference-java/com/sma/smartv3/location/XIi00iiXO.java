package com.sma.smartv3.location;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
public abstract class XIi00iiXO extends BDAbstractLocationListener {
    public long OXO1;
    public long XIi00iiXO;
    public int iO;

    public XIi00iiXO() {
        this.OXO1 = -1;
        this.XIi00iiXO = 5000;
        this.iO = 161;
    }

    public final void I0IIOi(long r1) {
        this.XIi00iiXO = r1;
    }

    public final void IO(long r1) {
        this.OXO1 = r1;
    }

    public abstract void IiI10X(@aa1 CustomLocation r1);

    public abstract void O00(@aa1 String r1);

    public final void OIi0(int r1) {
        this.iO = r1;
    }

    public final CustomLocation.TYPE OXO1(int r2) {
        if (r2 == 61) goto L11;
        if (r2 == 161) goto L9;
        return CustomLocation.TYPE.OTHER;
    L9:
        return CustomLocation.TYPE.NET;
    L11:
        return CustomLocation.TYPE.NORMAL;
    }

    public final long XIi00iiXO() {
        return this.XIi00iiXO;
    }

    public final long XO0O10() {
        return this.OXO1;
    }

    public final long XOO0ii0(BDLocation r5) {
        if (r5.getTimeStamp() > 0) goto L5;
        String r0 = r5.getTime();
        if (r0 == null) goto L16;
        if (StringsKt__StringsKt.i0XI0(r0) == true) goto L16;
        return O0X11OiO.IO0iXO0O().parse(r5.getTime()).getTime();
    L14:
        return System.currentTimeMillis();
    L16:
        return System.currentTimeMillis();
    L5:
        return r5.getTimeStamp();
    }

    public final int iO() {
        return this.iO;
    }

    @Override // com.baidu.location.BDAbstractLocationListener
    public void onReceiveLocation(@aa1 BDLocation r21) {
        Intrinsics.X0O(r21, "location");
        if (PermissionUtils.isGranted(new String[]{PermissionConstants.LOCATION}) == false) goto L56;
        float r0 = r21.getRadius();
        String r3 = r21.getCoorType();
        int r4 = r21.getLocType();
        String r5 = r21.getLocTypeDescription();
        r21.setTimeStamp(XOO0ii0(r21));
        String r6 = r21.getAddress().address;
        if (r6 == null) goto L9;
        LogUtils.d(new Object[]{"onReceiveLocation -> address:" + r6});
    L9:
        if (this.OXO1 != (-1)) goto L13;
        this.OXO1 = r21.getTimeStamp();
        this.iO = r4;
    L11:
        boolean r7 = true;
    L52:
    L22:
        e = e;
        boolean r8 = r7;
    L34:
        e.printStackTrace();
    L35:
        if (r8 == false) goto L47;
        if (r4 != 61) goto L39;
    L45:
        a01.OXO1.IiI10X().put(b01.XX1Oi, r21.getLongitude() + I000IiI1O.iO.XO0O10 + r21.getLatitude() + I000IiI1O.iO.XO0O10 + r21.getAltitude());
        I01XX0.XIi00iiXO(b01.XX1Oi, null, 2, null);
        IiI10X(new CustomLocation(r21.getLatitude(), r21.getLongitude(), r21.getAltitude(), r21.getSpeed(), 1, r21.getTimeStamp(), OXO1(r4), r21.getDirection(), r21.getRadius(), r21.getRadius()));
        return;
    L39:
        if (r4 == 161) goto L45;
        if (r4 == 65) goto L45;
        if (r4 == 66) goto L45;
        O00("error=" + r21.getLocType() + ", description=" + r21.getLocTypeDescription());
        return;
    L47:
        return;
    L20:
        if (i72.OXO1.XXI0XOIX() == false) goto L24;
        a01.OXO1.OXO1().put(b01.XiOIii1, true, true);     // Catch: OutOfMemoryError -> L22
        this.XIi00iiXO = 1500;     // Catch: OutOfMemoryError -> L22
    L24:
        i1O0OXO1O r9 = i1O0OXO1O.OXO1;     // Catch: OutOfMemoryError -> L22
        double r10 = r21.getLatitude();     // Catch: OutOfMemoryError -> L22
        double r11 = r21.getLongitude();     // Catch: OutOfMemoryError -> L22
        double r12 = r21.getAltitude();     // Catch: OutOfMemoryError -> L22
        float r14 = r21.getSpeed();     // Catch: OutOfMemoryError -> L22
        int r15 = r21.getGpsAccuracyStatus();     // Catch: OutOfMemoryError -> L22
        int r2 = r21.getGpsCheckStatus();     // Catch: OutOfMemoryError -> L22
        boolean r1 = AppUtils.isAppForeground();     // Catch: OutOfMemoryError -> L22
        boolean r16 = r7;
        long r13 = r21.getTimeStamp();     // Catch: OutOfMemoryError -> L32
        StringBuilder r17 = new StringBuilder();     // Catch: OutOfMemoryError -> L32
        r17.append("onReceiveLocation -> latitude=");     // Catch: OutOfMemoryError -> L32
        r17.append(r10);     // Catch: OutOfMemoryError -> L32
        r17.append(", longitude=");     // Catch: OutOfMemoryError -> L32
        r17.append(r11);     // Catch: OutOfMemoryError -> L32
        r17.append(", altitude=");     // Catch: OutOfMemoryError -> L32
        r17.append(r12);     // Catch: OutOfMemoryError -> L32
        r17.append(", speed=");     // Catch: OutOfMemoryError -> L32
        r17.append(r14);     // Catch: OutOfMemoryError -> L32
        r17.append(", radius=");     // Catch: OutOfMemoryError -> L32
        r17.append(r0);     // Catch: OutOfMemoryError -> L32
        r17.append(", coorType=");     // Catch: OutOfMemoryError -> L32
        r17.append(r3);     // Catch: OutOfMemoryError -> L32
        r17.append(", locType=");     // Catch: OutOfMemoryError -> L32
        r17.append(r4);     // Catch: OutOfMemoryError -> L32
        r17.append(", locTypeDescription=");     // Catch: OutOfMemoryError -> L32
        r17.append(r5);     // Catch: OutOfMemoryError -> L32
        r17.append(", GPS=");     // Catch: OutOfMemoryError -> L32
        r17.append(r15);     // Catch: OutOfMemoryError -> L32
        r17.append(", gpsCheckStatus=");     // Catch: OutOfMemoryError -> L32
        r17.append(r2);     // Catch: OutOfMemoryError -> L32
        r17.append(", isAppForeground=");     // Catch: OutOfMemoryError -> L32
        r17.append(r1);     // Catch: OutOfMemoryError -> L32
        r17.append(", timeStamp = ");     // Catch: OutOfMemoryError -> L32
        r17.append(r13);     // Catch: OutOfMemoryError -> L32
        r17.append(", isSendLocation=");     // Catch: OutOfMemoryError -> L32
        r8 = r16;
        r17.append(r8);     // Catch: OutOfMemoryError -> L30
        r9.OXO1(r17.toString());     // Catch: OutOfMemoryError -> L30
    L30:
        e = e;
    L32:
        e = e;
        r8 = r16;
        goto L34
    L13:
        if (this.iO != r4) goto L16;
        this.OXO1 = r21.getTimeStamp();
        this.iO = r4;
        goto L11
    L16:
        if ((r21.getTimeStamp() - this.OXO1) <= this.XIi00iiXO) goto L18;
        this.OXO1 = r21.getTimeStamp();
        this.iO = r4;
        goto L11
    L18:
        r7 = false;
        goto L52
    }
}
