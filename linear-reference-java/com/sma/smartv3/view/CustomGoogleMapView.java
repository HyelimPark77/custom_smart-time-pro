package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.gms.maps.MapView;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomGoogleMapView extends MapView {

    @tb1
    public OXO1 IO;

    public interface OXO1 {
        void OXO1(@aa1 MotionEvent r1);
    }

    @JvmOverloads
    public CustomGoogleMapView(@aa1 Context r8, @aa1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        Intrinsics.X0O(r9, "attrs");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, NotificationCompat.CATEGORY_EVENT);
        OXO1 r0 = this.IO;
        if (r0 == null) goto L6;
        r0.OXO1(r2);
    L6:
        return super.dispatchTouchEvent(r2);
    }

    public final void setOnMapTouchListener(@tb1 OXO1 r1) {
        this.IO = r1;
    }

    @JvmOverloads
    public CustomGoogleMapView(@aa1 Context r2, @aa1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "attrs");
        super(r2, r3, r4);
    }

    public /* synthetic */ CustomGoogleMapView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3);
    }
}
