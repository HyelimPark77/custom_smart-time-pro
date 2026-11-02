.class public final Lcom/sma/smartv3/ui/trans_charge/AudioOutputService$start$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/trans_charge/AudioOutputService$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/trans_charge/AudioOutputService$start$1$OXO1;->IO:Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lokio/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/ByteString;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trans_charge/AudioOutputService$start$1$OXO1;->IO:Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;

    invoke-static {v0}, Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;->iO(Lcom/sma/smartv3/ui/trans_charge/AudioOutputService;)Lcom/android/mltcode/paycertificationapi/IXOOiIIII;

    move-result-object v0

    invoke-virtual {p1}, Lokio/ByteString;->toByteArray()[B

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IXOOiIIII;->IiI10X([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokio/ByteString;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trans_charge/AudioOutputService$start$1$OXO1;->OXO1(Lokio/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
