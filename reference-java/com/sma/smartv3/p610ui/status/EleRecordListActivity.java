package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.status.EleRecordListActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EleRecordListActivity extends BaseActivity {

    @tb1
    private PopupWindow mPopupWindow;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1i01i0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EleRecordListActivity.abhTitleCenter_delegate$lambda$0(this.f1473IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EleRecordListActivity.abhTitleRight_delegate$lambda$0(this.f8031IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0X11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EleRecordListActivity.abhTitleOtherRight_delegate$lambda$0(this.f1194IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(EleRecordListActivity eleRecordListActivity) {
        return (PFMedium) eleRecordListActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(EleRecordListActivity eleRecordListActivity) {
        return (ImageView) eleRecordListActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(EleRecordListActivity eleRecordListActivity) {
        return (ImageView) eleRecordListActivity.findViewById(R.id.abh_title_right);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(EleRecordListActivity eleRecordListActivity, View view) {
        Intrinsics.XXI(view);
        eleRecordListActivity.showTitlePopup(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitlePopup$lambda$0(EleRecordListActivity eleRecordListActivity, View view) {
        PopupWindow popupWindow = eleRecordListActivity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTitlePopup$lambda$1(EleRecordListActivity eleRecordListActivity, View view) {
        PopupWindow popupWindow = eleRecordListActivity.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram_measurement_title));
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_delete);
        getAbhTitleCenter().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IOIXXIi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EleRecordListActivity.initView$lambda$0(this.f1808IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_list;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
    }

    public final void showTitlePopup(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Object systemService = getSystemService("layout_inflater");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_ele_center_title_layout, (ViewGroup) null);
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
        viewInflate.findViewById(R.id.ele_all_record).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OIOi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EleRecordListActivity.showTitlePopup$lambda$0(this.f3022IO, view2);
            }
        });
        viewInflate.findViewById(R.id.ele_symptom_record).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X0XX0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EleRecordListActivity.showTitlePopup$lambda$1(this.f4045IO, view2);
            }
        });
    }
}
