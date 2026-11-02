.class public final Lcom/sma/smartv3/ui/device/item/ShockItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/ShockItem;->initEvent:Z

    new-instance v0, Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/ShockItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/ShockItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;

    return-void
.end method


# virtual methods
.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/ShockItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IOIX1OI0()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->i100IXOX()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XXXO100X1()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiXI1OiX0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {p0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->VIBRATION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XOIX(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvLeft()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Oi1()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_4
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d02ba

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/ShockItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/ShockItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/ShockItem$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    return-void
.end method
