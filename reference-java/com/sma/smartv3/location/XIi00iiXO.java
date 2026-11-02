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
    public long OXO1 = -1;
    public long XIi00iiXO = 5000;

    /* JADX INFO: renamed from: iO */
    public int f51291iO = 161;

    public final void I0IIOi(long j) {
        this.XIi00iiXO = j;
    }

    /* JADX INFO: renamed from: IO */
    public final void m38248IO(long j) {
        this.OXO1 = j;
    }

    public abstract void IiI10X(@aa1 CustomLocation customLocation);

    public abstract void O00(@aa1 String str);

    public final void OIi0(int i) {
        this.f51291iO = i;
    }

    public final CustomLocation.TYPE OXO1(int i) {
        if (i != 61) {
            return i != 161 ? CustomLocation.TYPE.OTHER : CustomLocation.TYPE.NET;
        }
        return CustomLocation.TYPE.NORMAL;
    }

    public final long XIi00iiXO() {
        return this.XIi00iiXO;
    }

    public final long XO0O10() {
        return this.OXO1;
    }

    public final long XOO0ii0(BDLocation bDLocation) {
        if (bDLocation.getTimeStamp() > 0) {
            return bDLocation.getTimeStamp();
        }
        String time = bDLocation.getTime();
        if (time == null || StringsKt__StringsKt.i0XI0(time)) {
            return System.currentTimeMillis();
        }
        try {
            return O0X11OiO.IO0iXO0O().parse(bDLocation.getTime()).getTime();
        } catch (Exception unused) {
            return System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: iO */
    public final int m38249iO() {
        return this.f51291iO;
    }

    @Override // com.baidu.location.BDAbstractLocationListener
    public void onReceiveLocation(@aa1 BDLocation location) {
        boolean z;
        boolean z2;
        Intrinsics.X0O(location, "location");
        if (PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            float radius = location.getRadius();
            String coorType = location.getCoorType();
            int locType = location.getLocType();
            String locTypeDescription = location.getLocTypeDescription();
            location.setTimeStamp(XOO0ii0(location));
            String str = location.getAddress().address;
            if (str != null) {
                LogUtils.m11128d("onReceiveLocation -> address:" + str);
            }
            if (this.OXO1 == -1 || this.f51291iO == locType || location.getTimeStamp() - this.OXO1 > this.XIi00iiXO) {
                this.OXO1 = location.getTimeStamp();
                this.f51291iO = locType;
                z = true;
            } else {
                z = false;
            }
            try {
                if (i72.OXO1.XXI0XOIX()) {
                    a01.OXO1.OXO1().put(b01.XiOIii1, true, true);
                    this.XIi00iiXO = 1500L;
                }
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                double altitude = location.getAltitude();
                float speed = location.getSpeed();
                int gpsAccuracyStatus = location.getGpsAccuracyStatus();
                int gpsCheckStatus = location.getGpsCheckStatus();
                boolean zIsAppForeground = AppUtils.isAppForeground();
                boolean z3 = z;
                try {
                    long timeStamp = location.getTimeStamp();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceiveLocation -> latitude=");
                    sb.append(latitude);
                    sb.append(", longitude=");
                    sb.append(longitude);
                    sb.append(", altitude=");
                    sb.append(altitude);
                    sb.append(", speed=");
                    sb.append(speed);
                    sb.append(", radius=");
                    sb.append(radius);
                    sb.append(", coorType=");
                    sb.append(coorType);
                    sb.append(", locType=");
                    sb.append(locType);
                    sb.append(", locTypeDescription=");
                    sb.append(locTypeDescription);
                    sb.append(", GPS=");
                    sb.append(gpsAccuracyStatus);
                    sb.append(", gpsCheckStatus=");
                    sb.append(gpsCheckStatus);
                    sb.append(", isAppForeground=");
                    sb.append(zIsAppForeground);
                    sb.append(", timeStamp = ");
                    sb.append(timeStamp);
                    sb.append(", isSendLocation=");
                    z2 = z3;
                    try {
                        sb.append(z2);
                        i1o0oxo1o.OXO1(sb.toString());
                    } catch (OutOfMemoryError e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    z2 = z3;
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                z2 = z;
            }
            if (z2) {
                if (locType != 61 && locType != 161 && locType != 65 && locType != 66) {
                    O00("error=" + location.getLocType() + ", description=" + location.getLocTypeDescription());
                    return;
                }
                a01.OXO1.IiI10X().put(b01.XX1Oi, location.getLongitude() + I000IiI1O.C2156iO.XO0O10 + location.getLatitude() + I000IiI1O.C2156iO.XO0O10 + location.getAltitude());
                I01XX0.XIi00iiXO(b01.XX1Oi, null, 2, null);
                IiI10X(new CustomLocation(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getSpeed(), 1, location.getTimeStamp(), OXO1(locType), location.getDirection(), location.getRadius(), location.getRadius()));
            }
        }
    }
}
