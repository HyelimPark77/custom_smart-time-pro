.class public final Lcom/sma/smartv3/ui/device/item/NoDisturbItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/NoDisturbItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/NoDisturbItem;->initEvent:Z

    new-instance v0, Lcom/sma/smartv3/ui/device/item/NoDisturbItem$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/item/NoDisturbItem$OXO1;-><init>(Lcom/sma/smartv3/ui/device/item/NoDisturbItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/NoDisturbItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/NoDisturbItem$OXO1;

    return-void
.end method


# virtual methods
.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/NoDisturbItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->O1IO00()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->O1IO00()Z

    move-result v1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->NO_DISTURB_RANGE:Lcom/szabh/smable3/BleKey;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleNoDisturbSettings;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IOOIXiI1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v2

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartHour()I

    move-result v2

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v3

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleTimeRange;->getMStartMinute()I

    move-result v3

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v4

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndHour()I

    move-result v4

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEndMinute()I

    move-result v1

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->i0X000X0O()Z

    move-result v5

    invoke-static {v2, v3, v4, v1, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->IXI(IIIIZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XiOIO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleNoDisturbSettings;->getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->getMEnabled()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XiOIO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0287

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/item/NoDisturbItem;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/item/NoDisturbItem$OXO1;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final onNoDisturbChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "no_disturb_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/NoDisturbItem;->initView()V

    return-void
.end method
