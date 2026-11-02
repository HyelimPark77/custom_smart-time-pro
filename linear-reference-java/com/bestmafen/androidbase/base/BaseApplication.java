package com.bestmafen.androidbase.base;

import android.app.Application;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.s5;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class BaseApplication extends Application {

    @aa1
    public static final OXO1 I1 = null;

    @aa1
    public static final LinkedBlockingQueue<List<Object>> iX1O1 = null;

    @aa1
    public final Set<s5> IO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final LinkedBlockingQueue<List<Object>> OXO1() {
            return BaseApplication.OXO1();
        }

        public OXO1() {
        }
    }

    static {
        I1 = new OXO1(null);
        iX1O1 = new LinkedBlockingQueue();
    }

    public BaseApplication() {
        this.IO = new LinkedHashSet();
    }

    public static final /* synthetic */ LinkedBlockingQueue OXO1() {
        return iX1O1;
    }

    public final void XIi00iiXO() {
        iO(this.IO);
        Iterator<s5> r0 = this.IO.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().OXO1(this);
        goto L4
    }

    public void iO(@aa1 Set<s5> r2) {
        Intrinsics.X0O(r2, "initInitializers");
    }

    @Override // android.app.Application
    @CallSuper
    public void onCreate() {
        super.onCreate();
        XIi00iiXO();
    }
}
