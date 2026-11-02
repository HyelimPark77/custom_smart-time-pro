.class public final Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;
.super Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGiftTranslationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,45:1\n19#2:46\n15#2:47\n1869#3,2:48\n310#4,11:50\n*S KotlinDebug\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n*L\n20#1:46\n20#1:47\n26#1:48,2\n35#1:50,11\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGiftTranslationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,45:1\n19#2:46\n15#2:47\n1869#3,2:48\n310#4,11:50\n*S KotlinDebug\n*F\n+ 1 GiftTranslationHandler.kt\ncom/sma/smartv3/dialog/handler/GiftTranslationHandler\n*L\n20#1:46\n20#1:47\n26#1:48,2\n35#1:50,11\n*E\n"
    }
.end annotation


# instance fields
.field public XIi00iiXO:F


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;-><init>(I)V

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;->XIi00iiXO:F

    return p0
.end method


# virtual methods
.method public XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 41
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;

    iget v3, v2, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->label:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;

    invoke-direct {v2, v0, v1}, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;-><init>(Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v2

    iget v3, v6, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->label:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v2, v6, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-static {v1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v11, Lcom/sma/smartv3/model/AppUser;

    const v39, 0x7ffffff

    const/16 v40, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v11 .. v40}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v11, v1

    :goto_2
    check-cast v11, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_4
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1000;->OXO1:Lcom/android/mltcode/paycertificationapi/i1000;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i1000;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/iIX01Oi;

    move-result-object v3

    invoke-virtual {v11}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v4

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->L$0:Ljava/lang/Object;

    iput v10, v6, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$shouldShow$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/iIX01Oi;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iIX01Oi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    return-object v2

    :cond_5
    :goto_3
    check-cast v1, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getFreeList()Ljava/util/List;

    move-result-object v2

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    check-cast v2, Ljava/util/Collection;

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getFreeList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;

    iget v3, v0, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;->XIi00iiXO:F

    invoke-virtual {v2}, Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;->getRemainDuration()F

    move-result v2

    add-float/2addr v3, v2

    iput v3, v0, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;->XIi00iiXO:F

    goto :goto_5

    :cond_8
    iget v1, v0, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;->XIi00iiXO:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_9

    move v9, v10

    :cond_9
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_a
    :goto_6
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public XO0O10(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;-><init>()V

    new-instance v2, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$OXO1;

    invoke-direct {v2, v0}, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler$OXO1;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->setOnDismissAction(Lkotlin/jvm/functions/Function0;)V

    invoke-static {p0}, Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;->O00(Lcom/sma/smartv3/dialog/handler/GiftTranslationHandler;)F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;->setFreeTime(F)V

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v2, "giftTranslation"

    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
