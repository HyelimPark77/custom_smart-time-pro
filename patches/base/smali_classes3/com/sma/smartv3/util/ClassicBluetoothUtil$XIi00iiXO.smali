.class public final Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ClassicBluetoothUtil;->IO(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1869#2,2:292\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n*L\n261#1:292,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nClassicBluetoothUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1869#2,2:292\n*S KotlinDebug\n*F\n+ 1 ClassicBluetoothUtil.kt\ncom/sma/smartv3/util/ClassicBluetoothUtil$isA2dpBound$2$1\n*L\n261#1:292,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/IO0i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/IO0i;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;->OXO1:Lcom/android/mltcode/paycertificationapi/IO0i;

    iput-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 2

    const-string v0, "proxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    invoke-interface {p2}, Landroid/bluetooth/BluetoothProfile;->getConnectedDevices()Ljava/util/List;

    move-result-object p1

    const-string v0, "getConnectedDevices(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    invoke-interface {p2}, Landroid/bluetooth/BluetoothProfile;->getConnectedDevices()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;->XIi00iiXO:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$XIi00iiXO;->OXO1:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 0

    return-void
.end method
