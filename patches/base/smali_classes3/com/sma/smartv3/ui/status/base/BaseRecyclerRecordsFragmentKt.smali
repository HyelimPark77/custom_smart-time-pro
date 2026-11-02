.class public final Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final OXO1(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .locals 2
    .param p0    # Landroidx/recyclerview/widget/GridLayoutManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    new-instance v1, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;

    invoke-direct {v1, p1, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2;-><init>(Landroidx/recyclerview/widget/RecyclerView;I)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-object v1
.end method

.method public static final XIi00iiXO(Landroidx/recyclerview/widget/GridLayoutManager;Lcom/angcyo/dsladapter/DslAdapter;)Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .locals 2
    .param p0    # Landroidx/recyclerview/widget/GridLayoutManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/angcyo/dsladapter/DslAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dslAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    new-instance v1, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;

    invoke-direct {v1, p1, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;-><init>(Lcom/angcyo/dsladapter/DslAdapter;I)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    return-object v1
.end method
