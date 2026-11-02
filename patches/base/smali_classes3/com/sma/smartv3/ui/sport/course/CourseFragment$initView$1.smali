.class final Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/CourseFragment;->initView()V
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
    value = "SMAP\nCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n50#2,3:128\n53#2:134\n55#2,2:136\n1563#3:131\n1634#3,2:132\n1636#3:135\n*S KotlinDebug\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n*L\n55#1:128,3\n55#1:134\n55#1:136,2\n55#1:131\n55#1:132,2\n55#1:135\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.sport.course.CourseFragment$initView$1"
    f = "CourseFragment.kt"
    i = {}
    l = {
        0x36
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n50#2,3:128\n53#2:134\n55#2,2:136\n1563#3:131\n1634#3,2:132\n1636#3:135\n*S KotlinDebug\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n*L\n55#1:128,3\n55#1:134\n55#1:136,2\n55#1:131\n55#1:132,2\n55#1:135\n*E\n"
    }
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/course/CourseFragment;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

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

    new-instance p1, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput v2, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->label:I

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->O00()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SELECTED_COURSES"

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/CourseList;

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    :cond_3
    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->access$getTime(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->access$onRefPost(Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->access$onLoadData(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Ljava/util/List;)V

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/sport/course/CourseFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->access$onRefPost(Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
