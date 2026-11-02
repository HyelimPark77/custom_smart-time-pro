.class public final Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/item/MultiDeviceInfoItem$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->showList(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

.field public final synthetic XIi00iiXO:Lcom/szabh/smable3/entity/BleDeviceInfo;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->XIi00iiXO:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->XIi00iiXO(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Z

    move-result p0

    return p0
.end method

.method public static final XIi00iiXO(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ov0;->I0IIOi(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMClassicAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/component/BleConnector;->unbindClassic(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMSupportHID()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/szabh/smable3/component/BleConnector;->unbindHID(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ov0;->OIi0()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->showList(Ljava/util/List;)V

    return v3
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a01c9

    if-eq p1, v0, :cond_1

    const v0, 0x7f0a0cf7

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->XIi00iiXO:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->checkBluetoothIsOpenThenConnect(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    return-void

    :cond_1
    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$getMContext(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->XIi00iiXO:Lcom/szabh/smable3/entity/BleDeviceInfo;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    const v4, 0x7f1403e0

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v4, 0x7f14150e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v4, 0x7f14027f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p1, v4, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/rv0;

    invoke-direct {v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/rv0;-><init>(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;)V

    const v0, 0x7f14034b

    invoke-virtual {p1, v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method
