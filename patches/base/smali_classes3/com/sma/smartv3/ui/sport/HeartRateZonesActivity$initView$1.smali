.class final Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->initView()V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeartRateZonesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateZonesActivity.kt\ncom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.sport.HeartRateZonesActivity$initView$1"
    f = "HeartRateZonesActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHeartRateZonesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateZonesActivity.kt\ncom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
    }
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

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

    new-instance p1, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;-><init>(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->label:I

    if-nez v0, :cond_9

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMWorkoutDao(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p1

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMPersonalZone()[I

    move-result-object v5

    if-eqz v5, :cond_1

    array-length v5, v5

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    if-lez v5, :cond_5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMPersonalZone()[I

    move-result-object v4

    if-eqz v4, :cond_4

    array-length v5, v4

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_4

    aget v7, v4, v6

    if-lez v7, :cond_2

    move v8, v3

    goto :goto_2

    :cond_2
    move v8, v2

    :goto_2
    if-eqz v8, :cond_3

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->IiI10X(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    move v1, v2

    :goto_4
    if-eqz v1, :cond_0

    move-object v1, v0

    :cond_6
    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    const/16 p1, 0x8

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMPersonalZone()[I

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v1, v0

    const/4 v4, 0x6

    if-le v1, v4, :cond_7

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateZonesLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateNullLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x5

    aget v1, v0, p1

    add-int/2addr v1, v3

    aget v2, v0, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "~"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMValue1(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x4

    aget v4, v0, v2

    add-int/2addr v4, v3

    aget p1, v0, p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMValue2(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x3

    aget v4, v0, p1

    add-int/2addr v4, v3

    aget v2, v0, v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMValue3(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x2

    aget v4, v0, v2

    add-int/2addr v4, v3

    aget p1, v0, p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMValue4(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    aget p1, v0, v3

    aget v0, v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMValue5(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateZonesLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateNullLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    :cond_8
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateZonesLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;->access$getMHeartRateNullLayout(Lcom/sma/smartv3/ui/sport/HeartRateZonesActivity;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
