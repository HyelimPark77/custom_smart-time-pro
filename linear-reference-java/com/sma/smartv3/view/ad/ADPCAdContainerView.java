package com.sma.smartv3.view.ad;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.IIX1OXO;
import com.android.mltcode.paycertificationapi.XiOIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ScreenUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sma.smartv3.R;
import com.sma.smartv3.biz.ad.ADPCAdBanner;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ADPCAdContainerView extends RelativeLayout {

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String TAG = "ADPAdContainerView";

    @aa1
    private String adUnitId;
    private boolean autoLoad;

    @tb1
    private ADPCAdListener listener;

    @tb1
    private LifecycleEventObserver mHostActivityObserver;

    @aa1
    private final String makeSureToHandleLifecycleMessage;
    private boolean parentMayHaveAListView;

    @tb1
    private ADPCAdBanner showADBanner;

    @aa1
    private final String showOnConditionMessage;

    @aa1
    private final ColorDrawable transparent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static final /* synthetic */ void access$logDebug(Companion r0, String r1) {
            r0.logDebug(r1);
        }

        private final void logDebug(String r4) {
            i1O0OXO1O.OXO1.OXO1("ADPAdContainerView -> " + r4);
        }

        private Companion() {
        }
    }

    public final class HostActivityObserver implements LifecycleEventObserver {
        final /* synthetic */ ADPCAdContainerView this$0;

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[Lifecycle.Event.values().length];
                r0[Lifecycle.Event.ON_CREATE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
            L13:
                r0[Lifecycle.Event.ON_RESUME.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
            L19:
                r0[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
            L15:
                r0[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
            L7:
                $EnumSwitchMapping$0 = r0;
            }
        }

        public HostActivityObserver(ADPCAdContainerView r1) {
            this.this$0 = r1;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@aa1 LifecycleOwner r9, @aa1 Lifecycle.Event r10) {
            Intrinsics.X0O(r9, "source");
            Intrinsics.X0O(r10, NotificationCompat.CATEGORY_EVENT);
            int r0 = WhenMappings.$EnumSwitchMapping$0[r10.ordinal()];
            if (r0 == 1) goto L15;
            if (r0 != 2) goto L7;
            this.this$0.resumeAd();
        L17:
            LifecycleEventObserver r1 = ADPCAdContainerView.access$getMHostActivityObserver$p(this.this$0);
            if (r1 == null) goto L21;
            r1.onStateChanged(r9, r10);
            return;
        L21:
            return;
        L7:
            if (r0 != 3) goto L9;
            this.this$0.pauseAd();
            goto L17
        L9:
            if (r0 != 4) goto L17;
            this.this$0.destroyAd();
            goto L17
        L15:
            if (this.this$0.getAutoLoad() == false) goto L17;
            ADPCAdContainerView r2 = this.this$0;
            ADPCAdContainerView.loadAdView$default(r2, r2.getAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease(), ScreenUtils.getScreenWidth(), false, null, 12, null);
            goto L17
        }
    }

    static {
        Companion = new Companion(null);
    }

    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ Unit OXO1() {
        return resumeAd$lambda$0();
    }

    public static /* synthetic */ Unit XIi00iiXO() {
        return pauseAd$lambda$0();
    }

    public static final /* synthetic */ LifecycleEventObserver access$getMHostActivityObserver$p(ADPCAdContainerView r0) {
        return r0.mHostActivityObserver;
    }

    private final boolean isMainThread() {
        return Intrinsics.XOO0ii0(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAdView$default(ADPCAdContainerView r0, String r1, int r2, boolean r3, Function0 r4, int r5, Object r6) {
        if (r6 != null) goto L18;
        if ((r5 & 1) == 0) goto L7;
        r1 = r0.adUnitId;
    L7:
        if ((r5 & 2) == 0) goto L10;
        r2 = ScreenUtils.getScreenWidth();
    L10:
        if ((r5 & 4) == 0) goto L13;
        r3 = false;
    L13:
        if ((r5 & 8) == 0) goto L15;
        r4 = null;
    L15:
        r0.loadAdView(r1, r2, r3, r4);
        return;
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAdView");
    }

    private static final Unit pauseAd$lambda$0() {
        return Unit.OXO1;
    }

    private static final Unit resumeAd$lambda$0() {
        return Unit.OXO1;
    }

    public final void addUploadADPAdListener(@aa1 final ADPCAdListener r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = new AnonymousClass1(r2);
    }

    public final void destroyAd() {
        ADPCAdBanner r0 = this.showADBanner;
        if (r0 == null) goto L5;
        r0.destroy();
    L5:
        removeAllViews();
    }

    @aa1
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @aa1
    public final String getAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.adUnitId;
    }

    public final boolean getAutoLoad() {
        return this.autoLoad;
    }

    @tb1
    public final ADPCAdListener getListener() {
        return this.listener;
    }

    @aa1
    public final String getMakeSureToHandleLifecycleMessage$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.makeSureToHandleLifecycleMessage;
    }

    public final boolean getParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.parentMayHaveAListView;
    }

    @aa1
    public final String getShowOnConditionMessage$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.showOnConditionMessage;
    }

    @aa1
    public final ColorDrawable getTransparent$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.transparent;
    }

    public final void loadAdView(@aa1 String r2, int r3, boolean r4, @tb1 Function0<Boolean> r5) {
        Intrinsics.X0O(r2, "adUnitId");
        this.parentMayHaveAListView = r4;
        if (r5 != null) goto L5;
    L10:
        removeAllViews();
        setBackgroundColor(0);
        Context r6 = getContext();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.app.Activity");
        ADPCAdBanner r7 = new ADPCAdBanner((Activity) r6, r2, this, new C35031(this));
        this.showADBanner = r7;
        r7.setAdWidth(r3);
        ADPCAdBanner r8 = this.showADBanner;
        if (r8 == null) goto L13;
        r8.setRefreshTime(30);
    L13:
        ADPCAdBanner r9 = this.showADBanner;
        if (r9 == null) goto L18;
        r9.load();
        return;
    L18:
        return;
    L5:
        if (r5.invoke().booleanValue() == true) goto L10;
        Companion.access$logDebug(Companion, this.showOnConditionMessage);
        ADPCAdListener r10 = this.listener;
        if (r10 == null) goto L17;
        r10.onADError(new ADPCAdError("-1", this.showOnConditionMessage), r2);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.parentMayHaveAListView == true) goto L6;
        destroyAd();
        return;
    }

    @aa1
    public final Function0<Unit> pauseAd() {
        return new XiOIO();
    }

    public final void removeAd() {
        destroyAd();
    }

    @aa1
    public final Function0<Unit> resumeAd() {
        return new IIX1OXO();
    }

    public final void setAdListener(@aa1 ADPCAdListener r2) {
        Intrinsics.X0O(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (q62.OXO1.XXXiXXOI() == false) goto L6;
        addUploadADPAdListener(r2);
        return;
    L6:
        this.listener = r2;
    }

    public final void setAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.adUnitId = r2;
    }

    public final void setAutoLoad(boolean r1) {
        this.autoLoad = r1;
    }

    public final void setHostActivityObserver(@aa1 LifecycleEventObserver r2) {
        Intrinsics.X0O(r2, "lifecycleEventObserver");
        this.mHostActivityObserver = r2;
    }

    public final void setListener(@tb1 ADPCAdListener r1) {
        this.listener = r1;
    }

    public final void setParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease(boolean r1) {
        this.parentMayHaveAListView = r1;
    }

    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context r6, @tb1 AttributeSet r7, int r8) {
        Intrinsics.X0O(r6, "context");
        super(r6, r7, r8);
        this.showOnConditionMessage = "showOnCondition lambda returned false, AdContainerView will not load an Ad.";
        this.makeSureToHandleLifecycleMessage = "Make sure to call the resume, pause, destroy lifecycle methods.";
        String r0 = "";
        this.adUnitId = "";
        this.transparent = new ColorDrawable(0);
        if ((r6 instanceof LifecycleOwner) == true) goto L5;
        Companion.access$logDebug(Companion, "Context is not a FragmentActivity. Make sure to call the resume, pause, destroy lifecycle methods.");
    L8:
        TypedArray r9 = r6.getTheme().obtainStyledAttributes(r7, R.styleable.AdContainerView, 0, 0);
        String r10 = r9.getString(0);     // Catch: Throwable -> L16
        if (r10 == null) goto L13;
        r0 = r10;
    L13:
        this.adUnitId = r0;     // Catch: Throwable -> L16
        this.autoLoad = r9.getBoolean(1, false);     // Catch: Throwable -> L16
        r9.recycle();
        return;
    L16:
        th = move-exception;
        r9.recycle();
        throw th;
    L5:
        if (isMainThread() == false) goto L8;
        ((LifecycleOwner) r6).getLifecycle().addObserver(new HostActivityObserver(this));
        goto L8
    }

    public /* synthetic */ ADPCAdContainerView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
