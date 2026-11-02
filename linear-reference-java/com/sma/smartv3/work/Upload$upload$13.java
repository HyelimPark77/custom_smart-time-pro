package com.sma.smartv3.work;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.p96;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDataWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataWorker.kt\ncom/sma/smartv3/work/Upload$upload$13\n*L\n1#1,965:1\n*E\n"})
public final class Upload$upload$13 implements O1XIiIO<Object> {
    public final /* synthetic */ p96<T> OXO1;
    public final /* synthetic */ List<T> XIi00iiXO;

    /* JADX WARN: Multi-variable type inference failed */
    public Upload$upload$13(p96<T> r1, List<? extends T> r2) {
        this.OXO1 = r1;
        this.XIi00iiXO = r2;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(String r3) {
        Intrinsics.X0O(r3, "error");
        LogUtils.d(new Object[]{"activity " + r3});
        ((ArrayList) this.XIi00iiXO).clear();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleResponse(Object r2) {
        OXO1((ArrayList<T>) ((ArrayList) this.XIi00iiXO));
        ((ArrayList) this.XIi00iiXO).clear();
        ((ArrayList) this.XIi00iiXO).addAll(getList());
    }
}
