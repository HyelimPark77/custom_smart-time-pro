package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i01I1i1X;
import com.android.mltcode.paycertificationapi.mc0;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.DistanceUtil;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.p608db.entity.Location;
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
    public static final LocationData INSTANCE = new LocationData();

    private LocationData() {
    }

    public static /* synthetic */ ArrayList getFinalLocationList$default(LocationData locationData, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return locationData.getFinalLocationList(list, z, z2);
    }

    public static /* synthetic */ ArrayList getSmoothLocationListAlgorithm$default(LocationData locationData, ArrayList arrayList, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 7;
        }
        return locationData.getSmoothLocationListAlgorithm(arrayList, i);
    }

    @aa1
    public final ArrayList<CustomLatLng> getFinalLocationList(@aa1 List<Location> locationList, boolean z, boolean z2) {
        Intrinsics.X0O(locationList, "locationList");
        ArrayList<CustomLatLng> arrayList = new ArrayList<>();
        if (!locationList.isEmpty() && locationList.size() >= 2) {
            if (z) {
                Iterator<Location> it = locationList.iterator();
                while (it.hasNext()) {
                    if (it.next().getMSource() == 1) {
                        List<Location> list = locationList;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                        for (Location location : list) {
                            arrayList2.add(new CustomLatLng(location.getMLatitude(), location.getMLongitude(), location.getMTime(), location.getMAltitude(), 0, 16, null));
                        }
                        arrayList.addAll(arrayList2);
                        return arrayList;
                    }
                }
                CoordinateConverter coordinateConverterFrom = new CoordinateConverter().from(CoordinateConverter.CoordType.GPS);
                for (Location location2 : locationList) {
                    LatLng latLngConvert = coordinateConverterFrom.coord(new LatLng(location2.getMLatitude(), location2.getMLongitude())).convert();
                    arrayList.add(new CustomLatLng(latLngConvert.latitude, latLngConvert.longitude, location2.getMTime(), location2.getMAltitude(), 0, 16, null));
                }
            } else {
                if (z2) {
                    List<Location> list2 = locationList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    for (Location location3 : list2) {
                        Pair<Double, Double> pairOIi0 = i01I1i1X.OXO1.OIi0(location3.getMLatitude(), location3.getMLongitude());
                        arrayList3.add(new CustomLatLng(pairOIi0.component1().doubleValue(), pairOIi0.component2().doubleValue(), location3.getMTime(), location3.getMAltitude(), 0, 16, null));
                    }
                    arrayList.addAll(arrayList3);
                    return arrayList;
                }
                List<Location> list3 = locationList;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
                for (Location location4 : list3) {
                    arrayList4.add(new CustomLatLng(location4.getMLatitude(), location4.getMLongitude(), location4.getMTime(), location4.getMAltitude(), 0, 16, null));
                }
                arrayList.addAll(arrayList4);
            }
        }
        return arrayList;
    }

    @aa1
    public final String getGpxFileString(@aa1 ArrayList<CustomLatLng> locationList, long j, @aa1 String creator, @aa1 String title) {
        Intrinsics.X0O(locationList, "locationList");
        Intrinsics.X0O(creator, "creator");
        Intrinsics.X0O(title, "title");
        SimpleDateFormat simpleDateFormatOIX0iXi = O0X11OiO.OIX0iXi();
        int rawOffset = TimeZone.getDefault().getRawOffset();
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator='");
        sb.append(creator);
        sb.append("' version=\"1.1\" xmlns='http://www.topografix.com/GPX/1/1'><metadata><time>");
        long j2 = rawOffset;
        sb.append(simpleDateFormatOIX0iXi.format(Long.valueOf(j - j2)));
        sb.append("</time></metadata>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<trk><name>");
        sb2.append(title);
        sb2.append("</name><desc>");
        sb2.append(Utils.getApp().getString(R.string.app_name));
        sb2.append("</desc><trkseg>");
        int size = locationList.size();
        int i = 0;
        while (i < size) {
            CustomLatLng customLatLng = locationList.get(i);
            Intrinsics.O10IXXX0X(customLatLng, "get(...)");
            CustomLatLng customLatLng2 = customLatLng;
            sb.append("<wpt lat='");
            sb.append(customLatLng2.getLatitude());
            sb.append("' lon='");
            sb.append(customLatLng2.getLongitude());
            sb.append("'><name>\"");
            i++;
            sb.append(i);
            sb.append("\"</name><ele>");
            sb.append(customLatLng2.getAltitude());
            sb.append("</ele><time>");
            sb.append(simpleDateFormatOIX0iXi.format(Long.valueOf(customLatLng2.getTime() - j2)));
            sb.append("</time></wpt>");
            sb2.append("<trkpt lat='");
            sb2.append(customLatLng2.getLatitude());
            sb2.append("' lon='");
            sb2.append(customLatLng2.getLongitude());
            sb2.append("'><ele>");
            sb2.append(customLatLng2.getAltitude());
            sb2.append("</ele><time>");
            sb2.append(simpleDateFormatOIX0iXi.format(Long.valueOf(customLatLng2.getTime() - j2)));
            sb2.append("</time></trkpt>");
        }
        sb2.append("</trkseg></trk>");
        sb.append(sb2.toString());
        sb.append("</gpx>");
        String string = sb.toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH, PHI: r4
  0x0020: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v3 int) binds: [B:3:0x000e, B:5:0x0012, B:7:0x0016, B:8:0x0018, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @aa1
    public final ArrayList<CustomLatLng> getSmoothLocationListAlgorithm(@aa1 ArrayList<CustomLatLng> locationList, int i) {
        int i2;
        Intrinsics.X0O(locationList, "locationList");
        int i3 = 5;
        if (i != 12 && i != 13 && i != 19) {
            switch (i) {
                case 10:
                    i3 = 10;
                case 7:
                case 8:
                case 9:
                    i2 = 100;
                    break;
                default:
                    i2 = 11;
                    break;
            }
        } else {
            i2 = 100;
        }
        ArrayList<CustomLatLng> arrayList = new ArrayList<>();
        CustomLatLng customLatLng = new CustomLatLng(locationList.get(0).getLatitude(), locationList.get(0).getLongitude(), locationList.get(0).getTime(), locationList.get(0).getAltitude(), 0, 16, null);
        CustomLatLng customLatLng2 = new CustomLatLng(0.0d, 0.0d, 0L, 0, 0, 16, null);
        int size = locationList.size();
        for (int i4 = 0; i4 < size; i4++) {
            CustomLatLng customLatLng3 = locationList.get(i4);
            Intrinsics.O10IXXX0X(customLatLng3, "get(...)");
            CustomLatLng customLatLng4 = customLatLng3;
            if (customLatLng4.getLatitude() == customLatLng2.getLatitude() && customLatLng4.getLongitude() == customLatLng2.getLongitude()) {
                customLatLng4.setLongitude(customLatLng.getLongitude());
                customLatLng4.setLatitude(customLatLng.getLatitude());
            } else {
                float fIIi1 = (mc0.iIi1(DistanceUtil.getDistance(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()), new LatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude())) * ((double) 100)) / 100.0f) / (Math.abs(customLatLng4.getTime() - customLatLng.getTime()) / ((long) 1000));
                if (fIIi1 < i3) {
                    customLatLng2.setLatitude(0.0d);
                    customLatLng2.setLongitude(0.0d);
                    customLatLng2.setTime(0L);
                    customLatLng2.setAltitude(0);
                } else if (fIIi1 >= i2) {
                    customLatLng4.setLongitude(customLatLng.getLongitude());
                    customLatLng4.setLatitude(customLatLng.getLatitude());
                } else {
                    customLatLng2.setLatitude(customLatLng4.getLatitude());
                    customLatLng2.setLongitude(customLatLng4.getLongitude());
                    customLatLng2.setTime(customLatLng4.getTime());
                    customLatLng2.setAltitude(customLatLng4.getAltitude());
                    double d = 2;
                    customLatLng4.setLongitude((customLatLng.getLongitude() + customLatLng4.getLongitude()) / d);
                    customLatLng4.setLatitude((customLatLng.getLatitude() + customLatLng4.getLatitude()) / d);
                }
                customLatLng.setLatitude(customLatLng4.getLatitude());
                customLatLng.setLongitude(customLatLng4.getLongitude());
                customLatLng.setTime(customLatLng4.getTime());
                customLatLng.setAltitude(customLatLng4.getAltitude());
                arrayList.add(new CustomLatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude(), customLatLng4.getTime(), customLatLng4.getAltitude(), 0, 16, null));
            }
            customLatLng.setLatitude(customLatLng4.getLatitude());
            customLatLng.setLongitude(customLatLng4.getLongitude());
            customLatLng.setTime(customLatLng4.getTime());
            customLatLng.setAltitude(customLatLng4.getAltitude());
            arrayList.add(new CustomLatLng(customLatLng4.getLatitude(), customLatLng4.getLongitude(), customLatLng4.getTime(), customLatLng4.getAltitude(), 0, 16, null));
        }
        return arrayList;
    }
}
