package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.status.ElectrocardiogramV2Activity;
import com.sma.smartv3.p610ui.status.fragment.EcgV2DayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nElectrocardiogramV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n69#2,3:107\n72#2,5:111\n1#3:110\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n*L\n87#1:107,3\n87#1:111,5\n87#1:110\n*E\n"})
public final class ElectrocardiogramV2Activity extends BaseActivity {
    public EcgV2DayFragment mEcgV2DayFragment;

    @tb1
    private PopupWindow mPopupWindow;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1IXI01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramV2Activity.abhTitleCenter_delegate$lambda$0(this.f3668IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIIIO11iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramV2Activity.abhTitleRight_delegate$lambda$0(this.f7844IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXiIO01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ElectrocardiogramV2Activity.abhTitleOtherRight_delegate$lambda$0(this.f2139IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(ElectrocardiogramV2Activity electrocardiogramV2Activity) {
        return (PFMedium) electrocardiogramV2Activity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(ElectrocardiogramV2Activity electrocardiogramV2Activity) {
        return (ImageView) electrocardiogramV2Activity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(ElectrocardiogramV2Activity electrocardiogramV2Activity) {
        return (ImageView) electrocardiogramV2Activity.findViewById(R.id.abh_title_right);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$0(ElectrocardiogramV2Activity electrocardiogramV2Activity, View view) {
        electrocardiogramV2Activity.startActivity(new Intent(electrocardiogramV2Activity, (Class<?>) EleRecordListActivity.class));
        PopupWindow popupWindow = electrocardiogramV2Activity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$1(ElectrocardiogramV2Activity electrocardiogramV2Activity, View view) {
        ToastUtils.showLong(electrocardiogramV2Activity.getString(R.string.operating_guide), new Object[0]);
        PopupWindow popupWindow = electrocardiogramV2Activity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTitleRightClick$lambda$2(ElectrocardiogramV2Activity electrocardiogramV2Activity, View view) {
        ToastUtils.showLong(electrocardiogramV2Activity.getString(R.string.describe), new Object[0]);
        PopupWindow popupWindow = electrocardiogramV2Activity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @aa1
    public final EcgV2DayFragment getMEcgV2DayFragment() {
        EcgV2DayFragment ecgV2DayFragment = this.mEcgV2DayFragment;
        if (ecgV2DayFragment != null) {
            return ecgV2DayFragment;
        }
        Intrinsics.XXO("mEcgV2DayFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        setMEcgV2DayFragment(new EcgV2DayFragment());
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram));
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_frame, getMEcgV2DayFragment()).commit();
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ele_more_icon);
        getAbhTitleRight().setImageTintList(ContextCompat.getColorStateList(getMContext(), R.color.abh_text_color));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_v3;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Object systemService = getSystemService("layout_inflater");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_ele_right_title_layout, (ViewGroup) null);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow == null) {
            this.mPopupWindow = new PopupWindow(viewInflate, -2, -2);
        } else if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = this.mPopupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int width = i + (i - view.getWidth()) + OXI1i1.XIi00iiXO(this, 20.0f);
        int height = iArr[1] + view.getHeight();
        PopupWindow popupWindow3 = this.mPopupWindow;
        if (popupWindow3 != null) {
            popupWindow3.showAtLocation(view, 0, width, height);
        }
        viewInflate.findViewById(R.id.ele_synchronous_recording).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXX1iII1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ElectrocardiogramV2Activity.onTitleRightClick$lambda$0(this.f2097IO, view2);
            }
        });
        viewInflate.findViewById(R.id.ele_operating_guide).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O01O0OX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ElectrocardiogramV2Activity.onTitleRightClick$lambda$1(this.f2410IO, view2);
            }
        });
        viewInflate.findViewById(R.id.ele_describe).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi01O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ElectrocardiogramV2Activity.onTitleRightClick$lambda$2(this.f3620IO, view2);
            }
        });
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getMEcgV2DayFragment().getUserVisibleHint()) {
            getMEcgV2DayFragment().showCalendarPopop();
        }
    }

    public final void setMEcgV2DayFragment(@aa1 EcgV2DayFragment ecgV2DayFragment) {
        Intrinsics.X0O(ecgV2DayFragment, "<set-?>");
        this.mEcgV2DayFragment = ecgV2DayFragment;
    }
}
