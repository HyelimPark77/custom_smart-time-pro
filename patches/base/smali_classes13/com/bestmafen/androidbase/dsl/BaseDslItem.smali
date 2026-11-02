.class public abstract Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.super Lcom/angcyo/dsladapter/DslAdapterItem;
.source "SourceFile"


# instance fields
.field private final initEvent:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->layoutId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemLayoutId(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO0IXOIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO0IXOIi;-><init>(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)V

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemViewAttachedToWindow(Lkotlin/jvm/functions/Function2;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOX01OOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXOX01OOX;-><init>(Lcom/bestmafen/androidbase/dsl/BaseDslItem;)V

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemViewDetachedToWindow(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->_init_$lambda$0(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$0(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->onItemViewAttachedToWindow(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/angcyo/dsladapter/DslAdapterItem;->onItemViewDetachedToWindow(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->_init_$lambda$1(Lcom/bestmafen/androidbase/dsl/BaseDslItem;Lcom/angcyo/dsladapter/DslViewHolder;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->initEvent:Z

    return v0
.end method

.method public abstract initView()V
.end method

.method public abstract layoutId()I
.end method

.method public onAttach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 0
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->initView()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->getInitEvent()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDetach(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 0
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->getInitEvent()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onItemBind(Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/angcyo/dsladapter/DslAdapterItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapterItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/angcyo/dsladapter/DslAdapterItem;->onItemBind(Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    return-void
.end method
