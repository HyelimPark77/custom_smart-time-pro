.class public final Lcom/sma/smartv3/ui/device/item/SplitTitleItem;
.super Lcom/angcyo/dsladapter/DslAdapterItem;
.source "SourceFile"


# instance fields
.field private resID:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/ui/device/item/SplitTitleItem;->resID:I

    const p1, 0x7f0d02c3

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemLayoutId(I)V

    return-void
.end method


# virtual methods
.method public final getResID()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/item/SplitTitleItem;->resID:I

    return v0
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

    const p2, 0x7f0a0c17

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p2, p0, Lcom/sma/smartv3/ui/device/item/SplitTitleItem;->resID:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method

.method public final setResID(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/item/SplitTitleItem;->resID:I

    return-void
.end method
