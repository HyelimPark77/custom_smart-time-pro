package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.gms.maps.MapView;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomGoogleMapView extends MapView {

    /* JADX INFO: renamed from: IO */
    @tb1
    public OXO1 f54969IO;

    public interface OXO1 {
        void OXO1(@aa1 MotionEvent motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomGoogleMapView(@aa1 Context context, @aa1 AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        OXO1 oxo1 = this.f54969IO;
        if (oxo1 != null) {
            oxo1.OXO1(event);
        }
        return super.dispatchTouchEvent(event);
    }

    public final void setOnMapTouchListener(@tb1 OXO1 oxo1) {
        this.f54969IO = oxo1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomGoogleMapView(@aa1 Context context, @aa1 AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
    }

    public /* synthetic */ CustomGoogleMapView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
