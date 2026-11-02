.class public final Lcom/sma/smartv3/ui/device/item/FindWatchItem;
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
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OI1O()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getTvLeft()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x7f140be1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->getIv()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_3

    const v1, 0x7f0812a1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d028f

    return v0
.end method
