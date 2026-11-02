.class final Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->checkBluetoothIsOpenThenConnect(Lcom/szabh/smable3/entity/BleDeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1"
    f = "MultiDeviceManagerActivity.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0xa1
    }
    m = "invokeSuspend"
    n = {
        "address",
        "isSelfDevice",
        "isThirdPartyDevice"
    }
    s = {
        "L$0",
        "I$0",
        "I$1"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $item:Lcom/szabh/smable3/entity/BleDeviceInfo;

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/entity/BleDeviceInfo;",
            "Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;-><init>(Lcom/szabh/smable3/entity/BleDeviceInfo;Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    if-lez p1, :cond_2

    move p1, v2

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$setConnectingDeviceName$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->access$setConnectingDeviceAddress$p(Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/dto/OXO1;->I0iXXO:Lcom/sma/smartv3/dto/OXO1$OXO1;

    invoke-virtual {v3}, Lcom/sma/smartv3/dto/OXO1$OXO1;->XIi00iiXO()Lcom/sma/smartv3/dto/OXO1;

    move-result-object v4

    if-eqz v4, :cond_3

    move v1, v2

    :cond_3
    if-nez p1, :cond_6

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-string v4, "CLASSIC_BLE_DEVICE"

    invoke-virtual {v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/ov0;->IO()Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->L$0:Ljava/lang/Object;

    iput p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->I$0:I

    iput v1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->I$1:I

    iput v2, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->label:I

    invoke-virtual {v4, v5, v3, p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IO(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v3

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->this$0:Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    new-instance v1, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v1, v0, v2}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;->connectedThirdDevice(Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)Lkotlinx/coroutines/XiOIO;

    goto :goto_2

    :cond_5
    sget-object p1, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ov0;->IO()Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->O00()V

    goto :goto_2

    :cond_6
    invoke-virtual {v3, v2}, Lcom/sma/smartv3/dto/OXO1$OXO1;->I0IIOi(Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->setMDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/ov0;->OXO1:Lcom/android/mltcode/paycertificationapi/ov0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity$checkBluetoothIsOpenThenConnect$1;->$item:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ov0;->O00(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
