.class public final Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1;->collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n1#1,218:1\n18#2:219\n19#2:221\n37#3:220\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n1#1,218:1\n18#2:219\n19#2:221\n37#3:220\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/util/ChatWithQWManager;

.field public final synthetic IO:Lcom/android/mltcode/paycertificationapi/IXiXI;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/IXiXI;Lcom/sma/smartv3/util/ChatWithQWManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;->IO:Lcom/android/mltcode/paycertificationapi/IXiXI;

    iput-object p2, p0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;->I1:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;

    iget v1, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;-><init>(Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    iget-object p1, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;->IO:Lcom/android/mltcode/paycertificationapi/IXiXI;

    move-object v2, p1

    check-cast v2, Lcom/sma/smartv3/model/AiChatAnswerData;

    iget-object v4, p0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2;->I1:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v4, v2}, Lcom/sma/smartv3/util/ChatWithQWManager;->OXO1(Lcom/sma/smartv3/util/ChatWithQWManager;Lcom/sma/smartv3/model/AiChatAnswerData;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$1:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$2:Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->L$3:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/util/ChatWithQWManager$special$$inlined$filter$1$2$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
