package com.sma.smartv3.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TouchableWrapper(Context context) {
            super(context);
            Intrinsics.XXI(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
            Intrinsics.X0O(event, "event");
            int action = event.getAction();
            if (action == 0) {
                OXO1 oxo1 = CustomSupportMapFragment.this.mListener;
                Intrinsics.XXI(oxo1);
                oxo1.OXO1();
            } else if (action == 1) {
                OXO1 oxo2 = CustomSupportMapFragment.this.mListener;
                Intrinsics.XXI(oxo2);
                oxo2.OXO1();
            }
            return super.dispatchTouchEvent(event);
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.Fragment
    @aa1
    public View onCreateView(@aa1 LayoutInflater inflater, @tb1 ViewGroup viewGroup, @tb1 Bundle bundle) {
        Intrinsics.X0O(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Intrinsics.O10IXXX0X(viewOnCreateView, "onCreateView(...)");
        TouchableWrapper touchableWrapper = new TouchableWrapper(getActivity());
        touchableWrapper.setBackgroundColor(getResources().getColor(R.color.transparent));
        ((ViewGroup) viewOnCreateView).addView(touchableWrapper, new ViewGroup.LayoutParams(-1, -1));
        return viewOnCreateView;
    }

    public final void setListener(@tb1 OXO1 oxo1) {
        this.mListener = oxo1;
    }
}
