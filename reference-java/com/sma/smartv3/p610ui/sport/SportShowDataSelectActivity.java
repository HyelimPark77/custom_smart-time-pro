package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.j65;
import com.android.mltcode.paycertificationapi.js4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p610ui.sport.SportShowDataSelectActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleAppSportState;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportShowDataSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,384:1\n19#2:385\n15#2:386\n85#2,3:387\n94#2:390\n90#2:391\n*S KotlinDebug\n*F\n+ 1 SportShowDataSelectActivity.kt\ncom/sma/smartv3/ui/sport/SportShowDataSelectActivity\n*L\n33#1:385\n33#1:386\n72#1:387,3\n139#1:390\n139#1:391\n*E\n"})
public final class SportShowDataSelectActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy mSportCallback$delegate;
    private js4 sportDataOrder;
    private SportDataType type;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy itemValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e65
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportShowDataSelectActivity.itemValue_delegate$lambda$0(this.f6345IO);
        }
    });

    @aa1
    private final Lazy itemDesc$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f65
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportShowDataSelectActivity.itemDesc_delegate$lambda$0(this.f6588IO);
        }
    });

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[SportDataType.values().length];
            try {
                iArr[SportDataType.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportDataType.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportDataType.PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportDataType.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportDataType.STEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportDataType.SPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportDataType.ALTITUDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportDataType.HEARTRATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportDataType.SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements XO0O10.OXO1 {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        /* JADX INFO: renamed from: IO */
        public void mo38602IO(SportData sportData) {
            Intrinsics.X0O(sportData, "sportData");
            SportShowDataSelectActivity sportShowDataSelectActivity = SportShowDataSelectActivity.this;
            SportDataType sportDataType = sportShowDataSelectActivity.type;
            if (sportDataType == null) {
                Intrinsics.XXO("type");
                sportDataType = null;
            }
            sportShowDataSelectActivity.showItemValue(sportDataType, sportData);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void O00(boolean z) {
            super.O00(z);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void OIi0(Location location) {
            super.OIi0(location);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        public /* bridge */ void XO0O10(BleAppSportState bleAppSportState) {
            super.XO0O10(bleAppSportState);
        }

        @Override // com.sma.smartv3.ui.sport.XO0O10.OXO1
        /* JADX INFO: renamed from: iO */
        public /* bridge */ void mo38603iO(int i) {
            super.mo38603iO(i);
        }
    }

    public SportShowDataSelectActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mSportCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportShowDataSelectActivity.mSportCallback_delegate$lambda$0(this.f6821IO);
            }
        });
    }

    private final XIi00iiXO getMSportCallback() {
        return (XIi00iiXO) this.mSportCallback$delegate.getValue();
    }

    private final Pair<String, String> getOneContent(SportDataType sportDataType, SportData sportData) {
        switch (OXO1.OXO1[sportDataType.ordinal()]) {
            case 1:
                return new Pair<>(O0X11OiO.iXiX011(sportData.getMDuration() * 1000), getString(R.string.time));
            case 2:
                return new Pair<>(String.valueOf(cp5.X1ii(sportData.getMDistance(), this.userProfile.getUnit(), false, 4, null)), getString(R.string.distance));
            case 3:
                return new Pair<>(cp5.Ii1iii0(sportData.getMPace(), this.userProfile.getUnit()), getString(R.string.pace));
            case 4:
                return new Pair<>(String.valueOf(sportData.getMCalorie()), getString(R.string.calories));
            case 5:
                return new Pair<>(String.valueOf(sportData.getMStep()), getString(R.string.steps));
            case 6:
                return new Pair<>(String.valueOf(sportData.getMSpm()), getString(R.string.spm));
            case 7:
                return new Pair<>(String.valueOf(sportData.getMAltitude()), getString(R.string.altitude));
            case 8:
                return new Pair<>(String.valueOf(XO0O10.OXO1.m38659iI()), getString(R.string.heart_rate));
            case 9:
                return new Pair<>(String.valueOf(cp5.X1ii(sportData.getMSpeed(), this.userProfile.getUnit(), false, 4, null)), getString(R.string.speed));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium itemDesc_delegate$lambda$0(SportShowDataSelectActivity sportShowDataSelectActivity) {
        return (PFMedium) sportShowDataSelectActivity.findViewById(R.id.itemDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold itemValue_delegate$lambda$0(SportShowDataSelectActivity sportShowDataSelectActivity) {
        return (DINCondBold) sportShowDataSelectActivity.findViewById(R.id.itemValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XIi00iiXO mSportCallback_delegate$lambda$0(SportShowDataSelectActivity sportShowDataSelectActivity) {
        return sportShowDataSelectActivity.new XIi00iiXO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        sportShowDataSelectActivity.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.i55
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0(this.f7758IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(final SportShowDataSelectActivity sportShowDataSelectActivity) {
        sportShowDataSelectActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.p55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0(this.f10297IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.q55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$0(this.f10516IO, (DslAdapterItem) obj);
            }
        });
        q62 q62Var = q62.OXO1;
        if (!q62Var.XI1OX0IO()) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.u55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$2(this.f11426IO, (DslAdapterItem) obj);
                }
            });
        } else if (a15.m1445iO(XO0O10.OXO1.X0i1O().getMMode())) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.t55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$1(this.f11193IO, (DslAdapterItem) obj);
                }
            });
        }
        XO0O10 xo0o10 = XO0O10.OXO1;
        if (xo0o10.X0i1O().getMMode() == 10) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.v55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$3(this.f11650IO, (DslAdapterItem) obj);
                }
            });
        } else if (q62Var.XI1OX0IO()) {
            if (a15.m1445iO(xo0o10.X0i1O().getMMode())) {
                DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.w55
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$4(this.f11889IO, (DslAdapterItem) obj);
                    }
                });
            }
            Unit unit = Unit.OXO1;
        } else {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.x55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$5(this.f12109IO, (DslAdapterItem) obj);
                }
            });
        }
        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.y55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$6(this.f12314IO, (DslAdapterItem) obj);
            }
        });
        if (q62Var.XO11O()) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.z55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$7(this.f12544IO, (DslAdapterItem) obj);
                }
            });
        }
        if (q62Var.O1XXXX(xo0o10.X0i1O().getMMode())) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.a65
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$8(this.f5429IO, (DslAdapterItem) obj);
                }
            });
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.b65
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$9(this.f5677IO, (DslAdapterItem) obj);
                }
            });
        }
        if (q62.Oi0(q62Var, xo0o10.X0i1O().getMMode(), false, 2, null)) {
            DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_sport_data, new Function1() { // from class: com.android.mltcode.paycertificationapi.s55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$10(this.f10970IO, (DslAdapterItem) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.TIME);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.b55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$0$0(this.f5669IO, (View) obj);
                }
            });
            i = R.drawable.icon_time_n_108;
        } else {
            i = R.drawable.icon_time_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.c55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$0$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.TIME);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$0$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.time);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.DISTANCE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.h65
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$1$0(this.f7050IO, (View) obj);
                }
            });
            i = R.drawable.icon_distance_n_108;
        } else {
            i = R.drawable.icon_distance_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.i65
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$1$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.DISTANCE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$1$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.distance);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.ALTITUDE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.d55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$10$0(this.f6132IO, (View) obj);
                }
            });
            i = R.drawable.icon_altitude_n_108;
        } else {
            i = R.drawable.icon_altitude_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.e55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$10$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.ALTITUDE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$10$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.altitude);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.DISTANCE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.x45
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$2$0(this.f12104IO, (View) obj);
                }
            });
            i = R.drawable.icon_distance_n_108;
        } else {
            i = R.drawable.icon_distance_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.y45
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$2$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.DISTANCE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$2$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.distance);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.SPEED);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.r55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$3$0(this.f10753IO, (View) obj);
                }
            });
            i = R.drawable.icon_speed_no_108;
        } else {
            i = R.drawable.icon_speed_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.c65
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$3$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.SPEED);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$3$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.speed);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.PACE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.l55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$4$0(this.f9361IO, (View) obj);
                }
            });
            i = R.drawable.icon_pace_n_108;
        } else {
            i = R.drawable.icon_pace_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.m55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$4$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.PACE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$4$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.pace);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.PACE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.f55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$5$0(this.f6578IO, (View) obj);
                }
            });
            i = R.drawable.icon_pace_n_108;
        } else {
            i = R.drawable.icon_pace_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.h55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$5$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.PACE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$5$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.pace);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.CALORIES);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.n55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$6$0(this.f9852IO, (View) obj);
                }
            });
            i = R.drawable.icon_calories_n_108;
        } else {
            i = R.drawable.icon_calories_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.o55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$6$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.CALORIES);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$6$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.calories);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.HEARTRATE);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.j55
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$7$0(this.f8883IO, (View) obj);
                }
            });
            i = R.drawable.icon_n_hr_108;
        } else {
            i = R.drawable.icon_hr_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.k55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$7$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.HEARTRATE);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$7$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.heart_rate);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.STEP);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.z45
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$8$0(this.f12537IO, (View) obj);
                }
            });
            i = R.drawable.icon_step_n_108;
        } else {
            i = R.drawable.icon_step_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.a55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$8$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.STEP);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$8$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.steps);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9(final SportShowDataSelectActivity sportShowDataSelectActivity, DslAdapterItem dslItem) {
        final int i;
        Intrinsics.X0O(dslItem, "$this$dslItem");
        js4 js4Var = sportShowDataSelectActivity.sportDataOrder;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        Integer num = js4Var.XO0O10().get(SportDataType.SPM);
        if (num != null && num.intValue() == 0) {
            dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.v45
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$9$0(this.f11647IO, (View) obj);
                }
            });
            i = R.drawable.icon_spm_n_108;
        } else {
            i = R.drawable.icon_spm_108;
        }
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.g55
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0$0$0$9$1(i, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9$0(SportShowDataSelectActivity sportShowDataSelectActivity, View it) {
        Intrinsics.X0O(it, "it");
        sportShowDataSelectActivity.showData(SportDataType.SPM);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0$9$1(int i, DslViewHolder itemHolder, int i2, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.spm);
        }
        ImageView imageViewImg = itemHolder.img(R.id.f51417iv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(i);
        }
        return Unit.OXO1;
    }

    private final void showData(SportDataType sportDataType) {
        js4 js4Var = this.sportDataOrder;
        js4 js4Var2 = null;
        if (js4Var == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var = null;
        }
        for (Map.Entry<SportDataType, Integer> entry : js4Var.XO0O10().entrySet()) {
            SportDataType key = entry.getKey();
            if (entry.getValue().intValue() == getMArg1()) {
                js4 js4Var3 = this.sportDataOrder;
                if (js4Var3 == null) {
                    Intrinsics.XXO("sportDataOrder");
                    js4Var3 = null;
                }
                js4Var3.XO0O10().put(key, 0);
            }
        }
        js4 js4Var4 = this.sportDataOrder;
        if (js4Var4 == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var4 = null;
        }
        js4Var4.XO0O10().put(sportDataType, Integer.valueOf(getMArg1()));
        this.type = sportDataType;
        if (sportDataType == null) {
            Intrinsics.XXO("type");
            sportDataType = null;
        }
        XO0O10 xo0o10 = XO0O10.OXO1;
        showItemValue(sportDataType, xo0o10.X0i1O());
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String strValueOf = String.valueOf(xo0o10.X0i1O().getMMode());
        js4 js4Var5 = this.sportDataOrder;
        if (js4Var5 == null) {
            Intrinsics.XXO("sportDataOrder");
            js4Var5 = null;
        }
        sPUtilsIiI10X.put(strValueOf + '_' + js4.class.getName(), new Gson().toJson(js4Var5), false);
        js4 js4Var6 = this.sportDataOrder;
        if (js4Var6 == null) {
            Intrinsics.XXO("sportDataOrder");
        } else {
            js4Var2 = js4Var6;
        }
        LogUtils.m11130i("sportDataOrder", js4Var2);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.w45
            @Override // java.lang.Runnable
            public final void run() {
                this.f11880IO.finish();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showItemValue(SportDataType sportDataType, SportData sportData) {
        Pair<String, String> oneContent = getOneContent(sportDataType, sportData);
        String strComponent1 = oneContent.component1();
        String strComponent2 = oneContent.component2();
        if (q62.OXO1.XO11O() || sportDataType != SportDataType.HEARTRATE) {
            getItemValue().setText(strComponent1);
            getItemDesc().setText(strComponent2);
        } else {
            getItemValue().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
            getItemDesc().setText("");
        }
    }

    public final PFMedium getItemDesc() {
        return (PFMedium) this.itemDesc$delegate.getValue();
    }

    public final DINCondBold getItemValue() {
        return (DINCondBold) this.itemValue$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_show_data_select;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        XO0O10.OXO1.XOO0XOOii(getMSportCallback());
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String strValueOf = String.valueOf(XO0O10.OXO1.X0i1O().getMMode());
        SportDataType sportDataType = null;
        Object js4Var = new js4(null, 1, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(strValueOf + '_' + js4.class.getName()), (Class<Object>) js4.class);
        if (objFromJson != null) {
            js4Var = objFromJson;
        }
        js4 js4Var2 = (js4) js4Var;
        this.sportDataOrder = js4Var2;
        js4 js4VarOXO1 = j65.OXO1(js4Var2);
        this.sportDataOrder = js4VarOXO1;
        if (js4VarOXO1 == null) {
            Intrinsics.XXO("sportDataOrder");
            js4VarOXO1 = null;
        }
        for (Map.Entry<SportDataType, Integer> entry : js4VarOXO1.XO0O10().entrySet()) {
            SportDataType key = entry.getKey();
            if (entry.getValue().intValue() == getMArg1()) {
                this.type = key;
            }
        }
        SportDataType sportDataType2 = this.type;
        if (sportDataType2 == null) {
            Intrinsics.XXO("type");
        } else {
            sportDataType = sportDataType2;
        }
        XO0O10 xo0o10 = XO0O10.OXO1;
        showItemValue(sportDataType, xo0o10.X0i1O());
        xo0o10.XiOIii1(getMSportCallback());
        setTitle("");
        getRecyclerView().setLayoutManager(new GridLayoutManager(this, 3));
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.d65
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShowDataSelectActivity.onInitBaseLayoutAfter$lambda$0(this.f6138IO, (DslAdapter) obj);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
