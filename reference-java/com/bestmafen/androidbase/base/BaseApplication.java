package com.bestmafen.androidbase.base;

import android.app.Application;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
import com.android.mltcode.paycertificationapi.aa1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class BaseApplication extends Application {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static final OXO1 f20378I1 = new OXO1(null);

    @aa1
    public static final LinkedBlockingQueue<List<Object>> iX1O1 = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Set<InterfaceC2909s5> f20379IO = new LinkedHashSet();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final LinkedBlockingQueue<List<Object>> OXO1() {
            return BaseApplication.iX1O1;
        }

        public OXO1() {
        }
    }

    public final void XIi00iiXO() {
        mo11115iO(this.f20379IO);
        Iterator<InterfaceC2909s5> it = this.f20379IO.iterator();
        while (it.hasNext()) {
            it.next().OXO1(this);
        }
    }

    /* JADX INFO: renamed from: iO */
    public void mo11115iO(@aa1 Set<InterfaceC2909s5> initInitializers) {
        Intrinsics.X0O(initInitializers, "initInitializers");
    }

    @Override // android.app.Application
    @CallSuper
    public void onCreate() {
        super.onCreate();
        XIi00iiXO();
    }
}
