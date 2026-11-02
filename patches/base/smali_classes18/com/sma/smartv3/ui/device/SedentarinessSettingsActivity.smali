.class public final Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final itemHeader$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemInterval$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemRepeat$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemTimeRange$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/az3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/az3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bz3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bz3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cz3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cz3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dz3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dz3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemRepeat$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ez3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ez3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    new-instance v0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetRepeat$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetRepeat$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetInterval$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetInterval$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIII)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMSedentarinessSettings$p(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    return-void
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemRepeat$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uy3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/uy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMEnabled(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    const/4 p0, 0x0

    const/4 p1, 0x2

    const-string p2, "sedentariness_change"

    invoke-static {p2, p0, p1, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ac

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemRepeat_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05d5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ee

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onSetInterval$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;I)Z
    .locals 2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wy3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/wy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;I)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetInterval$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    int-to-double v3, p1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-int p1, v1

    mul-int/lit8 p1, p1, 0x1e

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMInterval(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMInterval()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->iI(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetRepeat$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;)Z
    .locals 2

    const-string v0, "picked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vy3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/vy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetRepeat$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;Ljava/util/Set;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    sget-object v1, Lcom/szabh/smable3/entity/BleRepeat;->INSTANCE:Lcom/szabh/smable3/entity/BleRepeat;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v2}, Lcom/szabh/smable3/entity/BleRepeat;->indicesToRepeat$default(Lcom/szabh/smable3/entity/BleRepeat;Ljava/util/Set;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMRepeat(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMRepeat()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->X11I(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIII)Z
    .locals 6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fz3;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/fz3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIII)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMStartHour(I)V

    invoke-virtual {v0, p2}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMStartMinute(I)V

    invoke-virtual {v0, p3}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMEndHour(I)V

    invoke-virtual {v0, p4}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->setMEndMinute(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v1

    invoke-static {p1, p2, p3, p4, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p5

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 6

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1411ef

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xy3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMStartHour()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMStartMinute()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMEndHour()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMEndMinute()I

    move-result v4

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemRepeat()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMRepeat()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->X11I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMInterval()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iI(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f9

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public final onSetInterval(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-nez p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dj4;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const v2, 0x7f030044

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p1, 0x7f140d2b

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/gz3;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/gz3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    iget-object p1, v1, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-eqz p1, :cond_1

    iget-object v0, v1, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMInterval()I

    move-result v0

    div-int/lit8 v0, v0, 0x1e

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/XiiOXI;->OXO1(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v2, "<get-rootView>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onSetRepeat(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/jv0;

    const v0, 0x7f030055

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/jv0;-><init>(Landroid/app/Activity;I)V

    const v0, 0x7f14118f

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->O1O(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yy3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->iOO1ii1(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mRepeatPopup:Lcom/android/mltcode/paycertificationapi/jv0;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/szabh/smable3/entity/BleRepeat;->INSTANCE:Lcom/szabh/smable3/entity/BleRepeat;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMRepeat()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/szabh/smable3/entity/BleRepeat;->toIndices$default(Lcom/szabh/smable3/entity/BleRepeat;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/jv0;->IXXOO(Ljava/util/Set;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ot5;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v0

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/ot5;-><init>(Landroid/app/Activity;Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zy3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zy3;-><init>(Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ot5;->X01IiOiIi(Lkotlin/jvm/functions/Function4;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMStartHour()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMStartMinute()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMEndHour()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSedentarinessSettings;->getMEndMinute()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ot5;->II1Xi0(IIII)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/SedentarinessSettingsActivity;->getRootView()Landroid/view/View;

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
