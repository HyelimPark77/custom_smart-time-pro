.class final Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/VoiceActivity;->processingEditTextKeyboard()V
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
    c = "com.sma.smartv3.ui.device.VoiceActivity$processingEditTextKeyboard$2$1"
    f = "VoiceActivity.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x15a,
        0x16e
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-run-VoiceActivity$processingEditTextKeyboard$2$1$1"
    }
    s = {
        "L$1",
        "I$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $keyboardHeight:I

.field final synthetic $recyclerViewHeight:Lkotlin/jvm/internal/Ref$IntRef;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/VoiceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/VoiceActivity;ILkotlin/jvm/internal/Ref$IntRef;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/VoiceActivity;",
            "I",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->this$0:Lcom/sma/smartv3/ui/device/VoiceActivity;

    iput p2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$keyboardHeight:I

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$recyclerViewHeight:Lkotlin/jvm/internal/Ref$IntRef;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->this$0:Lcom/sma/smartv3/ui/device/VoiceActivity;

    iget v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$keyboardHeight:I

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$recyclerViewHeight:Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;-><init>(Lcom/sma/smartv3/ui/device/VoiceActivity;ILkotlin/jvm/internal/Ref$IntRef;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->label:I

    const-wide/16 v2, 0x32

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, "mAdapter"

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->L$1:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput v5, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->label:I

    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->this$0:Lcom/sma/smartv3/ui/device/VoiceActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getViewKeyboardHeight(Lcom/sma/smartv3/ui/device/VoiceActivity;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_d

    iget v1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$keyboardHeight:I

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->this$0:Lcom/sma/smartv3/ui/device/VoiceActivity;

    iget-object v8, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->$recyclerViewHeight:Lkotlin/jvm/internal/Ref$IntRef;

    if-gtz v1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_4
    invoke-static {v5}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMRecyclerView(Lcom/sma/smartv3/ui/device/VoiceActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    iget v8, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eq v9, v8, :cond_5

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iput v1, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v6

    :cond_6
    invoke-virtual {v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_7
    invoke-static {v5}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v6

    :cond_8
    invoke-virtual {v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getItemCount()I

    move-result v1

    const/4 v8, 0x4

    if-le v1, v8, :cond_a

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMRecyclerView(Lcom/sma/smartv3/ui/device/VoiceActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v8

    if-nez v8, :cond_9

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v6

    :cond_9
    invoke-virtual {v8}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getItemCount()I

    move-result v8

    add-int/lit8 v8, v8, -0x3

    invoke-virtual {v1, v8}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_a
    iput-object v5, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->L$1:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->I$0:I

    iput v4, p0, Lcom/sma/smartv3/ui/device/VoiceActivity$processingEditTextKeyboard$2$1;->label:I

    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_1
    return-object v0

    :cond_b
    move-object v0, v5

    :goto_2
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMRecyclerView(Lcom/sma/smartv3/ui/device/VoiceActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/VoiceActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/device/VoiceActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v0

    if-nez v0, :cond_c

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    move-object v6, v0

    :goto_3
    invoke-virtual {v6}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDatas(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_d
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
