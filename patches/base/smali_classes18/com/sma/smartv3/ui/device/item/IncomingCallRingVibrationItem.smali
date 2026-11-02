.class public final Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;

    return-void
.end method

.method public static final synthetic access$setView(Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;->setView()V

    return-void
.end method

.method private final setView()V
    .locals 6

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->RING_VIBRATION_SET:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleRingVibrationSettings;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleRingVibrationSettings;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMVibration()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMRing()I

    move-result v2

    if-ne v2, v3, :cond_0

    const v0, 0x7f1402c4

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMVibration()I

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMRing()I

    move-result v2

    if-nez v2, :cond_1

    const v0, 0x7f1402c3

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMVibration()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleRingVibrationSettings;->getMRing()I

    move-result v0

    if-ne v0, v3, :cond_2

    const v0, 0x7f1402c5

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const v0, 0x7f141052

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public initView()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X10O()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvLeft()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->X11iII1O1()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f140003

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const v1, 0x7f140d12

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;->setView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d029d

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingVibrationItem$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method
