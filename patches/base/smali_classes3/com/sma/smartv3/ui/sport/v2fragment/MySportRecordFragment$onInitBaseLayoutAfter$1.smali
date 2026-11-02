.class final Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->onInitBaseLayoutAfter()V
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
    c = "com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment$onInitBaseLayoutAfter$1"
    f = "MySportRecordFragment.kt"
    i = {
        0x0
    }
    l = {
        0x38
    }
    m = "invokeSuspend"
    n = {
        "list"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->access$getMWorkoutDao(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->getMSportMode()I

    move-result v1

    invoke-interface {p1, v1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListByMode(I)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    sget-object v3, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->getMSportMode()I

    move-result v4

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->label:I

    invoke-virtual {v3, v4, p1, p0}, Lcom/sma/smartv3/model/MySportRecordModel;->getMySportRecordList(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->access$setDataList$p(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->access$getMActivity(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/util/DeviceItemDecoration;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/util/DeviceItemDecoration;-><init>(IZZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;->this$0:Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->access$showData(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
