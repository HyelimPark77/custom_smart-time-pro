package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.a55;
import com.android.mltcode.paycertificationapi.a65;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b55;
import com.android.mltcode.paycertificationapi.b65;
import com.android.mltcode.paycertificationapi.c55;
import com.android.mltcode.paycertificationapi.c65;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.d55;
import com.android.mltcode.paycertificationapi.d65;
import com.android.mltcode.paycertificationapi.e55;
import com.android.mltcode.paycertificationapi.e65;
import com.android.mltcode.paycertificationapi.f55;
import com.android.mltcode.paycertificationapi.f65;
import com.android.mltcode.paycertificationapi.g55;
import com.android.mltcode.paycertificationapi.g65;
import com.android.mltcode.paycertificationapi.h55;
import com.android.mltcode.paycertificationapi.h65;
import com.android.mltcode.paycertificationapi.i55;
import com.android.mltcode.paycertificationapi.i65;
import com.android.mltcode.paycertificationapi.j55;
import com.android.mltcode.paycertificationapi.j65;
import com.android.mltcode.paycertificationapi.js4;
import com.android.mltcode.paycertificationapi.k55;
import com.android.mltcode.paycertificationapi.l55;
import com.android.mltcode.paycertificationapi.m55;
import com.android.mltcode.paycertificationapi.n55;
import com.android.mltcode.paycertificationapi.o55;
import com.android.mltcode.paycertificationapi.p55;
import com.android.mltcode.paycertificationapi.q55;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r55;
import com.android.mltcode.paycertificationapi.s55;
import com.android.mltcode.paycertificationapi.t55;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u55;
import com.android.mltcode.paycertificationapi.v45;
import com.android.mltcode.paycertificationapi.v55;
import com.android.mltcode.paycertificationapi.w45;
import com.android.mltcode.paycertificationapi.w55;
import com.android.mltcode.paycertificationapi.x45;
import com.android.mltcode.paycertificationapi.x55;
import com.android.mltcode.paycertificationapi.y45;
import com.android.mltcode.paycertificationapi.y55;
import com.android.mltcode.paycertificationapi.z45;
import com.android.mltcode.paycertificationapi.z55;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleAppSportState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportShowDataSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,384:1\n19#2:385\n15#2:386\n85#2,3:387\n94#2:390\n90#2:391\n*S KotlinDebug\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n*L\n33#1:385\n33#1:386\n72#1:387,3\n139#1:390\n139#1:391\n*E\n"})
public final class SportShowDataSelectActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy itemDesc$delegate;

    @aa1
    private final Lazy itemValue$delegate;

    @aa1
    private final Lazy mSportCallback$delegate;
    private js4 sportDataOrder;
    private SportDataType type;

    @aa1
    private final AppUser userProfile;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[SportDataType.values().length];
            r0[SportDataType.TIME.ordinal()] = 1;     // Catch: NoSuchFieldError -> L14
        L25:
            r0[SportDataType.DISTANCE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L15
        L39:
            r0[SportDataType.PACE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L16
        L29:
            r0[SportDataType.CALORIES.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L31:
            r0[SportDataType.STEP.ordinal()] = 5;     // Catch: NoSuchFieldError -> L18
        L23:
            r0[SportDataType.SPM.ordinal()] = 6;     // Catch: NoSuchFieldError -> L19
        L33:
            r0[SportDataType.ALTITUDE.ordinal()] = 7;     // Catch: NoSuchFieldError -> L20
        L35:
            r0[SportDataType.HEARTRATE.ordinal()] = 8;     // Catch: NoSuchFieldError -> L21
        L27:
            r0[SportDataType.SPEED.ordinal()] = 9;     // Catch: NoSuchFieldError -> L22
        L12:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements XO0O10.OXO1 {
        public final /* synthetic */ SportShowDataSelectActivity OXO1;

        public XIi00iiXO(SportShowDataSelectActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public void IO(SportData r3) {
            Intrinsics.X0O(r3, "sportData");
            SportShowDataSelectActivity r0 = this.OXO1;
            SportDataType r1 = SportShowDataSelectActivity.access$getType$p(r0);
            if (r1 != null) goto L5;
            Intrinsics.XXO("type");
            r1 = null;
        L5:
            SportShowDataSelectActivity.access$showItemValue(r0, r1, r3);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void O00(boolean r1) {
            super.O00(r1);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void OIi0(Location r1) {
            super.OIi0(r1);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void XO0O10(BleAppSportState r1) {
            super.XO0O10(r1);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void iO(int r1) {
            super.iO(r1);
        }
    }

    public SportShowDataSelectActivity() {
        this.itemValue$delegate = LazyKt__LazyJVMKt.iO(new e65(this));
        this.itemDesc$delegate = LazyKt__LazyJVMKt.iO(new f65(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.mSportCallback$delegate = LazyKt__LazyJVMKt.iO(new g65(this));
    }

    public static /* synthetic */ Unit I0iXXO(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3$0(r0, r1);
    }

    public static /* synthetic */ Unit I1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$5$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void I1XOi1(SportShowDataSelectActivity r0) {
        showData$lambda$0(r0);
    }

    public static /* synthetic */ Unit II1Xi0(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit IIX1OXO(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3(r0, r1);
    }

    public static /* synthetic */ Unit IXXOO(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$10$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit Ii1iii0(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$6$0(r0, r1);
    }

    public static /* synthetic */ Unit O001I(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$7(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$6$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O1O(SportShowDataSelectActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$3$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OX(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$8(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit X01IiOiIi(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0i1O(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X100O(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$5(r0, r1);
    }

    public static /* synthetic */ Unit X11I(SportShowDataSelectActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X11iII1O1(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1(r0, r1);
    }

    public static /* synthetic */ Unit X1IX(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$10$0(r0, r1);
    }

    public static /* synthetic */ XIi00iiXO X1ii(SportShowDataSelectActivity r0) {
        return mSportCallback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$4$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XX1Oi(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$9$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XXI(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$4(r0, r1);
    }

    public static /* synthetic */ PFMedium XXIIO1i11(SportShowDataSelectActivity r0) {
        return itemDesc_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXO(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$7$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XXX11i(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$0$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XiOIO(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$5$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$2(r0, r1);
    }

    public static final /* synthetic */ SportDataType access$getType$p(SportShowDataSelectActivity r0) {
        return r0.type;
    }

    public static final /* synthetic */ void access$showItemValue(SportShowDataSelectActivity r0, SportDataType r1, SportData r2) {
        r0.showItemValue(r1, r2);
    }

    private final XIi00iiXO getMSportCallback() {
        return (XIi00iiXO) getValue();
    }

    private final Pair<String, String> getOneContent(SportDataType r5, SportData r6) {
        switch(OXO1.OXO1[r5.ordinal()]) {
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        return new Pair(String.valueOf(cp5.X1ii(r6.getMSpeed(), this.userProfile.getUnit(), false, 4, null)), getString(R.string.speed));
    L9:
        return new Pair(String.valueOf(XO0O10.OXO1.iI()), getString(R.string.heart_rate));
    L11:
        return new Pair(String.valueOf(r6.getMAltitude()), getString(R.string.altitude));
    L13:
        return new Pair(String.valueOf(r6.getMSpm()), getString(R.string.spm));
    L15:
        return new Pair(String.valueOf(r6.getMStep()), getString(R.string.steps));
    L17:
        return new Pair(String.valueOf(r6.getMCalorie()), getString(R.string.calories));
    L19:
        return new Pair(cp5.Ii1iii0(r6.getMPace(), this.userProfile.getUnit()), getString(R.string.pace));
    L21:
        return new Pair(String.valueOf(cp5.X1ii(r6.getMDistance(), this.userProfile.getUnit(), false, 4, null)), getString(R.string.distance));
    L23:
        return new Pair(O0X11OiO.iXiX011(r6.getMDuration() * 1000), getString(R.string.time));
    }

    public static /* synthetic */ Unit i010I(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$9$0(r0, r1);
    }

    public static /* synthetic */ Unit iI(SportShowDataSelectActivity r0) {
        return onInitBaseLayoutAfter$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit iIXi1iiXI(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$6(r0, r1);
    }

    public static /* synthetic */ Unit iIiiO(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit iOO1ii1(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$4$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$7$0(r0, r1);
    }

    public static /* synthetic */ DINCondBold iX(SportShowDataSelectActivity r0) {
        return itemValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iX1O1(SportShowDataSelectActivity r0, View r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$8$0(r0, r1);
    }

    public static /* synthetic */ Unit iXiX011(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$10(r0, r1);
    }

    public static /* synthetic */ Unit iXiiiO(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$0$0$0$8$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit iiiO(SportShowDataSelectActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0$9(r0, r1);
    }

    private static final PFMedium itemDesc_delegate$lambda$0(SportShowDataSelectActivity r1) {
        return (PFMedium) r1.findViewById(R.id.itemDesc);
    }

    private static final DINCondBold itemValue_delegate$lambda$0(SportShowDataSelectActivity r1) {
        return (DINCondBold) r1.findViewById(R.id.itemValue);
    }

    private static final XIi00iiXO mSportCallback_delegate$lambda$0(SportShowDataSelectActivity r1) {
        return new XIi00iiXO(r1);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(final SportShowDataSelectActivity r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new i55(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(final SportShowDataSelectActivity r1) {
        r1.renderAdapter(new p55(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final SportShowDataSelectActivity r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$renderAdapter");
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new q55(r6));
        q62 r0 = q62.OXO1;
        if (r0.XI1OX0IO() == true) goto L5;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new u55(r6));
    L8:
        XO0O10 r2 = XO0O10.OXO1;
        if (r2.X0i1O().getMMode() != 10) goto L12;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new v55(r6));
    L18:
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new y55(r6));
        if (r0.XO11O() == false) goto L22;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new z55(r6));
    L22:
        if (r0.O1XXXX(r2.X0i1O().getMMode()) == false) goto L25;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new a65(r6));
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new b65(r6));
    L25:
        if (q62.Oi0(r0, r2.X0i1O().getMMode(), false, 2, null) == false) goto L28;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new s55(r6));
    L28:
        return Unit.OXO1;
    L12:
        if (r0.XI1OX0IO() == true) goto L14;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new x55(r6));
        goto L18
    L14:
        if (a15.iO(r2.X0i1O().getMMode()) == false) goto L16;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new w55(r6));
    L16:
        Unit r3 = Unit.OXO1;
        goto L18
    L5:
        if (a15.iO(XO0O10.OXO1.X0i1O().getMMode()) == false) goto L8;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_sport_data, new t55(r6));
        goto L8
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.TIME);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_time_108;
    L12:
        r3.setItemBindOverride(new c55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new b55(r2));
        r4 = R.drawable.icon_time_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.TIME);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.time);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.DISTANCE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_distance_108;
    L12:
        r3.setItemBindOverride(new i65(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new h65(r2));
        r4 = R.drawable.icon_distance_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.DISTANCE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.distance);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.ALTITUDE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_altitude_108;
    L12:
        r3.setItemBindOverride(new e55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new d55(r2));
        r4 = R.drawable.icon_altitude_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.ALTITUDE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.altitude);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.DISTANCE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_distance_108;
    L12:
        r3.setItemBindOverride(new y45(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new x45(r2));
        r4 = R.drawable.icon_distance_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.DISTANCE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.distance);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.SPEED);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_speed_108;
    L12:
        r3.setItemBindOverride(new c65(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new r55(r2));
        r4 = R.drawable.icon_speed_no_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.SPEED);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.speed);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.PACE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_pace_108;
    L12:
        r3.setItemBindOverride(new m55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new l55(r2));
        r4 = R.drawable.icon_pace_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.PACE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.pace);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.PACE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_pace_108;
    L12:
        r3.setItemBindOverride(new h55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new f55(r2));
        r4 = R.drawable.icon_pace_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.PACE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.pace);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.CALORIES);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_calories_108;
    L12:
        r3.setItemBindOverride(new o55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new n55(r2));
        r4 = R.drawable.icon_calories_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.CALORIES);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.calories);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.HEARTRATE);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_hr_108;
    L12:
        r3.setItemBindOverride(new k55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new j55(r2));
        r4 = R.drawable.icon_n_hr_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.HEARTRATE);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.heart_rate);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.STEP);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_step_108;
    L12:
        r3.setItemBindOverride(new a55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new z45(r2));
        r4 = R.drawable.icon_step_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.STEP);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.steps);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9(final SportShowDataSelectActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        js4 r0 = r2.sportDataOrder;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Integer r1 = r0.XO0O10().get(SportDataType.SPM);
        if (r1 != null) goto L9;
    L11:
        final int r4 = R.drawable.icon_spm_108;
    L12:
        r3.setItemBindOverride(new g55(r4));
        return Unit.OXO1;
    L9:
        if (r1.intValue() != 0) goto L11;
        r3.setItemClick(new v45(r2));
        r4 = R.drawable.icon_spm_n_108;
        goto L12
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9$0(SportShowDataSelectActivity r1, View r2) {
        Intrinsics.X0O(r2, "it");
        r1.showData(SportDataType.SPM);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9$1(int r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L5;
        r5.setText(R.string.spm);
    L5:
        ImageView r6 = r1.img(R.id.iv);
        if (r6 == null) goto L9;
        r6.setImageResource(r0);
    L9:
        return Unit.OXO1;
    }

    private final void showData(SportDataType r8) {
        js4 r0 = this.sportDataOrder;
        js4 r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("sportDataOrder");
        r0 = null;
    L5:
        Iterator<Map.Entry<SportDataType, Integer>> r2 = r0.XO0O10().entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L14;
        Map.Entry<SportDataType, Integer> r3 = r2.next();
        SportDataType r5 = r3.getKey();
        if (r3.getValue().intValue() != getMArg1()) goto L7;
        js4 r4 = this.sportDataOrder;
        if (r4 != null) goto L13;
        Intrinsics.XXO("sportDataOrder");
        r4 = null;
    L13:
        r4.XO0O10().put(r5, 0);
        goto L7
    L14:
        js4 r6 = this.sportDataOrder;
        if (r6 != null) goto L17;
        Intrinsics.XXO("sportDataOrder");
        r6 = null;
    L17:
        r6.XO0O10().put(r8, Integer.valueOf(getMArg1()));
        this.type = r8;
        if (r8 != null) goto L20;
        Intrinsics.XXO("type");
        r8 = null;
    L20:
        XO0O10 r7 = XO0O10.OXO1;
        showItemValue(r8, r7.X0i1O());
        SPUtils r9 = a01.OXO1.IiI10X();
        String r10 = String.valueOf(r7.X0i1O().getMMode());
        js4 r11 = this.sportDataOrder;
        if (r11 != null) goto L23;
        Intrinsics.XXO("sportDataOrder");
        r11 = null;
    L23:
        r9.put(r10 + '_' + js4.class.getName(), new Gson().toJson(r11), false);
        js4 r12 = this.sportDataOrder;
        if (r12 != null) goto L26;
        Intrinsics.XXO("sportDataOrder");
    L27:
        LogUtils.i(new Object[]{"sportDataOrder", r1});
        new Handler().postDelayed(new w45(this), 200);
        return;
    L26:
        r1 = r12;
        goto L27
    }

    private static final void showData$lambda$0(SportShowDataSelectActivity r0) {
        r0.finish();
    }

    private final void showItemValue(SportDataType r3, SportData r4) {
        Pair<String, String> r5 = getOneContent(r3, r4);
        String r0 = r5.component1();
        String r6 = r5.component2();
        if (q62.OXO1.XO11O() == false) goto L5;
    L8:
        getItemValue().setText(r0);
        getItemDesc().setText(r6);
        return;
    L5:
        if (r3 != SportDataType.HEARTRATE) goto L8;
        getItemValue().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        getItemDesc().setText("");
    }

    public final PFMedium getItemDesc() {
        return (PFMedium) getValue();
    }

    public final DINCondBold getItemValue() {
        return (DINCondBold) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_show_data_select;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        XO0O10.OXO1.XOO0XOOii(getMSportCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SPUtils r0 = a01.OXO1.IiI10X();
        String r1 = String.valueOf(XO0O10.OXO1.X0i1O().getMMode());
        SportDataType r4 = null;
        Object r2 = new js4(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        Object r3 = new Gson().fromJson(r0.getString(r1 + '_' + js4.class.getName()), js4.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        js4 r5 = (js4) r2;
        this.sportDataOrder = r5;
        js4 r6 = j65.OXO1(r5);
        this.sportDataOrder = r6;
        if (r6 != null) goto L9;
        Intrinsics.XXO("sportDataOrder");
        r6 = null;
    L9:
        Iterator<Map.Entry<SportDataType, Integer>> r7 = r6.XO0O10().entrySet().iterator();
    L11:
        if (r7.hasNext() == false) goto L15;
        Map.Entry<SportDataType, Integer> r8 = r7.next();
        SportDataType r9 = r8.getKey();
        if (r8.getValue().intValue() != getMArg1()) goto L11;
        this.type = r9;
        goto L11
    L15:
        SportDataType r10 = this.type;
        if (r10 != null) goto L18;
        Intrinsics.XXO("type");
    L19:
        XO0O10 r11 = XO0O10.OXO1;
        showItemValue(r4, r11.X0i1O());
        r11.XiOIii1(getMSportCallback());
        setTitle("");
        getRecyclerView().setLayoutManager(new GridLayoutManager(this, 3));
        renderAdapter(new d65(this));
        return;
    L18:
        r4 = r10;
        goto L19
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
