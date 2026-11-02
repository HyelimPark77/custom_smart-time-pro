package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.mc0;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.pro.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLocationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1563#2:240\n1634#2,3:241\n1563#2:244\n1634#2,3:245\n1563#2:248\n1634#2,3:249\n*S KotlinDebug\n*F\n+ 1 LocationData.kt\ncom/sma/smartv3/model/LocationData\n*L\n60#1:240\n60#1:241,3\n74#1:244\n74#1:245,3\n85#1:248\n85#1:249,3\n*E\n"})
public final class LocationData {

    @aa1
    public static final LocationData INSTANCE = null;

    static {
        INSTANCE = new LocationData();
    }

    private LocationData() {
    }

    public static /* synthetic */ ArrayList getFinalLocationList$default(LocationData r0, List r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return r0.getFinalLocationList(r1, r2, r3);
    }

    public static /* synthetic */ ArrayList getSmoothLocationListAlgorithm$default(LocationData r0, ArrayList r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 7;
    L6:
        return r0.getSmoothLocationListAlgorithm(r1, r2);
    }

    @aa1
    public final ArrayList<CustomLatLng> getFinalLocationList(@aa1 List<Location> r18, boolean r19, boolean r20) {
        Intrinsics.X0O(r18, "locationList");
        ArrayList<CustomLatLng> r1 = new ArrayList();
        if (r18.isEmpty() == false) goto L5;
    L35:
        return r1;
    L5:
        if (r18.size() < 2) goto L35;
        if (r19 == false) goto L23;
        Iterator<Location> r3 = r18.iterator();
    L10:
        if (r3.hasNext() == false) goto L19;
        if (r3.next().getMSource() != 1) goto L10;
        List<Location> r0 = r18;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L15:
        if (r2.hasNext() == false) goto L17;
        Location r5 = (Location) r2.next();
        r4.add(new CustomLatLng(r5.getMLatitude(), r5.getMLongitude(), r5.getMTime(), r5.getMAltitude(), 0, 16, null));
        goto L15
    L17:
        r1.addAll(r4);
        return r1;
    L19:
        CoordinateConverter r6 = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
        Iterator<Location> r7 = r18.iterator();
    L21:
        if (r7.hasNext() == false) goto L35;
        Location r8 = r7.next();
        LatLng r9 = r6.coord(new LatLng(r8.getMLatitude(), r8.getMLongitude())).convert();
        r1.add(new CustomLatLng(r9.latitude, r9.longitude, r8.getMTime(), r8.getMAltitude(), 0, 16, null));
        goto L21
    L23:
        if (r20 == false) goto L30;
        List<Location> r10 = r18;
        ArrayList r11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r10, 10));
        Iterator<T> r12 = r10.iterator();
    L26:
        if (r12.hasNext() == false) goto L28;
        Location r13 = (Location) r12.next();
        Pair<Double, Double> r14 = i01I1i1X.OXO1.OIi0(r13.getMLatitude(), r13.getMLongitude());
        r11.add(new CustomLatLng(r14.component1().doubleValue(), r14.component2().doubleValue(), r13.getMTime(), r13.getMAltitude(), 0, 16, null));
        goto L26
    L28:
        r1.addAll(r11);
        return r1;
    L30:
        List<Location> r15 = r18;
        ArrayList r16 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r15, 10));
        Iterator<T> r17 = r15.iterator();
    L32:
        if (r17.hasNext() == false) goto L34;
        Location r21 = (Location) r17.next();
        r16.add(new CustomLatLng(r21.getMLatitude(), r21.getMLongitude(), r21.getMTime(), r21.getMAltitude(), 0, 16, null));
        goto L32
    L34:
        r1.addAll(r16);
        goto L35
    }

    @aa1
    public final String getGpxFileString(@aa1 ArrayList<CustomLatLng> r9, long r10, @aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r9, "locationList");
        Intrinsics.X0O(r12, "creator");
        Intrinsics.X0O(r13, "title");
        SimpleDateFormat r0 = O0X11OiO.OIX0iXi();
        int r1 = TimeZone.getDefault().getRawOffset();
        StringBuilder r2 = new StringBuilder();
        r2.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator='");
        r2.append(r12);
        r2.append("' version=\"1.1\" xmlns='http://www.topografix.com/GPX/1/1'><metadata><time>");
        long r3 = r1;
        r2.append(r0.format(Long.valueOf(r10 - r3)));
        r2.append("</time></metadata>");
        StringBuilder r11 = new StringBuilder();
        r11.append("<trk><name>");
        r11.append(r13);
        r11.append("</name><desc>");
        r11.append(Utils.getApp().getString(R.string.app_name));
        r11.append("</desc><trkseg>");
        int r14 = r9.size();
        int r15 = 0;
    L3:
        if (r15 >= r14) goto L5;
        CustomLatLng r16 = r9.get(r15);
        Intrinsics.O10IXXX0X(r16, "get(...)");
        CustomLatLng r17 = r16;
        r2.append("<wpt lat='");
        r2.append(r17.getLatitude());
        r2.append("' lon='");
        r2.append(r17.getLongitude());
        r2.append("'><name>\"");
        r15 = r15 + 1;
        r2.append(r15);
        r2.append("\"</name><ele>");
        r2.append(r17.getAltitude());
        r2.append("</ele><time>");
        r2.append(r0.format(Long.valueOf(r17.getTime() - r3)));
        r2.append("</time></wpt>");
        r11.append("<trkpt lat='");
        r11.append(r17.getLatitude());
        r11.append("' lon='");
        r11.append(r17.getLongitude());
        r11.append("'><ele>");
        r11.append(r17.getAltitude());
        r11.append("</ele><time>");
        r11.append(r0.format(Long.valueOf(r17.getTime() - r3)));
        r11.append("</time></trkpt>");
        goto L3
    L5:
        r11.append("</trkseg></trk>");
        r2.append(r11.toString());
        r2.append("</gpx>");
        String r18 = r2.toString();
        Intrinsics.O10IXXX0X(r18, "toString(...)");
        return r18;
    }

    @aa1
    public final ArrayList<CustomLatLng> getSmoothLocationListAlgorithm(@aa1 ArrayList<CustomLatLng> r24, int r25) {
        Intrinsics.X0O(r24, "locationList");
        int r4 = 5;
        if (r25 != 12) goto L5;
    L11:
        int r1 = 100;
    L12:
        ArrayList<CustomLatLng> r2 = new ArrayList();
        CustomLatLng r5 = new CustomLatLng(r24.get(0).getLatitude(), r24.get(0).getLongitude(), r24.get(0).getTime(), r24.get(0).getAltitude(), 0, 16, null);
        CustomLatLng r6 = new CustomLatLng(0.0d, 0.0d, 0, 0, 0, 16, null);
        int r7 = r24.size();
        int r8 = 0;
    L13:
        if (r8 >= r7) goto L28;
        CustomLatLng r9 = r24.get(r8);
        Intrinsics.O10IXXX0X(r9, "get(...)");
        CustomLatLng r10 = r9;
        if (r10.getLatitude() == r6.getLatitude()) goto L17;
    L20:
        float r11 = (mc0.iIi1(DistanceUtil.getDistance(new LatLng(r5.getLatitude(), r5.getLongitude()), new LatLng(r10.getLatitude(), r10.getLongitude())) * ((double) 100)) / 100.0f) / (Math.abs(r10.getTime() - r5.getTime()) / ((long) 1000));
        if (r11 >= r4) goto L23;
        r6.setLatitude(0.0d);
        r6.setLongitude(0.0d);
        r6.setTime(0);
        r6.setAltitude(0);
    L27:
        r5.setLatitude(r10.getLatitude());
        r5.setLongitude(r10.getLongitude());
        r5.setTime(r10.getTime());
        r5.setAltitude(r10.getAltitude());
        r2.add(new CustomLatLng(r10.getLatitude(), r10.getLongitude(), r10.getTime(), r10.getAltitude(), 0, 16, null));
        r8 = r8 + 1;
        goto L13
    L23:
        if (r11 < r1) goto L25;
        r10.setLongitude(r5.getLongitude());
        r10.setLatitude(r5.getLatitude());
        goto L27
    L25:
        r6.setLatitude(r10.getLatitude());
        r6.setLongitude(r10.getLongitude());
        r6.setTime(r10.getTime());
        r6.setAltitude(r10.getAltitude());
        double r12 = 2;
        r10.setLongitude((r5.getLongitude() + r10.getLongitude()) / r12);
        r10.setLatitude((r5.getLatitude() + r10.getLatitude()) / r12);
        goto L27
    L17:
        if (r10.getLongitude() != r6.getLongitude()) goto L20;
        r10.setLongitude(r5.getLongitude());
        r10.setLatitude(r5.getLatitude());
        goto L27
    L28:
        return r2;
    L5:
        if (r25 == 13) goto L11;
        if (r25 == 19) goto L11;
        switch(r25) {
            case 7: goto L11;
            case 8: goto L11;
            case 9: goto L11;
            case 10: goto L10;
            default: goto L9;
        };
    L9:
        r1 = 11;
        goto L12
    L10:
        r4 = 10;
        goto L11
    }
}
