package com.sma.smartv3.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.gms.maps.SupportMapFragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomSupportMapFragment extends SupportMapFragment {

    @tb1
    private OXO1 mListener;

    public interface OXO1 {
        void OXO1();
    }

    public final class TouchableWrapper extends FrameLayout {
        public final /* synthetic */ CustomSupportMapFragment IO;

        public TouchableWrapper(@tb1 CustomSupportMapFragment r1, Context r2) {
            this.IO = r1;
            Intrinsics.XXI(r2);
            super(r2);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(@aa1 MotionEvent r3) {
            Intrinsics.X0O(r3, NotificationCompat.CATEGORY_EVENT);
            int r0 = r3.getAction();
            if (r0 != 0) goto L5;
            OXO1 r1 = CustomSupportMapFragment.access$getMListener$p(this.IO);
            Intrinsics.XXI(r1);
            r1.OXO1();
        L10:
            return super.dispatchTouchEvent(r3);
        L5:
            if (r0 != 1) goto L10;
            OXO1 r2 = CustomSupportMapFragment.access$getMListener$p(this.IO);
            Intrinsics.XXI(r2);
            r2.OXO1();
            goto L10
        }
    }

    public CustomSupportMapFragment() {
    }

    public static final /* synthetic */ OXO1 access$getMListener$p(CustomSupportMapFragment r0) {
        return r0.mListener;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.Fragment
    @aa1
    public View onCreateView(@aa1 LayoutInflater r3, @tb1 ViewGroup r4, @tb1 Bundle r5) {
        Intrinsics.X0O(r3, "inflater");
        View r6 = super.onCreateView(r3, r4, r5);
        Intrinsics.O10IXXX0X(r6, "onCreateView(...)");
        TouchableWrapper r7 = new TouchableWrapper(this, getActivity());
        r7.setBackgroundColor(getResources().getColor(R.color.transparent));
        ((ViewGroup) r6).addView(r7, new ViewGroup.LayoutParams(-1, -1));
        return r6;
    }

    public final void setListener(@tb1 OXO1 r1) {
        this.mListener = r1;
    }
}
