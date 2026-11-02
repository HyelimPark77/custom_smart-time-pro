.class final Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->done()V
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
    c = "com.sma.smartv3.ui.device.guide.PhoneBindGuideFragment$done$1"
    f = "PhoneBindGuideFragment.kt"
    i = {}
    l = {
        0xb9,
        0xc1,
        0xc1,
        0xc1
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $account:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $code:Ljava/lang/String;

.field final synthetic $loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

.field L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/uq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$account:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$code:Ljava/lang/String;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$account:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$code:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;-><init>(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$account:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$code:Ljava/lang/String;

    iput v5, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->label:I

    invoke-static {p1, v1, v7, p0}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->access$bindPhone(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_7

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v3, v5, v6}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->L$0:Ljava/lang/Object;

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->Z$0:Z

    iput v4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->label:I

    invoke-static {v2, v3, p0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    return-object v1

    :cond_7
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v1, v2, v6}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V

    iput v3, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->label:I

    invoke-static {p1, v1, p0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto/16 :goto_4

    :cond_8
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;->access$getMAppUser$p(Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;)Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getPasswordStatus()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p1, p1, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    goto :goto_2

    :cond_9
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p1, p1, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.HykyGuideActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/guide/HykyGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    goto :goto_2

    :cond_a
    const p1, 0x7f14020c

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_b

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_b
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->this$0:Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_c
    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :goto_3
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->$loadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v3, v4, v6}, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/uq;Lkotlin/coroutines/Continuation;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/ui/device/guide/PhoneBindGuideFragment$done$1;->label:I

    invoke-static {v1, v3, p0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_d

    :goto_4
    return-object v0

    :cond_d
    move-object v0, p1

    :goto_5
    throw v0
.end method
