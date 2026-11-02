.class public final Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHrMonitoringSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrMonitoringSettingsActivity.kt\ncom/sma/smartv3/ui/device/HrMonitoringSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHrMonitoringSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrMonitoringSettingsActivity.kt\ncom/sma/smartv3/ui/device/HrMonitoringSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final HR_MAX:I = 0xc8

.field public static final HR_MIN:I = 0x14


# instance fields
.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderHigh$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderLow$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderReal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHeaderSmart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemHighValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemInterval$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemLowValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemTimeRange$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mHighPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLowPopup:Lcom/android/mltcode/paycertificationapi/qv1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final modePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final timePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final warnPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->Companion:Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOI0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXOI0O;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOO0OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOO0OO;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->modePanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1i11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1i11I;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderReal$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOO1X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOO1X0;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderSmart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXiX0OiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXiX0OiO;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->timePanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOi00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOi00;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiOX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiOX0;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIIX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOIIX0;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1ii0OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1ii0OO;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->warnPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0O1XO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0O1XO1;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderHigh$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiO1O0OOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiO1O0OOI;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHighValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiIXXX1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiIXXX1i;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderLow$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiOO0I01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiOO0I01;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemLowValue$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_MONITORING:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_WARNING_SET:Lcom/szabh/smable3/BleKey;

    const-class v3, Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleHrWarningSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIII)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$1$0$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$4$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$4$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->timePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemLowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderHigh_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetHighValue$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onDeviceSetInterval$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderSmart_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$2$0$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderReal_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetLowValue$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$3$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetHighValue$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;II)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onDeviceSetInterval$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->warnPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final delayPostEvent()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$delayPostEvent$1;

    const/4 v1, 0x0

    invoke-direct {v3, v1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity$delayPostEvent$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderHigh()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderHigh$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderLow()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderLow$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderReal()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderReal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHeaderSmart()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderSmart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemHighValue()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHighValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemLowValue()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemLowValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getModePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->modePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTimePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->timePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getWarnPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->warnPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHeaderLow_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$3$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemHighValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->initView$lambda$2$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->modePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onSetLowValue$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXXIOOiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXXIOOiO;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xff

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEnabled(I)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->HR_MONITORING:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->delayPostEvent()V

    const-string p0, "HR_MONITORING"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCheckChange"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOiiXI;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OOiiXI;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderReal()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1$0$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$2$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O10OXXO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O10OXXO;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderSmart()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$2$0$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$3$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->delayPostEvent()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO1O;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/XO1O;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderHigh()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$3$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->setMHighSwitch(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_WARNING_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$4$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->delayPostEvent()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIIii0X;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iIIii0X;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderLow()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$4$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->setMLowSwitch(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_WARNING_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final itemHeaderHigh_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0596

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderLow_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderReal_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a059e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeaderSmart_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a05a4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemHighValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05aa

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ac

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemLowValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05c4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ee

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final modePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0709

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic onDeviceSetInterval$default(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0xf

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7f030021

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onDeviceSetInterval(II)V

    return-void
.end method

.method private static final onDeviceSetInterval$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;II)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIO0I000O;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IIO0I000O;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;II)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onDeviceSetInterval$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    int-to-double v3, p2

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-int p2, v1

    mul-int/2addr p1, p2

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->setMInterval(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMInterval()I

    move-result p2

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/cp5;->iI(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->HR_MONITORING:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetHighValue$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX01i1IIi;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/IX01i1IIi;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetHighValue$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    add-int/lit8 p1, p1, 0x14

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->setMHighValue(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_WARNING_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->updateHigh()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetLowValue$lambda$1$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1Xi1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X1Xi1;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetLowValue$lambda$1$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    add-int/lit8 p1, p1, 0x14

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->setMLowValue(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_WARNING_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->updateLow()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIII)Z
    .locals 6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOIXI1IX;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/XIOIXI1IX;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIII)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleTimeRange;->setMStartHour(I)V

    invoke-virtual {v0, p2}, Lcom/szabh/smable3/entity/BleTimeRange;->setMStartMinute(I)V

    invoke-virtual {v0, p3}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEndHour(I)V

    invoke-virtual {v0, p4}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEndMinute(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->HR_MONITORING:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p5

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    sget-object p5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p5}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result p5

    invoke-static {p1, p2, p3, p4, p5}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final timePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0728

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final updateHigh()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHighValue()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMHighValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateLow()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemLowValue()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMLowValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method private static final warnPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0731

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 9

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140cbd

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xi()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iI0OIOO()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getTimePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v1

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v4

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/q62;->IIX(I)Z

    move-result v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iX1OX;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/iX1OX;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v1

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v4

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartHour()I

    move-result v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v5

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartMinute()I

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v6

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndHour()I

    move-result v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v7

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndMinute()I

    move-result v7

    sget-object v8, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v8

    invoke-static {v4, v5, v6, v7, v8}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v1

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMInterval()I

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cp5;->iI(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getTimePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXXI1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getModePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderReal()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v4

    const v5, 0x7f081685

    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XOXi1I1;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/XOXi1I1;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderSmart()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->getCheckEnabled()Landroid/widget/CheckBox;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iXOiXX;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/iXOiXX;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getModePanel()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Ii1X()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getWarnPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderHigh()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMHighSwitch()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX1ii1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XX1ii1;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->updateHigh()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getItemHeaderLow()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMLowSwitch()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXIX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XXIX0;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->updateLow()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getWarnPanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b6

    return v0
.end method

.method public final onDeviceSetInterval(II)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-nez v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj4;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p2, 0x7f140f71

    invoke-virtual {v1, p2}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/X10O101O;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/X10O101O;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;I)V

    invoke-virtual {v1, p2}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v1, v2, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object p2, v2, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-eqz p2, :cond_1

    iget-object v0, v2, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMInterval()I

    move-result v0

    div-int/2addr v0, p1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/XiiOXI;->OXO1(I)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object p1

    const-string v0, "<get-rootView>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSetHighValue(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHighPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xb5

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x14

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p1, 0x7f140cb7

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/qv1;->i010I()Landroid/widget/TextView;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/I11i0;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/I11i0;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHighPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHighPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMHighValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetInterval(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x1e

    const v0, 0x7f030022

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onDeviceSetInterval(II)V

    return-void

    :cond_0
    const/4 p1, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, p1, v0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->onDeviceSetInterval$default(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;IIILjava/lang/Object;)V

    return-void
.end method

.method public final onSetLowValue(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mLowPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xb5

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x14

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p1, 0x7f140cba

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/qv1;->i010I()Landroid/widget/TextView;

    move-result-object p1

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/i1X0XOiX;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1X0XOiX;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mLowPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mLowPopup:Lcom/android/mltcode/paycertificationapi/qv1;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrWarningSettings:Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->getMLowValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final onSetTimeRange(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ot5;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v0

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/ot5;-><init>(Landroid/app/Activity;Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOXi0III;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOXi0III;-><init>(Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ot5;->X01IiOiIi(Lkotlin/jvm/functions/Function4;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartHour()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartMinute()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v2

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndHour()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->mHrMonitoringSettings:Lcom/szabh/smable3/entity/BleHrMonitoringSettings;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleHrMonitoringSettings;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v3

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndMinute()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ot5;->II1Xi0(IIII)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/HrMonitoringSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
