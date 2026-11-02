.class public Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/o67$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;I)I
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;

    invoke-virtual {v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getItemViewType(I)I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;

    invoke-static {v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->access$000(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)Landroidx/collection/SparseArrayCompat;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    return p1

    :cond_0
    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;

    invoke-static {v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->access$100(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)Landroidx/collection/SparseArrayCompat;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    return p1

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
