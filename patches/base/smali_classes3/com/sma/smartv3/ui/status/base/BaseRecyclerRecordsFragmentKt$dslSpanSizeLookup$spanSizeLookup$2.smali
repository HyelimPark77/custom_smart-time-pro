.class public final Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt;->OXO1(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic $spanCount:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;->$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput p2, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;->$spanCount:I

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;->$recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    instance-of v1, v0, Lcom/angcyo/dsladapter/DslAdapter;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/angcyo/dsladapter/DslAdapter;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->isAdapterStatus()Z

    move-result v3

    if-ne v3, v1, :cond_1

    iget p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;->$spanCount:I

    return p1

    :cond_1
    if-eqz v0, :cond_3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, p1, v3, v4, v2}, Lcom/angcyo/dsladapter/DslAdapter;->getItemData$default(Lcom/angcyo/dsladapter/DslAdapter;IZILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object p1

    if-eqz p1, :cond_3

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;->$spanCount:I

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemSpanCount()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemSpanCount()I

    move-result p1

    return p1

    :cond_3
    return v1
.end method
