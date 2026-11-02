package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.OII0Oii;
import com.android.mltcode.paycertificationapi.OXXIO1OI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ActivityUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.AutoBindActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nHykyGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n1#2:107\n1869#3,2:108\n255#4:110\n*S KotlinDebug\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n*L\n55#1:108,2\n97#1:110\n*E\n"})
public final class HykyGuideActivity extends BaseAppGuideActivity {

    @aa1
    private final Lazy doneButton$delegate;

    @aa1
    private List<String> functionList;

    @aa1
    private final Lazy nextButton$delegate;

    public static final class OXO1 {

        @aa1
        public static final OXO1 OXO1 = null;

        @aa1
        public static final String XIi00iiXO = null;

        @aa1
        public static final String XO0O10 = null;

        @aa1
        public static final String iO = null;

        static {
            OXO1 = new OXO1();
            XIi00iiXO = "set_function";
            iO = "function_bind_phone";
            XO0O10 = "function_set_password";
        }

        public OXO1() {
        }

        @aa1
        public final String OXO1() {
            return iO;
        }

        @aa1
        public final String XIi00iiXO() {
            return XO0O10;
        }

        @aa1
        public final String iO() {
            return XIi00iiXO;
        }
    }

    public HykyGuideActivity() {
        this.nextButton$delegate = LazyKt__LazyJVMKt.iO(new OXXIO1OI(this));
        this.doneButton$delegate = LazyKt__LazyJVMKt.iO(new OII0Oii(this));
        this.functionList = new ArrayList();
    }

    public static /* synthetic */ TextView O10IXXX0X(HykyGuideActivity r0) {
        return nextButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(HykyGuideActivity r0) {
        return doneButton_delegate$lambda$0(r0);
    }

    private static final TextView doneButton_delegate$lambda$0(HykyGuideActivity r1) {
        return (TextView) r1.findViewById(R.id.done);
    }

    private final TextView getDoneButton() {
        return (TextView) getValue();
    }

    private final TextView getNextButton() {
        return (TextView) getValue();
    }

    private final void initHyky() {
        Iterator<T> r0 = this.functionList.iterator();
    L4:
        if (r0.hasNext() == false) goto L11;
        String r1 = (String) r0.next();
        OXO1 r2 = OXO1.OXO1;
        if (Intrinsics.XOO0ii0(r1, r2.OXO1()) == true) goto L7;
        if (Intrinsics.XOO0ii0(r1, r2.XIi00iiXO()) == false) goto L4;
        addSlide(new SetPasswordGuideFragment());
        goto L4
    L7:
        addSlide(new PhoneBindGuideFragment());
        goto L4
    }

    private static final TextView nextButton_delegate$lambda$0(HykyGuideActivity r1) {
        return (TextView) r1.findViewById(R.id.next);
    }

    @aa1
    public final TextView getNext() {
        TextView r0 = getNextButton();
        Intrinsics.O10IXXX0X(r0, "<get-nextButton>(...)");
        return r0;
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        super.onCreate(r3);
        setSkipButtonEnabled(false);
        showStatusBar(true);
        ArrayList<String> r4 = getIntent().getStringArrayListExtra(OXO1.OXO1.iO());
        if (r4 == null) goto L6;
        this.functionList.addAll(r4);
    L6:
        if (this.functionList.isEmpty() == false) goto L9;
        finish();
        return;
    L9:
        initHyky();
        List<Activity> r5 = ActivityUtils.getActivityList();
        Intrinsics.O10IXXX0X(r5, "getActivityList(...)");
        Iterator<T> r6 = r5.iterator();
    L11:
        if (r6.hasNext() == false) goto L15;
        Object r0 = r6.next();
        if ((((Activity) r0) instanceof AutoBindActivity) == false) goto L11;
    L16:
        Activity r1 = (Activity) r0;
        if (r1 == null) goto L23;
        r1.finish();
        return;
    L23:
        return;
    L15:
        r0 = null;
        goto L16
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment r1) {
        super.onDonePressed(r1);
        finish();
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity
    public void onHandleBackPressed() {
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSkipPressed(@tb1 Fragment r1) {
        super.onSkipPressed(r1);
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment r4, @tb1 Fragment r5) {
        int r0 = 0;
        if ((r5 instanceof PhoneBindGuideFragment) == false) goto L7;
        setSwipe(false);
        getNext().setVisibility(8);
        getDoneButton().setVisibility(8);
        return;
    L7:
        if ((r5 instanceof SetPasswordGuideFragment) == false) goto L10;
        setSwipe(false);
        getNext().setVisibility(8);
        getDoneButton().setVisibility(8);
        return;
    L10:
        setSwipe(true);
        TextView r6 = getNext();
        TextView r7 = getDoneButton();
        Intrinsics.O10IXXX0X(r7, "<get-doneButton>(...)");
        if (r7.getVisibility() != 0) goto L13;
        r0 = 8;
    L13:
        r6.setVisibility(r0);
    }
}
