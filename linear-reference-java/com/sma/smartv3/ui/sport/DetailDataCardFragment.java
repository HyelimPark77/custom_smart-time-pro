package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.device.ads.DtbConstants;
import com.android.mltcode.paycertificationapi.I0O01OI0O;
import com.android.mltcode.paycertificationapi.I0O0ii0;
import com.android.mltcode.paycertificationapi.I0OI1;
import com.android.mltcode.paycertificationapi.IO1O0I;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0i0001;
import com.android.mltcode.paycertificationapi.O0iOI;
import com.android.mltcode.paycertificationapi.O0iXOO;
import com.android.mltcode.paycertificationapi.O11iIi001;
import com.android.mltcode.paycertificationapi.O1XO1;
import com.android.mltcode.paycertificationapi.OIO1O0X0i;
import com.android.mltcode.paycertificationapi.OO111ii;
import com.android.mltcode.paycertificationapi.X1i0OiIi;
import com.android.mltcode.paycertificationapi.XI1OX0X;
import com.android.mltcode.paycertificationapi.XX0iXO;
import com.android.mltcode.paycertificationapi.XiI00O;
import com.android.mltcode.paycertificationapi.XiI11O1;
import com.android.mltcode.paycertificationapi.a94;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.iO1O10;
import com.android.mltcode.paycertificationapi.iX101XI0;
import com.android.mltcode.paycertificationapi.iiXIIXOO;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.facebook.share.internal.ShareConstants;
import com.sma.smartv3.pro.R;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailDataCardFragment extends DetailCaloriesCardFragment {

    @aa1
    private final Lazy mCameraBtn$delegate;

    @aa1
    private final Lazy mCrop$delegate;

    @aa1
    private final Lazy mCustomize$delegate;

    @aa1
    private final Lazy mEditBtn$delegate;

    @tb1
    private a94 mEditPop;

    @aa1
    private final Lazy mRlShareCard$delegate;

    @aa1
    private final Lazy mRouteImg$delegate;

    @aa1
    private final Lazy mRouteImgFigure$delegate;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final Lazy tvAvgPaceValue$delegate;

    @aa1
    private final Lazy tvAvgPaceValueLayout$delegate;

    @aa1
    private final Lazy tvDistanceUnit$delegate;

    @aa1
    private final Lazy tvDistanceValue$delegate;

    @aa1
    private final Lazy tvDuration$delegate;

    public static final class OXO1 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;
        public final /* synthetic */ Context XO0O10;
        public final /* synthetic */ DetailDataCardFragment iO;

        public OXO1(DetailDataCardFragment r1, Context r2) {
            this.iO = r1;
            this.XO0O10 = r2;
            sz0 r3 = sz0.OXO1;
            this.OXO1 = r3.XO0O10(uz0.II1Xi0(r3));
            Uri r4 = Uri.fromFile(uz0.iIXi1iiXI(r3));
            Intrinsics.O10IXXX0X(r4, "fromFile(...)");
            this.XIi00iiXO = r4;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri OXO1() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public void XIi00iiXO(Uri r3) {
            Intrinsics.X0O(r3, ShareConstants.MEDIA_URI);
            xz3 r0 = DetailDataCardFragment.access$getMSelectAvatarPopup$p(this.iO);
            if (r0 == null) goto L10;
            r0.dismiss();
        L10:
            Bitmap r4 = MediaStore.Images.Media.getBitmap(this.XO0O10.getContentResolver(), r3);     // Catch: Exception -> L7
            DetailDataCardFragment r1 = this.iO;     // Catch: Exception -> L7
            DetailDataCardFragment.access$getMRouteImg(r1).setImageBitmap(r4);     // Catch: Exception -> L7
            DetailDataCardFragment.access$getMRlShareCard(r1).setBackground(null);     // Catch: Exception -> L7
            DetailDataCardFragment.access$getMRouteImgFigure(r1).setVisibility(8);     // Catch: Exception -> L7
            return;
        L7:
            e = move-exception;
            e.printStackTrace();
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    public DetailDataCardFragment() {
        this.mEditBtn$delegate = LazyKt__LazyJVMKt.iO(new OO111ii(this));
        this.mCustomize$delegate = LazyKt__LazyJVMKt.iO(new XiI00O(this));
        this.mCameraBtn$delegate = LazyKt__LazyJVMKt.iO(new XI1OX0X(this));
        this.mRlShareCard$delegate = LazyKt__LazyJVMKt.iO(new O0iOI(this));
        this.mRouteImg$delegate = LazyKt__LazyJVMKt.iO(new I0O01OI0O(this));
        this.mRouteImgFigure$delegate = LazyKt__LazyJVMKt.iO(new I0O0ii0(this));
        this.tvDistanceValue$delegate = LazyKt__LazyJVMKt.iO(new X1i0OiIi(this));
        this.tvDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new XiI11O1(this));
        this.tvDuration$delegate = LazyKt__LazyJVMKt.iO(new O0i0001(this));
        this.tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.iO(new iiXIIXOO(this));
        this.tvAvgPaceValueLayout$delegate = LazyKt__LazyJVMKt.iO(new iO1O10(this));
        this.mCrop$delegate = LazyKt__LazyJVMKt.iO(new iX101XI0(this));
    }

    public static /* synthetic */ TextView I0iXXO(DetailDataCardFragment r0) {
        return tvDuration_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(xz3 r0, DetailDataCardFragment r1) {
        return selectAvatar$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView I1XOi1(DetailDataCardFragment r0) {
        return mRouteImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(DetailDataCardFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ View IO(DetailDataCardFragment r0) {
        return mRlShareCard_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(DetailDataCardFragment r0) {
        return mCameraBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(DetailDataCardFragment r0) {
        return mRouteImgFigure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(DetailDataCardFragment r0) {
        return tvDistanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX(DetailDataCardFragment r0, boolean r1) {
        return selectAvatar$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ View OiIIX101O(DetailDataCardFragment r0) {
        return tvAvgPaceValueLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0O(DetailDataCardFragment r0) {
        return mEditBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(DetailDataCardFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XX0(DetailDataCardFragment r0) {
        return tvDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(DetailDataCardFragment r0) {
        return mCustomize_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(DetailDataCardFragment r0) {
        return tvAvgPaceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ i1Ii1i11X XiOIii1(DetailDataCardFragment r0) {
        return mCrop_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ View access$getMRlShareCard(DetailDataCardFragment r0) {
        return r0.getMRlShareCard();
    }

    public static final /* synthetic */ ImageView access$getMRouteImg(DetailDataCardFragment r0) {
        return r0.getMRouteImg();
    }

    public static final /* synthetic */ ImageView access$getMRouteImgFigure(DetailDataCardFragment r0) {
        return r0.getMRouteImgFigure();
    }

    public static final /* synthetic */ xz3 access$getMSelectAvatarPopup$p(DetailDataCardFragment r0) {
        return r0.mSelectAvatarPopup;
    }

    private final ImageView getMCameraBtn() {
        return (ImageView) getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) getValue();
    }

    private final TextView getMCustomize() {
        return (TextView) getValue();
    }

    private final ImageView getMEditBtn() {
        return (ImageView) getValue();
    }

    private final View getMRlShareCard() {
        return (View) getValue();
    }

    private final ImageView getMRouteImg() {
        return (ImageView) getValue();
    }

    private final ImageView getMRouteImgFigure() {
        return (ImageView) getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) getValue();
    }

    private final View getTvAvgPaceValueLayout() {
        return (View) getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) getValue();
    }

    public static /* synthetic */ boolean iIiiO(DetailDataCardFragment r0, String r1, int r2) {
        return showEditPop$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iOOX010X(DetailDataCardFragment r0) {
        return selectAvatar$lambda$0$1(r0);
    }

    public static /* synthetic */ void initCustomizeText$default(DetailDataCardFragment r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        r0.initCustomizeText(r1);
    }

    private static final void initView$lambda$0(DetailDataCardFragment r0, View r1) {
        r0.showEditPop();
    }

    private static final void initView$lambda$1(DetailDataCardFragment r0, View r1) {
        r0.selectAvatar();
    }

    private static final ImageView mCameraBtn_delegate$lambda$0(DetailDataCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_map_camera);
    }

    private static final i1Ii1i11X mCrop_delegate$lambda$0(DetailDataCardFragment r3) {
        Context r0 = r3.getContext();
        if (r0 != null) goto L5;
        return null;
    L5:
        return new i1Ii1i11X(r0, new OXO1(r3, r0));
    }

    private static final TextView mCustomize_delegate$lambda$0(DetailDataCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.share_card_customize_tv);
    }

    private static final ImageView mEditBtn_delegate$lambda$0(DetailDataCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_map_edit);
    }

    private static final View mRlShareCard_delegate$lambda$0(DetailDataCardFragment r1) {
        return r1.getMView().findViewById(R.id.share_card_rl);
    }

    private static final ImageView mRouteImgFigure_delegate$lambda$0(DetailDataCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_route_image_figure);
    }

    private static final ImageView mRouteImg_delegate$lambda$0(DetailDataCardFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.share_card_route_image);
    }

    private static final Unit selectAvatar$lambda$0$0(xz3 r2, final DetailDataCardFragment r3) {
        hr1.OXO1.iOOX010X(r2.XO0O10(), new XX0iXO(r3));
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$0$0(DetailDataCardFragment r0, boolean r1) {
        i1Ii1i11X r2 = r0.getMCrop();
        if (r2 == null) goto L6;
        r2.iO();
    L6:
        return Unit.OXO1;
    }

    private static final Unit selectAvatar$lambda$0$1(DetailDataCardFragment r0) {
        i1Ii1i11X r1 = r0.getMCrop();
        if (r1 == null) goto L6;
        r1.OIX0iXi();
    L6:
        return Unit.OXO1;
    }

    private final void showEditPop() {
        if (this.mEditPop != null) goto L5;
        int r4 = 0;
        a94 r0 = new a94(getMActivity(), r4, 2, null);
        r0.i010I().addTextChangedListener(new O0iXOO(60));
        r0.i010I().setTextColor(gk4.iO(r0.XO0O10(), R.color.text_color_light));
        r0.XXX11i(new OIO1O0X0i(this));
        this.mEditPop = r0;
    L5:
        a94 r1 = this.mEditPop;
        if (r1 == null) goto L8;
        r1.iX1O1(getMCustomize().getText().toString());
    L8:
        a94 r2 = this.mEditPop;
        if (r2 == null) goto L12;
        r2.IIX1OXO();
        return;
    }

    private static final boolean showEditPop$lambda$0$0(DetailDataCardFragment r1, String r2, int r3) {
        Intrinsics.X0O(r2, "text");
        if (TextUtils.isEmpty(r2) == true) goto L7;
        r1.getMCustomize().setText(r2);
        r1.getMCustomize().setTextColor(r3);
        return true;
    L7:
        return true;
    }

    private static final View tvAvgPaceValueLayout_delegate$lambda$0(DetailDataCardFragment r1) {
        return r1.getMView().findViewById(R.id.ll_pace_value);
    }

    private static final TextView tvAvgPaceValue_delegate$lambda$0(DetailDataCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_pace_value);
    }

    private static final TextView tvDistanceUnit_delegate$lambda$0(DetailDataCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_unit);
    }

    private static final TextView tvDistanceValue_delegate$lambda$0(DetailDataCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_value);
    }

    private static final TextView tvDuration_delegate$lambda$0(DetailDataCardFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_duration);
    }

    public final void initCustomizeText(int r3) {
        TextView r0 = getMCustomize();
        if (r3 != 0) goto L5;
        String r4 = getString(R.string.customize_content1);
    L9:
        r0.setText(r4);
        return;
    L5:
        if (r3 == 1) goto L7;
        r4 = getString(R.string.customize_content3);
        goto L9
    L7:
        r4 = getString(R.string.customize_content2);
        goto L9
    }

    @Override // com.sma.smartv3.ui.sport.DetailCaloriesCardFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        i1Ii1i11X r0 = getMCrop();
        if (r0 == null) goto L5;
        i1Ii1i11X.X1ii(r0, this, null, 2, null);
    L5:
        getMEditBtn().setOnClickListener(new IO1O0I(this));
        if (getUserProfile().getGender() != 0) goto L8;
        getMRlShareCard().setBackgroundColor(Color.parseColor("#AA87CE"));
        getMRouteImgFigure().setImageResource(R.drawable.share_card_customize_woman_bg);
    L8:
        getMCameraBtn().setOnClickListener(new I0OI1(this));
        q62 r1 = q62.OXO1;
        if (q62.X0XI11I(r1, getMWorkout().getMMode(), false, 2, null) == false) goto L11;
        getTvDistanceValue().setText(String.valueOf(cp5.X1ii(getMWorkout().getMDistance(), getUserProfile().getUnit(), false, 4, null)));
        getTvDistanceUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
    L12:
        getTvDuration().setText(O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000));
        if (q62.X0XI11I(r1, getMWorkout().getMMode(), false, 2, null) == false) goto L15;
        getTvAvgPaceValueLayout().setVisibility(0);
        getTvAvgPaceValue().setText(cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()));
    L16:
        initCustomizeText(new Random().nextInt(3));
        return;
    L15:
        getTvAvgPaceValueLayout().setVisibility(8);
        goto L16
    L11:
        getTvDistanceValue().setVisibility(4);
        getTvDistanceUnit().setVisibility(4);
        goto L12
    }

    @Override // com.sma.smartv3.ui.sport.DetailCaloriesCardFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_data;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int r11, int r12, @tb1 Intent r13) {
        super.onActivityResult(r11, r12, r13);
        i1Ii1i11X r0 = getMCrop();
        Intrinsics.XXI(r0);
        r0.XOO0ii0(r11, r12, r13, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    }

    public final void selectAvatar() {
        if (this.mSelectAvatarPopup != null) goto L5;
        final xz3 r0 = new xz3(getMActivity());
        r0.iX(new O11iIi001(r0, this));
        r0.i010I(new O1XO1(this));
        this.mSelectAvatarPopup = r0;
    L5:
        xz3 r1 = this.mSelectAvatarPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }
}
