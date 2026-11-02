package com.sma.smartv3.location;

import android.location.Location;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class OXO1 extends LocationCallback {
    public OXO1() {
    }

    public abstract void OXO1(@aa1 String r1);

    public abstract void XIi00iiXO(@aa1 CustomLocation r1);

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(@aa1 LocationResult r23) {
        Intrinsics.X0O(r23, "locationResult");
        if (r23.getLocations().size() <= 0) goto L6;
        Location r1 = r23.getLocations().get(0);
        i1O0OXO1O.OXO1.OXO1("MyLocationCallback onLocationResult " + r1 + " ->" + r1.getLatitude() + I000IiI1O.iO.XO0O10 + r1.getLongitude() + I000IiI1O.iO.XO0O10 + r1.getAltitude() + I000IiI1O.iO.XO0O10 + r1.getSpeed() + ", isAppForeground=" + AppUtils.isAppForeground());
        XIi00iiXO(new CustomLocation(r1.getLatitude(), r1.getLongitude(), r1.getAltitude(), r1.getSpeed(), 0, r1.getTime(), null, r1.getBearing(), r1.getAccuracy(), r1.getVerticalAccuracyMeters(), 64, null));
        SPUtils r2 = a01.OXO1.IiI10X();
        double r4 = r1.getLongitude();
        double r6 = r1.getLatitude();
        double r8 = r1.getAltitude();
        StringBuilder r3 = new StringBuilder();
        r3.append(r4);
        r3.append(I000IiI1O.iO.XO0O10);
        r3.append(r6);
        r3.append(I000IiI1O.iO.XO0O10);
        r3.append(r8);
        r2.put(b01.XX1Oi, r3.toString());
        return;
    L6:
        OXO1("Google Map Location Failure");
    }
}
