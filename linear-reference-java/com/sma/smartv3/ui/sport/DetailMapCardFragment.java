package com.sma.smartv3.ui.sport;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.I0OX10I;
import com.android.mltcode.paycertificationapi.OXIiI;
import com.android.mltcode.paycertificationapi.XiiXOI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.android.mltcode.paycertificationapi.iXIXX1O0;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailMapCardFragment extends BaseDetailCardFragment {
    private boolean isShowMapPoi;

    @aa1
    private final Lazy showMapPoi$delegate;

    public DetailMapCardFragment() {
        this.showMapPoi$delegate = LazyKt__LazyJVMKt.iO(new OXIiI(this));
        this.isShowMapPoi = true;
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setShowLineMarker(true);
        setMBaiduLineStart(null);
        setMBaiduLineEnd(null);
    }

    public static /* synthetic */ ImageView X11iII1O1(DetailMapCardFragment r0) {
        return showMapPoi_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXIIO1i11(DetailMapCardFragment r0) {
        initView$lambda$1(r0);
    }

    private final ImageView getShowMapPoi() {
        return (ImageView) getValue();
    }

    public static /* synthetic */ void iI(DetailMapCardFragment r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ void iX1O1(DetailMapCardFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(DetailMapCardFragment r2, View r3) {
        int r0 = 1;
        r2.isShowMapPoi = !r2.isShowMapPoi;
        if (r2.isInChinaMainland() == false) goto L5;
        r2.getMBaiDuMap().showMapPoi(r2.isShowMapPoi);
    L10:
        ImageView r4 = r2.getShowMapPoi();
        if (r2.isShowMapPoi == false) goto L13;
        int r5 = R.drawable.share_map_card_showpoi;
    L14:
        r4.setImageResource(r5);
        return;
    L13:
        r5 = R.drawable.share_map_card_noshowpoi;
        goto L14
    L5:
        GoogleMap r6 = r2.getMGoogleMap();
        if (r2.isShowMapPoi == true) goto L9;
        r0 = 2;
    L9:
        r6.setMapType(r0);
        goto L10
    }

    private static final void initView$lambda$1(DetailMapCardFragment r0) {
        r0.onPause();
    }

    private static final void initView$lambda$2(DetailMapCardFragment r0) {
        r0.onResume();
    }

    private static final ImageView showMapPoi_delegate$lambda$0(DetailMapCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_map_showMapPoi);
    }

    @Override // com.sma.smartv3.ui.sport.BaseDetailCardFragment, com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getShowMapPoi().setOnClickListener(new iXIXX1O0(this));
        new Handler().postDelayed(new XiiXOI(this), 250);
        new Handler().postDelayed(new I0OX10I(this), 300);
    }

    @Override // com.sma.smartv3.ui.sport.BaseDetailCardFragment, com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        super.initializedMapFinish();
        if (isInChinaMainland() == true) goto L6;
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
        return;
    }

    public final boolean isShowMapPoi() {
        return this.isShowMapPoi;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_map;
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void mapStatusBaiDuCenterPoint(@aa1 ArrayList<CustomLatLng> r2) {
        Intrinsics.X0O(r2, "locationList");
        getMBaiDuMap().setMapStatus(iOXO11i1.O00(r2));
    }

    public final void setShowMapPoi(boolean r1) {
        this.isShowMapPoi = r1;
    }
}
