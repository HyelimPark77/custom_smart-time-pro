.class public Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final item:Lcom/sma/smartv3/model/TodayData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tvState:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvTitle:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private tvValue:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/TodayData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/TodayData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

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

    const v0, 0x7f0a18a3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvTitle:Landroid/widget/TextView;

    const v0, 0x7f0a18b0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvValue:Landroid/widget/TextView;

    const v0, 0x7f0a0d17

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    return-void
.end method

.method public final getItem()Lcom/sma/smartv3/model/TodayData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

    return-object v0
.end method

.method public final getTvState()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvTitle()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTvValue()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvValue:Landroid/widget/TextView;

    return-object v0
.end method

.method public initView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvTitle:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvValue:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getStateColor()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/high16 v1, -0x10000

    goto :goto_0

    :cond_3
    const v1, -0xff0100

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v2, 0x7f0600b4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    goto :goto_0

    :cond_5
    const-string v1, "#FE6D00"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_6
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0eac

    return v0
.end method

.method public final setTvState(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvState:Landroid/widget/TextView;

    return-void
.end method

.method public final setTvTitle(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvTitle:Landroid/widget/TextView;

    return-void
.end method

.method public final setTvValue(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;->tvValue:Landroid/widget/TextView;

    return-void
.end method
