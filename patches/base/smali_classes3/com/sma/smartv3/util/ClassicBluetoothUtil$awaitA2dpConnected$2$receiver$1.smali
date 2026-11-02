.class public final Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Landroid/content/Context;

.field public final synthetic XIi00iiXO:Lcom/android/mltcode/paycertificationapi/IO0i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/IO0i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;->OXO1:Landroid/content/Context;

    iput-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/IO0i;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    if-eqz p2, :cond_0

    const-string p1, "android.bluetooth.profile.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;->OXO1:Landroid/content/Context;

    invoke-virtual {p2, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
