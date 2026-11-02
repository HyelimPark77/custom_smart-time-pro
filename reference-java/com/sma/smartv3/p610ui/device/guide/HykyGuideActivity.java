package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ActivityUtils;
import com.sma.smartv3.p610ui.device.AutoBindActivity;
import com.sma.smartv3.p610ui.device.guide.HykyGuideActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "废弃")
@SourceDebugExtension({"SMAP\nHykyGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n1#2:107\n1869#3,2:108\n255#4:110\n*S KotlinDebug\n*F\n+ 1 HykyGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/HykyGuideActivity\n*L\n55#1:108,2\n97#1:110\n*E\n"})
public final class HykyGuideActivity extends BaseAppGuideActivity {

    @aa1
    private final Lazy nextButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXXIO1OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyGuideActivity.nextButton_delegate$lambda$0(this.f3541IO);
        }
    });

    @aa1
    private final Lazy doneButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OII0Oii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HykyGuideActivity.doneButton_delegate$lambda$0(this.f2946IO);
        }
    });

    @aa1
    private List<String> functionList = new ArrayList();

    public static final class OXO1 {

        @aa1
        public static final OXO1 OXO1 = new OXO1();

        @aa1
        public static final String XIi00iiXO = "set_function";

        /* JADX INFO: renamed from: iO */
        @aa1
        public static final String f54567iO = "function_bind_phone";

        @aa1
        public static final String XO0O10 = "function_set_password";

        @aa1
        public final String OXO1() {
            return f54567iO;
        }

        @aa1
        public final String XIi00iiXO() {
            return XO0O10;
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final String m38470iO() {
            return XIi00iiXO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView doneButton_delegate$lambda$0(HykyGuideActivity hykyGuideActivity) {
        return (TextView) hykyGuideActivity.findViewById(R.id.done);
    }

    private final TextView getDoneButton() {
        return (TextView) this.doneButton$delegate.getValue();
    }

    private final TextView getNextButton() {
        return (TextView) this.nextButton$delegate.getValue();
    }

    private final void initHyky() {
        for (String str : this.functionList) {
            OXO1 oxo1 = OXO1.OXO1;
            if (Intrinsics.XOO0ii0(str, oxo1.OXO1())) {
                addSlide(new PhoneBindGuideFragment());
            } else if (Intrinsics.XOO0ii0(str, oxo1.XIi00iiXO())) {
                addSlide(new SetPasswordGuideFragment());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView nextButton_delegate$lambda$0(HykyGuideActivity hykyGuideActivity) {
        return (TextView) hykyGuideActivity.findViewById(R.id.next);
    }

    @aa1
    public final TextView getNext() {
        TextView nextButton = getNextButton();
        Intrinsics.O10IXXX0X(nextButton, "<get-nextButton>(...)");
        return nextButton;
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        setSkipButtonEnabled(false);
        showStatusBar(true);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(OXO1.OXO1.m38470iO());
        if (stringArrayListExtra != null) {
            this.functionList.addAll(stringArrayListExtra);
        }
        if (this.functionList.isEmpty()) {
            finish();
            return;
        }
        initHyky();
        List<Activity> activityList = ActivityUtils.getActivityList();
        Intrinsics.O10IXXX0X(activityList, "getActivityList(...)");
        Iterator<T> it = activityList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Activity) next) instanceof AutoBindActivity));
        Activity activity = (Activity) next;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment fragment) {
        super.onDonePressed(fragment);
        finish();
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity
    public void onHandleBackPressed() {
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSkipPressed(@tb1 Fragment fragment) {
        super.onSkipPressed(fragment);
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment fragment, @tb1 Fragment fragment2) {
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
}
