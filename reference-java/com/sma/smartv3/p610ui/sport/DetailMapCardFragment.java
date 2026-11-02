package com.sma.smartv3.p610ui.sport;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iOXO11i1;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.sma.smartv3.model.CustomLatLng;
import com.sma.smartv3.p610ui.sport.DetailMapCardFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailMapCardFragment extends BaseDetailCardFragment {

    @aa1
    private final Lazy showMapPoi$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXIiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailMapCardFragment.showMapPoi_delegate$lambda$0(this.f3474IO);
        }
    });
    private boolean isShowMapPoi = true;

    public DetailMapCardFragment() {
        setMStartIcon(R.drawable.icon_sport_map_start_v2);
        setMCurrentIcon(R.drawable.icon_sport_map_end_v2);
        setEndMarkerAnchorCenter(false);
        setShowLineMarker(true);
        setMBaiduLineStart(null);
        setMBaiduLineEnd(null);
    }

    private final ImageView getShowMapPoi() {
        return (ImageView) this.showMapPoi$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DetailMapCardFragment detailMapCardFragment, View view) {
        detailMapCardFragment.isShowMapPoi = !detailMapCardFragment.isShowMapPoi;
        if (detailMapCardFragment.isInChinaMainland()) {
            detailMapCardFragment.getMBaiDuMap().showMapPoi(detailMapCardFragment.isShowMapPoi);
        } else {
            detailMapCardFragment.getMGoogleMap().setMapType(detailMapCardFragment.isShowMapPoi ? 1 : 2);
        }
        detailMapCardFragment.getShowMapPoi().setImageResource(detailMapCardFragment.isShowMapPoi ? R.drawable.share_map_card_showpoi : R.drawable.share_map_card_noshowpoi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView showMapPoi_delegate$lambda$0(DetailMapCardFragment detailMapCardFragment) {
        return (ImageView) detailMapCardFragment.getMView().findViewById(R.id.share_card_map_showMapPoi);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseDetailCardFragment, com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getShowMapPoi().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iXIXX1O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailMapCardFragment.initView$lambda$0(this.f8328IO, view);
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XiiXOI
            @Override // java.lang.Runnable
            public final void run() {
                this.f5376IO.onPause();
            }
        }, 250L);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I0OX10I
            @Override // java.lang.Runnable
            public final void run() {
                this.f1185IO.onResume();
            }
        }, 300L);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseDetailCardFragment, com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        super.initializedMapFinish();
        if (isInChinaMainland()) {
            return;
        }
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
    }

    public final boolean isShowMapPoi() {
        return this.isShowMapPoi;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_map;
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void mapStatusBaiDuCenterPoint(@aa1 ArrayList<CustomLatLng> locationList) {
        Intrinsics.X0O(locationList, "locationList");
        getMBaiDuMap().setMapStatus(iOXO11i1.O00(locationList));
    }

    public final void setShowMapPoi(boolean z) {
        this.isShowMapPoi = z;
    }
}
