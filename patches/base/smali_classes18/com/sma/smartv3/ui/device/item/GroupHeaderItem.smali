.class public final Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;
.super Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;
.source "SourceFile"


# instance fields
.field private final titleRes:I

.field private tvTitle:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->titleRes:I

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

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/device/item/BaseDeviceItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->tvTitle:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->titleRes:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method

.method public final getTitleRes()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->titleRes:I

    return v0
.end method

.method public final getTvTitle()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->tvTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0295

    return v0
.end method

.method public final setTvTitle(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/item/GroupHeaderItem;->tvTitle:Landroid/widget/TextView;

    return-void
.end method
