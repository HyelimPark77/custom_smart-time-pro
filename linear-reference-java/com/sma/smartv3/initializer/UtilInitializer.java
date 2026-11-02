package com.sma.smartv3.initializer;

import android.app.Application;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.s5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.CrashUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nUtilInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1011#2,2:93\n1878#2,3:95\n*S KotlinDebug\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n70#1:93,2\n71#1:95,3\n*E\n"})
public final class UtilInitializer implements s5 {
    public static final int I1 = 0;

    @aa1
    public static final UtilInitializer IO = null;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n1#1,328:1\n70#2:329\n*E\n"})
    public static final class OXO1<T> implements Comparator {
        public OXO1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T r4, T r5) {
            File r6 = (File) r4;
            UtilInitializer r0 = UtilInitializer.IO;
            Intrinsics.XXI(r6);
            Long r7 = Long.valueOf(-UtilInitializer.XIi00iiXO(r0, r6));
            File r8 = (File) r5;
            Intrinsics.XXI(r8);
            return ComparisonsKt__ComparisonsKt.I0iXXO(r7, Long.valueOf(-UtilInitializer.XIi00iiXO(r0, r8)));
        }
    }

    static {
        IO = new UtilInitializer();
        I1 = 240;
    }

    public UtilInitializer() {
    }

    public static /* synthetic */ void IiI10X(UtilInitializer r0, File r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = I1;
    L5:
        r0.O00(r1, r2);
    }

    public static final /* synthetic */ long XIi00iiXO(UtilInitializer r0, File r1) {
        return r0.iO(r1);
    }

    public final void O00(File r10, int r11) {
        long[] r12 = O0X11OiO.OiIIX101O(r11);
        List<File> r13 = FileUtils.listFilesInDir(r10);
        Intrinsics.XXI(r13);
        if (r13.size() <= 1) goto L5;
        XiX0OOXI0.XOXiX0(r13, new OXO1());
    L5:
        Intrinsics.O10IXXX0X(r13, "apply(...)");
        Iterator<T> r14 = r13.iterator();
        int r2 = 0;
    L7:
        if (r14.hasNext() == false) goto L17;
        Object r3 = r14.next();
        int r4 = r2 + 1;
        if (r2 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        File r5 = (File) r3;
        UtilInitializer r6 = IO;
        Intrinsics.XXI(r5);
        long r7 = r6.iO(r5);
        if (r7 >= r12[0]) goto L14;
    L15:
        FileUtils.delete(r5);
    L16:
        r2 = r4;
        goto L7
    L14:
        if (r7 <= r12[1]) goto L16;
    }

    @Override // com.android.mltcode.paycertificationapi.s5
    public void OXO1(@aa1 Application r5) {
        Intrinsics.X0O(r5, "app");
        Utils.init(r5);
        LogUtils.Config r6 = LogUtils.getConfig();
        a01 r0 = a01.OXO1;
        r6.setLogSwitch(r0.IiI10X().getBoolean(b01.iOO1ii1, false));
        r6.setGlobalTag("TAAG");
        r6.setLog2FileSwitch(true);
        r6.setDir(uz0.OX110i(sz0.OXO1));
        if (r0.OXO1().getBoolean(b01.OIX0iXi, false) == false) goto L6;
        LogUtils.d(new Object[]{"UtilInitializer initialize"});
        XOO0ii0(new Object());
        return;
    }

    public final int XO0O10() {
        return I1;
    }

    @sf5(tag = b01.OIX0iXi)
    public final void XOO0ii0(@aa1 Object r7) {
        Intrinsics.X0O(r7, "data");
        LogUtils.v(new Object[]{"onPrivacyAgree"});
        CrashUtils.init(uz0.X0O(sz0.OXO1));
        I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new UtilInitializer$onPrivacyAgree$1(null), 3, null);
    }

    public final long iO(File r4) {
        Date r0 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(r4.getName());     // Catch: Exception -> L4
        Intrinsics.XXI(r0);     // Catch: Exception -> L4
        return r0.getTime();
    L5:
        return r4.lastModified();
    }
}
