package com.sma.smartv3.p610ui.sport;

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
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iXOO;
import com.android.mltcode.paycertificationapi.a94;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1Ii1i11X;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.sma.smartv3.p610ui.sport.DetailDataCardFragment;
import com.sma.smartv3.pro.R;
import java.io.IOException;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailDataCardFragment extends DetailCaloriesCardFragment {

    @tb1
    private a94 mEditPop;

    @tb1
    private xz3 mSelectAvatarPopup;

    @aa1
    private final Lazy mEditBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO111ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mEditBtn_delegate$lambda$0(this.f3174IO);
        }
    });

    @aa1
    private final Lazy mCustomize$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiI00O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mCustomize_delegate$lambda$0(this.f5241IO);
        }
    });

    @aa1
    private final Lazy mCameraBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1OX0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mCameraBtn_delegate$lambda$0(this.f4477IO);
        }
    });

    @aa1
    private final Lazy mRlShareCard$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mRlShareCard_delegate$lambda$0(this.f2593IO);
        }
    });

    @aa1
    private final Lazy mRouteImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0O01OI0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mRouteImg_delegate$lambda$0(this.f1144IO);
        }
    });

    @aa1
    private final Lazy mRouteImgFigure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0O0ii0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mRouteImgFigure_delegate$lambda$0(this.f1148IO);
        }
    });

    @aa1
    private final Lazy tvDistanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i0OiIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.tvDistanceValue_delegate$lambda$0(this.f4378IO);
        }
    });

    @aa1
    private final Lazy tvDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiI11O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.tvDistanceUnit_delegate$lambda$0(this.f5251IO);
        }
    });

    @aa1
    private final Lazy tvDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0i0001
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.tvDuration_delegate$lambda$0(this.f2576IO);
        }
    });

    @aa1
    private final Lazy tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiXIIXOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.tvAvgPaceValue_delegate$lambda$0(this.f8636IO);
        }
    });

    @aa1
    private final Lazy tvAvgPaceValueLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO1O10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.tvAvgPaceValueLayout_delegate$lambda$0(this.f8032IO);
        }
    });

    @aa1
    private final Lazy mCrop$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX101XI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DetailDataCardFragment.mCrop_delegate$lambda$0(this.f8264IO);
        }
    });

    public static final class OXO1 implements i1Ii1i11X.XIi00iiXO {
        public final Uri OXO1;
        public final Uri XIi00iiXO;
        public final /* synthetic */ Context XO0O10;

        public OXO1(Context context) {
            this.XO0O10 = context;
            sz0 sz0Var = sz0.OXO1;
            this.OXO1 = sz0Var.XO0O10(uz0.II1Xi0(sz0Var));
            Uri uriFromFile = Uri.fromFile(uz0.iIXi1iiXI(sz0Var));
            Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
            this.XIi00iiXO = uriFromFile;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri OXO1() {
            return this.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public void XIi00iiXO(Uri uri) {
            Intrinsics.X0O(uri, "uri");
            xz3 xz3Var = DetailDataCardFragment.this.mSelectAvatarPopup;
            if (xz3Var != null) {
                xz3Var.dismiss();
            }
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.XO0O10.getContentResolver(), uri);
                DetailDataCardFragment detailDataCardFragment = DetailDataCardFragment.this;
                detailDataCardFragment.getMRouteImg().setImageBitmap(bitmap);
                detailDataCardFragment.getMRlShareCard().setBackground(null);
                detailDataCardFragment.getMRouteImgFigure().setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.android.mltcode.paycertificationapi.i1Ii1i11X.XIi00iiXO
        public Uri getResult() {
            return this.XIi00iiXO;
        }
    }

    private final ImageView getMCameraBtn() {
        return (ImageView) this.mCameraBtn$delegate.getValue();
    }

    private final i1Ii1i11X getMCrop() {
        return (i1Ii1i11X) this.mCrop$delegate.getValue();
    }

    private final TextView getMCustomize() {
        return (TextView) this.mCustomize$delegate.getValue();
    }

    private final ImageView getMEditBtn() {
        return (ImageView) this.mEditBtn$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getMRlShareCard() {
        return (View) this.mRlShareCard$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getMRouteImg() {
        return (ImageView) this.mRouteImg$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getMRouteImgFigure() {
        return (ImageView) this.mRouteImgFigure$delegate.getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) this.tvAvgPaceValue$delegate.getValue();
    }

    private final View getTvAvgPaceValueLayout() {
        return (View) this.tvAvgPaceValueLayout$delegate.getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) this.tvDistanceUnit$delegate.getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) this.tvDistanceValue$delegate.getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) this.tvDuration$delegate.getValue();
    }

    public static /* synthetic */ void initCustomizeText$default(DetailDataCardFragment detailDataCardFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        detailDataCardFragment.initCustomizeText(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCameraBtn_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (ImageView) detailDataCardFragment.getMView().findViewById(R.id.share_card_map_camera);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i1Ii1i11X mCrop_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        Context context = detailDataCardFragment.getContext();
        if (context != null) {
            return new i1Ii1i11X(context, detailDataCardFragment.new OXO1(context));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mCustomize_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (TextView) detailDataCardFragment.getMView().findViewById(R.id.share_card_customize_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mEditBtn_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (ImageView) detailDataCardFragment.getMView().findViewById(R.id.share_card_map_edit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mRlShareCard_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return detailDataCardFragment.getMView().findViewById(R.id.share_card_rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRouteImgFigure_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (ImageView) detailDataCardFragment.getMView().findViewById(R.id.share_card_route_image_figure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRouteImg_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (ImageView) detailDataCardFragment.getMView().findViewById(R.id.share_card_route_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0(xz3 xz3Var, final DetailDataCardFragment detailDataCardFragment) {
        hr1.OXO1.iOOX010X(xz3Var.XO0O10(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XX0iXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DetailDataCardFragment.selectAvatar$lambda$0$0$0(this.f4963IO, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$0$0(DetailDataCardFragment detailDataCardFragment, boolean z) {
        i1Ii1i11X mCrop = detailDataCardFragment.getMCrop();
        if (mCrop != null) {
            mCrop.m2012iO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAvatar$lambda$0$1(DetailDataCardFragment detailDataCardFragment) {
        i1Ii1i11X mCrop = detailDataCardFragment.getMCrop();
        if (mCrop != null) {
            mCrop.OIX0iXi();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEditPop() {
        if (this.mEditPop == null) {
            a94 a94Var = new a94(getMActivity(), 0, 2, null);
            a94Var.i010I().addTextChangedListener(new O0iXOO(60));
            a94Var.i010I().setTextColor(gk4.m1859iO(a94Var.XO0O10(), R.color.text_color_light));
            a94Var.XXX11i(new Function2() { // from class: com.android.mltcode.paycertificationapi.OIO1O0X0i
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj, Object obj2) {
                    return Boolean.valueOf(DetailDataCardFragment.showEditPop$lambda$0$0(this.f2991IO, (String) obj, ((Integer) obj2).intValue()));
                }
            });
            this.mEditPop = a94Var;
        }
        a94 a94Var2 = this.mEditPop;
        if (a94Var2 != null) {
            a94Var2.iX1O1(getMCustomize().getText().toString());
        }
        a94 a94Var3 = this.mEditPop;
        if (a94Var3 != null) {
            a94Var3.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showEditPop$lambda$0$0(DetailDataCardFragment detailDataCardFragment, String text, int i) {
        Intrinsics.X0O(text, "text");
        if (TextUtils.isEmpty(text)) {
            return true;
        }
        detailDataCardFragment.getMCustomize().setText(text);
        detailDataCardFragment.getMCustomize().setTextColor(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View tvAvgPaceValueLayout_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return detailDataCardFragment.getMView().findViewById(R.id.ll_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPaceValue_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (TextView) detailDataCardFragment.getMView().findViewById(R.id.tv_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceUnit_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (TextView) detailDataCardFragment.getMView().findViewById(R.id.tv_distance_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceValue_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (TextView) detailDataCardFragment.getMView().findViewById(R.id.tv_distance_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDuration_delegate$lambda$0(DetailDataCardFragment detailDataCardFragment) {
        return (TextView) detailDataCardFragment.getMView().findViewById(R.id.tv_duration);
    }

    public final void initCustomizeText(int i) {
        String string;
        TextView mCustomize = getMCustomize();
        if (i != 0) {
            string = i != 1 ? getString(R.string.customize_content3) : getString(R.string.customize_content2);
        } else {
            string = getString(R.string.customize_content1);
        }
        mCustomize.setText(string);
    }

    @Override // com.sma.smartv3.p610ui.sport.DetailCaloriesCardFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        i1Ii1i11X mCrop = getMCrop();
        if (mCrop != null) {
            i1Ii1i11X.X1ii(mCrop, this, null, 2, null);
        }
        getMEditBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IO1O0I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1766IO.showEditPop();
            }
        });
        if (getUserProfile().getGender() == 0) {
            getMRlShareCard().setBackgroundColor(Color.parseColor("#AA87CE"));
            getMRouteImgFigure().setImageResource(R.drawable.share_card_customize_woman_bg);
        }
        getMCameraBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I0OI1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1156IO.selectAvatar();
            }
        });
        q62 q62Var = q62.OXO1;
        if (q62.X0XI11I(q62Var, getMWorkout().getMMode(), false, 2, null)) {
            getTvDistanceValue().setText(String.valueOf(cp5.X1ii(getMWorkout().getMDistance(), getUserProfile().getUnit(), false, 4, null)));
            getTvDistanceUnit().setText(getString(cp5.XX0(getUserProfile().getUnit())));
        } else {
            getTvDistanceValue().setVisibility(4);
            getTvDistanceUnit().setVisibility(4);
        }
        getTvDuration().setText(O0X11OiO.iXiX011(getMWorkout().getMDuration() * 1000));
        if (q62.X0XI11I(q62Var, getMWorkout().getMMode(), false, 2, null)) {
            getTvAvgPaceValueLayout().setVisibility(0);
            getTvAvgPaceValue().setText(cp5.Ii1iii0(getMWorkout().getMPace(), getUserProfile().getUnit()));
        } else {
            getTvAvgPaceValueLayout().setVisibility(8);
        }
        initCustomizeText(new Random().nextInt(3));
    }

    @Override // com.sma.smartv3.p610ui.sport.DetailCaloriesCardFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail_share_card_data;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @tb1 Intent intent) throws IOException {
        super.onActivityResult(i, i2, intent);
        i1Ii1i11X mCrop = getMCrop();
        Intrinsics.XXI(mCrop);
        mCrop.XOO0ii0(i, i2, intent, 1.0d, 0.8d, DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    }

    public final void selectAvatar() {
        if (this.mSelectAvatarPopup == null) {
            final xz3 xz3Var = new xz3(getMActivity());
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11iIi001
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DetailDataCardFragment.selectAvatar$lambda$0$0(xz3Var, this);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1XO1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return DetailDataCardFragment.selectAvatar$lambda$0$1(this.f2791IO);
                }
            });
            this.mSelectAvatarPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectAvatarPopup;
        if (xz3Var2 != null) {
            xz3Var2.IIX1OXO();
        }
    }
}
