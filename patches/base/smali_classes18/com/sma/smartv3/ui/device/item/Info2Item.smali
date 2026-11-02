.class public final Lcom/sma/smartv3/ui/device/item/Info2Item;
.super Lcom/sma/smartv3/ui/device/item/InfoItem;
.source "SourceFile"


# instance fields
.field private btnDeviceAdd:Landroid/view/View;

.field private btnPairType:Landroid/view/View;

.field private final handler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final initEvent:Z

.field private ivVoltage:Landroid/widget/ImageView;

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final switchStatusRunnable$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tvMac:Landroid/widget/TextView;

.field private tvPower2:Landroid/widget/TextView;

.field private tvState:Landroid/widget/TextView;

.field private tvUsageGuidLines:Landroid/widget/TextView;

.field private tvVersion:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->initEvent:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/y4;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/Info2Item;->bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/Info2Item;->bindView$lambda$2(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/device/item/Info2Item;)Ljava/lang/Runnable;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/Info2Item;->switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/Info2Item;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/Info2Item;->bindView$lambda$1(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/device/item/Info2Item;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/item/Info2Item;->switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    return-void
.end method

.method public static final synthetic access$getHandler$p(Lcom/sma/smartv3/ui/device/item/Info2Item;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getSwitchStatusRunnable(Lcom/sma/smartv3/ui/device/item/Info2Item;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/Info2Item;->getSwitchStatusRunnable()Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvPower2$p(Lcom/sma/smartv3/ui/device/item/Info2Item;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvPower2:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$getTvState$p(Lcom/sma/smartv3/ui/device/item/Info2Item;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvState:Landroid/widget/TextView;

    return-object p0
.end method

.method public static final synthetic access$showVersion(Lcom/sma/smartv3/ui/device/item/Info2Item;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/Info2Item;->showVersion()V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->getMOnClickListener()Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->getMOnClickListener()Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/device/item/Info2Item;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->getMOnClickListener()Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final getSwitchStatusRunnable()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->switchStatusRunnable$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    return-object v0
.end method

.method private final showVersion()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvVersion:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const-string v0, "tvVersion"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    const v2, 0x7f14040b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":V"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final switchStatusRunnable_delegate$lambda$0(Lcom/sma/smartv3/ui/device/item/Info2Item;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/z4;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    return-object v0
.end method

.method private static final switchStatusRunnable_delegate$lambda$0$0(Lcom/sma/smartv3/ui/device/item/Info2Item;)V
    .locals 1

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvState:Landroid/widget/TextView;

    if-nez p0, :cond_0

    const-string p0, "tvState"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    const v0, 0x7f1403fa

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/item/InfoItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a0607

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->btnPairType:Landroid/view/View;

    const v0, 0x7f0a0627

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->btnDeviceAdd:Landroid/view/View;

    const v0, 0x7f0a0cb1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvMac:Landroid/widget/TextView;

    const v0, 0x7f0a0d14

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvState:Landroid/widget/TextView;

    const v0, 0x7f0a18b1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvVersion:Landroid/widget/TextView;

    const v0, 0x7f0a18ae

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvUsageGuidLines:Landroid/widget/TextView;

    const v0, 0x7f0a0ceb

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvPower2:Landroid/widget/TextView;

    const v0, 0x7f0a0673

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->ivVoltage:Landroid/widget/ImageView;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->btnPairType:Landroid/view/View;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "btnPairType"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/a5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/a5;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->btnDeviceAdd:Landroid/view/View;

    if-nez p1, :cond_1

    const-string p1, "btnDeviceAdd"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/b5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/b5;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvUsageGuidLines:Landroid/widget/TextView;

    if-nez p1, :cond_2

    const-string p1, "tvUsageGuidLines"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/c5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/c5;-><init>(Lcom/sma/smartv3/ui/device/item/Info2Item;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 7

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/item/InfoItem;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->btnPairType:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btnPairType"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O1iii()Z

    move-result v0

    const-string v3, "ivVoltage"

    const-string v4, "tvPower2"

    if-eqz v0, :cond_4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "https://ceshi.smawatch.cn/kotlinweb"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    const-string v5, "https://dev.iot-solution.net/kotlinweb"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvPower2:Landroid/widget/TextView;

    if-nez v0, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->ivVoltage:Landroid/widget/ImageView;

    if-nez v0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvPower2:Landroid/widget/TextView;

    if-nez v0, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->ivVoltage:Landroid/widget/ImageView;

    if-nez v0, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvMac:Landroid/widget/TextView;

    if-nez v2, :cond_7

    const-string v2, "tvMac"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_7
    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MAC:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->tvState:Landroid/widget/TextView;

    if-nez v0, :cond_8

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v1, v0

    :goto_1
    const v0, 0x7f1403f8

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_9
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/Info2Item;->showVersion()V

    :cond_a
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d108e

    return v0
.end method

.method public onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/InfoItem;->onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    :try_start_0
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/Info2Item;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/Info2Item$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/InfoItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method
