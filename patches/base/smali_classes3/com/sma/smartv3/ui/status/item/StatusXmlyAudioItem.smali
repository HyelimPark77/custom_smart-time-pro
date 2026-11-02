.class public final Lcom/sma/smartv3/ui/status/item/StatusXmlyAudioItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method

.method public static synthetic O00(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/StatusXmlyAudioItem;->bindView$lambda$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final bindView$lambda$0(Lcom/angcyo/dsladapter/DslViewHolder;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/smart/xmlyaudiolibrary/XmlyAudioWebViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0, p0}, Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s95;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/s95;-><init>(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->clickItem(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1083

    return v0
.end method
