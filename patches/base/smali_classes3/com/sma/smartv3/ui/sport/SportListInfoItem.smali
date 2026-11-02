.class public final Lcom/sma/smartv3/ui/sport/SportListInfoItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final iconResID:I

.field private final mode:I

.field private final textResID:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->mode:I

    iput p2, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->iconResID:I

    iput p3, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->textResID:I

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a05fc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/TintImageView;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->iconResID:I

    invoke-virtual {v0, v1}, Lskin/support/widget/SkinCompatImageView;->setImageResource(I)V

    :cond_0
    const v0, 0x7f0a0ca3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->textResID:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    return-void
.end method

.method public final getIconResID()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->iconResID:I

    return v0
.end method

.method public final getMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->mode:I

    return v0
.end method

.method public final getTextResID()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportListInfoItem;->textResID:I

    return v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1065

    return v0
.end method
