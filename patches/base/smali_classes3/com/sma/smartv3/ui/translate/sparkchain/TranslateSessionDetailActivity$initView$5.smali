.class final Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Lcom/sma/smartv3/db/entity/TranslateEntity;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTranslateSessionDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1869#2,2:125\n*S KotlinDebug\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n*L\n75#1:125,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailActivity$initView$5"
    f = "TranslateSessionDetailActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTranslateSessionDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1869#2,2:125\n*S KotlinDebug\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n*L\n75#1:125,2\n*E\n"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/TranslateEntity;->transferToAiMessageData()Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;->access$getAdapter$p(Lcom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity;)Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/translate/TranslateMultiDeviceAdapter;->submitData(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
