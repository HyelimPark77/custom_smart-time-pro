.class public final Lcom/sma/smartv3/dsl/AdapterStatusItem;
.super Lcom/angcyo/dsladapter/DslAdapterStatusItem;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/angcyo/dsladapter/DslAdapterStatusItem;-><init>()V

    return-void
.end method


# virtual methods
.method public _onBindStateLayout(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/angcyo/dsladapter/DslAdapterStatusItem;->_onBindStateLayout(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    const p2, 0x7f0a0b9c

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method
