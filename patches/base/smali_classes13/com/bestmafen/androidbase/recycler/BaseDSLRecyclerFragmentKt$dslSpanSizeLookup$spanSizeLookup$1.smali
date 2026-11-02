.class public final Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt;->XIi00iiXO(Landroidx/recyclerview/widget/GridLayoutManager;Lcom/angcyo/dsladapter/DslAdapter;)Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

.field final synthetic $spanCount:I


# direct methods
.method public constructor <init>(Lcom/angcyo/dsladapter/DslAdapter;I)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    iput p2, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$spanCount:I

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 4

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->isAdapterStatus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$spanCount:I

    return p1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lcom/angcyo/dsladapter/DslAdapter;->getItemData$default(Lcom/angcyo/dsladapter/DslAdapter;IZILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v0, p0, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragmentKt$dslSpanSizeLookup$spanSizeLookup$1;->$spanCount:I

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemSpanCount()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemSpanCount()I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
