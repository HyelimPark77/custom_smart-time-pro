package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IX1OI;
import com.android.mltcode.paycertificationapi.OO1iXOi;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.AutoBindActivity;
import com.szabh.smable3.component.BleConnector;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,193:1\n1#2:194\n255#3:195\n*S KotlinDebug\n*F\n+ 1 AppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/AppGuideActivity\n*L\n184#1:195\n*E\n"})
public final class AppGuideActivity extends BaseAppGuideActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static long onFinishTime;

    @aa1
    private final String TAG;

    @aa1
    private final Lazy doneButton$delegate;
    private boolean isNeedConnectClassic;
    private boolean isNeedConnectHID;

    @aa1
    private final Lazy nextButton$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final long OXO1() {
            return AppGuideActivity.access$getOnFinishTime$cp();
        }

        public final boolean XIi00iiXO() {
            if ((System.currentTimeMillis() - OXO1()) <= 5000) goto L6;
            return true;
        L6:
            return false;
        }

        public final void iO(long r1) {
            AppGuideActivity.access$setOnFinishTime$cp(r1);
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public AppGuideActivity() {
        this.TAG = "AppGuideActivity";
        this.nextButton$delegate = LazyKt__LazyJVMKt.iO(new OO1iXOi(this));
        this.doneButton$delegate = LazyKt__LazyJVMKt.iO(new IX1OI(this));
    }

    public static /* synthetic */ TextView O10IXXX0X(AppGuideActivity r0) {
        return doneButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(AppGuideActivity r0) {
        return nextButton_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ long access$getOnFinishTime$cp() {
        return onFinishTime;
    }

    public static final /* synthetic */ void access$setOnFinishTime$cp(long r0) {
        onFinishTime = r0;
    }

    private static final TextView doneButton_delegate$lambda$0(AppGuideActivity r1) {
        return (TextView) r1.findViewById(R.id.done);
    }

    private final TextView getDoneButton() {
        return (TextView) getValue();
    }

    private final TextView getNextButton() {
        return (TextView) getValue();
    }

    private static final TextView nextButton_delegate$lambda$0(AppGuideActivity r1) {
        return (TextView) r1.findViewById(R.id.next);
    }

    @Override // android.app.Activity
    public void finish() {
        onFinishTime = System.currentTimeMillis();
        super.finish();
    }

    @aa1
    public final TextView getNext() {
        TextView r0 = getNextButton();
        Intrinsics.O10IXXX0X(r0, "<get-nextButton>(...)");
        return r0;
    }

    public final boolean isNeedConnectClassic() {
        return this.isNeedConnectClassic;
    }

    public final boolean isNeedConnectHID() {
        return this.isNeedConnectHID;
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r9) {
        super.onCreate(r9);
        LogUtils.i(new Object[]{"BaseAppGuideActivity onCreate"});
        i72 r10 = i72.OXO1;
        setSkipButtonEnabled(r10.X100O());
        showStatusBar(true);
        addSlide(new WelcomeGuideFragment());
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        q62 r2 = q62.OXO1;
        Object r3 = null;
        r1.XO0O10("AppGuideActivity" + q62.OiO0IOX(r2, null, 1, null) + " " + r2.I0i1OXiI());
        if (q62.OiO0IOX(r2, null, 1, null) == false) goto L5;
    L6:
        addSlide(new EarphonesGuideFragment());
    L7:
        hr1 r4 = hr1.OXO1;
        if (r4.X00Xi1X(this) == true) goto L11;
        addSlide(new BgLocationGuideFragment());
    L11:
        if (r2.I1Ii() == false) goto L19;
        if (BleConnector.INSTANCE.isBoundClassic() == true) goto L19;
        this.isNeedConnectClassic = true;
        if (r10.X10i() == false) goto L17;
        addSlide(new ClassicPairGuide2Fragment());
        goto L19
    L17:
        addSlide(new ClassicPairGuideFragment());
    L19:
        if (r2.III() == false) goto L24;
        if (BleConnector.INSTANCE.isBoundHID() == true) goto L24;
        this.isNeedConnectHID = true;
        addSlide(new HIDGuideFragment());
    L24:
        if (r2.OiO() == true) goto L38;
        if (MyNotificationListenerService.O001I.O00(this) == true) goto L33;
        if (r2.I0IIOI() == false) goto L30;
    L31:
        addSlide(new NotificationGuideFragment());
        goto L33
    L30:
        if (r2.OI() == true) goto L31;
    L33:
        if (r2.I0IIOI() == false) goto L35;
    L36:
        addSlide(new NotificationSetGuideFragment());
        goto L38
    L35:
        if (r2.OI() == true) goto L36;
    L38:
        if (r2.OXX1I() == false) goto L43;
        if (r2.X0100I() == true) goto L43;
        addSlide(new WarmTipGuideFragment());
    L43:
        if (r4.XXiIiX10(this) == true) goto L48;
        if (r2.OiO() == true) goto L48;
        addSlide(new BgRunGuideFragment());
    L48:
        if (r2.X01I1OX1i() == false) goto L56;
        addSlide(new BloodGlucoseGuideFragment());
        if (r2.III() == false) goto L56;
        if (BleConnector.INSTANCE.isBoundHID() == false) goto L56;
        if (RomUtils.isXiaomi() == false) goto L56;
        addSlide(new WelcomeGuideFragment());
    L56:
        List<Activity> r11 = ActivityUtils.getActivityList();
        Intrinsics.O10IXXX0X(r11, "getActivityList(...)");
        Iterator<T> r12 = r11.iterator();
    L58:
        if (r12.hasNext() == false) goto L62;
        Object r0 = r12.next();
        if ((((Activity) r0) instanceof AutoBindActivity) == false) goto L58;
        r3 = r0;
    L62:
        Activity r5 = (Activity) r3;
        if (r5 == null) goto L66;
        r5.finish();
    L66:
        if (i72.OXO1.XI() == false) goto L74;
        IndicatorController r13 = getIndicatorController();
        if (r13 == null) goto L75;
        r13.setSelectedIndicatorColor(getColor(R.color.colorAccent));
        return;
    L75:
        return;
    L74:
        return;
    L5:
        if (r2.I0i1OXiI() == false) goto L7;
        goto L6
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.isNeedConnectClassic == false) goto L6;
        BleConnector.INSTANCE.connectClassic();
    L8:
        I01XX0.XIi00iiXO(I01XX0.i0X1iIO, null, 2, null);
        return;
    L6:
        if (this.isNeedConnectHID == false) goto L8;
        BleConnector.INSTANCE.connectHID();
        goto L8
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment r1) {
        super.onDonePressed(r1);
        setResult(-1);
        finish();
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity
    public void onHandleBackPressed() {
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSkipPressed(@tb1 Fragment r1) {
        super.onSkipPressed(r1);
        setResult(-1);
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment r4, @tb1 Fragment r5) {
        int r0 = 0;
        if ((r5 instanceof ClassicPairGuide2Fragment) == false) goto L9;
        if (((ClassicPairGuide2Fragment) r5).getCanSwipe() == true) goto L9;
        setSwipe(false);
        getNext().setVisibility(8);
        return;
    L9:
        if ((r5 instanceof HIDGuideFragment) == false) goto L15;
        if (((HIDGuideFragment) r5).getCanSwipe() == true) goto L15;
        setSwipe(false);
        getNext().setVisibility(8);
        return;
    L15:
        if ((r5 instanceof PhoneBindGuideFragment) == false) goto L19;
        setSwipe(false);
        getNext().setVisibility(8);
        getDoneButton().setVisibility(8);
        return;
    L19:
        if ((r5 instanceof SetPasswordGuideFragment) == false) goto L22;
        setSwipe(false);
        getNext().setVisibility(8);
        getDoneButton().setVisibility(8);
        return;
    L22:
        setSwipe(true);
        TextView r6 = getNext();
        TextView r7 = getDoneButton();
        Intrinsics.O10IXXX0X(r7, "<get-doneButton>(...)");
        if (r7.getVisibility() != 0) goto L25;
        r0 = 8;
    L25:
        r6.setVisibility(r0);
    }

    public final void setNeedConnectClassic(boolean r1) {
        this.isNeedConnectClassic = r1;
    }

    public final void setNeedConnectHID(boolean r1) {
        this.isNeedConnectHID = r1;
    }
}
