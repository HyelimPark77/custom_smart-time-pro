.class public final Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity$initView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;Landroid/app/Activity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity<",
            "TT;>;",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity$initView$1;->this$0:Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;

    invoke-direct {p0, p2, p3, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "TT;I)V"
        }
    .end annotation

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity$initView$1;->this$0:Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;

    invoke-interface {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/ag3;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity$initView$1;->this$0:Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerActivity;->getCount()I

    move-result v0

    return v0
.end method
