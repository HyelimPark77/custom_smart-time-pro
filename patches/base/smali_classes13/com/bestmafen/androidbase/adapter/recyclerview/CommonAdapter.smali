.class public abstract Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected mContext:Landroid/content/Context;

.field protected mDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mInflater:Landroid/view/LayoutInflater;

.field protected mLayoutId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mInflater:Landroid/view/LayoutInflater;

    iput p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mLayoutId:I

    iput-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mDatas:Ljava/util/List;

    new-instance p1, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;

    invoke-direct {p1, p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter$OXO1;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;I)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->addItemViewDelegate(Lcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    return-void
.end method


# virtual methods
.method public abstract convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "TT;I)V"
        }
    .end annotation
.end method
