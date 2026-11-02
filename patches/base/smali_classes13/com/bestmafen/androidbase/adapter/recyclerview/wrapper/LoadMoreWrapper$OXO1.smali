.class public Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/o67$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;I)I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$OXO1;->OXO1:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;

    invoke-static {v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->access$000(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    return p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
