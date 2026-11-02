package com.sma.smartv3.p610ui.sport;

import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.maps.model.LatLng;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.p610ui.sport.TrackPlay;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackPlay {

    @aa1
    public final ArrayList<CustomLatLng> I0IIOi;

    @aa1
    public final Handler I0iXXO;

    /* JADX INFO: renamed from: IO */
    public boolean f54777IO;
    public int IiI10X;
    public int O00;

    @aa1
    public final ArrayList<CustomLatLng> OIX0iXi;

    @tb1
    public OXO1 OIi0;

    @aa1
    public final String OXO1;
    public final double XIi00iiXO;
    public int XO0O10;

    @aa1
    public SourceType XOO0ii0;

    /* JADX INFO: renamed from: iO */
    public final int f54778iO;

    public interface OXO1 {
        void OXO1(@aa1 ArrayList<LatLng> arrayList, float f);

        void XIi00iiXO();

        void XO0O10(@aa1 ArrayList<com.baidu.mapapi.model.LatLng> arrayList, float f, int i);

        /* JADX INFO: renamed from: iO */
        void mo38626iO(float f);

        void onStart();
    }

    public enum SourceType {
        BAIDU,
        GOOGLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<SourceType> getEntries() {
            return $ENTRIES;
        }
    }

    public TrackPlay(@aa1 OXO1 onPlayListener) {
        Intrinsics.X0O(onPlayListener, "onPlayListener");
        this.OXO1 = "TrackPlay";
        this.XIi00iiXO = 1.0E-4d;
        this.f54778iO = 30;
        this.XO0O10 = 30000;
        this.IiI10X = 30;
        this.XOO0ii0 = SourceType.BAIDU;
        this.I0IIOi = new ArrayList<>();
        this.OIX0iXi = new ArrayList<>();
        this.I0iXXO = new Handler(Looper.getMainLooper());
        this.OIi0 = onPlayListener;
    }

    public static final void I1XOi1(TrackPlay trackPlay) {
        OXO1 oxo1 = trackPlay.OIi0;
        if (oxo1 != null) {
            oxo1.onStart();
        }
    }

    public static final void IIX1OXO(final TrackPlay trackPlay) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size = trackPlay.OIX0iXi.size();
        for (int i = 0; i < size && trackPlay.f54777IO; i++) {
            CustomLatLng customLatLng = trackPlay.OIX0iXi.get(i);
            Intrinsics.O10IXXX0X(customLatLng, "get(...)");
            final CustomLatLng customLatLng2 = customLatLng;
            if (i != 0) {
                CustomLatLng customLatLng3 = trackPlay.OIX0iXi.get(i - 1);
                Intrinsics.O10IXXX0X(customLatLng3, "get(...)");
                final CustomLatLng customLatLng4 = customLatLng3;
                trackPlay.I0iXXO.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ey5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrackPlay.XiOIO(this.f6523IO, customLatLng4, customLatLng2);
                    }
                });
            }
            trackPlay.I0iXXO.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.fy5
                @Override // java.lang.Runnable
                public final void run() {
                    TrackPlay.iIiiO(this.f6768IO, arrayList, customLatLng2, arrayList2);
                }
            });
            try {
                Thread.sleep(trackPlay.IiI10X);
            } catch (InterruptedException e) {
                e.printStackTrace();
                trackPlay.I0iXXO.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gy5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrackPlay.XX0(this.f6994IO);
                    }
                });
            }
        }
        trackPlay.I0iXXO.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.hy5
            @Override // java.lang.Runnable
            public final void run() {
                TrackPlay.OiIIX101O(this.f7240IO);
            }
        });
    }

    public static final void OiIIX101O(TrackPlay trackPlay) {
        try {
            LogUtils.m11128d(trackPlay.OXO1 + " play -> stop");
            OXO1 oxo1 = trackPlay.OIi0;
            if (oxo1 != null) {
                oxo1.XIi00iiXO();
            }
            trackPlay.f54777IO = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void XX0(TrackPlay trackPlay) {
        LogUtils.m11128d(trackPlay.OXO1 + " play -> error stop");
        OXO1 oxo1 = trackPlay.OIi0;
        if (oxo1 != null) {
            oxo1.XIi00iiXO();
        }
        trackPlay.f54777IO = false;
    }

    public static final void XiOIO(TrackPlay trackPlay, CustomLatLng customLatLng, CustomLatLng customLatLng2) {
        OXO1 oxo1 = trackPlay.OIi0;
        if (oxo1 != null) {
            oxo1.mo38626iO((float) trackPlay.I0IIOi(customLatLng, customLatLng2));
        }
    }

    public static final void iIiiO(TrackPlay trackPlay, ArrayList arrayList, CustomLatLng customLatLng, ArrayList arrayList2) {
        try {
            if (trackPlay.XOO0ii0 == SourceType.BAIDU) {
                arrayList.add(new com.baidu.mapapi.model.LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
                OXO1 oxo1 = trackPlay.OIi0;
                if (oxo1 != null) {
                    oxo1.XO0O10(arrayList, arrayList.size() / trackPlay.OIX0iXi.size(), customLatLng.getColor());
                    return;
                }
                return;
            }
            arrayList2.add(new LatLng(customLatLng.getLatitude(), customLatLng.getLongitude()));
            OXO1 oxo2 = trackPlay.OIi0;
            if (oxo2 != null) {
                oxo2.OXO1(arrayList2, arrayList2.size() / trackPlay.OIX0iXi.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final double I0IIOi(CustomLatLng customLatLng, CustomLatLng customLatLng2) {
        double dI0iXXO = I0iXXO(customLatLng, customLatLng2);
        if (dI0iXXO == Double.MAX_VALUE) {
            return customLatLng2.getLatitude() > customLatLng.getLatitude() ? 0.0d : 180.0d;
        }
        if (dI0iXXO == 0.0d) {
            return customLatLng2.getLongitude() > customLatLng.getLongitude() ? -90.0d : 90.0d;
        }
        return ((((double) 180) * (Math.atan(dI0iXXO) / 3.141592653589793d)) + ((double) ((customLatLng2.getLatitude() - customLatLng.getLatitude()) * dI0iXXO < 0.0d ? 180.0f : 0.0f))) - ((double) 90);
    }

    public final double I0iXXO(CustomLatLng customLatLng, CustomLatLng customLatLng2) {
        if (customLatLng2.getLongitude() == customLatLng.getLongitude()) {
            return Double.MAX_VALUE;
        }
        return (customLatLng2.getLatitude() - customLatLng.getLatitude()) / (customLatLng2.getLongitude() - customLatLng.getLongitude());
    }

    /* JADX INFO: renamed from: IO */
    public final int m38650IO() {
        return this.IiI10X;
    }

    public final boolean O10IXXX0X() {
        return this.f54777IO;
    }

    public final void OII(@aa1 ArrayList<CustomLatLng> source, @aa1 SourceType type) {
        Intrinsics.X0O(source, "source");
        Intrinsics.X0O(type, "type");
        this.XOO0ii0 = type;
        this.I0IIOi.clear();
        this.I0IIOi.addAll(source);
        this.OIX0iXi.clear();
        this.OIX0iXi.addAll(XOO0ii0(this.I0IIOi));
    }

    public final int OIX0iXi() {
        return this.OIX0iXi.size();
    }

    public final double OIi0(double d, CustomLatLng customLatLng) {
        return customLatLng.getLatitude() - (d * customLatLng.getLongitude());
    }

    /* JADX INFO: renamed from: OX */
    public final void m38651OX() {
        this.f54777IO = false;
    }

    public final void X0O() {
        this.f54777IO = true;
        int i = this.O00;
        int i2 = this.XO0O10;
        if (i > i2) {
            this.IiI10X = i2 / this.OIX0iXi.size();
        }
        if (this.IiI10X < 5) {
            this.IiI10X = 5;
        }
        LogUtils.m11128d(this.OXO1 + " play -> start ss:" + this.I0IIOi.size() + " fs:" + this.OIX0iXi.size() + " st:" + this.XOO0ii0 + " pt:" + this.O00 + " it:" + this.IiI10X);
        this.I0iXXO.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iy5
            @Override // java.lang.Runnable
            public final void run() {
                TrackPlay.I1XOi1(this.f8796IO);
            }
        });
        new Thread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.jy5
            @Override // java.lang.Runnable
            public final void run() {
                TrackPlay.IIX1OXO(this.f9071IO);
            }
        }).start();
    }

    public final double X1ii(double d) {
        return (d == Double.MAX_VALUE || d == 0.0d) ? this.XIi00iiXO : Math.abs((this.XIi00iiXO * d) / Math.sqrt(((double) 1) + (d * d)));
    }

    public final ArrayList<CustomLatLng> XOO0ii0(ArrayList<CustomLatLng> arrayList) {
        CustomLatLng customLatLng;
        int size = arrayList.size() * this.f54778iO;
        this.O00 = size;
        if (size > this.XO0O10) {
            return arrayList;
        }
        ArrayList<CustomLatLng> arrayList2 = new ArrayList<>();
        boolean z = true;
        int size2 = arrayList.size() - 1;
        int i = 0;
        while (i < size2) {
            CustomLatLng customLatLng2 = arrayList.get(i);
            Intrinsics.O10IXXX0X(customLatLng2, "get(...)");
            CustomLatLng customLatLng3 = customLatLng2;
            i++;
            CustomLatLng customLatLng4 = arrayList.get(i);
            Intrinsics.O10IXXX0X(customLatLng4, "get(...)");
            CustomLatLng customLatLng5 = customLatLng4;
            double dI0iXXO = I0iXXO(customLatLng3, customLatLng5);
            boolean z2 = customLatLng3.getLatitude() > customLatLng5.getLatitude() ? z : false;
            boolean z3 = customLatLng3.getLongitude() > customLatLng5.getLongitude() ? z : false;
            double dOIi0 = OIi0(dI0iXXO, customLatLng3);
            double dXXI = z3 ? XXI(dI0iXXO) : ((double) (-1)) * XXI(dI0iXXO);
            double dX1ii = z2 ? X1ii(dI0iXXO) : ((double) (-1)) * X1ii(dI0iXXO);
            double latitude = customLatLng3.getLatitude();
            double longitude = customLatLng3.getLongitude();
            while (true) {
                if (!((latitude > customLatLng5.getLatitude()) ^ z2)) {
                    if ((longitude > customLatLng5.getLongitude()) ^ z3) {
                        break;
                    }
                    if (dI0iXXO == Double.MAX_VALUE) {
                        customLatLng = new CustomLatLng(latitude, longitude, 0L, 0, 0, 28, null);
                        latitude -= dX1ii;
                    } else {
                        double d = longitude;
                        if (dI0iXXO == 0.0d) {
                            longitude = d - dXXI;
                            customLatLng = new CustomLatLng(latitude, longitude, 0L, 0, 0, 28, null);
                        } else {
                            customLatLng = new CustomLatLng(latitude, (latitude - dOIi0) / dI0iXXO, 0L, 0, 0, 28, null);
                            latitude -= dX1ii;
                            longitude = d;
                        }
                    }
                    CustomLatLng customLatLng6 = customLatLng;
                    if (customLatLng6.getLatitude() != 0.0d || customLatLng6.getLongitude() != 0.0d) {
                        customLatLng6.setColor(customLatLng3.getColor());
                        arrayList2.add(customLatLng6);
                    }
                } else {
                    break;
                }
            }
            size2 = size2;
            z = true;
        }
        this.O00 = arrayList2.size() * this.f54778iO;
        return arrayList2;
    }

    public final double XXI(double d) {
        if (d == Double.MAX_VALUE || d == 0.0d) {
            return this.XIi00iiXO;
        }
        double d2 = 1;
        return Math.abs(((this.XIi00iiXO * d2) / d) / Math.sqrt(d2 + (d2 / (d * d))));
    }

    public final void XiOIii1(int i) {
        this.IiI10X = i;
    }
}
