.class public final Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X01I0()Z

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

    sget-object v2, Lcom/szabh/smable3/BleKey;->INCOMING_CALL_RING:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XiOIO(I)Ljava/lang/String;

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

    const v0, 0x7f0d029c

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

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/IncomingCallRingItem$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method
