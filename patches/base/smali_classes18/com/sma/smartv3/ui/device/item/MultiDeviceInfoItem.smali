.class public final Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;
    }
.end annotation


# instance fields
.field private btnDelete:Landroid/view/View;

.field private final deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final initEvent:Z

.field private ivConnection:Landroid/widget/ImageView;

.field private ivDevice:Landroid/widget/ImageView;

.field private ivPower:Landroid/widget/ImageView;

.field private mContext:Landroid/content/Context;

.field private mOnClickListener:Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private pbConnecting:Landroid/widget/ProgressBar;

.field private powerPanel:Landroid/view/View;

.field private rlLayout:Landroid/widget/RelativeLayout;

.field private tvMac:Landroid/widget/TextView;

.field private tvName:Landroid/widget/TextView;

.field public tvReconnect:Landroid/widget/TextView;

.field private tvState:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->bindView$lambda$1(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->bindView$lambda$2(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final currentThirdPartyDeviceDisConnected()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const v3, 0x7f1403fa

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    if-nez v0, :cond_2

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final initDevice()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initDevice deviceInfo = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "  isSelfDevice:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->initThirdPartyDevice()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->initSelfDevice()V

    return-void
.end method

.method private final initSelfDevice()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/ov0;->I0iXXO(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XOO0ii0()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    const-string v2, "ivConnection"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivPower:Landroid/widget/ImageView;

    if-nez v0, :cond_2

    const-string v0, "ivPower"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    sget-object v4, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v5, Lcom/szabh/smable3/BleKey;->POWER:Lcom/szabh/smable3/BleKey;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getInt$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;ILcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageLevel(I)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v4

    const-string v5, "tvState"

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->powerPanel:Landroid/view/View;

    if-nez v4, :cond_3

    const-string v4, "powerPanel"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    if-nez v3, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_4
    const v4, 0x7f1403f8

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    if-nez v3, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v3

    :goto_0
    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_6
    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->connecting()V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    if-nez v0, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v1, v0

    :goto_1
    const v0, 0x7f1403fa

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_9
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->disconnect()V

    return-void
.end method

.method private final initThirdPartyDevice()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v2}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v3, Lcom/sma/smartv3/dto/OXO1;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v5

    const/16 v15, 0x7f8

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v16}, Lcom/sma/smartv3/dto/OXO1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/dto/OXO1;->XiOIii1()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->powerPanel:Landroid/view/View;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    const-string v3, "powerPanel"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_1
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivPower:Landroid/widget/ImageView;

    if-nez v3, :cond_2

    const-string v3, "ivPower"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_2
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez v3, :cond_3

    const-string v3, "ivDevice"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v4, v3

    :goto_0
    const v3, 0x7f080913

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/dto/OXO1;->XX0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->thirdPartyDeviceConnected()V

    return-void

    :cond_4
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->currentThirdPartyDeviceDisConnected()V

    return-void

    :cond_5
    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->thirdPartyDeviceDisConnected()V

    return-void
.end method

.method private final thirdPartyDeviceConnected()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const v2, 0x7f1403f8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    if-nez v0, :cond_2

    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final thirdPartyDeviceDisConnected()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const v2, 0x7f1403fa

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    if-nez v0, :cond_1

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    if-nez v0, :cond_2

    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 3
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "<get-context>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0861

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->rlLayout:Landroid/widget/RelativeLayout;

    const v0, 0x7f0a0626

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvName:Landroid/widget/TextView;

    const v0, 0x7f0a0cb1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvMac:Landroid/widget/TextView;

    const v0, 0x7f0a0d14

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    const v0, 0x7f0a0965

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->powerPanel:Landroid/view/View;

    const v0, 0x7f0a0623

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    const v0, 0x7f0a065e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivPower:Landroid/widget/ImageView;

    const v0, 0x7f0a0cf7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->setTvReconnect(Landroid/widget/TextView;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lv0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/lv0;-><init>(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a01c9

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    new-instance v2, Lcom/android/mltcode/paycertificationapi/mv0;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/mv0;-><init>(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->rlLayout:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_1

    const-string v0, "rlLayout"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/nv0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nv0;-><init>(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a08fb

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->pbConnecting:Landroid/widget/ProgressBar;

    return-void
.end method

.method public final connected()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->powerPanel:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "powerPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const v2, 0x7f1403f8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivConnection:Landroid/widget/ImageView;

    if-nez v0, :cond_2

    const-string v0, "ivConnection"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final connecting()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const v2, 0x7f1403f9

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->pbConnecting:Landroid/widget/ProgressBar;

    if-nez v0, :cond_1

    const-string v0, "pbConnecting"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final disconnect()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvState:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "tvState"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const v2, 0x7f1403fa

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->getTvReconnect()Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->btnDelete:Landroid/view/View;

    if-nez v0, :cond_1

    const-string v0, "btnDelete"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final getDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->initEvent:Z

    return v0
.end method

.method public final getTvReconnect()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvReconnect:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvReconnect"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvName:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "tvName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvMac:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvMac"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->pbConnecting:Landroid/widget/ProgressBar;

    if-nez v0, :cond_2

    const-string v0, "pbConnecting"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->powerPanel:Landroid/view/View;

    if-nez v0, :cond_3

    const-string v0, "powerPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->initDevice()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->onPairImageChange(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ff3

    return v0
.end method

.method public final onPairImageChange(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pair_image_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPairImageChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const-string v0, "ivDevice"

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    const p1, 0x7f080913

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->IOI(Lcom/szabh/smable3/entity/BleDeviceInfo;)Z

    move-result v2

    const-string v3, "mContext"

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez v2, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_2
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    const/4 v3, 0x1

    invoke-static {p1, v1, v3, v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOOXII(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v4, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez v2, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_5
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_6
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/q62;->iX(Lcom/szabh/smable3/entity/BleDeviceInfo;)I

    move-result p1

    invoke-virtual {v4, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->deviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-static {p1, v2}, Lcom/android/mltcode/paycertificationapi/uz0;->X00Xi1X(Lcom/android/mltcode/paycertificationapi/sz0;Lcom/szabh/smable3/entity/BleDeviceInfo;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->ivDevice:Landroid/widget/ImageView;

    if-nez v2, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v1, v2

    :goto_2
    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_8
    return-void
.end method

.method public final setOnClickListener(Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->mOnClickListener:Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;

    return-void
.end method

.method public final setTvReconnect(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem;->tvReconnect:Landroid/widget/TextView;

    return-void
.end method
