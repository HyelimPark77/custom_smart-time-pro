.class final Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->refreshData(Lcom/sma/smartv3/ui/device/model/LanguageUiType;)V
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
    value = "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,400:1\n1563#2:401\n1634#2,3:402\n11561#3:405\n11896#3,3:406\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1\n*L\n54#1:401\n54#1:402,3\n61#1:405\n61#1:406,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.device.model.LanguageUpdateViewModel$refreshData$1"
    f = "LanguageUpdateViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x31,
        0x32
    }
    m = "invokeSuspend"
    n = {
        "deviceLanguages"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,400:1\n1563#2:401\n1634#2,3:402\n11561#3:405\n11896#3,3:406\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1\n*L\n54#1:401\n54#1:402,3\n61#1:405\n61#1:406,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $type:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/sma/smartv3/ui/device/model/LanguageUiType;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;",
            "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->$type:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

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

    new-instance p1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->$type:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/sma/smartv3/ui/device/model/LanguageUiType;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/szabh/smable3/entity/BleDeviceLanguages2;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iput v4, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->label:I

    invoke-static {v2, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->access$getBleDevicesLanguageData(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v2, Lcom/szabh/smable3/entity/BleDeviceLanguages2;

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->label:I

    invoke-static {v4, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->access$getServerLanguageList(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v1, v2

    :goto_2
    check-cast v3, [Lcom/sma/smartv3/model/ExtraPackageData;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceLanguages2;->getMSize()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->setMLanguagesMaxCount(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMDevLanguageData()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceLanguages2;->getMList()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    if-eqz v3, :cond_6

    array-length v6, v3

    :goto_4
    if-ge v7, v6, :cond_6

    aget-object v9, v3, v7

    invoke-virtual {v9}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result v11

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;->getMCode()I

    move-result v12

    if-ne v11, v12, :cond_5

    move-object v8, v9

    goto :goto_5

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    :goto_5
    move-object v11, v8

    new-instance v9, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v15, 0x1c

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v16}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;-><init>(Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;Lcom/sma/smartv3/model/ExtraPackageData;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMServiceLanguageData()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getMServiceLanguageData()Ljava/util/List;

    move-result-object v2

    if-eqz v3, :cond_a

    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v3

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v3

    :goto_6
    if-ge v7, v5, :cond_b

    aget-object v11, v3, v7

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceLanguages2;->getMList()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;->getMCode()I

    move-result v10

    invoke-virtual {v11}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result v12

    if-ne v10, v12, :cond_8

    goto :goto_7

    :cond_9
    move-object v9, v8

    :goto_7
    move-object v10, v9

    check-cast v10, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/y44;

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3c

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v17}, Lcom/android/mltcode/paycertificationapi/y44;-><init>(Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;Lcom/sma/smartv3/model/ExtraPackageData;Ljava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_a
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    :cond_b
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->this$0:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getUiType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;->$type:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
