.class public final Lcom/sma/smartv3/ui/device/item/GameTimeSetItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iiIi0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->GAME_TIME_REMINDER:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleGameTimeReminder;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleGameTimeReminder;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGameTimeReminder;->getMEnabled()I

    move-result v2

    if-nez v2, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const v2, 0x7f141052

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleGameTimeReminder;->getMMinute()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v3, 0x7f1403a1

    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvRight()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0293

    return v0
.end method
