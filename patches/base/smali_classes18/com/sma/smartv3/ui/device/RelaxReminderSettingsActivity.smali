.class public final Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;
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

.field private final itemTimeRange$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIntervalPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sg3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tg3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ug3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ug3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vg3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->RELAX_REMINDER:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleRelaxReminder;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleRelaxReminder;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIII)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->initView$lambda$0$0$0$0()V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemHeader$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object v0
.end method

.method private final getItemInterval()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemInterval$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->itemTimeRange$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;Z)Lkotlin/Unit;
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ah3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ah3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object p0

    xor-int/2addr p1, v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEnabled(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->RELAX_REMINDER:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/yg3;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/yg3;-><init>()V

    const-wide/16 v0, 0x96

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$0$0$0$0()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "relax_reminder_set_change"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final itemHeader_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsHeader;
    .locals 1

    const v0, 0x7f0a0594

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsHeader;

    return-object p0
.end method

.method private static final itemInterval_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ac

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final itemTimeRange_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Lcom/sma/smartv3/view/AbhSettingsItem;
    .locals 1

    const v0, 0x7f0a05ee

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/AbhSettingsItem;

    return-object p0
.end method

.method private static final onSetTimeRange$lambda$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIII)Z
    .locals 6

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zg3;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/zg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIII)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static {p2, v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final onSetTimeRange$lambda$0$0$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;IIIILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleTimeRange;->setMStartHour(I)V

    invoke-virtual {v0, p2}, Lcom/szabh/smable3/entity/BleTimeRange;->setMStartMinute(I)V

    invoke-virtual {v0, p3}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEndHour(I)V

    invoke-virtual {v0, p4}, Lcom/szabh/smable3/entity/BleTimeRange;->setMEndMinute(I)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->RELAX_REMINDER:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p5

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

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

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

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
    .locals 6

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141182

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->getItemHeader()Lcom/sma/smartv3/view/AbhSettingsHeader;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v2

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->IIX(I)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wg3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setMListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->getItemTimeRange()Lcom/sma/smartv3/view/AbhSettingsItem;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartHour()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v2

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartMinute()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v3

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndHour()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v4

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndMinute()I

    move-result v4

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setMRightText(Ljava/lang/String;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f0

    return v0
.end method

.method public final onSetInterval(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ot5;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v0

    invoke-direct {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/ot5;-><init>(Landroid/app/Activity;Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xg3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xg3;-><init>(Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ot5;->X01IiOiIi(Lkotlin/jvm/functions/Function4;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mTimeRangePopup:Lcom/android/mltcode/paycertificationapi/ot5;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartHour()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartMinute()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v2

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndHour()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->mBleRelaxReminderSettings:Lcom/szabh/smable3/entity/BleRelaxReminder;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleRelaxReminder;->getMBleTimeRange()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v3

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndMinute()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ot5;->II1Xi0(IIII)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/RelaxReminderSettingsActivity;->getRootView()Landroid/view/View;

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
