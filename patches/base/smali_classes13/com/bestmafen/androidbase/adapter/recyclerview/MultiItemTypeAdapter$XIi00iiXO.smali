.class public Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->setListener(Landroid/view/ViewGroup;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

.field public final synthetic IO:Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->I1:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    iput-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->IO:Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->I1:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    iget-object v0, v0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mOnItemClickListener:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->IO:Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v0

    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->I1:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    iget-object v1, v1, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mOnItemClickListener:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;

    iget-object v2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;->IO:Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-interface {v1, p1, v2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;->XIi00iiXO(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
