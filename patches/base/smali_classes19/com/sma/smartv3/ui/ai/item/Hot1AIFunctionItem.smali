.class public final Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;
.super Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z

.field public title:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2, v0}, Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->setTitle(Landroid/widget/TextView;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->initEvent:Z

    return v0
.end method

.method public final getTitle()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->title:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "title"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/item/AIFunctionItem;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->setTitle(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/AIManager;->O10IXXX0X(Lcom/sma/smartv3/biz/AIManager;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0180

    return v0
.end method

.method public final onBindStateChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bind_stage_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onBindStateChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->initView()V

    return-void
.end method

.method public final setTitle(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->title:Landroid/widget/TextView;

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "titleStr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/AIManager;->iOiXi11II(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->getTitle()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final switchAIServe(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "CHANGE_AI_MODEL"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/Hot1AIFunctionItem;->initView()V

    return-void
.end method
