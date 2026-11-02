.class public final Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/item/TodayDataItem;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/TodayData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/ui/status/item/TodayDataItem;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/ui/status/item/TodayDataItem;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;",
            "Lcom/sma/smartv3/ui/status/item/TodayDataItem;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->$list:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/status/item/TodayDataItem;

    const p2, 0x7f0d0f2b

    invoke-direct {p0, p3, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/status/item/TodayDataItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->convert$lambda$0$0(Lcom/sma/smartv3/ui/status/item/TodayDataItem;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0$0(Lcom/sma/smartv3/ui/status/item/TodayDataItem;Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->access$getMRecyclerView$p(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "mRecyclerView"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Landroid/content/Intent;

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->access$getMRecyclerView$p(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-class v0, Lcom/sma/smartv3/ui/status/TodayHealthyDataActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TodayData;I)V
    .locals 8

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0bbf

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-nez p3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0bbe

    .line 3
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->$list:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-ne p3, v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const p3, 0x7f0a05f5

    .line 4
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0a05f6

    .line 5
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a05f7

    .line 6
    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v3, 0x7f0a05f4

    .line 7
    invoke-virtual {p1, v3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v5, 0x0

    .line 8
    invoke-static {v2, v4, v5}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TodayData;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {p2}, Lcom/sma/smartv3/model/TodayData;->getTitle()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/model/TodayData;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {p2}, Lcom/sma/smartv3/model/TodayData;->getState()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p2}, Lcom/sma/smartv3/model/TodayData;->getStateColor()I

    move-result p2

    if-eqz p2, :cond_5

    if-eq p2, v4, :cond_3

    const/4 p3, 0x2

    if-eq p2, p3, :cond_2

    const/high16 p2, -0x10000

    goto :goto_3

    :cond_2
    const p2, -0xff0100

    goto :goto_3

    .line 13
    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/status/item/TodayDataItem;

    invoke-static {p2}, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->access$getContext$p(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_4

    const-string p2, "context"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v5, p2

    :goto_2
    const p2, 0x7f0600b4

    invoke-virtual {v5, p2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    goto :goto_3

    .line 14
    :cond_5
    const-string p2, "#FE6D00"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    .line 15
    :goto_3
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    const p2, 0x7f0a05f3

    .line 16
    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->this$0:Lcom/sma/smartv3/ui/status/item/TodayDataItem;

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    const v0, 0x7f060758

    .line 18
    invoke-static {p3, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    .line 19
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 20
    new-instance p3, Lcom/android/mltcode/paycertificationapi/su5;

    invoke-direct {p3, p2}, Lcom/android/mltcode/paycertificationapi/su5;-><init>(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/TodayData;I)V

    return-void
.end method
