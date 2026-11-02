.class public final Lcom/sma/smartv3/ui/device/item/ShockLevelItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->initEvent:Z

    new-instance v0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/ShockLevelItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;

    return-void
.end method

.method private final intLevelToString(I)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    const v1, 0x7f141235

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const p1, 0x7f141233

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XXXO100X1()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->VIBRATION_V2:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->intLevelToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d02bb

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

    invoke-super {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    :try_start_0
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

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

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/ShockLevelItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockLevelItem$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method
