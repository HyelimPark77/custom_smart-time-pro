package com.sma.smartv3.p610ui.sport;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.blankj.utilcode.util.ImageUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.sma.smartv3.p610ui.sport.BaseDetailCardFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class BaseDetailCardFragment extends SportDetailMapFragment {

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0XI00X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.ivAvatar_delegate$lambda$0(this.f4449IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX00XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.tvNickname_delegate$lambda$0(this.f3394IO);
        }
    });

    @aa1
    private final Lazy tvDetailname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOO00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.tvDetailname_delegate$lambda$0(this.f8092IO);
        }
    });

    @aa1
    private final Lazy paceValueLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0Xi0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.paceValueLayout_delegate$lambda$0(this.f8530IO);
        }
    });

    @aa1
    private final Lazy tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1II110
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.tvAvgPaceValue_delegate$lambda$0(this.f1385IO);
        }
    });

    @aa1
    private final Lazy btnShare$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1IX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.btnShare_delegate$lambda$0(this.f2713IO);
        }
    });

    @aa1
    private final Lazy shareCardView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXI0X01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseDetailCardFragment.shareCardView_delegate$lambda$0(this.f8311IO);
        }
    });
    private final float mBitmapRadius = 30.0f;

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnShare_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (Button) baseDetailCardFragment.getMView().findViewById(R.id.btn_share);
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) this.ivAvatar$delegate.getValue();
    }

    private final View getPaceValueLayout() {
        return (View) this.paceValueLayout$delegate.getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) this.tvAvgPaceValue$delegate.getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) this.tvDetailname$delegate.getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) this.tvNickname$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageViewRound ivAvatar_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (ImageViewRound) baseDetailCardFragment.getMView().findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View paceValueLayout_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return baseDetailCardFragment.getMView().findViewById(R.id.ll_pace_value);
    }

    private final void saveBitmap(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        CardView shareCardView = getShareCardView();
        Intrinsics.O10IXXX0X(shareCardView, "<get-shareCardView>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(shareCardView), 0.0f, 0.0f, (Paint) null);
        Bitmap roundCorner = ImageUtils.toRoundCorner(bitmapCreateBitmap, this.mBitmapRadius);
        Intrinsics.O10IXXX0X(roundCorner, "toRoundCorner(...)");
        ImageUtils.save(roundCorner, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView shareCardView_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (CardView) baseDetailCardFragment.getMView().findViewById(R.id.base_share_cardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareImage$lambda$0(BaseDetailCardFragment baseDetailCardFragment, Bitmap bitmap) {
        Intrinsics.XXI(bitmap);
        baseDetailCardFragment.saveBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareImage$lambda$1(BaseDetailCardFragment baseDetailCardFragment, Bitmap bitmap) {
        Intrinsics.XXI(bitmap);
        baseDetailCardFragment.saveBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPaceValue_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (TextView) baseDetailCardFragment.getMView().findViewById(R.id.tv_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDetailname_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (TextView) baseDetailCardFragment.getMView().findViewById(R.id.tv_detail_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickname_delegate$lambda$0(BaseDetailCardFragment baseDetailCardFragment) {
        return (TextView) baseDetailCardFragment.getMView().findViewById(R.id.edt_nickname);
    }

    public final Button getBtnShare() {
        return (Button) this.btnShare$delegate.getValue();
    }

    public final float getMBitmapRadius() {
        return this.mBitmapRadius;
    }

    public final CardView getShareCardView() {
        return (CardView) this.shareCardView$delegate.getValue();
    }

    @aa1
    public final String getTitle() {
        return q62.OXO1.i01OOiI(getMWorkout().getMMode());
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        avatarShow();
        if (q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null)) {
            getPaceValueLayout().setVisibility(0);
            getTvAvgPaceValue().setText(cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()));
        } else {
            getPaceValueLayout().setVisibility(4);
        }
        getBtnShare().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O010X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2396IO.shareImage();
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland()) {
            getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.zoomOut());
            getMBaiDuMap().getUiSettings().setAllGesturesEnabled(false);
        } else {
            getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
            getMGoogleMap().getUiSettings().setAllGesturesEnabled(false);
        }
    }

    public void shareImage() {
        if (isInChinaMainland()) {
            getMBaiDuMap().snapshot(new BaiduMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.XXXXI
                @Override // com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    BaseDetailCardFragment.shareImage$lambda$0(this.OXO1, bitmap);
                }
            });
        } else {
            getMGoogleMap().snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.android.mltcode.paycertificationapi.IO10010
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    BaseDetailCardFragment.shareImage$lambda$1(this.OXO1, bitmap);
                }
            });
        }
    }
}
