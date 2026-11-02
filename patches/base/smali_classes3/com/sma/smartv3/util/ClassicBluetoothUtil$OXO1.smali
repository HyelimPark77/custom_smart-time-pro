.class public final Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ClassicBluetoothUtil;->iO(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;

.field public final synthetic IO:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;->IO:Landroid/content/Context;

    iput-object p2, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;->I1:Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;->IO:Landroid/content/Context;

    iget-object v0, p0, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;->I1:Lcom/sma/smartv3/util/ClassicBluetoothUtil$awaitA2dpConnected$2$receiver$1;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ClassicBluetoothUtil$OXO1;->OXO1(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
