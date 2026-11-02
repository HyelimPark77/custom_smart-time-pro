package com.sma.smartv3.view.p256ad;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ScreenUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.biz.StatManager;
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
    public static final Companion Companion = new Companion(null);

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logDebug(String str) {
            i1O0OXO1O.OXO1.OXO1("ADPAdContainerView -> " + str);
        }

        private Companion() {
        }
    }

    public final class HostActivityObserver implements LifecycleEventObserver {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public HostActivityObserver() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@aa1 LifecycleOwner source, @aa1 Lifecycle.Event event) {
            Intrinsics.X0O(source, "source");
            Intrinsics.X0O(event, "event");
            int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ADPCAdContainerView.this.resumeAd();
                } else if (i == 3) {
                    ADPCAdContainerView.this.pauseAd();
                } else if (i == 4) {
                    ADPCAdContainerView.this.destroyAd();
                }
            } else if (ADPCAdContainerView.this.getAutoLoad()) {
                ADPCAdContainerView aDPCAdContainerView = ADPCAdContainerView.this;
                ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, aDPCAdContainerView.getAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease(), ScreenUtils.getScreenWidth(), false, null, 12, null);
            }
            LifecycleEventObserver lifecycleEventObserver = ADPCAdContainerView.this.mHostActivityObserver;
            if (lifecycleEventObserver != null) {
                lifecycleEventObserver.onStateChanged(source, event);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final boolean isMainThread() {
        return Intrinsics.XOO0ii0(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAdView$default(ADPCAdContainerView aDPCAdContainerView, String str, int i, boolean z, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAdView");
        }
        if ((i2 & 1) != 0) {
            str = aDPCAdContainerView.adUnitId;
        }
        if ((i2 & 2) != 0) {
            i = ScreenUtils.getScreenWidth();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        aDPCAdContainerView.loadAdView(str, i, z, function0);
    }

    public final void addUploadADPAdListener(@aa1 final ADPCAdListener listener) {
        Intrinsics.X0O(listener, "listener");
        this.listener = new ADPCAdListener() { // from class: com.sma.smartv3.view.ad.ADPCAdContainerView.addUploadADPAdListener.1
            public void onADClicked(String adUnitId) {
                Intrinsics.X0O(adUnitId, "adUnitId");
                listener.onADClicked(adUnitId);
                StatManager.OXO1.XIi00iiXO(19, adUnitId);
            }

            public void onADClosed(String adUnitId) {
                Intrinsics.X0O(adUnitId, "adUnitId");
                listener.onADClosed(adUnitId);
            }

            public void onADError(ADPCAdError error, String adUnitId) {
                Intrinsics.X0O(error, "error");
                Intrinsics.X0O(adUnitId, "adUnitId");
                listener.onADError(error, adUnitId);
            }

            public void onADPresent(String adUnitId) {
                Intrinsics.X0O(adUnitId, "adUnitId");
                listener.onADPresent(adUnitId);
                StatManager.OXO1.XIi00iiXO(18, adUnitId);
            }

            public void onADReceive(String adUnitId) {
                Intrinsics.X0O(adUnitId, "adUnitId");
                listener.onADReceive(adUnitId);
            }
        };
    }

    public final void destroyAd() {
        ADPCAdBanner aDPCAdBanner = this.showADBanner;
        if (aDPCAdBanner != null) {
            aDPCAdBanner.destroy();
        }
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
    /* JADX INFO: renamed from: getMakeSureToHandleLifecycleMessage$app_smart_time_pro_google_play_v2UniversalRelease */
    public final String m38924x660532e2() {
        return this.makeSureToHandleLifecycleMessage;
    }

    /* JADX INFO: renamed from: getParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease */
    public final boolean m38925xa511f380() {
        return this.parentMayHaveAListView;
    }

    @aa1
    /* JADX INFO: renamed from: getShowOnConditionMessage$app_smart_time_pro_google_play_v2UniversalRelease */
    public final String m38926xb57b5947() {
        return this.showOnConditionMessage;
    }

    @aa1
    public final ColorDrawable getTransparent$app_smart_time_pro_google_play_v2UniversalRelease() {
        return this.transparent;
    }

    public final void loadAdView(@aa1 String adUnitId, int i, boolean z, @tb1 Function0<Boolean> function0) {
        Intrinsics.X0O(adUnitId, "adUnitId");
        this.parentMayHaveAListView = z;
        if (function0 != null && !function0.invoke2().booleanValue()) {
            Companion.logDebug(this.showOnConditionMessage);
            ADPCAdListener aDPCAdListener = this.listener;
            if (aDPCAdListener != null) {
                aDPCAdListener.onADError(new ADPCAdError("-1", this.showOnConditionMessage), adUnitId);
                return;
            }
            return;
        }
        removeAllViews();
        setBackgroundColor(0);
        Context context = getContext();
        Intrinsics.X1ii(context, "null cannot be cast to non-null type android.app.Activity");
        ADPCAdBanner aDPCAdBanner = new ADPCAdBanner((Activity) context, adUnitId, this, new ADPCAdListener() { // from class: com.sma.smartv3.view.ad.ADPCAdContainerView.loadAdView.1
            public void onADClicked(String adUnitId2) {
                Intrinsics.X0O(adUnitId2, "adUnitId");
                ADPCAdListener listener = ADPCAdContainerView.this.getListener();
                if (listener != null) {
                    listener.onADClicked(adUnitId2);
                }
            }

            public void onADClosed(String adUnitId2) {
                Intrinsics.X0O(adUnitId2, "adUnitId");
                ADPCAdListener listener = ADPCAdContainerView.this.getListener();
                if (listener != null) {
                    listener.onADClosed(adUnitId2);
                }
            }

            public void onADError(ADPCAdError error, String adUnitId2) {
                Intrinsics.X0O(error, "error");
                Intrinsics.X0O(adUnitId2, "adUnitId");
                ADPCAdListener listener = ADPCAdContainerView.this.getListener();
                if (listener != null) {
                    listener.onADError(error, adUnitId2);
                }
            }

            public void onADPresent(String adUnitId2) {
                Intrinsics.X0O(adUnitId2, "adUnitId");
                ADPCAdListener listener = ADPCAdContainerView.this.getListener();
                if (listener != null) {
                    listener.onADPresent(adUnitId2);
                }
            }

            public void onADReceive(String adUnitId2) {
                Intrinsics.X0O(adUnitId2, "adUnitId");
                ADPCAdContainerView.this.setBackgroundColor(-1);
                ADPCAdListener listener = ADPCAdContainerView.this.getListener();
                if (listener != null) {
                    listener.onADReceive(adUnitId2);
                }
            }
        });
        this.showADBanner = aDPCAdBanner;
        aDPCAdBanner.setAdWidth(i);
        ADPCAdBanner aDPCAdBanner2 = this.showADBanner;
        if (aDPCAdBanner2 != null) {
            aDPCAdBanner2.setRefreshTime(30);
        }
        ADPCAdBanner aDPCAdBanner3 = this.showADBanner;
        if (aDPCAdBanner3 != null) {
            aDPCAdBanner3.load();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.parentMayHaveAListView) {
            return;
        }
        destroyAd();
    }

    @aa1
    public final Function0<Unit> pauseAd() {
        return new Function0() { // from class: com.android.mltcode.paycertificationapi.XiOIO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Unit.OXO1;
            }
        };
    }

    public final void removeAd() {
        destroyAd();
    }

    @aa1
    public final Function0<Unit> resumeAd() {
        return new Function0() { // from class: com.android.mltcode.paycertificationapi.IIX1OXO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Unit.OXO1;
            }
        };
    }

    public final void setAdListener(@aa1 ADPCAdListener listener) {
        Intrinsics.X0O(listener, "listener");
        if (q62.OXO1.XXXiXXOI()) {
            addUploadADPAdListener(listener);
        } else {
            this.listener = listener;
        }
    }

    public final void setAdUnitId$app_smart_time_pro_google_play_v2UniversalRelease(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setAutoLoad(boolean z) {
        this.autoLoad = z;
    }

    public final void setHostActivityObserver(@aa1 LifecycleEventObserver lifecycleEventObserver) {
        Intrinsics.X0O(lifecycleEventObserver, "lifecycleEventObserver");
        this.mHostActivityObserver = lifecycleEventObserver;
    }

    public final void setListener(@tb1 ADPCAdListener aDPCAdListener) {
        this.listener = aDPCAdListener;
    }

    /* JADX INFO: renamed from: setParentMayHaveAListView$app_smart_time_pro_google_play_v2UniversalRelease */
    public final void m38927x113bf48c(boolean z) {
        this.parentMayHaveAListView = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ADPCAdContainerView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.showOnConditionMessage = "showOnCondition lambda returned false, AdContainerView will not load an Ad.";
        this.makeSureToHandleLifecycleMessage = "Make sure to call the resume, pause, destroy lifecycle methods.";
        String str = "";
        this.adUnitId = "";
        this.transparent = new ColorDrawable(0);
        if (context instanceof LifecycleOwner) {
            if (isMainThread()) {
                ((LifecycleOwner) context).getLifecycle().addObserver(new HostActivityObserver());
            }
        } else {
            Companion.logDebug("Context is not a FragmentActivity. Make sure to call the resume, pause, destroy lifecycle methods.");
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C15429R.styleable.AdContainerView, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                str = string;
            }
            this.adUnitId = str;
            this.autoLoad = typedArrayObtainStyledAttributes.getBoolean(1, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ ADPCAdContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
