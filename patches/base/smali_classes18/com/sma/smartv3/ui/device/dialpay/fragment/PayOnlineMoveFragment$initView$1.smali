.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Landroid/app/Activity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WatchFaceCategoryV2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-direct {p0, p2, p3, p4}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getCount(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->onBindViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->onBindViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V

    return-void

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    const p3, 0x7f0a08f9

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const-string p3, "getView(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/ProgressButtonV2;

    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initView$1;->this$0:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$getMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)Lcom/sma/smartv3/model/SyncStatus;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$syncStatusChange(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/SyncStatus;)V

    return-void
.end method
