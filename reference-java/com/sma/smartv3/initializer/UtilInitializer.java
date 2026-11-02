package com.sma.smartv3.initializer;

import android.app.Application;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
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
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nUtilInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1011#2,2:93\n1878#2,3:95\n*S KotlinDebug\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n70#1:93,2\n71#1:95,3\n*E\n"})
public final class UtilInitializer implements InterfaceC2909s5 {

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final UtilInitializer f51279IO = new UtilInitializer();

    /* JADX INFO: renamed from: I1 */
    public static final int f51278I1 = 240;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n1#1,328:1\n70#2:329\n*E\n"})
    public static final class OXO1<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            File file = (File) t;
            UtilInitializer utilInitializer = UtilInitializer.f51279IO;
            Intrinsics.XXI(file);
            Long lValueOf = Long.valueOf(-utilInitializer.m38234iO(file));
            File file2 = (File) t2;
            Intrinsics.XXI(file2);
            return ComparisonsKt__ComparisonsKt.I0iXXO(lValueOf, Long.valueOf(-utilInitializer.m38234iO(file2)));
        }
    }

    public static /* synthetic */ void IiI10X(UtilInitializer utilInitializer, File file, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = f51278I1;
        }
        utilInitializer.O00(file, i);
    }

    public final void O00(File file, int i) {
        long[] jArrOiIIX101O = O0X11OiO.OiIIX101O(i);
        List<File> listListFilesInDir = FileUtils.listFilesInDir(file);
        Intrinsics.XXI(listListFilesInDir);
        if (listListFilesInDir.size() > 1) {
            XiX0OOXI0.XOXiX0(listListFilesInDir, new OXO1());
        }
        Intrinsics.O10IXXX0X(listListFilesInDir, "apply(...)");
        int i2 = 0;
        for (Object obj : listListFilesInDir) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            File file2 = (File) obj;
            UtilInitializer utilInitializer = f51279IO;
            Intrinsics.XXI(file2);
            long jM38234iO = utilInitializer.m38234iO(file2);
            if (jM38234iO < jArrOiIIX101O[0] || jM38234iO > jArrOiIIX101O[1]) {
                FileUtils.delete(file2);
            }
            i2 = i3;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2909s5
    public void OXO1(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        Utils.init(app);
        LogUtils.Config config = LogUtils.getConfig();
        a01 a01Var = a01.OXO1;
        config.setLogSwitch(a01Var.IiI10X().getBoolean(b01.iOO1ii1, false));
        config.setGlobalTag("TAAG");
        config.setLog2FileSwitch(true);
        config.setDir(uz0.OX110i(sz0.OXO1));
        if (a01Var.OXO1().getBoolean(b01.OIX0iXi, false)) {
            LogUtils.m11128d("UtilInitializer initialize");
            XOO0ii0(new Object());
        }
    }

    public final int XO0O10() {
        return f51278I1;
    }

    @sf5(tag = b01.OIX0iXi)
    public final void XOO0ii0(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onPrivacyAgree");
        CrashUtils.init(uz0.X0O(sz0.OXO1));
        XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new UtilInitializer$onPrivacyAgree$1(null), 3, null);
    }

    /* JADX INFO: renamed from: iO */
    public final long m38234iO(File file) {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(file.getName());
            Intrinsics.XXI(date);
            return date.getTime();
        } catch (Exception unused) {
            return file.lastModified();
        }
    }
}
