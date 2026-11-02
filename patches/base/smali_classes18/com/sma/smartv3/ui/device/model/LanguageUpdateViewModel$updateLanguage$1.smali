.class final Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->updateLanguage(Ljava/util/List;)V
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
    value = "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1878#2,3:401\n1788#2,4:404\n1788#2,4:408\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1\n*L\n114#1:401,3\n139#1:404,4\n142#1:408,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.model.LanguageUpdateViewModel$updateLanguage$1"
    f = "LanguageUpdateViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x7a,
        0x7f
    }
    m = "invokeSuspend"
    n = {
        "$this$forEachIndexed$iv",
        "item$iv",
        "languagesListItem",
        "$i$f$forEachIndexed",
        "index$iv",
        "index",
        "$i$a$-forEachIndexed-LanguageUpdateViewModel$updateLanguage$1$2",
        "$this$forEachIndexed$iv",
        "item$iv",
        "languagesListItem",
        "$i$f$forEachIndexed",
        "index$iv",
        "index",
        "$i$a$-forEachIndexed-LanguageUpdateViewModel$updateLanguage$1$2",
        "downSuccess"
    }
    s = {
        "L$0",
        "L$4",
        "L$5",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "L$0",
        "L$4",
        "L$5",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "Z$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1878#2,3:401\n1788#2,4:404\n1788#2,4:408\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1\n*L\n114#1:401,3\n139#1:404,4\n142#1:408,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $listItem:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/rk;",
            ">;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/mltcode/paycertificationapi/rk;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$1:I

    iget v6, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$0:I

    iget-object v7, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$5:Ljava/lang/Object;

    check-cast v7, Lcom/android/mltcode/paycertificationapi/rk;

    iget-object v7, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iget-object v10, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move v12, v4

    move v4, v3

    move v3, v12

    move-object v12, v8

    move v8, v6

    move-object/from16 v6, p1

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$3:I

    iget v6, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$2:I

    iget v7, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$1:I

    iget v8, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$0:I

    iget-object v9, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$5:Ljava/lang/Object;

    check-cast v9, Lcom/android/mltcode/paycertificationapi/rk;

    iget-object v10, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$4:Ljava/lang/Object;

    iget-object v11, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$2:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$1:Ljava/lang/Object;

    check-cast v13, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iget-object v14, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$0:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move v3, v6

    move v6, v2

    move v2, v7

    move v7, v3

    move-object v3, v10

    move-object v10, v9

    move-object v9, v11

    move-object v11, v3

    move v3, v4

    move-object/from16 v4, p1

    goto/16 :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    if-eqz v2, :cond_3

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->X0O(Z)V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v7

    const v8, 0x7f141321

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "getString(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->XiOIO(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_3
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    iget-object v7, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v10, v5

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move v6, v10

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v6, 0x1

    if-gez v6, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_4
    move-object v13, v11

    check-cast v13, Lcom/android/mltcode/paycertificationapi/rk;

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    if-eqz v14, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v15

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->iIiiO(Ljava/lang/String;)V

    invoke-virtual {v13}, Lcom/android/mltcode/paycertificationapi/rk;->XO0O10()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->I1XOi1(Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3, v14}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_5
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$4:Ljava/lang/Object;

    iput-object v13, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$5:Ljava/lang/Object;

    iput v10, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$0:I

    iput v12, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$1:I

    iput v6, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$2:I

    iput v5, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$3:I

    const/4 v3, 0x1

    iput v3, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->label:I

    invoke-static {v8, v13, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->access$getLanguageBinData(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto :goto_3

    :cond_6
    move v14, v12

    move-object v12, v2

    move v2, v14

    move-object v14, v13

    move-object v13, v8

    move v8, v10

    move-object v10, v14

    move-object v14, v7

    move v7, v6

    move v6, v5

    :goto_1
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_7

    move v10, v8

    move-object v8, v13

    move-object v7, v14

    const/4 v4, 0x2

    :goto_2
    move v6, v2

    move-object v2, v12

    goto :goto_5

    :cond_7
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$1:Ljava/lang/Object;

    iput-object v12, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$4:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->L$5:Ljava/lang/Object;

    iput v8, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$0:I

    iput v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$1:I

    iput v7, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$2:I

    iput v6, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->I$3:I

    iput-boolean v4, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->Z$0:Z

    const/4 v4, 0x2

    iput v4, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->label:I

    invoke-static {v13, v10, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->access$binFileToDevice(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object v7, v9

    move-object v9, v13

    move-object v10, v14

    :goto_4
    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v6, v9

    move-object v9, v7

    move-object v7, v10

    move v10, v8

    move-object v8, v6

    goto :goto_2

    :goto_5
    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    goto/16 :goto_0

    :cond_9
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    if-eqz v1, :cond_a

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;->X0O(Z)V

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getPopup()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :cond_a
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-eqz v1, :cond_b

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->refreshData(Lcom/sma/smartv3/ui/device/model/LanguageUiType;)V

    :cond_b
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_c

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_c

    move v2, v5

    goto :goto_7

    :cond_c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v5

    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/rk;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/rk;->O00()Z

    move-result v3

    if-eqz v3, :cond_d

    add-int/lit8 v2, v2, 0x1

    if-gez v2, :cond_d

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_6

    :cond_e
    :goto_7
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_f

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_f

    move v3, v5

    goto :goto_9

    :cond_f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v5

    :cond_10
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/mltcode/paycertificationapi/rk;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/rk;->O00()Z

    move-result v4

    if-nez v4, :cond_10

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_10

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_8

    :cond_11
    :goto_9
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;->$listItem:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v2, v1, :cond_12

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f140ddd

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_a

    :cond_12
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f140dde

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_a
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
