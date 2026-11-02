.class final Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->connectItem(I)V
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
    c = "com.sma.smartv3.ui.device.AddDeviceWithThirdPartyActivity$connectItem$3"
    f = "AddDeviceWithThirdPartyActivity.kt"
    i = {}
    l = {
        0x173
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $device:Lcom/bestmafen/baseble/scanner/BleDevice;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

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

    new-instance p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;-><init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/bestmafen/baseble/scanner/BleDevice;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getThirdPartyUtil$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v3

    iput v2, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->label:I

    invoke-virtual {p1, v1, v3, p0}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IO(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    new-instance v0, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->$device:Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMAddress()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;-><init>(Ljava/lang/String;Z)V

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$bindThirdDevice(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;Lcom/sma/smartv3/util/BluetoothConnectionReceiver$A2DPInfo;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$connectItem$3;->this$0:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getThirdPartyUtil$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/sma/smartv3/util/ClassicBluetoothUtil;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->O00()V

    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
