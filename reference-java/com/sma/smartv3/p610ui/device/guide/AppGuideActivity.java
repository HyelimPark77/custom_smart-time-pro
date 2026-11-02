package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.RomUtils;
import com.github.appintro.indicator.IndicatorController;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.p610ui.device.AutoBindActivity;
import com.sma.smartv3.p610ui.device.guide.AppGuideActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,193:1\n1#2:194\n255#3:195\n*S KotlinDebug\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n*L\n184#1:195\n*E\n"})
public final class AppGuideActivity extends BaseAppGuideActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static long onFinishTime;
    private boolean isNeedConnectClassic;
    private boolean isNeedConnectHID;

    @aa1
    private final String TAG = "AppGuideActivity";

    @aa1
    private final Lazy nextButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO1iXOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AppGuideActivity.nextButton_delegate$lambda$0(this.f3204IO);
        }
    });

    @aa1
    private final Lazy doneButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AppGuideActivity.doneButton_delegate$lambda$0(this.f1969IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long OXO1() {
            return AppGuideActivity.onFinishTime;
        }

        public final boolean XIi00iiXO() {
            return System.currentTimeMillis() - OXO1() > 5000;
        }

        /* JADX INFO: renamed from: iO */
        public final void m38463iO(long j) {
            AppGuideActivity.onFinishTime = j;
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView doneButton_delegate$lambda$0(AppGuideActivity appGuideActivity) {
        return (TextView) appGuideActivity.findViewById(R.id.done);
    }

    private final TextView getDoneButton() {
        return (TextView) this.doneButton$delegate.getValue();
    }

    private final TextView getNextButton() {
        return (TextView) this.nextButton$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView nextButton_delegate$lambda$0(AppGuideActivity appGuideActivity) {
        return (TextView) appGuideActivity.findViewById(R.id.next);
    }

    @Override // android.app.Activity
    public void finish() {
        onFinishTime = System.currentTimeMillis();
        super.finish();
    }

    @aa1
    public final TextView getNext() {
        TextView nextButton = getNextButton();
        Intrinsics.O10IXXX0X(nextButton, "<get-nextButton>(...)");
        return nextButton;
    }

    public final boolean isNeedConnectClassic() {
        return this.isNeedConnectClassic;
    }

    public final boolean isNeedConnectHID() {
        return this.isNeedConnectHID;
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        IndicatorController indicatorController;
        super.onCreate(bundle);
        LogUtils.m11130i("BaseAppGuideActivity onCreate");
        i72 i72Var = i72.OXO1;
        setSkipButtonEnabled(i72Var.X100O());
        showStatusBar(true);
        addSlide(new WelcomeGuideFragment());
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        q62 q62Var = q62.OXO1;
        Object obj = null;
        i1o0oxo1o.XO0O10("AppGuideActivity" + q62.OiO0IOX(q62Var, null, 1, null) + " " + q62Var.I0i1OXiI());
        if (q62.OiO0IOX(q62Var, null, 1, null) || q62Var.I0i1OXiI()) {
            addSlide(new EarphonesGuideFragment());
        }
        hr1 hr1Var = hr1.OXO1;
        if (!hr1Var.X00Xi1X(this)) {
            addSlide(new BgLocationGuideFragment());
        }
        if (q62Var.I1Ii() && !BleConnector.INSTANCE.isBoundClassic()) {
            this.isNeedConnectClassic = true;
            if (i72Var.X10i()) {
                addSlide(new ClassicPairGuide2Fragment());
            } else {
                addSlide(new ClassicPairGuideFragment());
            }
        }
        if (q62Var.III() && !BleConnector.INSTANCE.isBoundHID()) {
            this.isNeedConnectHID = true;
            addSlide(new HIDGuideFragment());
        }
        if (!q62Var.OiO()) {
            if (!MyNotificationListenerService.O001I.O00(this) && (q62Var.I0IIOI() || q62Var.m2882OI())) {
                addSlide(new NotificationGuideFragment());
            }
            if (q62Var.I0IIOI() || q62Var.m2882OI()) {
                addSlide(new NotificationSetGuideFragment());
            }
        }
        if (q62Var.OXX1I() && !q62Var.X0100I()) {
            addSlide(new WarmTipGuideFragment());
        }
        if (!hr1Var.XXiIiX10(this) && !q62Var.OiO()) {
            addSlide(new BgRunGuideFragment());
        }
        if (q62Var.X01I1OX1i()) {
            addSlide(new BloodGlucoseGuideFragment());
            if (q62Var.III() && BleConnector.INSTANCE.isBoundHID() && RomUtils.isXiaomi()) {
                addSlide(new WelcomeGuideFragment());
            }
        }
        List<Activity> activityList = ActivityUtils.getActivityList();
        Intrinsics.O10IXXX0X(activityList, "getActivityList(...)");
        for (Object obj2 : activityList) {
            if (((Activity) obj2) instanceof AutoBindActivity) {
                obj = obj2;
                break;
            }
        }
        Activity activity = (Activity) obj;
        if (activity != null) {
            activity.finish();
        }
        if (!i72.OXO1.m2052XI() || (indicatorController = getIndicatorController()) == null) {
            return;
        }
        indicatorController.setSelectedIndicatorColor(getColor(R.color.colorAccent));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.isNeedConnectClassic) {
            BleConnector.INSTANCE.connectClassic();
        } else if (this.isNeedConnectHID) {
            BleConnector.INSTANCE.connectHID();
        }
        I01XX0.XIi00iiXO(I01XX0.i0X1iIO, null, 2, null);
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment fragment) {
        super.onDonePressed(fragment);
        setResult(-1);
        finish();
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity
    public void onHandleBackPressed() {
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSkipPressed(@tb1 Fragment fragment) {
        super.onSkipPressed(fragment);
        setResult(-1);
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment fragment, @tb1 Fragment fragment2) {
        if ((fragment2 instanceof ClassicPairGuide2Fragment) && !((ClassicPairGuide2Fragment) fragment2).getCanSwipe()) {
            setSwipe(false);
            getNext().setVisibility(8);
            return;
        }
        if ((fragment2 instanceof HIDGuideFragment) && !((HIDGuideFragment) fragment2).getCanSwipe()) {
            setSwipe(false);
            getNext().setVisibility(8);
            return;
        }
        if (fragment2 instanceof PhoneBindGuideFragment) {
            setSwipe(false);
            getNext().setVisibility(8);
            getDoneButton().setVisibility(8);
        } else if (fragment2 instanceof SetPasswordGuideFragment) {
            setSwipe(false);
            getNext().setVisibility(8);
            getDoneButton().setVisibility(8);
        } else {
            setSwipe(true);
            TextView next = getNext();
            TextView doneButton = getDoneButton();
            Intrinsics.O10IXXX0X(doneButton, "<get-doneButton>(...)");
            next.setVisibility(doneButton.getVisibility() == 0 ? 8 : 0);
        }
    }

    public final void setNeedConnectClassic(boolean z) {
        this.isNeedConnectClassic = z;
    }

    public final void setNeedConnectHID(boolean z) {
        this.isNeedConnectHID = z;
    }
}
