package com.sma.smartv3.ui.sport;

import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ey5;
import com.android.mltcode.paycertificationapi.fy5;
import com.android.mltcode.paycertificationapi.gy5;
import com.android.mltcode.paycertificationapi.hy5;
import com.android.mltcode.paycertificationapi.iy5;
import com.android.mltcode.paycertificationapi.jy5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.gms.maps.model.LatLng;
import com.sma.smartv3.model.CustomLatLng;
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
    public boolean IO;
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
    public final int iO;

    public interface OXO1 {
        void OXO1(@aa1 ArrayList<LatLng> r1, float r2);

        void XIi00iiXO();

        void XO0O10(@aa1 ArrayList<com.baidu.mapapi.model.LatLng> r1, float r2, int r3);

        void iO(float r1);

        void onStart();
    }

    public static final enum SourceType extends Enum<SourceType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ SourceType[] $VALUES = null;
        public static final SourceType BAIDU = null;
        public static final SourceType GOOGLE = null;

        private static final /* synthetic */ SourceType[] $values() {
            return new SourceType[]{BAIDU, GOOGLE};
        }

        static {
            BAIDU = new SourceType("BAIDU", 0);
            GOOGLE = new SourceType("GOOGLE", 1);
            SourceType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private SourceType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<SourceType> getEntries() {
            return $ENTRIES;
        }

        public static SourceType valueOf(String r1) {
            return (SourceType) Enum.valueOf(SourceType.class, r1);
        }

        public static SourceType[] values() {
            return (SourceType[]) $VALUES.clone();
        }
    }

    public TrackPlay(@aa1 OXO1 r3) {
        Intrinsics.X0O(r3, "onPlayListener");
        this.OXO1 = "TrackPlay";
        this.XIi00iiXO = 1.0E-4d;
        this.iO = 30;
        this.XO0O10 = 30000;
        this.IiI10X = 30;
        this.XOO0ii0 = SourceType.BAIDU;
        this.I0IIOi = new ArrayList();
        this.OIX0iXi = new ArrayList();
        this.I0iXXO = new Handler(Looper.getMainLooper());
        this.OIi0 = r3;
    }

    public static final void I1XOi1(TrackPlay r0) {
        OXO1 r1 = r0.OIi0;
        if (r1 == null) goto L6;
        r1.onStart();
        return;
    }

    public static final void IIX1OXO(final TrackPlay r8) {
        final ArrayList r0 = new ArrayList();
        final ArrayList r1 = new ArrayList();
        int r2 = r8.OIX0iXi.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L15;
        if (r8.IO == false) goto L15;
        CustomLatLng r4 = r8.OIX0iXi.get(r3);
        Intrinsics.O10IXXX0X(r4, "get(...)");
        final CustomLatLng r5 = r4;
        if (r3 == 0) goto L9;
        CustomLatLng r6 = r8.OIX0iXi.get(r3 - 1);
        Intrinsics.O10IXXX0X(r6, "get(...)");
        final CustomLatLng r7 = r6;
        r8.I0iXXO.post(new ey5(r8, r7, r5));
    L9:
        r8.I0iXXO.post(new fy5(r8, r0, r5, r1));
        Thread.sleep(r8.IiI10X);     // Catch: InterruptedException -> L12
    L14:
        r3 = r3 + 1;
    L12:
        e = move-exception;
        e.printStackTrace();
        r8.I0iXXO.post(new gy5(r8));
    L15:
        r8.I0iXXO.post(new hy5(r8));
    }

    public static /* synthetic */ void IiI10X(TrackPlay r0, CustomLatLng r1, CustomLatLng r2) {
        XiOIO(r0, r1, r2);
    }

    public static /* synthetic */ void O00(TrackPlay r0) {
        I1XOi1(r0);
    }

    public static /* synthetic */ void OXO1(TrackPlay r0, ArrayList r1, CustomLatLng r2, ArrayList r3) {
        iIiiO(r0, r1, r2, r3);
    }

    public static final void OiIIX101O(TrackPlay r2) {
        LogUtils.d(new Object[]{r2.OXO1 + " play -> stop"});     // Catch: Exception -> L7
        OXO1 r0 = r2.OIi0;     // Catch: Exception -> L7
        if (r0 == null) goto L5;
        r0.XIi00iiXO();     // Catch: Exception -> L7
    L5:
        r2.IO = false;     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
    }

    public static /* synthetic */ void XIi00iiXO(TrackPlay r0) {
        XX0(r0);
    }

    public static /* synthetic */ void XO0O10(TrackPlay r0) {
        IIX1OXO(r0);
    }

    public static final void XX0(TrackPlay r2) {
        LogUtils.d(new Object[]{r2.OXO1 + " play -> error stop"});
        OXO1 r0 = r2.OIi0;
        if (r0 == null) goto L5;
        r0.XIi00iiXO();
    L5:
        r2.IO = false;
    }

    public static final void XiOIO(TrackPlay r1, CustomLatLng r2, CustomLatLng r3) {
        OXO1 r0 = r1.OIi0;
        if (r0 == null) goto L6;
        r0.iO((float) r1.I0IIOi(r2, r3));
        return;
    }

    public static final void iIiiO(TrackPlay r4, ArrayList r5, CustomLatLng r6, ArrayList r7) {
    L12:
        e = move-exception;
        e.printStackTrace();
        return;
    L3:
        if (r4.XOO0ii0 != SourceType.BAIDU) goto L8;
        r5.add(new com.baidu.mapapi.model.LatLng(r6.getLatitude(), r6.getLongitude()));     // Catch: Exception -> L12
        OXO1 r8 = r4.OIi0;     // Catch: Exception -> L12
        if (r8 == null) goto L16;
        r8.XO0O10(r5, r5.size() / r4.OIX0iXi.size(), r6.getColor());     // Catch: Exception -> L12
        return;
    L16:
        return;
    L8:
        r7.add(new LatLng(r6.getLatitude(), r6.getLongitude()));     // Catch: Exception -> L12
        OXO1 r9 = r4.OIi0;     // Catch: Exception -> L12
        if (r9 == null) goto L17;
        r9.OXO1(r7, r7.size() / r4.OIX0iXi.size());     // Catch: Exception -> L12
        return;
    }

    public static /* synthetic */ void iO(TrackPlay r0) {
        OiIIX101O(r0);
    }

    public final double I0IIOi(CustomLatLng r8, CustomLatLng r9) {
        double r0 = I0iXXO(r8, r9);
        if (r0 != Double.MAX_VALUE) goto L10;
        if (r9.getLatitude() <= r8.getLatitude()) goto L7;
        return 0.0d;
    L7:
        return 180.0d;
    L10:
        if (r0 != 0.0d) goto L18;
        if (r9.getLongitude() <= r8.getLongitude()) goto L15;
        return -90.0d;
    L15:
        return 90.0d;
    L18:
        if (((r9.getLatitude() - r8.getLatitude()) * r0) >= 0.0d) goto L20;
        float r10 = 180.0f;
    L22:
        return ((((double) 180) * (Math.atan(r0) / 3.141592653589793d)) + ((double) r10)) - ((double) 90);
    L20:
        r10 = 0.0f;
        goto L22
    }

    public final double I0iXXO(CustomLatLng r5, CustomLatLng r6) {
        if (r6.getLongitude() != r5.getLongitude()) goto L7;
        return Double.MAX_VALUE;
    L7:
        return (r6.getLatitude() - r5.getLatitude()) / (r6.getLongitude() - r5.getLongitude());
    }

    public final int IO() {
        return this.IiI10X;
    }

    public final boolean O10IXXX0X() {
        return this.IO;
    }

    public final void OII(@aa1 ArrayList<CustomLatLng> r2, @aa1 SourceType r3) {
        Intrinsics.X0O(r2, "source");
        Intrinsics.X0O(r3, "type");
        this.XOO0ii0 = r3;
        this.I0IIOi.clear();
        this.I0IIOi.addAll(r2);
        this.OIX0iXi.clear();
        this.OIX0iXi.addAll(XOO0ii0(this.I0IIOi));
    }

    public final int OIX0iXi() {
        return this.OIX0iXi.size();
    }

    public final double OIi0(double r5, CustomLatLng r7) {
        return r7.getLatitude() - (r5 * r7.getLongitude());
    }

    public final void OX() {
        this.IO = false;
    }

    public final void X0O() {
        this.IO = true;
        int r0 = this.O00;
        int r1 = this.XO0O10;
        if (r0 <= r1) goto L6;
        this.IiI10X = r1 / this.OIX0iXi.size();
    L6:
        if (this.IiI10X >= 5) goto L8;
        this.IiI10X = 5;
    L8:
        LogUtils.d(new Object[]{this.OXO1 + " play -> start ss:" + this.I0IIOi.size() + " fs:" + this.OIX0iXi.size() + " st:" + this.XOO0ii0 + " pt:" + this.O00 + " it:" + this.IiI10X});
        this.I0iXXO.post(new iy5(this));
        new Thread(new jy5(this)).start();
    }

    public final double X1ii(double r5) {
        if (r5 == Double.MAX_VALUE) goto L8;
        if (r5 == 0.0d) goto L8;
        return Math.abs((this.XIi00iiXO * r5) / Math.sqrt(((double) 1) + (r5 * r5)));
    L8:
        return this.XIi00iiXO;
    }

    public final ArrayList<CustomLatLng> XOO0ii0(ArrayList<CustomLatLng> r39) {
        int r2 = r39.size() * this.iO;
        this.O00 = r2;
        if (r2 <= this.XO0O10) goto L5;
        return r39;
    L5:
        ArrayList<CustomLatLng> r3 = new ArrayList();
        boolean r4 = true;
        int r5 = r39.size() - 1;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L50;
        CustomLatLng r7 = r39.get(r6);
        Intrinsics.O10IXXX0X(r7, "get(...)");
        CustomLatLng r8 = r7;
        r6 = r6 + 1;
        CustomLatLng r9 = r39.get(r6);
        Intrinsics.O10IXXX0X(r9, "get(...)");
        CustomLatLng r10 = r9;
        double r11 = I0iXXO(r8, r10);
        if (r8.getLatitude() <= r10.getLatitude()) goto L10;
        boolean r12 = r4;
    L12:
        if (r8.getLongitude() <= r10.getLongitude()) goto L14;
        boolean r13 = r4;
    L15:
        double r14 = OIi0(r11, r8);
        if (r13 == false) goto L18;
        double r15 = XXI(r11);
    L19:
        if (r12 == false) goto L21;
        double r16 = X1ii(r11);
    L22:
        double r21 = r8.getLatitude();
        double r26 = r21;
        double r28 = r8.getLongitude();
    L24:
        if (r26 <= r10.getLatitude()) goto L26;
        boolean r17 = true;
    L28:
        if ((r17 ^ r12) == true) goto L49;
        if (r28 <= r10.getLongitude()) goto L32;
        boolean r18 = true;
    L34:
        if ((r18 ^ r13) == true) goto L49;
        if (r11 != Double.MAX_VALUE) goto L39;
        CustomLatLng r25 = new CustomLatLng(r26, r28, 0, 0, 0, 28, null);
        r26 = r26 - r16;
    L38:
        CustomLatLng r19 = r25;
        if (r19.getLatitude() != 0.0d) goto L48;
        if (r19.getLongitude() == 0.0d) goto L24;
    L48:
        r19.setColor(r8.getColor());
        r3.add(r19);
        goto L24
    L39:
        double r23 = r28;
        if (r11 != 0.0d) goto L42;
        r28 = r23 - r15;
        r25 = new CustomLatLng(r26, r28, 0, 0, 0, 28, null);
        goto L38
    L42:
        r25 = new CustomLatLng(r26, (r26 - r14) / r11, 0, 0, 0, 28, null);
        r26 = r26 - r16;
        r28 = r23;
        goto L38
    L32:
        r18 = false;
    L49:
        r5 = r5;
        r4 = true;
        goto L6
    L26:
        r17 = false;
        goto L28
    L21:
        r16 = ((double) (-1)) * X1ii(r11);
        goto L22
    L18:
        r15 = ((double) (-1)) * XXI(r11);
        goto L19
    L14:
        r13 = false;
        goto L15
    L10:
        r12 = false;
        goto L12
    L50:
        this.O00 = r3.size() * this.iO;
        return r3;
    }

    public final double XXI(double r5) {
        if (r5 == Double.MAX_VALUE) goto L8;
        if (r5 == 0.0d) goto L8;
        double r2 = 1;
        return Math.abs(((this.XIi00iiXO * r2) / r5) / Math.sqrt(r2 + (r2 / (r5 * r5))));
    L8:
        return this.XIi00iiXO;
    }

    public final void XiOIii1(int r1) {
        this.IiI10X = r1;
    }
}
