.class public final Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocalAudioInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAudioInputService.kt\ncom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocalAudioInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAudioInputService.kt\ncom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

.field public final synthetic IO:Lcom/android/mltcode/paycertificationapi/iXOIii;

.field public final synthetic iX1O1:Lcom/sma/smartv3/ui/translate/LocalAudioInputService;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/iXOIii;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/sma/smartv3/ui/translate/LocalAudioInputService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->IO:Lcom/android/mltcode/paycertificationapi/iXOIii;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->I1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    iput-object p3, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->iX1O1:Lcom/sma/smartv3/ui/translate/LocalAudioInputService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->IO:Lcom/android/mltcode/paycertificationapi/iXOIii;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->I1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1$1$1;

    invoke-direct {v4, p2, p1, v0}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/iXOIii;[BLkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    iget-object v7, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->I1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v10, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1$2;

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->iX1O1:Lcom/sma/smartv3/ui/translate/LocalAudioInputService;

    invoke-direct {v10, p2, p1, v0}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1$2;-><init>(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;[BLkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1$1;->OXO1([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
