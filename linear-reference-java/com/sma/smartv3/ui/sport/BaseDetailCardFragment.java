package com.sma.smartv3.ui.sport;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.mltcode.paycertificationapi.I1II110;
import com.android.mltcode.paycertificationapi.IO10010;
import com.android.mltcode.paycertificationapi.O010X;
import com.android.mltcode.paycertificationapi.O1IX;
import com.android.mltcode.paycertificationapi.OX00XX;
import com.android.mltcode.paycertificationapi.XI0XI00X0;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XXXXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iOO00I;
import com.android.mltcode.paycertificationapi.iXI0X01;
import com.android.mltcode.paycertificationapi.ii0Xi0I;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.blankj.utilcode.util.ImageUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class BaseDetailCardFragment extends SportDetailMapFragment {

    @aa1
    private final Lazy btnShare$delegate;

    @aa1
    private final Lazy ivAvatar$delegate;
    private final float mBitmapRadius;

    @aa1
    private final Lazy paceValueLayout$delegate;

    @aa1
    private final Lazy shareCardView$delegate;

    @aa1
    private final Lazy tvAvgPaceValue$delegate;

    @aa1
    private final Lazy tvDetailname$delegate;

    @aa1
    private final Lazy tvNickname$delegate;

    public BaseDetailCardFragment() {
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new XI0XI00X0(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new OX00XX(this));
        this.tvDetailname$delegate = LazyKt__LazyJVMKt.iO(new iOO00I(this));
        this.paceValueLayout$delegate = LazyKt__LazyJVMKt.iO(new ii0Xi0I(this));
        this.tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.iO(new I1II110(this));
        this.btnShare$delegate = LazyKt__LazyJVMKt.iO(new O1IX(this));
        this.shareCardView$delegate = LazyKt__LazyJVMKt.iO(new iXI0X01(this));
        this.mBitmapRadius = 30.0f;
    }

    public static /* synthetic */ ImageViewRound I1(BaseDetailCardFragment r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(BaseDetailCardFragment r0, Bitmap r1) {
        shareImage$lambda$0(r0, r1);
    }

    public static /* synthetic */ void IXXOO(BaseDetailCardFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView O1O(BaseDetailCardFragment r0) {
        return tvDetailname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(BaseDetailCardFragment r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(BaseDetailCardFragment r0) {
        return tvAvgPaceValue_delegate$lambda$0(r0);
    }

    private final void avatarShow() {
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r0 = sz0.OXO1;
        if (uz0.OIi0(r0).exists() == false) goto L6;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r0)));
        return;
    }

    private static final Button btnShare_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_share);
    }

    private final ImageViewRound getIvAvatar() {
        return (ImageViewRound) getValue();
    }

    private final View getPaceValueLayout() {
        return (View) getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDetailname() {
        return (TextView) getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) getValue();
    }

    public static /* synthetic */ View i010I(BaseDetailCardFragment r0) {
        return paceValueLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOO1ii1(BaseDetailCardFragment r0, Bitmap r1) {
        shareImage$lambda$1(r0, r1);
    }

    public static /* synthetic */ Button iOOX010X(BaseDetailCardFragment r0) {
        return btnShare_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CardView iX(BaseDetailCardFragment r0) {
        return shareCardView_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(BaseDetailCardFragment r0, View r1) {
        r0.shareImage();
    }

    private static final ImageViewRound ivAvatar_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (ImageViewRound) r1.getMView().findViewById(R.id.iv_avatar);
    }

    private static final View paceValueLayout_delegate$lambda$0(BaseDetailCardFragment r1) {
        return r1.getMView().findViewById(R.id.ll_pace_value);
    }

    private final void saveBitmap(Bitmap r7) {
        Bitmap r0 = Bitmap.createBitmap(getShareCardView().getWidth(), getShareCardView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r0, "createBitmap(...)");
        Canvas r1 = new Canvas(r0);
        r1.drawBitmap(r7, 0.0f, 0.0f, null);
        XIi1i01O r8 = XIi1i01O.OXO1;
        CardView r4 = getShareCardView();
        Intrinsics.O10IXXX0X(r4, "<get-shareCardView>(...)");
        r1.drawBitmap(r8.XIi00iiXO(r4), 0.0f, 0.0f, null);
        Bitmap r9 = ImageUtils.toRoundCorner(r0, this.mBitmapRadius);
        Intrinsics.O10IXXX0X(r9, "toRoundCorner(...)");
        ImageUtils.save(r9, uz0.iOiXi11II(sz0.OXO1), Bitmap.CompressFormat.PNG);
        requireActivity().setResult(-1);
        requireActivity().finish();
    }

    private static final CardView shareCardView_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (CardView) r1.getMView().findViewById(R.id.base_share_cardView);
    }

    private static final void shareImage$lambda$0(BaseDetailCardFragment r0, Bitmap r1) {
        Intrinsics.XXI(r1);
        r0.saveBitmap(r1);
    }

    private static final void shareImage$lambda$1(BaseDetailCardFragment r0, Bitmap r1) {
        Intrinsics.XXI(r1);
        r0.saveBitmap(r1);
    }

    private static final TextView tvAvgPaceValue_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_pace_value);
    }

    private static final TextView tvDetailname_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_detail_name);
    }

    private static final TextView tvNickname_delegate$lambda$0(BaseDetailCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.edt_nickname);
    }

    public final Button getBtnShare() {
        return (Button) getValue();
    }

    public final float getMBitmapRadius() {
        return this.mBitmapRadius;
    }

    public final CardView getShareCardView() {
        return (CardView) getValue();
    }

    @aa1
    public final String getTitle() {
        return q62.OXO1.i01OOiI(getMWorkout().getMMode());
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTvDetailname().setText(getTitle());
        getTvNickname().setText(getUserProfile().getNickname());
        avatarShow();
        if (q62.X0XI11I(q62.OXO1, getMWorkout().getMMode(), false, 2, null) == false) goto L5;
        getPaceValueLayout().setVisibility(0);
        getTvAvgPaceValue().setText(cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()));
    L6:
        getBtnShare().setOnClickListener(new O010X(this));
        return;
    L5:
        getPaceValueLayout().setVisibility(4);
        goto L6
    }

    @Override // com.sma.smartv3.ui.sport.SportDetailMapFragment
    public void initializedMapFinish() {
        if (isInChinaMainland() == false) goto L6;
        getMBaiDuMap().setMapStatus(MapStatusUpdateFactory.zoomOut());
        getMBaiDuMap().getUiSettings().setAllGesturesEnabled(false);
        return;
    L6:
        getMGoogleMap().moveCamera(CameraUpdateFactory.zoomOut());
        getMGoogleMap().getUiSettings().setAllGesturesEnabled(false);
    }

    public void shareImage() {
        if (isInChinaMainland() == false) goto L6;
        getMBaiDuMap().snapshot(new XXXXI(this));
        return;
    L6:
        getMGoogleMap().snapshot(new IO10010(this));
    }
}
