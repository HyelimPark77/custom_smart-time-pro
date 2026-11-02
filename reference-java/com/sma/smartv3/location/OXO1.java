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
    public abstract void OXO1(@aa1 String str);

    public abstract void XIi00iiXO(@aa1 CustomLocation customLocation);

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(@aa1 LocationResult locationResult) {
        Intrinsics.X0O(locationResult, "locationResult");
        if (locationResult.getLocations().size() <= 0) {
            OXO1("Google Map Location Failure");
            return;
        }
        Location location = locationResult.getLocations().get(0);
        i1O0OXO1O.OXO1.OXO1("MyLocationCallback onLocationResult " + location + " ->" + location.getLatitude() + I000IiI1O.C2156iO.XO0O10 + location.getLongitude() + I000IiI1O.C2156iO.XO0O10 + location.getAltitude() + I000IiI1O.C2156iO.XO0O10 + location.getSpeed() + ", isAppForeground=" + AppUtils.isAppForeground());
        XIi00iiXO(new CustomLocation(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getSpeed(), 0, location.getTime(), null, location.getBearing(), location.getAccuracy(), location.getVerticalAccuracyMeters(), 64, null));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();
        double altitude = location.getAltitude();
        StringBuilder sb = new StringBuilder();
        sb.append(longitude);
        sb.append(I000IiI1O.C2156iO.XO0O10);
        sb.append(latitude);
        sb.append(I000IiI1O.C2156iO.XO0O10);
        sb.append(altitude);
        sPUtilsIiI10X.put(b01.XX1Oi, sb.toString());
    }
}
